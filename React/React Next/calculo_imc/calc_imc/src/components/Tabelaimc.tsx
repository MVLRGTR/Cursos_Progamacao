interface Tabelaimcprops{
    imc:number
}

export default function Tabelaimc(props:Tabelaimcprops){
    return(
        <main className="mx-2 mb-3">
            <section className="flex ">
                <p className="w-1/2 border text-center font-bold">Classificação</p>
                <p className="w-1/2 border text-center font-bold">IMC</p>
            </section>
            <section className={"flex " + (props.imc>0 &&  props.imc<18.5?'destaque':'')}>  {/*a sintaxe em questão funciona da seguinte maneira ,se a condição for satisfeita utilizo aclasse .destaque senão retorno nada */}
                <p className="w-1/2 border">Abixo do Peso</p>
                <p className="w-1/2 border">Abaixo de 18,5</p>
            </section>
            <section className={"flex " + (props.imc >= 18.5 && props.imc <= 24.9?"destaque":'')}>
                <p className="w-1/2 border">Peso Normal</p>
                <p className="w-1/2 border">Entre 18,5 e 24,9</p>
            </section>
            <section className={"flex " + (props.imc >= 25 && props.imc <= 29.9?'destaque':'')}>
                <p className="w-1/2 border">Sobrepeso</p>
                <p className="w-1/2 border">Entre 25 e 29,9</p>
            </section>
            <section className={"flex " + (props.imc >= 30 && props.imc <= 34.9?'destaque':'')}>
                <p className="w-1/2 border">Obesidade Grau I</p>
                <p className="w-1/2 border">Entre 30 e 34,9</p>
            </section>
            <section className={"flex " + (props.imc >= 35 && props.imc <= 39.9?'destaque':'')}>
                <p className="w-1/2 border">Obesidade Grau II</p>
                <p className="w-1/2 border">35 e 39,9</p>
            </section>
            <section className={"flex " + (props.imc>40?'destaque':'')}>
                <p className="w-1/2 border">Obesidade Grau III</p>
                <p className="w-1/2 border">Maior que 40</p>
            </section>
        </main>
    )
}