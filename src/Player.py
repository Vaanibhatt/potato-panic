from Vector2 import Vector2
from PlayerType import PlayerType
from Dimensions import Dimensions
import pygame

class Player():
    coordinates = Vector2(0,0)
    dimensions = Dimensions(0,0)
    playerRect = pygame.Rect((0, 0, 0, 0))
    playerType = PlayerType.RED
    isPotatoMan = False
    color = (0,0,0)

    def __init__(self, coordinates, dimensions, playerType, isPotatoMan):
        self.playerType = playerType
        self.isPotatoMan = isPotatoMan

        self.coordinates = coordinates
        self.dimensions = dimensions

        self.playerRect = pygame.Rect((coordinates.x, coordinates.y, dimensions.l, dimensions.w))

        self.color = playerType.value
        
        

    def render(self, screen):

        pygame.draw.rect(screen, self.color, self.playerRect)

        

    

