<<<<<<< HEAD
import pygame

import Player;
import Vector2;


pygame.init();

SCREEN_WIDTH = 900;
SCREEN_HEIGHT = 700;

screen = pygame.display.set_mode((SCREEN_WIDTH,SCREEN_HEIGHT));

running = True;
player = Player(Vector2(0,0), 50, 50);
while running:
    # draw rect
    pygame.draw.rect(screen, Color(255,0,0), 50, 50);
    
    
    #Exit screen if "x"  clicked
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False;

pygame.quit();
=======
#My files
from GameWorld import GameWorld

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

pygame.quit()



>>>>>>> f87e473d746f1f5911e3c086fe5af4fa6ee893d4
