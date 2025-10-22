
class Character {
    protected String name;
    protected int hp;
    protected int baseDamage;

    public Character(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}

class Warrior extends Character {
    public Warrior(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Warrior) attacks with a sword!");
    }
}

class Archer extends Character {
    public Archer(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Archer) shoots an arrow!");
    }
}

class Mage extends Character {
    public Mage(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Mage) casts a fireball!");
    }
}

class ArcaneArcher extends Archer {
    public ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (ArcaneArcher) shoots an arrow!");
        System.out.println(name + " (ArcaneArcher) casts a magic spell!");
    }
}


public class Game {
    public static void main(String[] args) {
        Character[] characters = {
                new Warrior("Arthur", 100, 15),
                new Archer("Legolas", 80, 12),
                new Mage("Gandalf", 70, 20),
                new ArcaneArcher("Sylvanas", 90, 18)
        };

        for (Character c : characters) {
            c.attack();
        }
    }
}
