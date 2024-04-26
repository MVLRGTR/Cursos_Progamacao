import  * as create  from "./create" // aqui faço a importação de tudo de create

export const CidadesController = {
    ...create,                      //aqui trago todos o metodos criados em create
}                                   //esse arquivo agrupa todas as controllers que nós temos e faz o export dela como um objeto que terá todos os metodos para serem acessados de cidade

