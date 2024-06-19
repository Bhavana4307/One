package Exam;

public class StringReversalExam {
    public static void main(String[] args) {
        System.out.print("Main method execution : ");
        reversalLogic();

    }

    public static void reverseBuffer() {
        StringBuffer input1 = new StringBuffer();
        input1.append("mentor");
        System.out.print(input1);

    }

    public static void reverseBuilder() {
        StringBuilder input = new StringBuilder();
        input.append("postman");
        System.out.println(input);
        input.append("Rail");
        System.out.print(input);
    }

    public static void reversalLogic() {
        String input = "Manual";
        String output = "";
        char[] one = input.toCharArray();
        for (int i = one.length - 1; i >= 0; i--) {
            output = output + one[i];
        }
        System.out.print(output);
    }

}



