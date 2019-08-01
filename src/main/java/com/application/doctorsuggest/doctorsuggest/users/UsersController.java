package com.application.doctorsuggest.doctorsuggest.users;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UsersServiceImpl usersServiceImpl;

    @PostMapping(value = "/createUser")
    public String createUser(@RequestBody UsersModel usersModel) throws JSONException {

        JSONObject result = new JSONObject();
        try{
            result.put("result",usersServiceImpl.createUser(usersModel));
        }catch (Exception e){
            result.put("result",e.getMessage());
        }
        return result.toString();
    }

    @PostMapping(value = "/deleteUser/{id}")
    public void deleteUser(@RequestBody UsersModel userModel){
        //usersServiceImpl.delete(usersServiceImpl.findBy_id(id));
        usersServiceImpl.deleteUser(userModel);
    }

    @PostMapping(value = "/updateuser")
    public void updateUser(@RequestBody UsersModel userModel,String updateInfo){
        usersServiceImpl.updateUser(userModel,updateInfo);
    }

    @PostMapping(value = "/getAllUsers")
    public List<UsersModel> getAllUsers(){

            return usersServiceImpl.getAllUsers();
    }

    @PostMapping(value = "/getSingleUser")
    public void getSingleuser(@RequestBody UsersModel userModel){

        usersServiceImpl.getSingleUser(userModel);
    }

    @RequestMapping(value = "/test")
    public String getTest(){
        return "Hello world";
    }

    @RequestMapping(value = "/deleteTest")
    public void deletePet(@RequestParam String id) {
        //usersServiceImpl.delete(usersServiceImpl.findById(id));
    }

}
