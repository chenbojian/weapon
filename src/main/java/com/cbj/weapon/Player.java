package com.cbj.weapon;


public class Player {
    private int lifeValue;
    private String name;
    private int attackValue;
    private int damagedValue;
    private int defenseValue;
    private NegativeEffect negativeEffect;

    public Player(String name, int lifeValue, int attackValue, int defenseValue) {
        this.lifeValue = lifeValue;
        this.name = name;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
    }

    public void attack(Player damagedPlayer) {
        if (this.getNegativeEffect() != null && !this.getNegativeEffect().isAttackable()) {
            //ToDo
            return;
        }
        damagedPlayer.damaged(this.getAttackValue());
        System.out.println(this.attackMessage(damagedPlayer));
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
        this.negativeEffect = negativeEffect;
    }
}
