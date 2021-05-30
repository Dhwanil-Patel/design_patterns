package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.wrong;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.composite_design_pattern.Employee;

public class Task {
    private String taskName;
    private Employee person;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Employee getPerson() {
        return person;
    }

    public void setPerson(Employee person) {
        this.person = person;
    }

    public void updateTaskDB(int hours) {
        SQLDB2Gateway dbGateWay = new SQLDB2Gateway();
        dbGateWay.updateDB("Update DB details of "+person.getName()+" with "+hours);
    }

    public void sendCompletionEmail() {
        Email email = new Email();
        email.sendEmail("Send email to "+person.getName());
    }
}
