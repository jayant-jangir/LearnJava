package com.BasicPro;
public class Palindrome {
    public static void main(String[] args) {
//        String str = "CarModelCompany man, a plan, a canal: Panama";
        String str = "0P";
        System.out.println(isPalindrome (str));

    }

    public static boolean isPalindrome(String s) {
        int sStart = isAlphaNumeric (s, 0, true);
        int sEnd = isAlphaNumeric (s, s.length() - 1, false);

        while (sStart <= sEnd) {
            System.out.println(s.charAt(sStart) + " " + s.charAt(sEnd));
            boolean isStartInCapital = false;
            if (s.charAt(sStart) >= 'A' && s.charAt(sStart) <= 'Z') {
                isStartInCapital = true;
            }

            boolean isStartInSmall = false;
            if (s.charAt(sStart) >= 'a' && s.charAt(sStart) <= 'z') {
                isStartInSmall = true;
            }

            boolean isEndInCapital = false;
            if (s.charAt(sEnd) >= 'A' && s.charAt(sEnd) <= 'Z') {
                isEndInCapital = true;
            }

            boolean isEndInSmall = false;
            if (s.charAt(sEnd) >= 'a' && s.charAt(sEnd) <= 'z') {
                isEndInSmall = true;
            }

            if (isStartInCapital && isEndInCapital
                    || isStartInSmall && isEndInSmall) {
                if (s.charAt(sStart) != s.charAt(sEnd)) return false;
            }
            else if (isStartInCapital && isEndInSmall) {
                if (s.charAt(sStart) + ('a' - 'A') != s.charAt(sEnd)) return false;
            } else if (isStartInSmall && isEndInCapital) {
                if (s.charAt(sStart) != s.charAt(sEnd) + ('a' - 'A')) return false;
            } else {
                if (s.charAt(sStart) != s.charAt(sEnd)) return false;
            }

            sStart = isAlphaNumeric (s, sStart + 1, true);
            sEnd = isAlphaNumeric (s, sEnd - 1, false);
        }

        return true;
    }

    public static int isAlphaNumeric (String s, int pos, boolean beginFromStart) {

        while (pos >= 0 && pos < s.length()) {
            if (s.charAt(pos) >= 'A' && s.charAt(pos) <= 'Z'
                    || s.charAt(pos) >= 'a' && s.charAt(pos) <= 'z'
                    || s.charAt(pos) >= '0' && s.charAt(pos) <= '9')
            {
                return pos;
            } else {
                if (beginFromStart) pos++;
                else pos--;
            }
        }
        return beginFromStart ? s.length() : 0;
    }
}
