package main;

public class KnapsackProblem {
    public static void main(String args[])
    {
        boolean isAnagram = isAnagram("Angle","Angle");
        System.out.println("Are Angle and Angel anangrams: "+isAnagram);
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int count[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
//            for (int p=0;p<count.length;p++)
             //   System.out.print(count[str1.charAt(i)]+"done  --");
             count[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
