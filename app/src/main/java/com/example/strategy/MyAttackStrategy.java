package com.example.strategy;

public class MyAttackStrategy implements IAttackStrategy {
    @Override
    public void attack() {
        System.out.println("给我打他，小老弟！");
    }
}
