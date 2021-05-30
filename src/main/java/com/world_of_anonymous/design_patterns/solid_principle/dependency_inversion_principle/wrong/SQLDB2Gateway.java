package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.wrong;

public class SQLDB2Gateway {
    public void updateDB(String data) {
        System.out.println("updating db >>> "+data);
    }
}
