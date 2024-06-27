"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.router = void 0;
const express_1 = __importDefault(require("express"));
const http_status_codes_1 = require("http-status-codes");
const router = (0, express_1.default)();
exports.router = router;
router.get('/', (req, res) => {
    return res.send('Olá , DEV !');
});
router.post('/teste', (req, res) => {
    console.log(req.body);
    return res.status(http_status_codes_1.StatusCodes.UNAUTHORIZED).json(req.body);
});
