package com.test.mmm.service;

import com.test.mmm.entity.Users;
import com.test.mmm.repository.UsersRepository;

import java.util.Date;

/**
 * Created by Marian_Mykhalchuk on 9/9/2015.
 */
public class InitUserCreateService {
    public InitUserCreateService(UsersRepository usersRepository) {
        createAdmin(usersRepository);
    }

    private void createAdmin(UsersRepository usersRepository) {
        Users admin = new Users();
        admin.setLogin("admin");
        admin.setFirstname("admin");
        admin.setLastname("adminovych");
        admin.setCountry("Ukraine");
        admin.setPassword("admin");
        admin.setSex("M");
        admin.setEmail("my1@mail.box");
        admin.setPhone("+380935648216");
        admin.setAddress1("Lviv");
        admin.setState("Lviv");
        admin.setZip("79000");
        admin.setRegistereddt(new Date());
        admin.setLastvisitdt(new Date());
        usersRepository.save(admin);
    }
}
