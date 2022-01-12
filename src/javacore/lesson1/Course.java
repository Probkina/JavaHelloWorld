package javacore.lesson1;

public class Course {
    private int[] bariers;

    public Course(int[] bariers) {
        this.bariers = bariers;
    }

    public void doIt(Team team){
        System.out.println("Команда " + team.getNameOfTeam() + " приступила к соревнованиям" );
        for (TeamMember teamMember : team.getTeamMembers()) {
            teamMember.setMaxBariers(bariers.length);
            for (int i = 0; i < bariers.length; i++) {
                int barier = bariers[i];
                if(teamMember.getSkill()>=barier){
                    teamMember.addSuccessBarier();
                }

            }
        }
        System.out.println("Команда " + team.getNameOfTeam() + " закончила соревнования");
    }
}
