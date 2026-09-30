import java.util.*;
 class Student implements Comparable<Student>{
   String name ;
   int rollNo;
   int marks;

   Student(String name ,int rollNo,int marks){
      this.name = name;
      this.rollNo = rollNo;
      this.marks = marks;

}
@Override 
public int compareTo(Student o){
   return this.rollNo - o.rollNo;
}
@Override 
public String toString(){
   return rollNo +" "+ marks+" "+ name;
}
}

 public class Comparator {
    public static void main(String[] args) {
      ArrayList<Integer> t = new ArrayList<>();
      t.add(890);
      t.add(20);
      t.add(90);
      t.add(50);
      t.sort(null);
      System.out.println(t);

      t.sort(Collections.reverseOrder()); // Comparator for descending order
      System.out.println(t);



      ArrayList<Student> st = new ArrayList<>();
       st.add(new Student("john",1,90));
       st.add(new Student("johny",2,91));
       st.add(new Student("johna",3,92));
       st.sort(null);
       System.out.println(st);

    }
}
