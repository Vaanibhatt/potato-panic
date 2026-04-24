class Dimensions:
    l = 0
    w = 0

    def __init__(self, l,w):
        self.l = l
        self.w = w

    def scale(self, scalar):
        self.l *= scalar
        self.w *= scalar