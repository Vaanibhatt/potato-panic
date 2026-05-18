import pygame
from Vector2 import Vector2
from Dimensions import Dimensions
import GameWorld
class GameObject:
    def __init__(self, coordinates, dimensions):
        self.coordinates = Vector2(coordinates.x, coordinates.y)
        self.dimensions = Dimensions(dimensions.w, dimensions.l)
        self.shape = pygame.Rect((self.coordinates.x - self.dimensions.w/2, self.coordinates.y - self.dimensions.l/2, self.dimensions.w, self.dimensions.l))
        GameWorld.objectsList.append(self)
    
    def render(self, coordinates):
        self.shape = pygame.Rect((coordinates.x - self.dimensions.w/2, coordinates.y - self.dimensions.l/2, self.dimensions.w, self.dimensions.l)) #Updates Rect position
