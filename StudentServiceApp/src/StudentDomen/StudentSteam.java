package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroups;

    public StudentSteam(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
    public List<StudentGroup> getStudentGroup() {
        return studentGroups;
    }

    public void setStudentGroup(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<studentGroups.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return studentGroups.get(index++);        
            }

        };
    }
}

