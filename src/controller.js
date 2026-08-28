import { joinRoom } from "https://esm.run/trystero";

const controllerCanvas = document.getElementById("controllerCanvas");
const ctx = controllerCanvas.getContext("2d");

controllerCanvas.width = innerWidth;
controllerCanvas.height = innerHeight;
const FPS = 120;
function clearBG() {
  ctx.fillStyle = "#101c35";
  ctx.fillRect(0, 0, controllerCanvas.width, controllerCanvas.height);
}
function drawCircle(x,y,radius,color) {
  ctx.beginPath();
  ctx.arc(x, y, radius, 0, 2 * Math.PI);
  ctx.fillStyle = color;
  ctx.fill();
}
class JoyStick {

  constructor(x,y, radius, handleRadius) {
    this.x = x
    this.y = y

    this.radius = radius
    this.handleRadius = handleRadius
  }

  draw() {
    //handle
    drawCircle(this.x,this.y, this.handleRadius, "#3a1852")
    drawCircle(this.x,this.y, this.radius, "#8827a5")
    
    
  }
  update(){
    
  }
}
clearBG()
let handleRadius = 80
let joystick = new JoyStick(190,200, handleRadius/2 , handleRadius)
joystick.draw()

setInterval(() => {
  //loop
}, 1000 / FPS);