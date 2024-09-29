package lotr.kickstrategy;

import lotr.Character;

import java.util.Random;

public class KingKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        Random random = new Random();
        int damage = random.nextInt(attacker.getPower()) + 1;
        defender.setHp(defender.getHp() - damage);
        System.out.println(attacker + " deals " + damage + " damage to " + defender);
    }
}
