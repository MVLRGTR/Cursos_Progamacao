import Input from "../../form/Input"
import styles from '../../../components/form/Form.module.css'
import { Link } from "react-router-dom"
function Register(){
    function handleChange(event){

    }
    return(
        <section className={styles.form_container}>
            <h1>Registrar</h1>
            <form>
                <Input text='Nome' type='text' name='name' placeholder='Digite seu nome' handleOnChange={handleChange}></Input>
                <Input text='Telefone' type='text' name='phone' placeholder='Digite seu telefone' handleOnChange={handleChange}></Input>
                <Input text='E-mail' type='email' name='email' placeholder='Digite seu E-mail' handleOnChange={handleChange}></Input>
                <Input text='Senha' type='password' name='password' placeholder='Digite sua Senha' handleOnChange={handleChange}></Input>
                <Input text='Confirmação de Senha' type='password' name='confirmpassword' placeholder='Digite sua Senha novamente' handleOnChange={handleChange}></Input>
                <input type='submit' value='Cadastrar'/>
            </form>
            <p>
                Já tem conta ? <Link to='/login'>Clique aqui</Link>
            </p>
        </section>
    )
}

export default Register