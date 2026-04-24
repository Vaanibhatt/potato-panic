#My files
from Vector2 import Vector2
from PlayerType import PlayerType
from Dimensions import Dimensions
from GameWorld import GameWorld
from Player import Player

#Render & Physics
import pygame

pygame.init()
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600

screen = pygame.display.set_mode((SCREEN_WIDTH,SCREEN_HEIGHT))

#Menu (add later)

#Create "playing" part of the game
gameWorld = GameWorld()
gameWorld.run(screen)



