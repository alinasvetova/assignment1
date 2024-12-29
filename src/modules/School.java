package modules;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person member) {
        members.add(member);
    }

    public List<Person> getMembers() {
        return members;
    }

    public void giveRaiseToExperiencedTeachers(int experienceThreshold, int raisePercentage) {
        for (Person member : members) {
            if (member instanceof Teacher teacher) {
                if (teacher.getYearsOfExperience() > experienceThreshold) {
                    teacher.giveRaise(raisePercentage);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}