package com.cbj.weapon;

public class Player {
    private int lifeValue;
    private String name;
    private int attackValue;

    public Player(String name, int lifeValue, int attackValue) {
        this.lifeValue = lifeValue;
        this.name = name;
        this.attackValue = attackValue;
    }

    public void attack(Player damagedPlayer) {
        damagedPlayer.damaged(this.getAttackValue());
    }

    private void damaged(int attackValue) {
        this.lifeValue -= attackValue;
    }

    public boolean isDead() {
        return this.lifeValue > 0;
    }


    public int getLifeValue() {
        return lifeValue;
    }


    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }
}
