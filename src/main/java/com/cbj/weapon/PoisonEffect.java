package com.cbj.weapon;

public class PoisonEffect extends NegativeEffect {

    public PoisonEffect() {
        setAttackable(true);
        setName("中毒了");
        setDurationCount(2);
        setAttackValue(3);
    }

    @Override
    public NegativeEffect copy() {
        return new PoisonEffect();
    }

}
