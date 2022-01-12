package javacore.lesson1;

public class TeamMember {
    private String name;
    private int skill;
    private int count = 0;
    private int maxBariers;

    public TeamMember(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public int getSkill() {
        return skill;
    }

    public void addSuccessBarier() {
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setMaxBariers(int length) {
        maxBariers = length;
    }

    public int getMaxBariers() {
        return maxBariers;
    }
}
