package lotr.kickstrategy;
import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoKicked) {
        if (whoKicked.getPower() < whoKick.getPower()) {
            whoKicked.setHp(0);
        } 
        else {
            whoKicked.setPower(whoKicked.getPower() - 1);
        }
        System.out.println("Shas pobyu");
    }
}
