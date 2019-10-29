package kea.gameexercise;

public class Character {

    private IWeapon weapon;

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.Use();
    }
}
