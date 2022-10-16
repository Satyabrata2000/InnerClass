package InnerClass;

//This is an inner class without a name and for which only a single object is created.
//A class that has no name is known as anonymous inner class. It should be used to override a method of class
// or interface.

abstract class TestAnonymousInner {
    abstract void eat();
}

class AnonymousInnerClass{

    public static void main(String[] args) {
        TestAnonymousInner obj = new TestAnonymousInner() {
            @Override
            void eat() {
                System.out.println("This is a string");
            }
        };
        obj.eat();

    }
}


