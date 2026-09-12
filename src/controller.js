// import { joinRoom } from "https://esm.run/trystero";

// const controllerCanvas = document.getElementById("controllerCanvas");
// const ctx = controllerCanvas.getContext("2d");

// controllerCanvas.width = innerWidth;
// controllerCanvas.height = innerHeight;
// const FPS = 120;
// function clearBG() {
//   ctx.fillStyle = "#101c35";
//   ctx.fillRect(0, 0, controllerCanvas.width, controllerCanvas.height);
// }
// function drawCircle(x, y, radius, color) {
//   ctx.beginPath();
//   ctx.arc(x, y, radius, 0, 2 * Math.PI);
//   ctx.fillStyle = color;
//   ctx.fill();
// }
// class JoyStick {
//   constructor(x, y, radius, handleRadius) {
//     this.x = x;
//     this.y = y;
//     this.ogX = x;
//     this.ogY = y;

//     this.radius = radius;
//     this.handleRadius = handleRadius;

//     this.handleFriction = 0.5;
//     this.ondrag = false;
//     this.touchPosX = 0;
//     this.touchPosY = 0;
//     this.listener();
//   }
//   listener() {
//     addEventListener("touchstart", (e) => {
//       this.touchPos = new Vector2(e.touches[0].pageX, e.touches[0].pageY); // Get touch position
//       if (this.touchPos.sub(this.origin).mag() <= this.radius)
//         this.ondrag = true; // Check if touch is inside the joystick
//     });

//     addEventListener("touchend", () => {
//       this.ondrag = false; // Stop dragging on touch end
//     });

//     addEventListener("touchmove", (e) => {
//       this.touchPos = new Vector2(e.touches[0].pageX, e.touches[0].pageY); // Update touch position on move
//     });

//     // Mouse Events
//     addEventListener("mousedown", (e) => {
//       this.touchPos = new Vector2(e.pageX, e.pageY); // Get mouse position
//       if (this.touchPos.sub(this.origin).mag() <= this.radius)
//         this.ondrag = true; // Check if click is inside the joystick
//     });

//     addEventListener("mouseup", () => {
//       this.ondrag = false; // Stop dragging on mouse up
//     });

//     addEventListener("mousemove", (e) => {
//       this.touchPos = new Vector2(e.pageX, e.pageY); // Update mouse position on move
//     });
//   }

//   draw() {
//     //handle
//     drawCircle(this.x, this.y, this.handleRadius, "#3a1852");
//     drawCircle(this.x, this.y, this.radius, "#8827a5");
//   }
//   update() {
//     this.draw();
//   }
// }
// clearBG();
// let handleRadius = 80;
// let joystick = new JoyStick(200, 130, handleRadius / 2, handleRadius);
// joystick.draw();

// setInterval(() => {
//   joystick.update();
// }, 1000 / FPS);
