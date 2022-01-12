package javacore.lesson1;

public class Team {
    private String nameOfTeam;
    private TeamMember[] teamMembers = new TeamMember[4];


    public Team(String nameOfTeam, TeamMember  member1, TeamMember member2, TeamMember member3, TeamMember member4) {
        this.nameOfTeam = nameOfTeam;
        teamMembers[0] = member1;
        teamMembers[1] = member2;
        teamMembers[2] = member3;
        teamMembers[3] = member4;
    }

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public TeamMember[] getTeamMembers() {
        return teamMembers;
    }

    public void showResults() {
        System.out.println("Результаты команды "+ getNameOfTeam());
        for (TeamMember teamMember : teamMembers) {
            System.out.println(teamMember.getName() + ": прошел "+ teamMember.getCount() + " испытания из "+ teamMember.getMaxBariers());
        }
    }
}
