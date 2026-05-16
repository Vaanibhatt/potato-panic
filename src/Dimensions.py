class Dimensions:
    w = 0
    l = 0

    def __init__(self, w,l):
        self.w = w
        self.l = l

    def scale(self, scalar):
        self.w *= scalar
        self.l *= scalar