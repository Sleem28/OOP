# OOP
## HomeWork1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения

А так же реализовать следующие классы-наследники:
1. Продукты питания, содержащие следующие свойства:
>1.1. Срок годности
2. Напитки, содержащие следующие свойства:
>2.1. Объём
3. Предметы гигиены, содержащие следующие свойства:
>3.1 Количество штук в упаковке
4. Детские товары:
>4.1. Минимальный возраст
>4.2. Гипоаллергенность

А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):

5. Молоко, содержащиее следующее свойство:
>5.1 Процент жирности
5.2 Срок годности
6. Лимонад
7. Хлеб, содержащий следующие свойство:
>7.1 Тип муки
8. Яйца, содержащее следующиее свойство:
>8.1 Количество в упаковке
9. Маски
10. Туалетная бумага, содержащее следующее свойство:
>10.1 Количество слоёв
11. Подгузники, содержащие следующее свойства:
>11.1 Размер
>11.2 Минимальный вес
>11.3 Максимальный вес
>11.4 Тип
12. Соска

**У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program**

## HomeWork2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

На языке Java реализовать интерфейс "Животное" со следующими полями:

1.Рост животного
2.Вес животного
3.Цвет глаз животного

И методы:

1.Издать звук
2.Напечатать информацию о животном

Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:

1.Домашнее животное со следующими свойствами:
>1.1 Кличка
>1.2 Порода
>1.3 Наличие прививок
>1.4 Цвет шерсти
>1.5 Дата рождения

И методами:
>1.6 Проявлять ласку

2.Дикое животное со следующими свойствами:
>2.1 Место обитания
>2.2 Дата нахождения

Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или дикого животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):

1.Кот со свойством:
>1.1 Наличие шерсти(доступным только для чтения внешним классам)
2. Тигр
3.Собака со свойством:
>3.1 Наличие дрессировки(доступным только для чтения внешним классам)
и методом:
>3.2 Дрессировать

4.Волк со свойством:
>4.1 Вожак стаи(доступным только для чтения внешним классам)

Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
1. Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта

И защищённый конструктор:
3. Конструктор принемающий высоту полёта
И следующие классы-наследники:
1. Курица
2. Аист

Для всех классов реализовать методы издавать звук, чтобы он печатал на консоль звук, примерно похожий на звук, который издаёт животное в реальном мире, а метод напечатать информацию, печатающий на экран все свойства, которые есть у данного животного. Так же для всех классов реализовать набор конструкторов, которые необходимы для задания всех свойств объекта, которые они у него есть.
Так же реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь), в котором организовать приватный массив объектов-животных со следующими методами:

1.Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)
2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
3.Посмотреть информацию о животном с номером i
4.Заставить животное с номером i издать звук
5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук

Предоставить пользователю консольный интерфейс(консольное меню), который позволяет пользователю добавлять новых животных в зоопарк, убирать животных из зоопарка, печатать информацию о конкретном животном(вводя его номер), печатать информацию о всех животных в зоопарке на данный момент, заставлять животное издавать звук(введя номер животное), заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)
Задание под звёздочкой(необязательное, но плюсы к карме и к оценкам): Сделать возможность у животных летать, если это животное птица, проявлять ласку, если это домашнее животное и дрессировать, если это животное собака.

## HomeWork4

**Написать метод чтения из JSON файла строки, числа либо объекта заданного класса. Метод должен возвращать объект типа данных указанного вызывающим**

## HomeWork5

**Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования.**

## FinalProject

**Сделал скринер плотностей для биржи Binance.**
