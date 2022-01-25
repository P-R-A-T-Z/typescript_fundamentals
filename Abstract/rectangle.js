"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.rectangle = void 0;
const shape_1 = require("./shape");
class rectangle extends shape_1.shape {
    constructor(_x, _y, _length, _width) {
        super(_x, _y);
        this._length = _length;
        this._width = _width;
    }
    calcuateArea() {
        return this._length * this._width;
    }
    get width() {
        return this._width;
    }
    set width(value) {
        this._width = value;
    }
    get length() {
        return this._length;
    }
    set length(value) {
        this._length = value;
    }
    getInfo() {
        return super.getInfo() + ` length=${this.length} width=${this._width}`;
    }
}
exports.rectangle = rectangle;
//# sourceMappingURL=rectangle.js.map