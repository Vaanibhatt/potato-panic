<<<<<<< HEAD
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

    

    
=======
from PlayerType import PlayerType
from PhysicsObject import PhysicsObject
from GameObject import GameObject
from Vector2 import Vector2
import pygame
import pymunk

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
        
        # print(str(self.coordinates.x)  + ", " + str(self.coordinates.y)) #Debug print
        # print(str(self.body.position.x)  + ", " + str(self.body.position.y)) #Debug print


        

    

>>>>>>> f87e473d746f1f5911e3c086fe5af4fa6ee893d4
