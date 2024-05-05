const fs = require('fs')

console.log('inicio')

fs.writeFile('Arquivo.txt','ola mundo',function(erro){
    setTimeout(function(){
        console.log('Arquivo criado')
    },3000)
})

console.log('Fim')