package day3;

public class Zelda {
    
    public static void main (String[] args) {
        Monster monster = new Monster ();
        Tree tree = new Tree();
        RockMonster rockMonster = new RockMonster();
        Link link = new Link ();

        link.attack(monster);
        link.attack(rockMonster);
        link.attack(tree);

        if (monster.isDead()) {
            System.out.println("You win");
        }

    }
}
