package javacore.lesson1;


public class Test {
    public static void main(String[] args) {
        Team team = new Team("Бегуны",
                new TeamMember("Вася", 10),
                new TeamMember("Женя", 45),
                new TeamMember("Олег", 5),
                new TeamMember("Саня", 9));

        Course course = new Course(new int[]{2, 4, 6, 8, 10,5,7,44});
        course.doIt(team);
        team.showResults();

    }
}
