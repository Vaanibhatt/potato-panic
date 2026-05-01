#My files
from Vector2 import Vector2
from PlayerType import PlayerType
from Dimensions import Dimensions
from Player import Player
from Platform import Platform
#Render & Physics
import pygame
import pymunk

class GameWorld():

    physicsObjectsList = [] #Will be used later
    space = pymunk.Space() #Create a Space which contain the simulation
    space.gravity = (0,9.81)
    
    
    def run(self, screen):

        
        player = Player(Vector2(50, 50), Dimensions(50,50), self.space, PlayerType.BLUE, True)
        platform = Platform(Vector2(50, 100), Dimensions(500,60), self.space)
        

        white = (255,255,255)

        while True:
            screen.fill(white)
            player.render(screen)
            platform.render(screen)
            self.space.step(0.02) #move simulation forward


            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    return
            
            
            pygame.display.update() #Display everything

        