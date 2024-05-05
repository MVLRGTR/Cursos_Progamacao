const fs = require('fs')
fs.unlink('arquivo.txt',function(erro){
    if(erro){
        console.log('Erro',erro)
        return
    }
    console.log('Arquivo Removido')
})