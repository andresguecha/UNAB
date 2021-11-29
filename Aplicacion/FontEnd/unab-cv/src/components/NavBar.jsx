import React from "react";
import { Container, Nav, Navbar, NavDropdown, Form,FormControl, Button,img,a } from "react-bootstrap";
import { BrowserRouter, Switch, Route, Link, NavLink } from "react-router-dom";

const NavBar = () => {
    return (
//Nav bar con Bootstrap

        <Navbar bg="light" expand="lg">
        <Container fluid>

        <nav class="navbar navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="/">
                <img src="https://cdn-icons-png.flaticon.com/512/3135/3135731.png" alt="" width="30" height="24"/>
                UNAB-CV
            </a>
        </div>
        </nav> 


            <Navbar.Toggle aria-controls="navbarScroll" />
            <Navbar.Collapse id="navbarScroll">
            <Nav
                className="me-auto my-2 my-lg-0"
                style={{ maxHeight: "100px" }}
                navbarScroll
            >
                <Link to = "/" className="nav-link">Inicio</Link>
                <Link to = "/CargarDatos" className="nav-link">Carga datos</Link>
                <Link to = "/ListarDatos" className="nav-link">Listar datos</Link>
                <NavDropdown title="Nosotros" id="navbarScrollingDropdown">
                <NavDropdown.Item ><Link to = "/About" className="nav-link">Nosotros</Link></NavDropdown.Item>
                <NavDropdown.Item ><Link to = "/Contacto" className="nav-link">Contacto</Link></NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item ><Link to = "/Login" className="nav-link">iniciar Sesion</Link></NavDropdown.Item>
                </NavDropdown>
            </Nav>

            </Navbar.Collapse>
        </Container>
        </Navbar>



    //----------------------------------------------
    // Anterior Nab Var

    // <div className="btn-group gap-2 d-dm-flex">
    //     <Link to = "/" className="btn btn-dark" activeClassName="active">
    //     Home
    //     </Link>
    //     <Link to = "/Client" className="btn btn-dark">
    //     Client
    //     </Link>
    //     <Link to = "/Contact" className="btn btn-dark">
    //     Contact
    //     </Link>
    //     <Link to = "/About" className="btn btn-dark">
    //     About
    //     </Link>
    // </div>
  );
};

export default NavBar;