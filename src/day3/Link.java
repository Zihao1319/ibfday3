package day3;

public class Link {

    private int hitPoint = 4;
    
    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    // public void attack (Monster monster) {
    //     monster.hit(hitPoint);
    // }

    public void attack (Damageable damageable) {
        damageable.hit(hitPoint);
    }

}
