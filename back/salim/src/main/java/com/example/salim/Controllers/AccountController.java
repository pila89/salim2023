package com.example.salim.Controllers;

import com.example.salim.Repositories.RoleRepositorie;
import com.example.salim.Repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts/")
public class AccountController {
@Autowired
    private  UserRepositorie userRepositorie;
    private RoleRepositorie roleRepositorie;
}
