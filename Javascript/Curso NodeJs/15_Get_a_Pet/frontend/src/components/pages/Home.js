import { useState,useEffect } from "react"
import api from "../../utils/api"
import { Link } from "react-router-dom"
import styles from './Home.module.css'

function Home(){
    const [pets,setPets] = useState([])

    useEffect(()=>{
        api.get('/pets')
        .then((response)=>{
            setPets(response.data.pets)
            console.log(pets)
        }).catch((Erro)=>{
            return Erro.response.data
        })
    },[])


    return(
        <section>
            <div>
                <h1>Adote um Pet</h1>
                <p>Veja os detalhes de cada um e conheça o tutor deles</p>
            </div>
            <div>
                {pets.length > 0 && (
                    pets.map((pet)=>(
                        <div>
                            <p>Imagem do Pet</p>
                            <h3>{pet.name}</h3>
                            <p>
                                <span className="bold">Peso :</span>{pet.weight}kg
                            </p>
                            {pet.available === true ? (
                                <Link to={`pet/${pet._id}`}>Mais Detalhes</Link>
                            ) : 
                            (
                                <p>Adotado</p>
                            ) }
                        </div>
                    ))
                )}
                {pets.length === 0 && (
                    <p>Não existem pets cadastrados ou disponíveis para adoção no momento !</p>
                )}
            </div>
        </section>
    )
}

export default Home