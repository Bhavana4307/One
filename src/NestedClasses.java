class OuterClass {
    int x = 4;

    class InnerClass {
        int y = 3;
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
