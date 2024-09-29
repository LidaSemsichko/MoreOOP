package lotr;
import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;
import lotr.King;
import lotr.Knight;
import java.util.Random;

public class CharacterFactory {

    private static final Class<?>[] characterClasses = {
        Hobbit.class, Elf.class, King.class, Knight.class
    };

    public static Character createCharacter() {
        Random random = new Random();
        int choice = random.nextInt(characterClasses.length);

        try {
            return (Character) characterClasses[choice].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create character", e);
        }
    }
}
