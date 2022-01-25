 import {shape} from './shape';
 import {circle} from './circle';
 import { rectangle } from './rectangle';

 let myCircle=new circle(5,10,20);
 let myRectangle=new rectangle(0,0,3,7);

 let myShape:shape[]=[];
 myShape.push(myCircle);
 myShape.push(myRectangle);


 for(var teamShape of myShape){
    console.log(teamShape.getInfo());
    console.log(teamShape.calcuateArea());
    console.log("\n");
    
 }