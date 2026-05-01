from GameObject import GameObject
import pymunk
import pygame
class PhysicsObject(GameObject):

    def __init__(self, coordinates, dimensions, space):
        super(PhysicsObject, self).__init__(coordinates, dimensions)
        
        # Create physics body
        self.body = pymunk.Body()
        self.body.position = (self.coordinates.x,self.coordinates.y)
        self.poly = pymunk.Poly.create_box(self.body)
        self.poly.mass = 10

        space.add(self.body, self.poly)