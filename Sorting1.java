import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;   // Ascending by rollNo
    }

    @Override
    public String toString() {
        return rollNo + " " + marks + " " + name;
    }
}

class CustomComparator implements Comparator<Student> {  
      @Override
    public int compare(Student ob1, Student ob2) {
        if (ob1.marks != ob2.marks) {
            return ob2.marks - ob1.marks;   // Descending by marks
        } else {
            return ob1.rollNo - ob2.rollNo; // Ascending by rollNo
        }
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name); // Ascending by name
    }
}

public class Sorting1 {
    public static void main(String[] args) {

        ArrayList<Integer> t = new ArrayList<>();

        t.add(890);
        t.add(20);
        t.add(90);
        t.add(50);

        t.sort(null);   // Ascending
        System.out.println(t);

        t.sort(Collections.reverseOrder()); // Descending
        System.out.println(t);

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("john", 1, 90));
        st.add(new Student("johny", 2, 91));
        st.add(new Student("johna", 3, 92));

        // Natural sorting (rollNo)
        st.sort(null);
        System.out.println(st);

        // Sort by marks descending
        st.sort(new CustomComparator());
        System.out.println(st);

        // Sort by name
        st.sort(new NameComparator());
        System.out.println(st);
    }
}