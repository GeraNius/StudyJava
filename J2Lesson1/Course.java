import animals.*;
import obstacles.*;
/**
 * Class Team is for creating and showing team of animals.
 * 
 * @author Nadezhda Demyanik
 * @version dates Dec 21, 2017
 * @link https://github.com/GeraNius/StudyJava
 */
public class Course
{
    protected Obstacle[] obstacles;
    
    // Constructor
    public Course(Obstacle[] obstacles)
    {
        this.obstacles = obstacles;
    }

    // Method makes team get over obstacle and changes team results
    public void doIt(Team team)
    {
        for (int i=0;i<team.members.length;i++) {                 
             for (Obstacle obstacle : this.obstacles) {
                 if (obstacle.doIt(team.members[i]))
                   team.results[i]++;                    
             }
         }
    }
}
