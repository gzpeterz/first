import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

import java.util.*;  
class TestCollection2{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  for(String obj:al)  
    System.out.println(obj);  
 }  
}  

import java.util.*;  
public class TestCollection3{  
 public static void main(String args[]){  
  //Creating user-defined class objects  
  Student s1=new Student(101,"Sonoo",23);  
  Student s2=new Student(102,"Ravi",21);  
  Student s2=new Student(103,"Hanumat",25);  
  //creating arraylist  
  ArrayList<Student> al=new ArrayList<Student>();  
  al.add(s1);//adding Student class object  
  al.add(s2);  
  al.add(s3);  
  //Getting Iterator  
  Iterator itr=al.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
 }  
}  

class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  


import java.util.*;  
public class TestCollection7{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  