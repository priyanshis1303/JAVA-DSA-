
public class oops {
     public static void main(String[] args){

// creating object of the class Pen
// seetting pen color 
          Pen p1= new Pen();
          p1.setColor("blue");
          System.out.println(p1.getcolor());
//setting pen tip size 
          p1.settip(5);
          System.out.println(p1.gettip());

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
     // String color;
     // int tip;
//getters jo basically private variables in a class 
//ko access karne deta hai 
  private String color;
    private  int tip;

    String getcolor(){
     return this.color;
    }
    int gettip(){
     return this.tip;
    }

//setters 
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

  