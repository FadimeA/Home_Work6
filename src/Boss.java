public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public String printInfo() {
        return "Health: " + this.getHealth() +
                " Damage: " + this.getDamage() +
                " Weapon " + this.getWeapon();
    }

}


