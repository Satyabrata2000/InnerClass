package InnerClass;

//Anonymous inner class example using interface

interface AnonymousInnerClassUsingInterface {
    void eat();
}

class Anonymousinnerclass{

    public static void main(String[] args) {

        AnonymousInnerClassUsingInterface obj = new AnonymousInnerClassUsingInterface() {
            @Override
            public void eat() {
                System.out.println("String 2");
            }
        };
        obj.eat();
    }
}
