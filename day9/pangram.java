public class pangram{
    public static boolean isPangram(String str) {
        boolean[] alpha = new boolean[26];
        int index;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                alpha[index] = true;
            }
        }
        for (boolean b : alpha) {
            if (!b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s) ? "Pangram" : "Not Pangram");
    }
}
