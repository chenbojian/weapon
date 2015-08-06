package com.cbj.weapon;

public class Weapon {

    private final String name;
    private NegativeEffect negativeEffect;
    private boolean damagedPlayerEffected;

    public Weapon(String name, NegativeEffect negativeEffect) {
        this.name = name;
        this.negativeEffect = negativeEffect;
    }

    public String getName() {
        return name;
    }

    public NegativeEffect getNegativeEffect() {
        return negativeEffect;
    }

    public void setNegativeEffect(NegativeEffect negativeEffect) {
        this.negativeEffect = negativeEffect;
    }

    public void clearStatus() {
        this.damagedPlayerEffected = false;

    }

    public void setDamagedPlayerEffected(boolean damagedPlayerEffected) {
        this.damagedPlayerEffected = damagedPlayerEffected;
    }

    public boolean isDamagedPlayerEffected() {
        return damagedPlayerEffected;
    }
}
