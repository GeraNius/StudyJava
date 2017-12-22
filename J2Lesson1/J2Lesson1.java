import animals.*;
import obstacles.*;
/**
 * Class Team is for creating and showing team of animals.
 * 
 * @author Nadezhda Demyanik
 * @version dates Dec 21, 2017
 * @link https://github.com/GeraNius/StudyJava
 */
public class J2Lesson1
{
    
    public static void main(String[] args) {
        int teamSize = 4;

        Obstacle[] o = {new Track(80), new Wall(3), new Water(10)};
        Course c = new Course(o);
        Team dreamTeam = new Team("Dream Team");
        dreamTeam.showTeam();
        c.doIt(dreamTeam);
        dreamTeam.showResults();
        Animal[] zoo = {new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};
        Team zooTeam = new Team("Zoo Team",zoo);
        zooTeam.showTeam();
        c.doIt(zooTeam);
        zooTeam.showResults();
    }
}
