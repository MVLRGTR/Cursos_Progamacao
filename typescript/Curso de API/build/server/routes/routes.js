"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.router = void 0;
const express_1 = __importDefault(require("express"));
const controller_1 = require("../controllers/controller");
const router = (0, express_1.default)();
exports.router = router;
router.get('/', (req, res) => {
    return res.send('Olá , DEV !');
});
router.post('/cidades', controller_1.CidadesController.createBodyValidation, controller_1.CidadesController.create);
