package main;

import java.util.*;
import java.util.stream.IntStream;
public class LinkedHashMapEntries {
//    public static void main(String[] args) {
//        Map<Integer,String> studentMap= new LinkedHashMap<Integer,String>();
//        studentMap.put(1,"Namita");
//        studentMap.put(2,"Arun");
//        studentMap.put(3,"Rakesh");
//        studentMap.putIfAbsent(6,"Rakesh");
//        studentMap.remove(3);
//        System.out.println(studentMap);
//        Map<String,Integer> travelFareMap= new LinkedHashMap<>();
//        travelFareMap.put("Bus", 120);
//        travelFareMap.put("Car", 2200);
//        travelFareMap.put("Rail", 680);
//        travelFareMap.put("Flight", 4000);
//        System.out.println(travelFareMap);
//        Integer fareCar=travelFareMap.remove("Car");
//        System.out.println("integer farecar" + fareCar);
//        System.out.println(travelFareMap);
//        boolean empty= travelFareMap.isEmpty();
//        System.out.println("empty" + empty + travelFareMap.size() + travelFareMap.get("Rail"));
//        travelFareMap.clear();
//        System.out.println(travelFareMap.isEmpty());
//        System.out.println(empty);
//        Set<Map.Entry<String,Integer>> entrySet= travelFareMap.entrySet();
//        System.out.println(entrySet);


//        List<String> products = new ArrayList<>();
//        products.add("redHat");
//        products.add("redHat");
//        products.add("redHat");
//        products.add("blackShirt");
//        products.add("yellowShirt");
//        System.out.println(featuredProduct(products));
//    }

    public static String featuredProduct(List<String> products) {
        if (products.isEmpty()) {
            return null;
        }
        HashMap<String, Integer> mapFeatured = new HashMap<>();
        for (String product : products
        ) {
            if (mapFeatured.containsKey(product)) {
                mapFeatured.put(product, mapFeatured.get(product) + 1);
            } else {
                mapFeatured.put(product, 1);

            }
        }
        Collection<Integer> values = mapFeatured.values();
        int max = 0;
        for (int value : values
        ) {
            if (max < value)
                max = value;
        }
        ArrayList sorted = new ArrayList();
        for (String product : mapFeatured.keySet()) {
            if (mapFeatured.get(product) == max)
                sorted.add(product);
        }
        Collections.sort(sorted);
        int s = sorted.size();
        String result = (String) sorted.get(s - 1);
        return result;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int fiberCount=0,fatCount=0,carbCount=0;
        int[] cookCount= new int[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            String ingredient = in.next();
            if(ingredient.contains("FAT")){
                fatCount+=1;
            }
            else if(ingredient.contains("FIBER")){
                fiberCount+=1;
            }
            else if(ingredient.contains("CARB")){
                carbCount+=1;
            }
            else System.out.println("String mismatch");
            if(fatCount<2 && fiberCount<2 &&fatCount<2){
                cookCount[i]=0;
            }
            else if(fatCount==2 &&carbCount==1){
                cookCount[i]=1;
                fatCount=fatCount-2;
                carbCount=carbCount-1;
            }
            else if(fatCount==2 &&fiberCount==1){
                cookCount[i]=1;
                fatCount=fatCount-2;
                fiberCount=fiberCount-1;
            }
            else if(fiberCount==2 &&fatCount==1){
                cookCount[i]=1;
                fiberCount=fiberCount-2;
                fatCount=fatCount-1;
            }
            else if(fiberCount==2 &&carbCount==1){
                cookCount[i]=1;
                fiberCount=fiberCount-2;
                carbCount=carbCount-1;
            }
            else if(carbCount==2 &&fiberCount==1){
                cookCount[i]=1;
                carbCount=carbCount-2;
                fiberCount=fiberCount-1;
            }
            else if(fatCount==2 &&fatCount==1){
                cookCount[i]=1;
                carbCount=carbCount-2;
                fatCount=fatCount-1;
            }
            else if(fatCount==3 ){
                cookCount[i]=1;
                fatCount=fatCount-3;
            }
            else if(carbCount==3 ){
                cookCount[i]=1;
                carbCount=carbCount-3;
            }
            else if(fiberCount==3 ){
                cookCount[i]=1;
                fiberCount=fiberCount-3;
            }



        }
        for(int p=0;p<numberOfDays;p++){
            System.out.print(cookCount[p]);
        }
    }
}