const fs = require('fs')

console.log('inicio')

fs.writeFileSync('Arquivo.txt','Olá Mundo')

console.log('Fim')