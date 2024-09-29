package lotr.kickstrategy;
import lotr.Character;

public class HobbitKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        System.out.println("Plak Plak");
        
    }
    
}
