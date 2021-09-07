package reflect;



class Simple{
	void Reflect_Method()
	{
		System.out.println("Its method Reflect_Method ");
	}
}  

class Test_Reflect{  
  void printName(Object obj){  
  Class c=obj.getClass();    
  System.out.println(c.getName());   
  System.out.println(c.getSimpleName()+"\n"+c.getModifiers()+"\n"+c.getTypeName());
  System.out.println(c.getMethods());
  System.out.println(c.getFields());

  }  
  public static void main(String args[]){  
   Simple s=new Simple();  
   s.Reflect_Method();
   
   Test_Reflect t=new Test_Reflect();  
   t.printName(s);  
 }  
}  


/*OUTPUT
Its method Reflect_Method 
reflect.Simple
Simple
0
reflect.Simple
[Ljava.lang.reflect.Method;@1f32e575
[Ljava.lang.reflect.Field;@279f2327
*/
