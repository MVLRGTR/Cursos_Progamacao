function logar(user:string,password:string):void{
    console.log(`User  : ${user}\nSenha : ${password}`)
}

logar('caio','12345')

function soma(n1:number = 0,n2:number = 0):number{
    let resultado:number = 0
    resultado = n1+n2
    return resultado
}

console.log(soma(10,20))