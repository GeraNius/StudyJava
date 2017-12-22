package obstacles;
import animals.*;
/**
 * Class Team is for creating and showing team of animals.
 *
 * @author Nadezhda Demyanik
 * @version dates Dec 20, 2017
 * @link https://github.com/GeraNius/StudyJava
 */
public class Wall implements Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }
}