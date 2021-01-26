package main;

public class OnesInBinary {
    public int ones(int x){
        int sum=0;
        while(x>0){
            sum += x^1;
            x>>=1;
        }
        return sum;
    }
    public static void main(String[] args) {
    OnesInBinary ones = new OnesInBinary();
        System.out.println(ones.ones(3));
    }
}
