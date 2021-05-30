package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.impl;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IDBGateway;

public class OracleDB2Gateway implements IDBGateway {
    @Override
    public void updateDB(String data) {
        System.out.println("updating oracle db >>> "+data);
    }
}
