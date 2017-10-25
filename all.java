import java.io.*;

class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  

public class TestCustomException1{  
  
   static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception m){
      	m.printStackTrace();
      	System.out.println("Exception occured: "+m);
      }  
  
      System.out.println("rest of the code...");  
  }  
}  
import java.io.*;

public class TestEx {
	public static void main(String[] args) {
		
		try {
			new TestEx().f2();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		int[] arr = {1, 2, 3};
		System.out.println(arr[2]);
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("系统正在维护,请与管理员联系");
			e.printStackTrace();
		}
		*/
		
		//TestEx te = new TestEx();
		//te.m(0);
		
		/*
		try {
			new TestEx().m(0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("出错了");
		}
		*/
		
		
		FileInputStream in = null;
		
    try {
        in = new FileInputStream("myfile.txt");
        int b;
        b = in.read();
        while (b != -1) {
            System.out.print((char) b);
            b = in.read();
        }
    } catch (IOException e) {
      System.out.println(e.getMessage());
     	
    } catch (FileNotFoundException e) {
    	e.printStackTrace(); 
      
    } finally {
    	try {
      	in.close();
      } catch (IOException e) {
      	e.printStackTrace();
      }
    }
    
 
	}
	
	void m(int i) throws ArithmeticException {
		if(i==0) 
			throw new ArithmeticException("被除数为0");
	}
	
	void f() throws FileNotFoundException , IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
    int b;
    b = in.read();
    while (b != -1) {
        System.out.print((char) b);
        b = in.read();
    }
	}
	
	void f2() throws IOException {
		/*
		try {
			f();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		f();
	}
	
}
class TestExceptionPropagation1{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){
    // e.printStackTrace();
    System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  class TestExceptionPropagation2{  
  void m(){  
    throw new java.io.IOException("device error");//checked exception  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
    }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}  class TestFinallyBlock{  
  public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  class TestFinallyBlock1{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  public class TestFinallyBlock2{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){
  	e.printStackTrace();
  	// System.exit(-1);
  	System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  public class TestMultipleCatchBlock{  
  public static void main(String args[]){  
   try{  
    int a[]=new int[5];  
    a[5]=30/0;  
   }  
   catch(ArithmeticException e){System.out.println("task1 is completed");}  
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
   catch(Exception e){System.out.println("common task completed");}  
  
   System.out.println("rest of the code...");  
 }  
}  
class TestMultipleCatchBlock1{  
  public static void main(String args[]){  
   try{  
    int a[]=new int[5];  
    a[5]=30/0;  
   }  
   catch(Exception e){System.out.println("common task completed");}  
   catch(ArithmeticException e){System.out.println("task1 is completed");}  
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
   System.out.println("rest of the code...");  
 }  
}  
public class TestThrow1{  
   static void validate(int age){  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
   public static void main(String args[]){  
      validate(13);  
      System.out.println("rest of the code...");  
  }  
}  import java.io.IOException;  
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows2{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}  import java.io.*;  
class M{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
class Testthrows3{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  
public class Testtrycatch1{  
  public static void main(String args[]){  
      int data=50/0;//may throw exception  
      System.out.println("rest of the code...");  
}  
}  
public class Testtrycatch2{  
  public static void main(String args[]){  
   try{  
      int data=50/0;  
   }catch(ArithmeticException e){System.out.println(e);}  
      /*
   } finally {
   		System.out.println("in finally now");
   }
   */
   System.out.println("rest of the code...");  
  }  
}  
