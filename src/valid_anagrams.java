import java.util.Arrays;
public class valid_anagrams {

    public static boolean valid(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(s_array);
        Arrays.sort(t_array);

        return Arrays.equals(s_array, t_array);
    }

    public static void main(String[] args) { // Corrected "Main" to "main"
        String sa = "abcd";
        String ta = "abcd";
        System.out.println(valid(sa, ta));
    }
}
