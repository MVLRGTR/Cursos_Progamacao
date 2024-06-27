import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import { FaShoppingCart } from 'react-icons/fa';
import ProductCard from '@/components/testebutton';



// export default function Cardapio() {
//     return (
//         <div>
//             <Header />
//             {
//                 categoria.map((elemento: any) => {
//                     return (
//                         <Menucardapio key={elemento.id} categoria={elemento.categoria} />
//                     )
//                 })
//             }
//             {
//                 produtos.map((grupoProdutos: any) => { // Renomeie elemento para grupoProdutos para maior clareza
//                     return (
//                         <div key={grupoProdutos[0].id} className="divisao"> {/* Suponho que o ID do grupo é o ID do primeiro produto */}
//                             <div className="linha"></div>
//                             <p>Teste</p>
//                             <div className="linha"></div>
//                             {grupoProdutos.map((produto: any) => ( // Adicione o bloco {} ao redor do map
//                                 <ProdutosCardapio
//                                     key={produto.id}
//                                     img={produto.img}
//                                     nome={produto.nome}
//                                     descricao={produto.descricao}
//                                     categoria={produto.categoria}
//                                     valor={produto.valor}
//                                 />
//                             ))}
//                         </div>
//                     );
//                 })
//             }
//         </div>
//     );
// }

// export default class Globais {
//     static usuario: string = 'User01';
//     static carrinho: Array<any> = JSON.parse(localStorage.getItem('carrinho') || '[]');

//     static verificaradd(item: any): boolean {
//         let verificador: boolean = true;

//         this.carrinho.forEach((elemento) => {
//             if (elemento.id === item.id) {
//                 verificador = false;
//             }
//         });

//         return verificador;
//     }

//     static adicionarAocarrinho(item: any) {
//         if (this.verificaradd(item)) {
//             this.carrinho.push(item);
//             localStorage.setItem('carrinho', JSON.stringify(this.carrinho));
//             console.log('Foi adicionado');
//         } else {
//             console.log('Não foi adicionado');
//         }
//     }

//     static limparCarrinho() {
//         localStorage.removeItem('carrinho');
//         this.carrinho = [];
//     }
// }


