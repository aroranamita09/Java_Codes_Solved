package main;

public class MaxSumOfArray {
    public static int  MaxArraySum(int A[],int B[],int n1, int n2){

       int index= findCommonElements(A,B,n1, n2);
        int sumA=0,sumB=0, result=0, sumAend=0, sumBend=0;
        for(int i=0;i<index;i++){
         sumA += A[i];

       }
        for(int j=0;j<index;j++){
            sumB += B[j];

        }
       if(sumA > sumB){
           result=sumA+A[index];

       }
       else {
           result=sumB+B[index];
       }
        for(int i=index+1;i<n1;i++){
            sumAend += A[i];
        }
        for(int j=index+1;j<n2;j++){
            sumBend =+ B[j];
        }
        if(sumAend > sumBend){
            result+=sumAend;
        }
        else {
            result+=sumBend;
        }
        return  result;
    }
    public static int findCommonElements(int A[],int B[],int n1, int n2){
        int b=0;
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(A[i]==B[j])
                        b=i;
                }
            }
            return b;
    }
    public static void main(String args[]){
        int A[]={2 ,3, 7, 10, 12};
        int B[]={1, 5 ,7, 8 };
        int n1=5 , n2=4;
        System.out.print(MaxArraySum(A,B,n1,n2));

    }
}
