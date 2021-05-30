package com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right;

import com.world_of_anonymous.design_patterns.solid_principle.dependency_inversion_principle.right.*;

public interface ITask {
    String getTaskName();

    void setTaskName(String taskName);

    IEmplooyee getPerson();

    void setPerson(IEmplooyee person);

    void updateTaskDB(int hours);

    void sendCompletionEmail();
}
