package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
    protected int sizeOfGroup() {
        int size=0;
        for (Student stud: students){
            size++;
        }
        return size;
    }
    @Override
    public String toString() {
         String gropStr = "";
        for(Student stud : students)
        {
            gropStr += "Student{" 
                
            +"firstName=" +stud.getFirstName()
            +", secondName=" +stud.getSecondName()
            +", age=" +stud.getAge()+
            ", studentID=" + stud.getStudentID() +
            '}'+"\n";
        }
        return gropStr;
    }

    @Override
    public int compareTo(StudentGroup o) {
        if(this.sizeOfGroup()==o.sizeOfGroup()){
            return 0;
         }
         if(this.sizeOfGroup()<o.sizeOfGroup()){ 
            return -1;
         }   
         return 1;
    }
}
    

