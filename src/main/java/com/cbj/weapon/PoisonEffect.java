package com.cbj.weapon;

public class PoisonEffect extends NegativeEffect {

    public PoisonEffect() {
        this.setAttackable(true);
        this.setName("中毒了");
        this.setDurationCount(1);
    }

    @Override
    public void reduceDurationCount() {
        this.durationCount --;
    }

}
