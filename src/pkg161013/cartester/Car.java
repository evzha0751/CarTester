

package pkg161013.cartester;
/**
 * Car Class 
 */
public class Car {

    private String make,model,color;
    private int year,price,num;
    
 /**
  * constructor
  * pre: none
  * post: values have been changed
  */   
    public Car(){
        make="Audi";
        model="Q7";
        year=2017;
        price=65200;
        color="Blue";
        num=3;
    }
    
  /**
  * constructor
  * pre: 6 values
  * post: values have been changed
  */ 
    public Car(String ma,String mo,int ye,int pr,String co,int nu){
        make=ma;
        model=mo;
        year=ye;
        price=pr;
        color=co;
        num=nu;
    }
    
  /**
  * constructor
  * pre: 3 values
  * post: values have been changed
  */
    public Car(String ma,String mo,int ye,int pr){
        make=ma;
        model=mo;
        year=ye;
        price=pr;
        color="Silver";
        num=2;
    }
    
    
    public void sound1(){
        System.out.println("Bi~~~~~");
    }
    
    public void sound2(){
        System.out.println("Bu~~~~");
    }
    
    public String toString(){
    String output = "Make: " + make + "\n";
    output += "Modle: " + model + "\n";
    output += "Year: " + year + "\n";
    output += "Price: " + price + "\n";
    output += "Color: " + color + "\n";
    output += "Number" + num;
    return output;

    }
}
