package com.cbj.weapon;

/**
 * Created by chenbojian on 8/6/15.
 */
public class Solider extends Player {

    private final String weapon;

    public Solider(String name, int lifeValue, int attackValue, int defenseValue, String weapon) {
        super(name, lifeValue, attackValue, defenseValue);
        this.weapon = weapon;
    }

    @Override
    public String attack(Player damagedPlayer) {
        damagedPlayer.damaged(this.getAttackValue());
        return "战士" + this.getName() + "用" + this.getWeapon() + Player.damageInfo(this, damagedPlayer);
    }

    public String getWeapon() {
        return weapon;
    }
}
