package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.impl;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IMessage;

public class Email implements IMessage {
    @Override
    public void sendEmail(String message) {
        System.out.println("send email >>> "+message);
    }
}
