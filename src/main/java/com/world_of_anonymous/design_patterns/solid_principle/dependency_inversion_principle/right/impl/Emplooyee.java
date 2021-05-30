package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.impl;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IEmplooyee;

public class Emplooyee implements IEmplooyee {

    private String name;
    private String email;
    private int phoneNo;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getPhoneNo() {
        return phoneNo;
    }

    @Override
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
