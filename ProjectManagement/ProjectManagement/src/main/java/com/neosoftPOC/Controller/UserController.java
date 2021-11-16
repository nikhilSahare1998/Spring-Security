package com.neosoftPOC.Controller;

import com.neosoftPOC.Entity.Users;
import com.neosoftPOC.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/save")
    @RolesAllowed({"USER","ADMIN"})
    public ResponseEntity<String> save(@RequestBody Users users) {
        return ResponseEntity.ok(userServices.save(users));
    }

    @GetMapping("/get/{Id}")
    @RolesAllowed("ADMIN")
    public ResponseEntity<Users> get(@PathVariable Long Id){
        return ResponseEntity.ok( userServices.get(Id));
    }

    @GetMapping("/getAll")
    @RolesAllowed("ADMIN")
    public  ResponseEntity<List<Users>> getAll(){
        return ResponseEntity.ok(userServices.getAll());
    }

}
