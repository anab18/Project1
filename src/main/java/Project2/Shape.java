package Project2;

/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.
 */
public interface Shape {



    double calculateArea(double a);
   double calculatePerimeter(double a);

    class Circle implements Shape {

        @Override
        public double calculateArea(double radius) {
            return Math.PI*radius*radius;

        }

        @Override
        public double calculatePerimeter(double radius) {
            return 2*Math.PI*radius;
        }

        }

    }

        class Square implements Shape {

            @Override
            public double calculateArea(double side) {
                return side*side;
            }

            @Override
            public double calculatePerimeter(double side) {
                return 2*(side+side);
            }


            public static void main(String[] args) {

                Circle c=new Circle();
                System.out.println("Calculate the area of a circle:"+c.calculateArea(6.9));
                System.out.println("Calculate the perimeter of a circle:"+c.calculatePerimeter(5.5));
                Square s=new Square();
                System.out.println("Calculate the area of a square:"+s.calculateArea(4.5));
                System.out.println("Calculate the perimeter of a square:"+ s.calculatePerimeter(7.3));

            }
        }

