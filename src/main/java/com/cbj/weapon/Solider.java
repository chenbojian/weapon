package com.cbj.weapon;

public class Solider extends Player {

    private final Weapon weapon;

    public Solider(String name, int lifeValue, int attackValue, int defenseValue, Weapon weapon) {
        super(name, lifeValue, attackValue, defenseValue);
        this.weapon = weapon;
    }

    @Override
    public void attack(Player damagedPlayer) {
        damagedPlayer.setNegativeEffect(weapon.getNegativeEffect());
        super.attack(damagedPlayer);
    }

    @Override
    public String attackMessage(Player damagedPlayer) {
        return "战士" + this.getName() + "用" + this.getWeapon().getName() + "攻击了" + damagedPlayer.getName() + "," +
                damagedPlayer.getName() + "受到了" + damagedPlayer.getDamagedValue() + "点伤害," +
                damagedPlayer.negativeEffectInformation() +
                damagedPlayer.getName() + "剩余生命:" + damagedPlayer.getLifeValue();
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
