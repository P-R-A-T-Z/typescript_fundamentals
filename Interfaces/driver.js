"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const cricketcoach_1 = require("./cricketcoach");
const golfcoach_1 = require("./golfcoach");
let myCricketCoach = new cricketcoach_1.cricketcoach();
let myGolfCoach = new golfcoach_1.golfcoach();
let myCoach = [];
myCoach.push(myCricketCoach);
myCoach.push(myGolfCoach);
for (var coacches of myCoach) {
    console.log(coacches.getdDailyWorkout());
    console.log(coacches);
}
//# sourceMappingURL=driver.js.map