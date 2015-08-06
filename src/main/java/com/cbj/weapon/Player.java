package com.cbj.weapon;


public class Player {
    private int lifeValue;
    private String name;
    private int attackValue;
    private int damagedValue;
    private int defenseValue;
    private NegativeEffect negativeEffect;
    private int attackCount;

    public Player(String name, int lifeValue, int attackValue, int defenseValue) {
        this.lifeValue = lifeValue;
        this.name = name;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
        this.negativeEffect = new NegativeEffect();
    }

    public void attack(Player damagedPlayer) {
        this.attackCount++;
        if (!this.getNegativeEffect().isAttackable()) {
            return;
        }
        updateNegativeEffectStatus();
        damagedPlayer.damaged(this.getAttackValue());
        System.out.println(this.attackMessage(damagedPlayer));
    }

    private void updateNegativeEffectStatus() {
        if (this.negativeEffect.getClass().equals(NegativeEffect.class)) {
            return;
        }
        this.negativeEffect.reduceDurationCount();
        System.out.println("剩余次数" + this.negativeEffect.getDurationCount());
        if (this.negativeEffect.getDurationCount() == 0) {
            this.setNegativeEffect(new NegativeEffect());
        }
    }

    public String attackMessage(Player damagedPlayer) {
        return "普通人" + this.getName() + "攻击了" + damagedPlayer.getName() + "," +
                damagedPlayer.getName() + "受到了" + damagedPlayer.getDamagedValue() + "点伤害," +
                damagedPlayer.getName() + "剩余生命:" + damagedPlayer.getLifeValue();
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

    public String negativeEffectInformation() {
        return this.getNegativeEffect().getName().equals("") ?
                "" : this.getName() + this.getNegativeEffect().getName() + ",";
    }

    public int getAttackCount() {
        return attackCount;
    }
}
