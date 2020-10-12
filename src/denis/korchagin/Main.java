package denis.korchagin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readNumberN();
        System.out.println(findPalindromeN(n));
    }

    static int readNumberN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n ");
        return scanner.nextInt();
    }

    static int findPalindromeN(int n) {
        int count = 0;
        for (int i = 0; ; i++) {
            if (checkPalindrome(i)) count++;
            if (count == n) return i;
        }
    }

    static int findMirrorNumber(int i) {
        int mirrorNumber = 0;
        for (int j = i; j > 0;) {
            mirrorNumber = 10 * mirrorNumber + j % 10;
            j /= 10;
        }
        return mirrorNumber;
    }

    static boolean checkPalindrome(int i) {
        return findMirrorNumber(i) == i;
    }


}
