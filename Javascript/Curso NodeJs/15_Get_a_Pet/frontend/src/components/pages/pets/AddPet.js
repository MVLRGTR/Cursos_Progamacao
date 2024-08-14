import styles from './AddPet.module.css'
import { useState,useEffect } from 'react'
import api from    '../../../utils/api'
import { useNavigate } from 'react-router-dom'
import useFlashMessage from '../../../hooks/useFlashMessage'
import PetForm from '../../form/PetForm'

function AddPet(){

    const [token] = useState(localStorage.getItem('token') || '')
    const [setFlasMessage] = useFlashMessage()
    const navigate = useNavigate()

    async function registerPet(pet) {
        let msgType = 'sucess'
        const formData = new FormData()

        await Object.keys(pet).forEach((key)=>{
            // if(key === 'images'){
            //     for(let i = 0 ; i < pet[key].length; i++){
            //         formData.append('images',pet[key][i])
            //     }
            // }else{
            //     formData.append(key,pet[key])
            // }
            if (key === 'images') {
                // Verifica se o valor de 'images' é um array antes de iterar
                if (Array.isArray(pet[key])) {
                  for (let i = 0; i < pet[key].length; i++) {
                    formData.append('images', pet[key][i]);
                  }
                } else {
                  console.error('O valor de "images" não é um array.');
                }
              } else {
                // Verifica se a propriedade existe no objeto antes de adicioná-la
                if (pet.hasOwnProperty(key)) {
                  formData.append(key, pet[key]);
                } else {
                  console.error(`A propriedade "${key}" não existe no objeto pet.`);
                }
              }
            

        })

        const data = await api.post('pets/create',formData,{
            Authorization : `Bearer ${JSON.parse(token)}`,
            'Content-Type' : 'multipart/form-data'
        })
        .then((response)=>{
            return response.data
        })
        .catch((Erro)=>{
            msgType = 'error'
            return Erro.response.data
        })

        setFlasMessage(data.mesage,msgType)
        navigate('/pets/mypets')
    } 

    return(
        <section className={styles.addpet_header}>
            <div>
                <h1>Cadastre um Pet</h1>
                <p>Depois ele ficará disponivél para adoção</p>
            </div>
            <PetForm handleSubmit={registerPet} btnText='Cadastar Pet'/>
        </section>
    )
}

export default AddPet