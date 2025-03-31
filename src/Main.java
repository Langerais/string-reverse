public class Main {

    public static void main(String[] args) {
        String input = "hello world here";

        System.out.println("Basic Reverse:");
        String reversed = stringReverse(input);
        System.out.println(reversed);

        char[] inputChars = input.toCharArray();
        reverseWordsInPlace(inputChars);
        System.out.println("In Place Reverse:");
        System.out.println(new String(inputChars));
    }

    public static String stringReverse(String s) {
        String[] words = s.trim().split("\\s+");
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }

    public static void reverseWordsInPlace(char[] s) {
        // Reverse the whole array
        reverse(s, 0, s.length - 1);

        // Reverse each word
        int start = 0;
        for (int end = 0; end <= s.length; end++) {
            if (end == s.length || s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
        }
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
