package main.GoldMan;

//josephus(n,k)=(josephus(n-1,k)+k-1)%n+1
//josephus (1,k)=1
public class Josephus {
static int josephus(int n,int k){
    if(n==1) return 1;
    else return (josephus(n-1,k)+k-1)%n +1;
}
}
