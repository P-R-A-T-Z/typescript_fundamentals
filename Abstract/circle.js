"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.circle = void 0;
const shape_1 = require("./shape");
class circle extends shape_1.shape {
    constructor(_x, _y, _radius) {
        super(_x, _y);
        this._radius = _radius;
    }
    calcuateArea() {
        return Math.PI * Math.pow(this._radius, 2);
    }
    get radius() {
        return this._radius;
    }
    set radius(value) {
        this._radius = value;
    }
    getInfo() {
        return super.getInfo() + ` radius=${this._radius}`;
    }
}
exports.circle = circle;
//# sourceMappingURL=circle.js.map