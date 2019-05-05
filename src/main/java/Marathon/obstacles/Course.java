package Marathon.obstacles;

import Marathon.Members.Team;

public class Course {
    private Obstacle[] courses;

    public Course(Obstacle _course1, Obstacle _course2, Obstacle _course3, Obstacle _course4) {
        this.courses = new Obstacle[]{_course1,_course2,_course3,_course4};;
    }

    public void showDoIT(Team team){
        System.out.println("Приглашается пройти полосу припятствий команда: "+team.getName());
    }

    public Obstacle[] getCourses() {
        return courses;
    }
}
