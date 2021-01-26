package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solutionA {
    public static void main(String[] args) {
        int t=0;
        int n=0;
        Scanner sc = new Scanner(System.in);
         t = sc.nextInt();
             n = sc.nextInt();
        String[] productString = new String[n];
        int productNumber = 0;
        String productName = "";
        Map<String, Integer> products = new HashMap<String, Integer>();
             for(int i=0;i<n-1;i++){
                  productString[i] = sc.nextLine();
                  if(!productString.equals("top")) {
                      String[] part = productString[i].split(" ");
                      productName = part[0];
                      productNumber = Integer.parseInt(part[1]);
                  }
                  else {

                      productName="top";
                      productNumber=0;
                      products.put(productName, productNumber);
                  }
                 System.out.println(products);

            }}


    public static void FindMaxProduct(HashMap<String,Integer> products){
        Map.Entry<String, Integer> maxProduct = null;

            for (Map.Entry<String, Integer> entry : products.entrySet()) {
                if (maxProduct == null || entry.getValue() > maxProduct.getValue()) {
                    maxProduct = entry;
                    System.out.println(maxProduct.getValue());
                } else {
                    System.out.println(entry.getValue());
                }
            }

        }
    }

