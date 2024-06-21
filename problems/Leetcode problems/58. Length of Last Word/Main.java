public class Main {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int lastSpaceIndex = s.lastIndexOf(' '); // Find the index of the last space
        return s.length() - lastSpaceIndex - 1; // Calculate the length of the last word
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}
