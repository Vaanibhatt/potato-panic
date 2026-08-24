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
function drawCircle(x,y,radius) {
  ctx.beginPath();
  ctx.arc(x, y, radius, 0, 2 * Math.PI);
  ctx.fillStyle = "#922121";
  ctx.fill();
}



setInterval(() => {
  //loop
}, 1000 / FPS);



class JoyStick {
  constructor(x, y, radius, handleRadius) {}

  draw() {
    drawCircle()
  }
}
