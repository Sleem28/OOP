from src.Base.Classes.InfoFactory import InfoFactory
import tkinter as tk
from tkinter import ttk


class GUI:

    def __init__(self, info_factory: InfoFactory):
        self.info_factory = info_factory

    def run_gui(self):
        def get_max_volumes(event):

            try:
                min_volume = float(entry.get())
            except BaseException:
                min_volume = 1

            symbol = futures.get()
            all_Volumes = self.info_factory.get_max_volumes(symbol=symbol, min_volume=min_volume)
            bids = all_Volumes[0]
            asks = all_Volumes[1]
            f_text = field.get(1.0, 'end')

            if len(f_text) > 0:
                field.delete(1.0, 'end')

            if len(bids)!=0:
                for item in bids:
                    price = item[0]
                    vol = item[1]
                    field.insert(0.0, "По цене {} стоит объем на покупку {}\n".format(price, vol))
            else:
                field.insert(0.0, "Плотностей на покупку не обнаружено\n")

            if len(asks) != 0:
                for item in asks:
                    price = item[0]
                    vol = item[1]
                    field.insert(0.0, "По цене {} стоит объем на продажу {}\n".format(price, vol))
            else:
                field.insert(0.0, "Плотностей на продажу не обнаружено\n")


        symbols = self.info_factory.get_all_symbols()

        main_window = tk.Tk()
        main_window.geometry('700x300+100+100')
        main_window.title('Скринер плотностей для фьючерсов Binance')
        main_window.resizable(False, False)

        tk.Label(main_window, text='Плотности:', font='Arial 10', ).grid(row=0, column=0, sticky='w', padx=20)  # label для поиска

        tk.Label(main_window, text='Введите объем в USDT:', font='Arial 10').grid(row=0, column=1, sticky='n')

        tk.Label(main_window, text='Выберите фьючерс:', font='Arial 10').grid(row=2, column=1, sticky='s')

        field = tk.Text(main_window, width=60, height=16, relief='solid')
        field.grid(row=1, column=0, rowspan=20, padx=20)
        scroll_bar = tk.Scrollbar(main_window, command=field.yview)
        scroll_bar.grid(row=1, column=0, rowspan=20, sticky='sne', padx=2, pady=2)
        field.config(yscrollcommand=scroll_bar.set)

        entry = tk.Entry(main_window, font='Arial 10', relief='solid', width=20)
        entry.grid(column=1, row=1, sticky='n')

        futures = ttk.Combobox(main_window, values=symbols)
        futures.grid(column=1, row=3, sticky='n')
        futures.current(0)
        futures.bind("<<ComboboxSelected>>", get_max_volumes)

        main_window.mainloop()


