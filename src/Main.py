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