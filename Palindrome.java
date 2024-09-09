public class Palindrome {
    
    // Метод для переворачивания строки
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String word = args[i];
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
}
