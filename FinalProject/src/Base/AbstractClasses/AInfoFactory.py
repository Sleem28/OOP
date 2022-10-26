from abc import abstractmethod

class AInfoFactory:
    @abstractmethod
    def get_all_symbols(self):
        """get symbols"""
    @abstractmethod
    def get_max_volumes(self, symbol:str, min_volume: float):
        """get max volumes"""