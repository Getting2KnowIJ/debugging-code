package com.getting2knowij.debugging;

import org.junit.jupiter.api.Test;

public class DebuggerTest {
  @Test
  void shouldBeAbleToSelectMethodToStepInto() {
    System.out.println(getCar().getWheels().get(1).getTyre().getBrand());
  }

  private Car getCar() {
    return new Car();
  }
}
