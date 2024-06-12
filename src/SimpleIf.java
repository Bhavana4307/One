public class SimpleIf {

    public static void main(String[] args) {
        String input = "Bhavana";
        System.out.println("orignal :"+ input);
        System.out.println("upper"+ input.toUpperCase());
        System.out.println("lower"+ input.toLowerCase());
        System.out.println("length"+ input.length());

        if (input.equalsIgnoreCase("bhavana")) {
            System.out.println("Yes, it's me!");
        } else {
            System.out.println("No, it's not me!");
        }
    }
}