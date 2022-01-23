import {shape} from './shape';
import {circle} from './circle';
import {rectangle} from './rectangle'
let myShape=new shape(5,10);
console.log(myShape.getInfo());

let myCircle=new circle(5,10,20);
console.log(myCircle.getInfo());

let myRectangle=new rectangle(5,10,15,20);
console.log(myRectangle.getInfo());