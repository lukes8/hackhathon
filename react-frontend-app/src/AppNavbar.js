import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import { Outlet, Link } from "react-router-dom";
import Container from 'react-bootstrap/Container';


const AppNavbar = () => (
    <>
  
    <Navbar className="shadow bg-primary" sticky="top" variant="dark">
      <Container>
      <Navbar.Brand className="mr-5" href="gifts">Darujeme Jídlo</Navbar.Brand>
      <Nav className="me-auto">
        <Nav.Link href="gifts">Potravinové Dary</Nav.Link>
        <Nav.Link href="addGift">Vložit Dar</Nav.Link>
        <Nav.Link href="contact">O projektu</Nav.Link>
      </Nav>
      </Container>
    </Navbar>
    <Outlet />
  
  </>
  );

export default AppNavbar;
