package exercise;
//    #* important *#
//Given a string str consisting of alphanumeric characters,
// the task is to check whether the string contains all the digits from 1 to 9.
public class password_gfg {
    // Java implementation of the approach
    static class GFG {
        static int MAX = 10;

        static boolean isDigit(char ch)     // Function that returns true
        {
            if (ch >= '0' && ch <= '9')       // if ch is a digit
                return true;
           else return false;
        }
        static boolean allDigits(String str, int len)    // Function that returns true
        {                                                 // if str contains all the  digits from 0 to 9
            boolean []present = new boolean[MAX];         // To mark the present digits
            // For every character of the String
            for (int i = 0; i < len; i++)
            {// If the current character is a digit
                if (isDigit(str.charAt(i)))
                {// Mark the current digit as present
                    int digit = str.charAt(i) - '0';
                    present[digit] = true;
                }
            }

            // For every digit from 0 to 9
            for (int i = 0; i < MAX; i++)
            {
                // If the current digit is
                // not present in str
                if (!present[i])
                    return false;
            }

            return true;
        }

        // Driver code
        public static void main(String[] args)
        {
            String str = "1234567890";
            int len = str.length();

            if (allDigits(str, len))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }
}
