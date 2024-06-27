import { useState,useEffect } from "react"
import Compform from "@/components/Compform";
import Tabelaimc from "@/components/Tabelaimc";
import Link from "next/link";

export default function Calcimc(){
    const [peso,Setpeso] = useState<number>(0);
    const [altura,Setaltura] = useState<number>(0);
    const [imc,Setimc] = useState<number>(0)

    function calcular(){
        let res = peso/(altura*altura)
        Setimc(res)
    }

    return(
        <main className="flex flex-col border border-black  w-[300px] gap-5">
            <p className='w-full text-center bg-zinc-400 font-bold text-lg' >Calculo de Massa Corporea I.M.C</p>
            <Compform label="peso" state={peso} funcao={Setpeso}/>
            <Compform label="altura" state={altura} funcao={Setaltura}/>
            <button className="bg-indigo-900 mx-2 p-2 rounded-lg cursor-pointer text-white" onClick={calcular}>Calcular</button>
            <Link href={{
                pathname:'/dadosimc/Dadosimc',
                query:{
                    p_peso:peso,
                    p_altura:altura,
                    p_imc:imc
                }
            }} className="bg-indigo-900 mx-2 p-2 rounded-lg cursor-pointer text-white text-center" >Dados IMC</Link>
            <p className="bg-zinc-100 p-1">Resultado : {imc.toFixed(2)}</p>
            <Tabelaimc imc={imc}/>
        </main>
    )
}