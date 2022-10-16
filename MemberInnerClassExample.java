package InnerClass;

// a non-static class that is created inside a class but outside a method is called member inner class.
//It is also known as regular inner class

public class MemberInnerClassExample {

    private int data = 10;
    class Inner{
        void msg(){
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        MemberInnerClassExample obj1 = new MemberInnerClassExample();
        MemberInnerClassExample.Inner obj2 = obj1.new Inner();
        obj2.msg();
    }
}
