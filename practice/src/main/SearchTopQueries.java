package main;

import java.util.*;

public class SearchTopQueries{
    //List of String
    //Top n queries=100
    //List of Key Value pa key=String ,Value=Integer
    //inputQ=10 n=5
   // f=15 a=10 b=10 c=5 d=3
    // a=10 a=10
    //top two
    static LinkedHashMap<String ,Integer> findFrequency(List<String> inputQueries,int n){
        HashMap<String ,Integer> countQuery=new HashMap<>();
        LinkedHashMap<String ,Integer> resultantQueries=new LinkedHashMap<String ,Integer>();
        for(String query :inputQueries){
//            if(countQuery.containsKey(query)){
                countQuery.put(query,countQuery.getOrDefault(query,0)+1);
            //countQuery.put(query,1);
//            }
//            else{

           // }
        }
        //Find top 100/n values have to sort on the basis of values;
        //Have to sort map on  basis of values;
        ArrayList<Integer> topFreqVal=new ArrayList<>();
        //topFreqVal=(ArrayList<Integer>)countQuery.values();
     for(Integer val: countQuery.values()){
         topFreqVal.add(val);
     }
        //pivot index low high
        Collections.sort(topFreqVal);
       //take only top n values;
        for( int i=0;i<n;i++){
            //topFreqVal=100,
            //
              for(Map.Entry<String,Integer> entry:countQuery.entrySet()){
                  if(entry.getValue()==topFreqVal.get(i)){
                        resultantQueries.put((String)entry.getKey(),(Integer) entry.getValue());
                  }
              }
        }
        return resultantQueries;
    }
    public static void main(String args[]){
        ArrayList<String> listOfQueries=new ArrayList<>();
        int i=15;
        int j=10;
        int k=10;
        while(i>0){
        listOfQueries.add("f");
        i--;}
        while(j>0){
            listOfQueries.add("a");
            j--;}
        while(k>0){
            listOfQueries.add("b");
            k--;}
        // c=5 d=3
        LinkedHashMap<String,Integer> freqMap=findFrequency(listOfQueries,3);
        for(Map.Entry<String,Integer> entry: freqMap.entrySet()){
            System.out.print("The key is"+ entry.getKey()+"The value is "+entry.getValue());
        }
    }

}
