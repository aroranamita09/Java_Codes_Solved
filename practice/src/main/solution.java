package main;
import java.util.*;
public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            while(n>=0){
               String productsName= sc.nextLine();
                int productNumber = 0;
                String productName = "";
                Map<String, Integer> products = new HashMap<String, Integer>();
                if(productsName.equals("top")){
                    productName="top";
                    productNumber=0;
                    products.put(productName, productNumber);
                }
                else {
                    String[] part=productsName.split(" ");
                    productName =part[0];
                    System.out.print(productName);
                    //System.out.print(part[0] + "1 is " + part[1]);
                   // productNumber = Integer.parseInt(part[1]);
                  //  products.put(productName, productNumber);
                }
    }
            t--;
}
    }
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

