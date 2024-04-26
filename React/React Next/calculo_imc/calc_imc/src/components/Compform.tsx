interface Imcprops{
    label:string,
    state:any,
    funcao:any
}

export default function Compform(props:Imcprops){
    return(
        <main className="flex mx-2">
            <label className="w-[60px]">{props.label}</label>
            <input className="border p-2 w-full rounded-lg" value={props.state} onChange={(evt)=>props.funcao(evt.target.value)} />
        </main>
    )
}