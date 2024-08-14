import { useState,useEffect } from "react"
import { Link } from "react-router-dom"


function Mypets(){
    const [pets,setPets] = useState({})

    return(
        <section>
            <h1>Meus Pets</h1>
            <Link to= '/pets/addpet'>Cadastrar Pet</Link>
            <div>{pets.length > 0 ? <section></section> : <p>Você ainda não tem pets cadastrados</p>}</div>
        </section>
    )
}

export default Mypets