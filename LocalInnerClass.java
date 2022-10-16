package InnerClass;

//A class created inside a method. Local inner classes are the inner classes that are defined inside a block

public class LocalInnerClass {

    private int data = 20; //instance variable
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}
