from binance import Client
from src.Base.AbstractClasses.AGetInfo import AGetInfo


class GetAllSymbols(AGetInfo):
    def __init__(self, client:Client):
        self.__client = client

    def get_info(self):
        tickers = self.__client.get_all_tickers()
        symbols = []

        for ticker in tickers:
            if str(ticker['symbol'][-4:]) == 'USDT':
                symbols.append(ticker['symbol'])

        return symbols