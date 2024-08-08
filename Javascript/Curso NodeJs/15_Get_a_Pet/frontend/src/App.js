import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Login from './components/pages/auth/Login'
import Register from './components/pages/auth/Register'
import Home from './components/pages/Home'
/*Components */
import Navbar from './components/Layouts/Navbar'
import Footer from './components/Layouts/Footer'
import Container from './components/Layouts/Container'
/*context */
import { UserProvider } from './context/UserContext'

function App() {
  return (
    <Router>
      <UserProvider>
        <Navbar />
        <Container>
          <Routes>

            <Route path='/login' element={<Login />} />
            <Route path='/register' element={<Register />} />
            <Route path='/' element={<Home />} />

          </Routes>
        </Container>
        <Footer />
      </UserProvider>
    </Router>
  );
}

export default App;
