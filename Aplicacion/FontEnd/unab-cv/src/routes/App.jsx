import '../App.css';


import React from "react";
import {
  BrowserRouter,
  Switch,
  Route,
  Link,
  NavLink
} from "react-router-dom";

import Inicio from '../pages/Inicio';
import CargarDatos from '../pages/CargarDatos';
import ListarDatos from '../pages/ListarDatos';
import Contacto from '../pages/Contacto';
import About from '../pages/About';
import NotFound from '../pages/NotFound';

import Layout from '../container/Layout';


function App() {
  return (
    <BrowserRouter>
      <Layout>
        <switch>
          <Route  exact path="/" component={Inicio}/>
          <Route  exact path="/CargarDatos" component={CargarDatos}/>
          <Route  exact path="/ListarDatos" component={ListarDatos}/>
          <Route  exact path="/Contacto" component={Contacto}/>
          <Route  exact path="/about" component={About}/>
          <Route  path="*" component={NotFound}/>
        </switch>
      </Layout>
    </BrowserRouter>
  );
}

export default App;
