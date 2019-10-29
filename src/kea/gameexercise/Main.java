package kea.gameexercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IWeapon weapon = null;
        Character DrEvil = new Character();

        Scanner input = new Scanner(System.in);

        while (true) {
            String value = input.nextLine();

            switch (value) {
                case "axe":
                    weapon = new Axe();
                    break;
                case "sword":
                    weapon = new Sword();
                    break;
                case "club":
                    weapon = new Club();
                    break;
                default:
                    System.out.println("No such weapon in inventory");
            }

            DrEvil.setWeapon(weapon);
            DrEvil.attack();

        }
    }
}
