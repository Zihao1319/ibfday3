package day3;

//monster enters into a contract with damageable
public class Monster implements Damageable {
    protected int health = 10;
    public Monster (){};
    public Monster (int health) {
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