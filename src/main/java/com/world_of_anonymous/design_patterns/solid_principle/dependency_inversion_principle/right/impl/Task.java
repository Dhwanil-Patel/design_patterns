package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.impl;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IDBGateway;
import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IEmplooyee;
import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.IMessage;
import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.ITask;

public class Task implements ITask {
    private String taskName;
    private IEmplooyee person;
    IMessage _email;
    IDBGateway _dbGateway;

    public Task(IMessage message, IDBGateway gateway) {
        this._email = message;
        this._dbGateway = gateway;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public IEmplooyee getPerson() {
        return person;
    }

    @Override
    public void setPerson(IEmplooyee person) {
        this.person = person;
    }

    @Override
    public void updateTaskDB(int hours) {
        _dbGateway.updateDB("Update DB details of "+person.getName()+" with "+hours);
    }

    @Override
    public void sendCompletionEmail() {
        _email.sendEmail("Send email to "+person.getName());
    }
}
