import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        Student s7 = new Student("Паша", "Молчанов", 22, (long)302);
        Student s8 = new Student("Дима", "Новиков", 20, (long)173);
        Student s9 = new Student("Катя", "Кутейкина", 23, (long)124);

        List<Student> Group1 = new ArrayList<Student>();
        Group1.add(s1);
        Group1.add(s2);
        Group1.add(s3);
        Group1.add(s4);
        List<Student> Group2 = new ArrayList<Student>();
        Group2.add(s5);
        Group2.add(s6);
        List<Student> Group3 = new ArrayList<Student>();
        Group1.add(s7);
        Group1.add(s8);
        Group1.add(s9);
        StudentGroup group1 = new StudentGroup(Group1);
        StudentGroup group2 = new StudentGroup(Group2);
        StudentGroup group3 = new StudentGroup(Group3);

        List<StudentGroup> Steam1 = new ArrayList<StudentGroup>();
        Steam1.add(group1);
        Steam1.add(group3);
        StudentSteam steam1 = new StudentSteam(Steam1);

        for(Student stud : group1)
        {
            System.out.println(stud);
        }
        for(Student stud : group2)
        {
            System.out.println(stud);
        }
        for(Student stud : group3)
        {
            System.out.println(stud);
        }
        System.out.println();
        for(StudentGroup group : steam1)
        {
            System.out.println(group);
        }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        

        // Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        // //EmploeeController contrEmp = new EmploeeController();
        // EmploeeController.paySalary(peron1);
        // //contrEmp.paySalary(s1);

        // Integer studHour[] = {124,234,231,1,45};
        // System.out.println(EmploeeController.mean(studHour));

        // Double emplSalary[] = {12555.23,34213.5,10000.0};
        // System.out.println(EmploeeController.mean(emplSalary));
        
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}
