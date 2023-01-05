package day3;

public class Tree implements Damageable {
    public int health = 10;

    public Tree () {}
    public Tree (int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead () {
        return health <= 0;
    }

    @Override
    public void hit (int damage) {
        this.health -= damage;
    }

}
