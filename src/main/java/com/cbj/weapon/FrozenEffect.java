package com.cbj.weapon;

/**
 * Created by chenbojian on 8/6/15.
 */
public class FrozenEffect extends NegativeEffect {
    public FrozenEffect() {
        setAttackable(false);
        setName("冻僵了");
        setDurationCount(3);
    }

    @Override
    public NegativeEffect copy() {
        return new FrozenEffect();
    }
}
