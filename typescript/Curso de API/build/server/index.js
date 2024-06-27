"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const server_1 = require("./server");
server_1.server.listen(process.env.PORT || 3333, () => { console.log(`App Rodando na porta ${process.env.PORT || 3333}`); });
