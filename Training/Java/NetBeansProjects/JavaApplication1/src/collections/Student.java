/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;

/**
 *
 * @author sdas301
 */
public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student() {

    }

    public Student(int id, String name, int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }

    @Override
    public int compareTo(Student o) {
        return (this.id-o.id);
    }

}


class NameCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}

class MarksCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarks()-o2.getMarks();
    }
    
}

class IdCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o2.getId();
    }
    
}
