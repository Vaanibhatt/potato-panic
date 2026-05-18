from PlayerType import PlayerType
from PhysicsObject import PhysicsObject
from GameObject import GameObject

from Vector2 import Vector2
import pygame

import keyboard

class Player(PhysicsObject):

    def __init__(self, coordinate, dimensions, space, playerType, isPotatoMan):
        super(Player, self).__init__(coordinate, dimensions, space, 10, False)
        self.isPotatoMan = isPotatoMan
        self.playerType = playerType
        

        

    def render(self, screen):
        self.currentColor = self.playerType
        if (self.isPotatoMan):
            self.currentColor = PlayerType.POTATO_MAN
        super(Player, self).render(Vector2(self.body.position.x, self.body.position.y))
        
        pygame.draw.rect(screen, self.currentColor.value, self.shape)
        


        

