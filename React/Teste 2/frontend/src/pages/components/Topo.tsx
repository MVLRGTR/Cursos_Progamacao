import Nav from 'react-bootstrap/Nav';


export default function Topo() {
  return (
    <>
      <main>
        <h1>CRUD Simples React</h1>
        <Nav
          activeKey="/"
        >
          <Nav.Item>
            <Nav.Link href="/">Pagina Inicial</Nav.Link>
          </Nav.Item>
          <Nav.Item>
            <Nav.Link href="/Alunos">Cadastro de Alunos</Nav.Link>
          </Nav.Item>
          <Nav.Item>
            <Nav.Link href="/Sobre">Sobre</Nav.Link>
          </Nav.Item>
        </Nav>
        <p className='linha'></p>

      </main>
    </>
  );
}
