public class CodingBat {

    public static void main(String[] args) {
        int[] myInts = {6, 3, 4, 5};
        int[] evens = {2, 4, 3, 6, 7, 8};
        int[] balance = {1, 2, 3, 4, 2, 0};
        System.out.println(sleepIn(true, false));
        System.out.println(stringTimes("hi", 5));
        System.out.println(helloName("Tara"));
        System.out.println(firstLast6(myInts));
        System.out.println(cigarParty(45, false));
        System.out.println(loneSum(1, 2, 3));
        System.out.println(doubleChar("hello"));
        System.out.println(countYZ("fez day"));
        System.out.println(countEvens(evens));
        System.out.println(canBalance(balance));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static String helloName(String name) {
        String result = "Hello " + name + "!";
        return result;
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false && cigars >= 40 && cigars <= 60) {
            return true;
        }
        if (isWeekend == true && cigars >= 40) {
            return true;
        }
        return false;
    }

    public static int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length(); i++)
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && !Character.isLetter(str.charAt(i + 1)))
                count++;
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) sum += nums[j];
            for (int j = i; j < nums.length; j++) sum -= nums[j];
            if (sum == 0) return true;
        }
        return false;
    }
}











