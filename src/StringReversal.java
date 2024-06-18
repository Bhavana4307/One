public class StringReversal {
    public static void main(String[] args) {

        //String Builder method
        StringBuilder s = new StringBuilder();
        s.append("school");
        System.out.println(s.reverse());

        //String Buffer method
        StringBuffer sr = new StringBuffer();
        sr.append("moniflam");
        sr.reverse();
        System.out.println(sr);

        //For loop logic string reverse (String builder)
        String input1 = "I AM A STUDENT";
        char[] One = input1.toCharArray();
        StringBuilder Output1 = new StringBuilder();
        for (int i = One.length - 1; i >= 0; i--) {
            Output1.append(One[i]);
        }
        System.out.println("Out String builder "+Output1);

        //For loop logic string reverse (String Concatenation)
        String input2 = "I am a Student";
        char[] two = input2.toCharArray();
        String output2 = "";
        for (int i = two.length-1; i >= 0 ; i--) {
            output2 =output2+two[i];
        }
        System.out.println("Out String concat "+output2);
    }
}
