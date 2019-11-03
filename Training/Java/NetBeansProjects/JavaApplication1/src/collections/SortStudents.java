/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author sdas301
 */
public class SortStudents {

    public static void main(String[] args) {
        Student stu1 = new Student(1, "abcsad", 10);
        Student stu2 = new Student(2, "abcsdfs", 11);
        
        Student stu5 = new Student(5, "abc2", 16);
        Student stu4 = new Student(4, "abc32", 13);
        Student stu3 = new Student(3, "abc324", 12);
        

        Students students = new Students();

        List<Student> stud = new ArrayList<>();
        stud.add(stu5);
        stud.add(stu4);
        stud.add(stu3);
        stud.add(stu2);
        stud.add(stu1);
        students.setStudList(stud);

//user 2
        ArrayList<Student> studList = (ArrayList) students.getStudList();
        
        
        //USING COMPARABLE
        System.out.println("USING COMPARABLE:");
        Collections.sort(studList);
        studList.forEach((st) -> {
            System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks());
        });
        
        
        
        //USING COMPARATORS
        System.out.println("USING COMPARATORS:");
        System.out.println("Marks:");
        MarksCompare mc=new MarksCompare();
        Collections.sort(studList,mc);
        studList.forEach((st) -> {
            System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks());
        });
        
        
        System.out.println("Name:");
        NameCompare nc=new NameCompare();
        Collections.sort(studList,nc);
        studList.forEach((st) -> {
            System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks());
        });
        
        
        System.out.println("ID:");
        IdCompare ic=new IdCompare();
        Collections.sort(studList,ic);
        studList.forEach((st) -> {
            System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks());
        });
    }
}
