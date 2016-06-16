package com.logicon.service.interf;

import com.logicon.dto.Address;
import com.logicon.dto.User;

import java.time.LocalDate;


/**
 * Created by Dom on 16.06.2016.
 */
public interface UserService {

    User createUser(String name, String surname, LocalDate birthdate, String email);
}
