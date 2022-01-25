import { coach } from "./Coach";
import { cricketcoach } from "./cricketcoach";
import { golfcoach } from "./golfcoach";

let myCricketCoach=new cricketcoach();
let myGolfCoach=new golfcoach();

let myCoach: coach[]=[];
myCoach.push(myCricketCoach);
myCoach.push(myGolfCoach);

for(var coacches of myCoach){
    console.log(coacches.getdDailyWorkout());
    
}