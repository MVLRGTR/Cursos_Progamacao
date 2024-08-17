import styles from './PetDetails.module.css'
import api from '../../../utils/api'
import { useState,useEffect } from 'react'
import { useParams,Link } from 'react-router-dom'
import useFlashMessage from '../../../hooks/useFlashMessage'

function PetDetails(){

    const[pet,setPet] = useState({})
    const {id} = useParams()
    const {setFlashmessage} = useFlashMessage()
    const [token] = useState(localStorage.getItem('token') || '')

    useEffect(()=>{
        api.get(`/pets/${id}`).
        then((response)=>{
            setPet(response.data.pet)
        }).catch((Erro)=>{
            return Erro.response.data
        })
    },[id])

    return(
        <>  
            {pet.name && (
                <section>
                    <div>
                        <h1>Conhecendo o Pet : {pet.name}</h1>
                        <p>Se tiver interesse marque uma visita para conhecê-lo</p>
                    </div>
                    <div>
                        {pet.images.map((image,index)=>(
                            <img src={`${process.env.REACT_APP_API}images/pets/${image}`} key={index}/>
                        ))}
                    </div>
                    <p>
                       <span className='bold'>Peso:</span> {pet.weight}Kg
                    </p>
                    <p>
                       <span className='bold'>Idade:</span> {pet.age} Meses
                    </p>
                    {token ? (
                        <button>Solicitar Visita </button>
                    ) : 
                    (
                        <p>Você precisa <Link to='/register'>criar uma conta</Link> para solicitar a visita</p>
                    )}
                </section>
            )}
        </>    
    )
}

export default PetDetails