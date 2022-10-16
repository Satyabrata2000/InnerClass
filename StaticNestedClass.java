package InnerClass;

public class StaticNestedClass {

    static int data = 30;
    int data1 = 20;


    static class inner{
        void msg(){
            System.out.println("data is " + data);
            //System.out.println("data is " + data1);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.inner obj = new StaticNestedClass.inner();
        obj.msg();

       }
}
