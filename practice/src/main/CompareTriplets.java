package main;

import java.util.List;
import java.util.Scanner;

public class CompareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> aScore=null;
        List<Integer> bScore=null;
        List<Integer> tScore=null;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>b.get(i)){
                aScore.add(1);
            }
            else{
                bScore.add(1);
            }
        }
        tScore.addAll(aScore);
        tScore.addAll(bScore);
        return  tScore;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> a= null;
        List<Integer> b=null;
        sc.nextLine();
        compareTriplets(a,b);
        System.out.println();
    }
}





//

//        Map.Entry<String, Integer> maxProduct = null;
//        if (productName != "top") {
//        if (products.containsKey(productName)) {
//        productNumber += products.get(productName);
//        products.put(productName, productNumber);
//        }
//        products.put(productName, productNumber);
//        } else {
//        for (Map.Entry<String, Integer> entry : products.entrySet()) {
//        if (maxProduct == null || entry.getValue() > maxProduct.getValue()) {
//        maxProduct = entry;
//        System.out.println(maxProduct.getValue());
//        } else {
//        System.out.println(entry.getValue());
