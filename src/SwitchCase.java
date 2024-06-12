public class SwitchCase {
    public static void main(String[] args) {
        String input = "Bhavana";
        {
            switch (input.toLowerCase()) {
                case "udesh":
                    System.out.println("Brother");
                    System.out.println("32");
                    System.out.println("Male");
                    break;
                case "ramya":
                    System.out.println("Sister in law");
                    System.out.println("33");
                    System.out.println("Female");
                    break;
                case "thanvin":
                    System.out.println("Son in law");
                    System.out.println("6");
                    System.out.println("Male");
                    break;
                case "venba":
                    System.out.println("Daughter in law");
                    System.out.println("3");
                    System.out.println("Female");
                    break;
                case "Muniyasamy":
                    System.out.println("Uncle");
                    System.out.println("60");
                    System.out.println("Male");
                    break;
                case "Coco":
                    System.out.println("Pet");
                    System.out.println("1");
                    System.out.println("Male");
                    break;
                default:
                    System.out.println("Noone is there");
                    break;
            }
        }
    }
}