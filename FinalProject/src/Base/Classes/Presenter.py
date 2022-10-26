from src.Base.Classes.Loader import Loader
from src.Base.AbstractClasses.APresenter import APresenter
from src.Base.Classes.InfoFactory import InfoFactory
from src.Base.Classes.GUI import GUI


class Presenter(APresenter):

    def __init__(self, loader: Loader):
        self.client = loader.get_client()
        self.info_factory = InfoFactory(client=self.client)
        self.gui = GUI(info_factory=self.info_factory)

    def run(self):
        self.gui.run_gui()

