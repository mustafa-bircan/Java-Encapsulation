package org.example;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ali", 120, Weapon.SWORD);
        Player player2 = new Player("Veli", 90, Weapon.AXE);
        Player player3 = new Player("Ayşe", 80, Weapon.BOW);

        player1.showPlayerInfo();
        player2.showPlayerInfo();
        player3.showPlayerInfo();

        player1.showWeaponInfo();
        player2.showWeaponInfo();
        player3.showWeaponInfo();

        System.out.println();

        player1.loseHealth(60);
        player2.loseHealth(50);
        player3.loseHealth(70);

        player1.showPlayerInfo();
        player2.showPlayerInfo();
        player3.showPlayerInfo();

        System.out.println();

        player1.restoreHealth(20);
        player2.restoreHealth(30);
        player3.restoreHealth(50);

        player1.showPlayerInfo();
        player2.showPlayerInfo();
        player3.showPlayerInfo();

        Point p1 = new Point(3, 4);
        Point p2 = new Point(4, 8);
        Point p3 = new Point(7,8);

        System.out.println("Mesafe p1 ve p2 arasındaki mesafe: " + p1.distance(p2));
        System.out.println("Mesafe p1 ve p3 arasındaki mesafe: " + p1.distance(p3));
        System.out.println("Mesafe p1 ve (5, 5) arasındaki mesafe: " + p1.distance(5, 5));
        System.out.println("Mesafe p1 ve (0, 0) arasındaki mesafe: " + p1.distance());
    }
}
