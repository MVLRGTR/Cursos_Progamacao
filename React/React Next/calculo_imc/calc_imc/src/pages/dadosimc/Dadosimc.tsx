import { useRouter } from "next/router"
import { useState,useEffect } from "react"

export default function Dadosimc(){

    const [nome,Setnome] = useState<any>('')
    const [peso,Setpeso] = useState<any>('')
    const [altura,Setaltura] = useState<any>('')
    const [imc,Setimc] = useState<any>('')
    const [data,Setdata] = useState<any>('')

    const router=useRouter()
    const {p_peso,p_altura,p_imc}=router.query //Aqui eu pego os dados da URL que passei na pagina anterior

    useEffect(()=>{
        Setpeso(p_peso)
        Setaltura(p_altura)
        Setimc(p_imc)
        Setdata('01-04-2024')
    })
    

    return(
        <main>
            <section className='campoForm'>
                <label>Nome</label>
                <input className='inputDados' type="text" value={nome} onChange={(evt)=>Setnome(evt.target.value)}/>
            </section>
            <section className='campoForm'>
                <label>Peso</label>
                <input className='inputDados' type="text" value={peso} readOnly/>
            </section>
            <section className='campoForm'>
                <label>Altura</label>
                <input className='inputDados' type="text" value={altura} readOnly/>
            </section>
            <section className='campoForm'>
                <label>IMC</label>
                <input className='inputDados' type="text" value={Number(imc).toFixed(2)} readOnly/>
            </section>
            <section className='campoForm'>
                <label>Data</label>
                <input className='inputDados' type="text"value={data} readOnly/>
            </section>
            <section className='campoForm'>
                <button className='inputDados bg-indigo-900  rounded-lg cursor-pointer text-white'>GRAVAR</button>
            </section>
            <section>
                <article>
                    <p>Nome</p>
                    <p>Peso</p>
                    <p>Altura</p>
                    <p>IMC</p>
                    <p>Data</p>
                </article>
            </section>
        </main>
    )
}