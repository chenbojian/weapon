package com.cbj.weapon;

public class NegativeEffect {

    private boolean attackable;

    private String name;
    protected int durationCount;

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

    public int getDurationCount() {
        return durationCount;
    }

    public void setDurationCount(int durationCount) {
        this.durationCount = durationCount;
    }

    public void reduceDurationCount() {
    }

    public NegativeEffect copy() {
        return new NegativeEffect();
    }

    public void addDurationCount(int durationCount) {
        this.durationCount += durationCount + 1;
    }
}
