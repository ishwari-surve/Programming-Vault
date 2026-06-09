# Duck typing : It is a concept wherethe type of an object is determined
# by its behaviour,not by its class

class  InkjetPrinter:
    def printdocument(self,documnet):
        print("Inkjet printer printing:",documnet)

class LaserPrinter:
    def printdocument(self,documnet):
        print("Lasser printer printing:",documnet)

class PDFWriter:
    def printdocument(self,documnet):
        print(f"Saving {documnet}as a PDF")

def StartPrinting(Device):
    Device.printdocument("Marvellous Notes")

def main():
    StartPrinting(InkjetPrinter())
    StartPrinting(LaserPrinter())
    StartPrinting(PDFWriter())

main()


