package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.impl.*;

public class Creator {

    public static IEmplooyee createEmployee() {
        return new Emplooyee();
    }

    public static IMessage createMessage() {
        return new Email();
    }

    public static IDBGateway createSQLDB() {
//        return new SQLDB2Gateway();
        return new OracleDB2Gateway();
    }

    public static ITask createTask() {
        IMessage _message = createMessage();
        IDBGateway _gateway = createSQLDB();
        return new Task(_message, _gateway);
    }
}
