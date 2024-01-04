package Project2;
/*
 We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code

 */
public abstract class  Marks {

    abstract double getPercentage();

    }
class A extends Marks {
    double SubSience, SubMath,SubSocialStudy;
        A(double SubSience, double SubMath,double SubSocialStudy){
            this.SubSience=SubSience;
            this.SubMath=SubMath;
            this.SubSocialStudy=SubSocialStudy;
        }


    @Override
    double getPercentage() {
        return (SubSience+SubMath+SubSocialStudy)/3;
    }
}

    class B extends Marks{
        double SubSience, SubMath,SubSocialStudy,SubFranch;
        B(double SubSience, double SubMath,double SubSocialStudy,double SubFranch){
            this.SubSience=SubSience;
            this.SubMath=SubMath;
            this.SubSocialStudy=SubSocialStudy;
            this.SubFranch=SubFranch;
        }


        @Override
        double getPercentage() {
            return (SubSience+SubMath+SubSocialStudy+SubFranch)/4;
        }



    public static void main(String[] args) {
        A a=new A(90,74,83);
        B b=new B(90,80,72,82);
        System.out.println("Average of student A:"+a.getPercentage());
        System.out.println("Average of student B:"+b.getPercentage());
    }}
