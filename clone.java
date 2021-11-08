

class student implements cloneable(){

int age;
String name;


public student( intA String N){

  this.age=A;
  this.name=N;
}

 public void display(){
   
   System.out.println("name "+ name);
   System.out.println("Age "+ age);
}
  prublic object clone()throws cloneNotsupportedException{

   return super.clone();
}


}


class test{
public static void main(String arg[]){
  

try{
  student s =new student(100,"akash") ;
   stuudent s1=(student)s.clone();
    s.display();
     s1.display():
}
catch(cloneNotsupportedException c)
{
  System.out.println("this is havig an exception:"+ c.getmessage0);
}
}