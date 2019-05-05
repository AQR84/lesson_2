package Marathon.Members;

import Marathon.obstacles.Course;
import Marathon.Members.Interfaces.Competitor;
import Marathon.obstacles.Obstacle;

public class Team {


    private String name;
    private Competitor[] members;

    public Team(String name, Competitor _member1, Competitor _member2, Competitor _member3, Competitor _member4 ) {
        this.name = name;
        this.members = new Competitor[]{_member1, _member2, _member3, _member4};
    }

    public String getName() {
        return name;
    }

    public void showResults(Course course){
        for (Competitor m : members) {
            Obstacle[] obstacles = course.getCourses();
            for (Obstacle o : obstacles) {
                o.doIt(m);
                if (!m.isOnDistance()) break;
            }
        }
    }

    public void showTeamInfo(){
        for (Competitor teamMember : members) {
            teamMember.info();
        }
    }
}
