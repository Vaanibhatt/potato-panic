import pygame
class GameObject:
    def __init__(self, coordinates, dimensions):
        self.coordinates = coordinates
        self.dimensions = dimensions
        self.shape = pygame.Rect((self.coordinates.x, self.coordinates.y, self.dimensions.l, self.dimensions.w))