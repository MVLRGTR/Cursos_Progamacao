class Curso{
    canal=null
    curso=null
    constructor(canal:any,curso:any){
        this.canal = canal
        this.curso = curso
    }
}

let c1=new Curso('CFBcurso','typescript')
console.log(c1.canal)
console.log(c1.curso)

/*Utilizamos para compilar na ultima versão do javascript o seguinte comando tsc arquivo --target "ES2016" ou a versão mais recente */
/*Para forcamos pegar a ultima versão do javascript utilizamos o comando no final "ESNEXT" */
/*Também podemos utilizar o tsc --init para gerar um arquivo de configuração de compilação */
/*"rootDirs": ["./src"], mudamos isso para mostrar aonde estão os aruivos ts ,"outDir": "./build" local aonde será compilado o jse por ultimo "removeComments": true, para remover comentarios na compilação */
/*Por ultimo utilizamod o tsc -w para inicializar o compilador automatico */