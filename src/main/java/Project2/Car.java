package Project2;
/*
Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
 */
public abstract class Car {
    double carPrice;
    String color;
    public Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }

    public abstract void calculateSalePrince(double num);
}
 class Sedan extends Car {

         public Sedan(double carPrice, String color) {
             super(carPrice, color);
         }

     @Override
     public void calculateSalePrince(double weight) {
             if(weight>200){
                 System.out.println("Sedan price is include 10% discount "+(carPrice-(carPrice/10)));
             }else{
                 System.out.println("Sedan price is include 20% discount "+(carPrice-(carPrice/20)));
             }
         }
}
class Truck extends Car{
    public Truck(double carPrice,String color){
        super(carPrice,color);}

    @Override
    public void calculateSalePrince(double length) {
        if(length>20){
            System.out.println( "Truck price is include 5% discount "+(carPrice-(carPrice/5)));
        }else{
            System.out.println(" Truck price is include 10% discount "+(carPrice-(carPrice/10)));
        }

    }

    public static void main(String[] args) {
        Truck t=new Truck(99500,"white");
        t.calculateSalePrince(60);
        Sedan s=new Sedan(69200,"Gray");
        s.calculateSalePrince(3500);


        }

    }



