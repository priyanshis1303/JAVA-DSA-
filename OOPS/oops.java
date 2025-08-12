
public class oops {
     public static void main(String[] args){

// creating object of the class Pen
// seetting pen color 
          Pen p1= new Pen();
          p1.setColor("blue");
          System.out.println(p1.color);
//setting pen tip size 
          p1.settip(5);
          System.out.println(p1.tip);

          //Access modifiers 
//first make object 

          BankAccount bank = new BankAccount();
          bank.setusername("priya");
          System.out.print(bank.username);

          bank.setPassword("85kkhhhhh");
       //   System.out.println(bank.password);
       //the above code wot work a ste password is declared 
       //as private so it is only accessible in the class it is described in hence you 
       //can set the password but not gt it printed from th main class 

     }


     }
// creating  blueprint of pen (class)
    class Pen{
     String color;
     int tip;

     void setColor(String newcolor){
          color=newcolor;
     }

     void settip(int newtip){
          tip=newtip;
     }

    }

// Access Modifiers 
class BankAccount{
 String username;
 private String password ;

 public void setusername(String usernamenew){
     username=usernamenew;
 }

 public void setPassword(String pwd){
     password=pwd;
 }





}

