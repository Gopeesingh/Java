package PriorityQueues;
import java.util.*;
public class Studentcomparator {
    public static class Student{
        String name;
        Integer rollNo;
        Integer marks;
        String dob;
    }
    public static class StudentComparator implements Comparator<Student>{
    // overriding
    public int compare(Student s1, Student s2){
        if(s1.marks > s2.marks){
            return -1;
        }
        else if(s2.marks > s1.marks){
            return 1;
        }
        else{
            if(s1.rollNo > s2.rollNo){
                return -1;
            }
            if(s1.rollNo < s2.rollNo){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
public static void main(String[] args) {
    PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());
    Student gopee = new Student();
    gopee.name = "Gopee";
    gopee.dob = "26-08-2003";
    gopee.rollNo = 14;
    gopee.marks = 99;

    Student raghav = new Student();
    raghav.name = "Raghav";
    raghav.dob = "26-12-2000";
    raghav.rollNo = 18;
    raghav.marks = 97;

    List<Student> studentList = new ArrayList<>();
    studentList.add(raghav);
    studentList.add(gopee);
    studentList.sort(new StudentComparator());

    studentPriorityQueue.add(gopee);
    studentPriorityQueue.add(raghav);

    System.out.println(studentPriorityQueue.peek().name);
    System.out.println(studentPriorityQueue.peek().rollNo);
    System.out.println(studentPriorityQueue.peek().marks);



}
}







