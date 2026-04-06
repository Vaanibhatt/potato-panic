import pygame;
import Vector2;

class Player:
    coordinates;

    width;
    height;
    player;


    def __init__(self, vector, width, height):
        coordinates = Vector2(0,0);
        self.width = width;
        self.height = height;
        player = pygame.Rect((self.width, self.height));

    

    