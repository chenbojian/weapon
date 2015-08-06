package com.cbj.weapon;

public class NegativeEffect {

    private boolean attackable;

    private String name;

    public NegativeEffect() {
        this.attackable = true;
        this.name = "";
    }

    public boolean isAttackable() {
        return attackable;
    }

    public void setAttackable(boolean attackable) {
        this.attackable = attackable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
