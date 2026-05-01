from PlayerType import PlayerType
from PhysicsObject import PhysicsObject
from GameObject import GameObject
from Vector2 import Vector2
import pygame
import pymunk

class Platform(PhysicsObject):

    def __init__(self, coordinate, dimensions, space):
        super(Platform, self).__init__(coordinate, dimensions, space)
        self.color = (0,0,0)
        
   
        
        

    def render(self, screen):

        self.coordinates = Vector2(self.body.position.x, self.body.position.y)
        self.shape = pygame.Rect((self.coordinates.x, self.coordinates.y, self.dimensions.l, self.dimensions.w)) #Updates Rect position
        
        pygame.draw.rect(screen, self.color, self.shape)

        print(str(self.coordinates.x)  + ", " + str(self.coordinates.y)) #Debug print

        

    

