"use strict"

//let - variavel que só pode ser acessada no scope aonde ela foi criada  exemplo abaixo---------------------------------------------------

function teste(){
    if(true){
        let nome ="Bruno"
        console.log('Dentro do IF teste: ' + nome)
    }
    console.log("dentro de teste: " + nome)//Teremos um erro nessa linha pois o let faz com que nome esteja conhecido apenas dentro do if.
}
teste()
console.log(nome) 

//var - temos um comportamento semelhante ao let só que o var permite uma abrangencia um pouco maior---------------------------------------

function teste(){
    if(true){
        var nome ="Bruno"
        console.log('Dentro do IF teste: ' + nome)
    }
    console.log("dentro de teste: " + nome)
}
teste()
console.log(nome)//Teremos um erro nessa linha pois o var faz com que nome esteja conhecido apenas dentro do teste. 