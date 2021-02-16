package com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service;

import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.impl.Shipped;

public class DeliveryContext {

  private String packageId;
  private PackageState currState;

  public DeliveryContext(String packageId, PackageState currState) {
    super();
    this.packageId = packageId;
    this.currState = currState;

    if (currState == null) {
      this.currState = Shipped.getInstance();
    }
  }

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public PackageState getCurrState() {
    return currState;
  }

  public void setCurrState(PackageState currState) {
    this.currState = currState;
  }

  public void update() {
    currState.updateState(this);
  }

}
