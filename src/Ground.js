import { GameObject } from "./GameObject.js"

export class Ground extends GameObject {

  constructor(x, y, length, thickness) {
    super(x,y , length, thickness, true)
  }
} 

