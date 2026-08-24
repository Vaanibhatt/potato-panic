import { engine, render, Bodies, Composite} from "./main.js"

export class GameObject {

  constructor(x, y, width, height, unmoveable) {
    self.body = Bodies.rectangle(x, y, width, height, {isStatic : unmoveable})
    Composite.add(engine.world, [body])
  }
} 

