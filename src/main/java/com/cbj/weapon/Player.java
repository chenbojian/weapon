package com.cbj.weapon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player {
    private int lifeValue;
    private String name;
    private int attackValue;
    private int damagedValue;
    private int defenseValue;
    private NegativeEffect negativeEffect;
    protected int attackCount;

    public Player(String name, int lifeValue, int attackValue, int defenseValue) {
        this.lifeValue = lifeValue;
        this.name = name;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
        this.negativeEffect = new NegativeEffect();
    }

    public void attack(Player damagedPlayer) {
        attackCount++;
        if (!getNegativeEffect().isAttackable()) {
            updateNegativeEffectStatus();
            return;
        }
        updateNegativeEffectStatus();
        damagedPlayer.damaged(getAttackValue());
        System.out.println(String.join(",", attackMessage(damagedPlayer)));
    }

    protected void updateNegativeEffectStatus() {
        if (negativeEffect.getClass().equals(NegativeEffect.class)) {
            return;
        }
        damaged(negativeEffect.getAttackValue());
        negativeEffect.reduceDurationCount();
        System.out.println("-" + negativeEffect.getAttackValue());
        System.out.println("剩余次数" + negativeEffect.getDurationCount());
        if (negativeEffect.getDurationCount() == 0) {
            setNegativeEffect(new NegativeEffect());
        }
    }

    public List<String> attackMessage(Player damagedPlayer) {
        List<String> attackMessages = new ArrayList<>();
        attackMessages.add(getProfessionAndName() + "攻击了" + damagedPlayer.getProfessionAndName());
        attackMessages.add(damagedPlayer.getName() + "受到了" + damagedPlayer.getDamagedValue() + "点伤害");
        attackMessages.add(damagedPlayer.getName() + "剩余生命:" + damagedPlayer.getLifeValue());
        return attackMessages;
    }

    public void damaged(int attackValue) {
        this.damagedValue = attackValue - this.defenseValue;
        this.lifeValue -= attackValue;
    }

    public boolean isDead() {
        return this.lifeValue <= 0;
    }

    public int getLifeValue() {
        return lifeValue;
    }


    public String getName() {
        return name;
    }


    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDamagedValue() {
        return damagedValue;
    }

    public void setDamagedValue(int damagedValue) {
        this.damagedValue = damagedValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public NegativeEffect getNegativeEffect() {
        return negativeEffect;
    }

    public void setNegativeEffect(NegativeEffect negativeEffect) {
        if (this.negativeEffect.getClass().equals(negativeEffect.getClass())) {
            this.negativeEffect.addDurationCount(negativeEffect.getDurationCount());
        } else {
            this.negativeEffect = negativeEffect.copy();
        }
    }

    public int getAttackCount() {
        return attackCount;
    }

    public String getProfession() {
        return "普通人";
    }

    private String getProfessionAndName() {
        return getProfession() + getName();
    }
}
