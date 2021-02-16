package com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service.SocialMediaContext;
import com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service.impl.FacebookStrategy;
import com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service.impl.GoogleStrategy;
import com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service.impl.TwitterStrategy;

public class StrategyMain {
  public static void main(String[] args) {
    SocialMediaContext context = new SocialMediaContext();

    context.setSocialMediaStrategy(new FacebookStrategy());
    context.connect("Jay");

    context.setSocialMediaStrategy(new GoogleStrategy());
    context.connect("Ajay");

    context.setSocialMediaStrategy(new TwitterStrategy());
    context.connect("Vijay");
  }
}
