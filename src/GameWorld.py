#My files
import pymunk.util
from Vector2 import Vector2
from PlayerType import PlayerType
from Dimensions import Dimensions
from Player import Player
from Platform import Platform
#Render & Physics
import pygame
import pymunk
from pymunk.pygame_util import DrawOptions

class GameWorld():

    physicsObjectsList = [] #Will be used later
    space = pymunk.Space() #Create a Space which contain the simulation
    space.gravity = (0,981)
    clock = pygame.time.Clock()
    
    
    def run(self, screen):
        # draw_options = pymunk.pygame_util.DrawOptions(screen)
        
        player = Player(Vector2(200, 200), Dimensions(50,50), self.space, PlayerType.BLUE, True)
        platform = Platform(Vector2(250, 500), Dimensions(200,60), self.space)

        FPS = 80
        white = (255,255,255)
        
        while True:
            screen.fill(white)
            player.render(screen)
            platform.render(screen)
            # self.space.debug_draw(draw_options)

            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    return

            
            pygame.display.update() #Display everything
            self.clock.tick(FPS)
            self.space.step(2/FPS) #move simulation forward

        