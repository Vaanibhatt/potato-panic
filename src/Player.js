import { GameObject } from "./GameObject.js"

export class Player extends GameObject {

  constructor(x, y) {
    let size = 60
    super(x,y , size, size, false)

  }


} 

