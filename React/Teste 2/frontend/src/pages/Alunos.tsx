import React from "react";
import { Table } from "react-bootstrap";
import Topo from "./components/Topo";
import Button from 'react-bootstrap/Button';



class Alunos extends React.Component {
    constructor(props: any) {
        super(props);

        this.state = {
            alunos: []
        }

    }

    componentDidMount(): void {
        this.buscarAluno()
    }

   

    componentWillUnmount(): void {
        alert('O componente alunos foi desmontado')
    }


    buscarAluno = () => {
        fetch('http://localhost:8800').then(resposta => resposta.json()).then(dados => {
            this.setState ({alunos : dados})   
        })
    }

    deletarAluno=(id:any)=>{
        fetch('http://localhost:8800/'+id,{method:'DELETE'}).then(resposta => {
            if(resposta.ok){
                this.buscarAluno()
            }
         })
    }

    render() {
        return (
            <>
                <Topo />
                <Table striped bordered hover>
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Email</th>
                            <th>Opções</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.alunos.map((aluno) =>
                                <tr key={aluno.id}>
                                    <td>{aluno.id}</td>
                                    <td>{aluno.nome}</td>
                                    <td>{aluno.email}</td>
                                    <td>Atualizar   <Button variant="danger" onClick={()=> this.deletarAluno(aluno.id)}>Excluir</Button>{' '}</td>
                                </tr>
                            )
                        }

                    </tbody>
                </Table>
            </>
        )
    }
}

export default Alunos


