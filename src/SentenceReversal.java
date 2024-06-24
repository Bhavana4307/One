public class SentenceReversal {
    public static void main(String[] args) {
        String input = "This is my Folder";
        StringBuilder output = new StringBuilder();
        String[] s = input.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            output.append(s[i]).append(" ");
        }
        System.out.print(output.toString().trim());
    }
}