package ua.od.hillel;

public class Palindrome {

    public static void main(String[] args) {

        String str = "deleveled, evitative, cat, dog, deified, qweewq, , i";
        String[] strArray = str.split(",");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].trim();
        }
        int count = 0;
        for (String temp : strArray) {
            if (isPalindrome(temp)) count++;
        }
        System.out.println("There are " + count + " palindromes in the text");
    }

    public static boolean isPalindrome(String str) {

        if (str.length() < 2) return false; // пропускаем пустые строки и однобуквенные слова
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.toCharArray()[i] == str.toCharArray()[str.length() - i - 1]) continue;
            return false;
        }
        return true;
    }
}
