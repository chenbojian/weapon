package com.cbj.weapon;

public class Solider extends Player {

    private final String weapon;

    public Solider(String name, int lifeValue, int attackValue, int defenseValue, String weapon) {
        super(name, lifeValue, attackValue, defenseValue);
        this.weapon = weapon;
    }

    @Override
    public String attackMessage(Player damagedPlayer) {
        return "战士" + this.getName() + "用" + this.getWeapon() + "攻击了" + damagedPlayer.getName() + "," +
                damagedPlayer.getName() + "受到了" + damagedPlayer.getDamagedValue() + "点伤害," +
                damagedPlayer.getName() + "剩余生命:" + damagedPlayer.getLifeValue();
    }

    public String getWeapon() {
        return weapon;
    }
}
