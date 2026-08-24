import { GameObject } from "./GameObject.js"
import { Ground } from "./Ground.js"
import { Player } from "./Player.js"

// module aliases
export const Engine = Matter.Engine,
    Render = Matter.Render,
    Runner = Matter.Runner,
    Bodies = Matter.Bodies,
    Composite = Matter.Composite;

// create an engine
export const engine = Engine.create()
const gameCanvas = document.getElementById("gameArea");
// create a renderer
export const render = Render.create({
    element: document.body,
    engine: engine,
    canvas: gameCanvas
    
});

var qrcode = new QRCode(document.getElementById("qrcode"), {
	text: "https://vaanibhatt.github.io/potato-panic/src/controller.html",
	width: 192,
	height: 192,
	colorDark : "#000000",
	colorLight : "#ffffff",
	correctLevel : QRCode.CorrectLevel.H
})


render.canvas.width = window.innerWidth
render.canvas.height = window.innerHeight

let player = new Player(100, 100)
let ground = new Ground(1000, 900, 2000, 200)


Render.run(render)

// create runner
const runner = Runner.create()

// run the engine
Runner.run(runner, engine)


