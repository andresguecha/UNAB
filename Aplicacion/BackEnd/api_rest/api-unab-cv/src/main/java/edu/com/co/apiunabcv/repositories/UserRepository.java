package edu.com.co.apiunabcv.repositories;

//import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.com.co.apiunabcv.models.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String>{

    //ArrayList <UserModel> findbyNombre(String nombre);
    
}
