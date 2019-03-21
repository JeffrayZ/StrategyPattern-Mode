package com.example;

import com.example.role.Role;
import com.example.role.RoleA;
import com.example.strategy.MyAttackStrategy;
import com.example.strategy.MyDefendStrategy;
import com.example.strategy.MyDisplayStrategy;
import com.example.strategy.MyRunStrategy;

public class Test{
    public static void main(String[] args) {
        Role xiaoming = new RoleA("小明");
        xiaoming.setRun(new MyRunStrategy()).setAttack(new MyAttackStrategy()).setDefend(new MyDefendStrategy()).setDisplay(new MyDisplayStrategy());
        System.out.println(xiaoming.name + ":");
        xiaoming.display();
        xiaoming.attack();
        xiaoming.run();
        xiaoming.defend();
    }
}
