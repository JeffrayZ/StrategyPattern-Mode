package com.example.role;

import com.example.strategy.IAttackStrategy;
import com.example.strategy.IDefendStrategy;
import com.example.strategy.IDisplayStrategy;
import com.example.strategy.IRunStrategy;

/**
 * 游戏角色
 *
 * 游戏角色有什么？
 * 名字、技能、能跑能跳，长什么样子等等
 * */
public abstract class Role {

    /**
     * 名字
     * */
    public String name;
    /**
     * 样子
     * */
    protected IDisplayStrategy display;
    /**
     * 攻击
     * */
    protected IAttackStrategy attack;
    /**
     * 跑
     * */
    protected IRunStrategy run;
    /**
     * 防御
     * */
    protected IDefendStrategy defend;

    public Role setDisplay(IDisplayStrategy display){
        this.display = display;
        return this;
    }

    public Role setAttack(IAttackStrategy attack){
        this.attack = attack;
        return this;
    }

    public Role setRun(IRunStrategy run){
        this.run = run;
        return this;
    }

    public Role setDefend(IDefendStrategy defend){
        this.defend = defend;
        return this;
    }

    public void display(){
        display.display();
    }

    public void attack(){
        attack.attack();
    }

    public void run(){
        run.run();
    }

    public void defend(){
        defend.defend();
    }
}
