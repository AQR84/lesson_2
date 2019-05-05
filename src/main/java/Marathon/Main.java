package Marathon;

import Marathon.Members.Cat;
import Marathon.Members.Dog;
import Marathon.Members.Human;
import Marathon.Members.Team;
import Marathon.obstacles.Course;
import Marathon.obstacles.Cross;
import Marathon.obstacles.Wall;
import Marathon.Enums.WeekDays;
import MyExceptions.MyArray;
import MyExceptions.MyArrayException;


public class Main {
    public static void main(String[] args) {

        WeekDays weekdays = WeekDays.FRIDAY;

        Course course = new Course(new Cross(300), new Wall(2), new Wall(1), new Cross(120)); // Создаем полосу препятствий
        Team team = new Team("Dream team", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Джон")); // Создаем команду
        team.showTeamInfo(); //информация о команде до полосы
        course.showDoIT(team); // Просим команду пройти полосу
        team.showResults(course); // Показываем результаты
        team.showTeamInfo(); //информация о команде после полосы


//ENUM ДЗ
        System.out.println(weekdays.getHour()); //получаем остаток часов у конкретного emun через get`ер
        System.out.println(getWorkingHours(WeekDays.THURSDAY)); //получаем остаток часов через передачу дня недели в функцию
        System.out.println(getWorkingHours(WeekDays.SUNDAY));

//Exception ДЗ

        String[][] array1 = {{"1","2"}, {"3","4"}};
        String[][] array2 = {{"1","2","e","2"}, {"3","4","1","2"}, {"1","2","3","4"}, {"h","4","1","2"}};


        MyArray myArray = new MyArray();
        try {
            myArray.ForArrayWork(array1);
        } catch (MyArrayException e) {
            e.printStackTrace();
        }

        System.out.println(array2[0].length);
        try {
            myArray.ForArrayWork(array2);
        } catch (MyArrayException e) {
            e.printStackTrace();
        }
    }

    public static String getWorkingHours(WeekDays weekdays){
        return weekdays.getHour();
    }

}