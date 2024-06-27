const fs = require('fs')

fs.rename('arquivo.txt','novoarquivo.txt',function(erro){
    if(erro){
        console.log(erro)
        return
    }
    console.log('Arquivo renomeado com sucesso')
})