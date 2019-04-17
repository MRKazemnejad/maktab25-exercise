package com.maktab.HW6G;

public class ThermostatKnob implements Turner {
    @Override
    public void turn() {
        System.out.println("Temperature is changing !!!");
    }
}
