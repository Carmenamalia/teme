package com.springapps.bookingapp.service;

import com.springapps.bookingapp.dto.UserRequestDTO;
import com.springapps.bookingapp.entities.Role;
import com.springapps.bookingapp.entities.RoleType;
import com.springapps.bookingapp.entities.User;
import com.springapps.bookingapp.exceptions.ResourceNotFoundException;
import com.springapps.bookingapp.repositories.HotelRepository;
import com.springapps.bookingapp.repositories.RoleRepository;
import com.springapps.bookingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    UserRepository userRepository;
    RoleRepository roleRepository;
    HotelRepository hotelRepository;

    @Autowired
    public UserService(UserRepository userRepository, RoleRepository roleRepository, HotelRepository hotelRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.hotelRepository = hotelRepository;
    }

    @Transactional
    public User addNewUser(UserRequestDTO userRequestDTO) {
        // creez un nou user folosindu-ma de DTO
        User newUser = new User(userRequestDTO.getName());

        RoleType roleType = userRequestDTO.getRoleType();

        //caut acel rol in baza de date si apoi il adaug la user
        Role role = roleRepository.findByRoleType(roleType).orElseThrow(() -> new ResourceNotFoundException("role not found"));
        role.getUsers().add(newUser);
        // Updatez lista de roluri a userului
        newUser.getRoles().add(role);

        return userRepository.save(newUser);
    }
    @Transactional
    public Role addRoleToUser(RoleType roleType, Long userId){
        // caut rolul in repository dupa roletype

        User user = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found!"));
        Role role = roleRepository.findByRoleType(roleType).orElseThrow(()->new ResourceNotFoundException("role not found"));

        //daca este null il creez de la 0, ii setez roletype si il adaug la userul creat mai sus
//        if(role==null){
//            Role newRole = new Role();
//            newRole.setRoleType(roleType);
//            user.getRoles().add(newRole);
//            return roleRepository.save(newRole);
//        }else {
        // daca rolul exista il adaug la lista de useri si il salvez
        role.getUsers().add(user);
        // Updatez lista de roluri a userului
        user.getRoles().add(role);
        return roleRepository.save(role);//in loc de rol se poate salva user pt ca se cascadeaza

    }
}

