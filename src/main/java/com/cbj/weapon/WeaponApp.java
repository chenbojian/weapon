package com.cbj.weapon;

public class WeaponApp {
    public static void main(String[] args) {
        Player playerA = new Player("张三", 100, 12);
        Player playerB = new Player("李四", 101, 11);
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
