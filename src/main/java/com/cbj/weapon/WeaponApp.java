package com.cbj.weapon;

public class WeaponApp {
    public static void main(String[] args) {
        Solider playerA = new Solider("张三", 100, 12, 0, "超级大木棒");
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
