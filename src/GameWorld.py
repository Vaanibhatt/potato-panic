#My files
from Vector2 import Vector2
from PlayerType import PlayerType
from Dimensions import Dimensions
from Player import Player

#Render & Physics
import pygame
import pymunk

class GameWorld():

    gameObjectsList = []  #will be used later

    def run(self, screen):
        running = True
        player = Player(Vector2(50, 50), Dimensions(50,50), PlayerType.RED, False)

        while running:
            player.render(screen)
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    running = False
            
            #Display everything
            pygame.display.update()

        pygame.quit()