package com.neosoftPOC.Services;

import com.neosoftPOC.Entity.Users;
import com.neosoftPOC.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServices {


    @Autowired
    private UserRepo userRepo;


    public String save(Users users){
        return userRepo.save(users) != null ? "Data inserted successfully" : "Data not inserted";
    }

    public List<Users> getAll(){
        return userRepo.findAll();
    }

    public Users get(Long Id) {
        return userRepo.findById(Id).orElse(new Users());

    }

}
