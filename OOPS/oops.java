
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

