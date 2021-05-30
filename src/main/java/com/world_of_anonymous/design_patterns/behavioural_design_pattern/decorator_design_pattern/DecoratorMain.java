package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.ClientDecorator;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.concreate_decorator.SupportLinkDecorator;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.concreate_decorator.SupportPopupDecorator;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.concreate_component.SupportReport;

public class DecoratorMain {
  public static void main(String[] args) {
    SupportPopupDecorator decorator = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
    System.out.println(decorator.getFirstColumnData());

    ClientDecorator clientDecorator = new ClientDecorator(new SupportReport());
    System.out.println(clientDecorator.getFirstColumnData());
  }
}
