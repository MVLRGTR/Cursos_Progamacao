import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Login from './components/pages/auth/Login'
import Register from './components/pages/auth/Register';
import Home from './components/pages/Home';
/*Components */
import Navbar from './components/Layouts/Navbar';
import Footer from './components/Layouts/Footer';
import Container from './components/Layouts/Container'

function App() {
  return (
    <Router>
      <Navbar />
      <Container>
        <Routes>

          <Route path='/login' element={<Login />} />
          <Route path='/register' element={<Register />} />
          <Route path='/' element={<Home />} />

        </Routes>
      </Container>
      <Footer />
    </Router>
  );
}

export default App;
