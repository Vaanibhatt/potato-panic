from PlayerType import PlayerType
from PhysicsObject import PhysicsObject
from GameObject import GameObject
from Vector2 import Vector2
import pygame
import pymunk

class Platform(PhysicsObject):

    def __init__(self, coordinate, dimensions, space):
        super(Platform, self).__init__(coordinate, dimensions, space, 5, True)
        self.color = (0,0,0)
        
   

    def render(self, screen):

        super(Platform, self).render(Vector2(self.body.position.x, self.body.position.y))
        
        pygame.draw.rect(screen, self.color, self.shape)

        # print(str(self.coordinates.x)  + ", " + str(self.coordinates.y)) #Debug print
        # print(str(self.body.position.x)  + ", " + str(self.body.position.y)) #Debug print

         

    

