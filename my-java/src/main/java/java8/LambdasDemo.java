package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasDemo {

    public static void main(String[] args) {
	List<Student> ls = new ArrayList<>();
	ls.add(new Student(11, 321));
	ls.add(new Student(13, 843));
	ls.add(new Student(12, 111));
	ls.add(new Student(14, 983));
	// ls.sort((x, y) -> x.age - y.age);
	Collections.sort(ls);
	System.out.println(ls);

	AgeDouble ag = (x) -> {
	    x.age *= 2;
	};

	ag.doubleAge(ls.get(0));
	System.out.println(ls.get(0));

    }
}

interface AgeDouble {
    void doubleAge(Student s);
}

class Student implements Comparable<Student> {
    int age;
    int roll;

    public Student(int age, int roll) {
	super();
	this.age = age;
	this.roll = roll;
    }

    @Override
    public String toString() {
	return " [age=" + age + ", roll=" + roll + "]";
    }

    @Override
    public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.age - o.age;
    }

}