from binance import Client
from src.Base.AbstractClasses.ALoader import ALoader
from data import config


class Loader(ALoader):
    def __init__(self):
        self.client = Client(api_key=config.API_KEY, api_secret=config.SECRET)

    def get_client(self):
        return self.client

