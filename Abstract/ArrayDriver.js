"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const circle_1 = require("./circle");
const rectangle_1 = require("./rectangle");
let myCircle = new circle_1.circle(5, 10, 20);
let myRectangle = new rectangle_1.rectangle(0, 0, 3, 7);
let myShape = [];
myShape.push(myCircle);
myShape.push(myRectangle);
for (var teamShape of myShape) {
    console.log(teamShape.getInfo());
    console.log(teamShape.calcuateArea());
    console.log("\n");
}
//# sourceMappingURL=ArrayDriver.js.map