package com.cbj.weapon;

public class WeaponApp {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("超级大木棒", new PoisonEffect());
        Solider playerA = new Solider("张三", 100, 12, 0, weapon);
        Player playerB = new Player("李四", 101, 11, 0);
        while (true) {
            playerA.attack(playerB);
            if (playerB.isDead()) {
                System.out.println(playerB.getName() + "被打败了!");
                break;
            }
            playerB.attack(playerA);
            if (playerA.isDead()) {
                System.out.println(playerA.getName() + "被打败了!");
                break;
            }
        }
    }
}
