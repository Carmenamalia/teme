package com.springapps.bookingapp.dto;

import com.springapps.bookingapp.entities.RoleType;

public class UserRequestDTO {

    private Long userId;
    private String name;
    private RoleType roleType;

    public UserRequestDTO() {
    }
    public UserRequestDTO( String name, RoleType roleType) {
        this.name = name;
        this.roleType = roleType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
