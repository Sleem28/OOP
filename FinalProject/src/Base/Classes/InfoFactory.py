from src.Base.AbstractClasses.AInfoFactory import AInfoFactory
from src.Base.Classes.GetAllSymbols import GetAllSymbols
from src.Base.Classes.GetMaxVolumes import GetMaxVolumes
from binance import Client


class InfoFactory(AInfoFactory):

    def __init__(self, client: Client):
        self.client = client

    def get_all_symbols(self):
        symbols = GetAllSymbols(self.client).get_info()
        return symbols

    def get_max_volumes(self, symbol: str, min_volume: float):
        max_volumes = GetMaxVolumes(self.client, symbol, min_volume=min_volume).get_info()
        return max_volumes