package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right;

public class DIPUI {
    public static void main(String[] args) {
        IEmplooyee emp = Creator.createEmployee();
        emp.setName("Dhwanil");
        emp.setEmail("dhwanil.patel.24@gmail.com");

        ITask task = Creator.createTask();
        task.setPerson(emp);
        task.setTaskName("Warehouse task");
        task.setTaskName(task.getTaskName());
        task.updateTaskDB(5);
        task.sendCompletionEmail();
    }
}
