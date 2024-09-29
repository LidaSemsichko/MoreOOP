package lotr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstrategy.KickStrategy;

@Getter
@Setter
@AllArgsConstructor

public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public void kick(Character C) {
        kickStrategy.kick(this, C);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp; 
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{hp=" + hp + ", " + "power=" + power +"}";
    }
}
