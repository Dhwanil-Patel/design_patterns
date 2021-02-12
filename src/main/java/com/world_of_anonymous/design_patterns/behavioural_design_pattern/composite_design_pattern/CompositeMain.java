package com.world_of_anonymous.design_patterns.behavioural_design_pattern.composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
  public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Jay");
    Employee emp2 = new Employee(1, "Ajay");
    Employee emp3 = new Employee(1, "Vijay");
    Employee emp4 = new Employee(1, "Sanjay");
    Employee emp5 = new Employee(1, "Dhananjay");
    Employee cto = new Employee(0, "Boss");

    List<Object> acc = new ArrayList<Object>();
    acc.add(emp1);
    acc.add(emp2);
    List<Object> hr = new ArrayList<Object>();
    hr.add(emp3);

    List<Object> dev = new ArrayList<Object>();
    dev.add(emp4);
    dev.add(emp5);

    Composite<Object> deptAcc = new Composite<Object>(1, "Account", acc);
    Composite<Object> deptHr = new Composite<Object>(1, "Account", hr);
    Composite<Object> deptDev = new Composite<Object>(1, "Account", dev);

    List<Object> ind = new ArrayList<Object>();
    ind.add(deptAcc);
    ind.add(deptHr);

    List<Object> aus = new ArrayList<Object>();
    aus.add(deptDev);

    Composite<Object> regionInd = new Composite<Object>(1, "Indian Region", ind);
    Composite<Object> regionAus = new Composite<Object>(1, "Australian Region", aus);

    List<Object> company = new ArrayList<Object>();
    company.add(regionAus);
    company.add(regionInd);
    company.add(cto);

    Composite<Object> myCompany = new Composite<Object>(1, "Company", company);

    System.out.println("\nFull Company : ");
    System.out.println(myCompany);

    System.out.println("\nRegion : ");
    System.out.println(regionInd);

    System.out.println("\nDepartment : ");
    System.out.println(deptAcc);

    System.out.println("\nEmployee : ");
    System.out.println(hr);

  }
}
