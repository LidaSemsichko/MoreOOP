package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight started between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }

            System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());
            System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp());
        }

        if (!c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " is dead. " + c2.getClass().getSimpleName() + " wins!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " is dead. " + c1.getClass().getSimpleName() + " wins!");
        }
    }
}
