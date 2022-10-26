from abc import abstractmethod

class ALoader():
    @abstractmethod
    def get_client(self):
        """return client"""
