package InnerClass;

//local inner class with local variable

class LocalInnerClass2 {

    private int data = 10; //instance variable
    void display(){
        int value = 30;
        class Local {
            void msg1() {
                System.out.println(value);
            }
        }
            Local l1 = new Local();
            l1.msg1();

    }

    public static void main(String[] args) {
        LocalInnerClass2 obj = new LocalInnerClass2();
        obj.display();
    }
}
