package com.cbj.weapon;

public class Player {
    private int lifeValue;
    private String name;
    private int attackValue;
    private int damagedValue;

    public Player(String name, int lifeValue, int attackValue) {
        this.lifeValue = lifeValue;
        this.name = name;
        this.attackValue = attackValue;
    }

    public void attack(Player damagedPlayer) {
        damagedPlayer.damaged(this.getAttackValue());
        System.out.println(this.getName() + "攻击了" + damagedPlayer.getName() + "," +
                damagedPlayer.getName() + "受到了" + damagedPlayer.getDamagedValue() + "点伤害," +
                damagedPlayer.getName() + "剩余生命:" + damagedPlayer.getLifeValue());
    }

    private void damaged(int attackValue) {
        this.damagedValue = attackValue;
        this.lifeValue -= attackValue;
    }

    public boolean isDead() {
        return this.lifeValue <= 0;
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

    public int getDamagedValue() {
        return damagedValue;
    }

    public void setDamagedValue(int damagedValue) {
        this.damagedValue = damagedValue;
    }
}
