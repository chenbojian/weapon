package com.cbj.weapon;

import java.util.List;

public class Solider extends Player {

    private final Weapon weapon;

    public Solider(String name, int lifeValue, int attackValue, int defenseValue, Weapon weapon) {
        super(name, lifeValue, attackValue, defenseValue);
        this.weapon = weapon;
    }

    @Override
    public void attack(Player damagedPlayer) {
        attackCount++;
        weapon.clearStatus();
        if (!getNegativeEffect().isAttackable()) {
            updateNegativeEffectStatus();
            return;
        }
        updateNegativeEffectStatus();
        damagedPlayer.damaged(getAttackValue());
        if (getAttackCount() == 1) {
            weapon.setDamagedPlayerEffected(true);
            damagedPlayer.setNegativeEffect(weapon.getNegativeEffect());
        }
        System.out.println(String.join(",", attackMessage(damagedPlayer)));
    }

    @Override
    public List<String> attackMessage(Player damagedPlayer) {
        List<String> attackMessages = super.attackMessage(damagedPlayer);
        if (weapon.isDamagedPlayerEffected()) {
            attackMessages.add(attackMessages.size() - 1,
                    damagedPlayer.getName() + damagedPlayer.getNegativeEffect().getName());
        }
        return attackMessages;
    }

    @Override
    public String getProfession() {
        return "战士";
    }


    public Weapon getWeapon() {
        return weapon;
    }
}
