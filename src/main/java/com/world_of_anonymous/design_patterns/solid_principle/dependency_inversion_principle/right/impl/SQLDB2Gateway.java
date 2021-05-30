package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.impl;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IDBGateway;

public class SQLDB2Gateway implements IDBGateway {
    public void updateDB(String data) {
        System.out.println("updating sql db >>> "+data);
    }
}
