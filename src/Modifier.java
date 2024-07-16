public class Modifier {
    final int x = 10;
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 50; // It will generate an error
        System.out.println(myObj.x);
        }
    }
