#My files
import GameWorld

#Render & Physics
import pygame

pygame.init()
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600


screen = pygame.display.set_mode((SCREEN_WIDTH,SCREEN_HEIGHT))

#Menu (add later)

#Create "playing" part of the game

GameWorld.run(screen)

pygame.quit()
