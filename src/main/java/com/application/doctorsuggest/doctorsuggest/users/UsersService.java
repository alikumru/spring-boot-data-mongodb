package com.application.doctorsuggest.doctorsuggest.users;

import java.util.List;

public interface UsersService {

    public String createUser(UsersModel usersModel);

    public void deleteUser(UsersModel usersModel);

    public void updateUser(UsersModel userModel, String editInfos);

    public List<UsersModel> getAllUsers();

    public UsersModel getSingleUser(UsersModel usersModel);

    public void delete(UsersModel usersModel) ;

}
