package main;

public class Count {
    static boolean isToOne(int n)
    {

        // Return true if n is positive
        return (n > 0);
    }

    // Drivers code
    public static void main(String[] args)
    {
        int n = 90;

        if(isToOne(n) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
