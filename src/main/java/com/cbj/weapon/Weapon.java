package com.cbj.weapon;

public class Weapon {

    private final String name;
    private NegativeEffect negativeEffect;

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
}
