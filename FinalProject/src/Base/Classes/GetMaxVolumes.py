from src.Base.AbstractClasses.AGetInfo import AGetInfo
from binance import Client


class GetMaxVolumes(AGetInfo):

    def __init__(self, client: Client, symbol: str, min_volume: float):
        self.__client = client
        self.__symbol = symbol
        self.__min_volume = min_volume

    def get_info(self, ):
        order_book = self.__client.get_order_book(symbol=self.__symbol, limit=1000)
        all_results = []
        result_bids = []
        result_asks = []

        for level in order_book['bids']:
            if float(level[0]) * float(level[1]) >= self.__min_volume:
                result_bids.append([level[0], level[1]])

        for level in order_book['asks']:
            if float(level[0]) * float(level[1]) >= self.__min_volume:
                result_asks.append([level[0], level[1]])

        all_results.append(result_bids)
        all_results.append(result_asks)

        return all_results
