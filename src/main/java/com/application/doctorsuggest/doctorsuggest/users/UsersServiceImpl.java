package com.application.doctorsuggest.doctorsuggest.users;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    private static MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
    private static DB db = mongoClient.getDB("Doktorlar");


    @Override
    public String createUser(UsersModel usersModel) {
        try {
            UsersModel result =usersRepository.save(usersModel);
            System.out.println(result);
            return result.getUsername();
        }catch(Exception e){
            System.out.println( e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public void deleteUser(UsersModel usersModel) {

        DBCollection collection = db.getCollection("Users");
        BasicDBObject query = new BasicDBObject();
        query.append("_id", usersModel.getId());
        collection.remove(query);
    }

    @Override
    public void updateUser(UsersModel userModel, String editInfos) {

    }

    @Override
    public List<UsersModel> getAllUsers() {

        return  usersRepository.findAll();
    }

    @Override
    public UsersModel getSingleUser(UsersModel usersModel) {

        try {
            DBCollection collection = db.getCollection("Users");
            BasicDBObject query = new BasicDBObject();
            query.append("username",usersModel.getUsername());
            collection.remove(query);
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public void delete(UsersModel usersModel) {

    }


}
