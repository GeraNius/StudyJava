import animals.*;
/**
 * Class Team is for creating and showing team of animals.
 * 
 * @author Nadezhda Demyanik
 * @version dates Dec 21, 2017
 * @link https://github.com/GeraNius/StudyJava
 */
public class Team
{
    // team name
    protected String name;
    // team members
    protected Animal[] members;    
    // team results
    protected int[] results;
    
    // Constructor - only team name
    public Team(String name) {
        this.name = name;
        // if I understood homework fully, I can choose crew inside constructor
        Animal[] team = {new Cat("Murzik"), new Hen("Ryaba"), new Cat("Barsik"), new Hippo("Gloria")};
        this.members = team;
        // initialize array for team results
        this.results = new int[this.members.length];
    }
    
    // Constructor - team name + team crew
    public Team(String name, Animal[] members) {
        this.name = name;
        this.members = members;
        // initialize array for team results
        this.results = new int[this.members.length];
    }

    // Method prints classes and names of team members
    public void showTeam() {
        System.out.println("Greetings to '" + this.name+"'!");
        for (Animal member : this.members) {
             System.out.println(member);
         }
    }
    
    // Method prints results of team members and total team result
    public void showResults() {
        int total = 0;
        System.out.println("Results of '" + this.name+"' are:");
        for (int i=0;i<this.results.length;i++) {
           System.out.println(this.members[i] + " got over "+this.results[i]+" obstacles");
           total += this.results[i];
        }
        System.out.println("Total team result " + total +" obstacles");
    }
    
}
