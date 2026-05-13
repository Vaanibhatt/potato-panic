from GameObject import GameObject
from Vector2 import Vector2
import pymunk
import pygame
class PhysicsObject(GameObject):

    def __init__(self, coordinates, dimensions, space, mass, isStatic):
        # Create physics body
        self.body = pymunk.Body()
        self.body.position = (coordinates.x, coordinates.y)

        if (isStatic):
            self.body = pymunk.Body(mass, body_type=pymunk.Body.STATIC)
        else:
            self.body = pymunk.Body(mass, body_type=pymunk.Body.DYNAMIC)

        self.body.position = (coordinates.x, coordinates.y)

        super(PhysicsObject, self).__init__(self.body.position, dimensions)

        self.poly = pymunk.Poly.create_box(self.body, (dimensions.w , dimensions.l))

        self.poly.mass = mass
        self.poly.density = 1
        space.add(self.body, self.poly)




    