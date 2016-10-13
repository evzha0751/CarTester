

package pkg161013.cartester;

public class Car {

    private String make,modle,color;
    private int year,price,num;
    
    
    public Car(){
        make="Audi";
        modle="Q7";
        year=2017;
        price=65200;
        color="Blue";
        num=3;
    }
    
    public Car(String ma,String mo,int ye,int pr,String co,int nu){
        make=ma;
        modle=mo;
        year=ye;
        price=pr;
        color=co;
        num=nu;
    }
    
    public Car(String ma,String mo,int ye,int pr){
        make=ma;
        modle=mo;
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
    output += "Modle: " + modle + "\n";
    output += "Year: " + year + "\n";
    output += "Price: " + price + "\n";
    output += "Color: " + color + "\n";
    output += "Number" + num;
    return output;

    }
}
