package obstacles;
import animals.*;
/**
 * Class Team is for creating and showing team of animals.
 *
 * @author Nadezhda Demyanik
 * @version dates Dec 20, 2017
 * @link https://github.com/GeraNius/StudyJava
 */
public class Track implements Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        return animal.run(length);
    } 
}