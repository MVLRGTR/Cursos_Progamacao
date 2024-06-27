"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.validation = void 0;
const validation = () => (req, res, next) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        yield queryValidation.validate(req.body, { abortEarly: false });
        return next();
    }
    catch (err) {
        const yupErro = err;
        const ValidationErrors = {};
        yupErro.inner.forEach(error => {
            if (error.path === undefined)
                return;
            ValidationErrors[error.path] = error.message;
        });
        return res.status(StatusCodes.BAD_REQUEST).json({
            erros: ValidationErrors
        });
    }
});
exports.validation = validation;
