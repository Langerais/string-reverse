import java.util.Arrays;

public class Main {

    //Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"
    //
    //Follow-up: given a mutable string representation, can you perform this operation in-place?

    public static void main(String[] args) {

        stringReverse("hello world here");

    }

    public static String stringReverse(String s){


        String[] temp = s.split(" ");
        String[] out = new String[temp.length];

        for(int i = 0; i < out.length; i++){
            out[i] = temp[temp.length - i - 1];
        }

        return String.join(" ", out);
    }
}