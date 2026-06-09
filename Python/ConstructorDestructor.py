import gc


class Demo:
    def __init__(self):
        print("Inside constructor")

    def __del__(self):
        print("Inside Destructor")
#Allocate

#Deallocate
obj = Demo()

del obj

gc.collect()

print("End of Application")