import React, {  useEffect, useState} from 'react'
import axios from 'axios'

const TableUsuario = () => {

    const [users, setUsers] = useState({documents:[]})
    useEffect(()=>{
        const fetchUsersList = async () => {
            const {data} = await axios(
                "http://localhost:8080/usuarios"
            );
            setUsers({documents:data});
            console.log(data);
        };
        fetchUsersList();
    }, [setUsers]);

    return (
        <div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col">Nombres</th>
                        <th scope="col">Apellidos</th>
                        <th scope="col">Correo</th>
                        <th scope="col">Años de Experiencia</th>
                    </tr>
                </thead>
                <tbody>
                    {users.documents && 
                    users.documents.map((item) => (
                        <tr key ={item.id}>
                            <td>{item.nombres}</td>
                            <td>{item.apellidos}</td>
                            <td>{item.correo}</td>
                            <td>{item.añosExperiencia}</td>
                        </tr>
                    ))
                    }
                </tbody>
            </table>
        </div>
    )
}

export default TableUsuario
