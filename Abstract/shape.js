"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.shape = void 0;
class shape {
    //private _x: number;
    constructor(_x, _y) {
        this._x = _x;
        this._y = _y;
    }
    get x() {
        return this._x;
    }
    set x(value) {
        this._x = value;
    }
    //private _y: number;
    get y() {
        return this._y;
    }
    set y(value) {
        this._y = value;
    }
    getInfo() {
        return `x=${this._x}, y=${this._y}`;
    }
}
exports.shape = shape;
//# sourceMappingURL=shape.js.map