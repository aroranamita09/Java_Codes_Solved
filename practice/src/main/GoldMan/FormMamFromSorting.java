package main.GoldMan;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class FormMamFromSorting {
    public static void printlargest(Vector<String> arr){
        Collections.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String X,String Y){
                String XY=X+Y;
                String YX=Y+X;
                return XY.compareTo(YX) >0  ?-1:1;
            }
        });
        Iterator it=arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
    public static void main(String args[]){
      Vector<String> arr=new Vector<String>();
      arr.add("1");
        arr.add("34");
        arr.add("3");
        arr.add("98");
        arr.add("9");
        arr.add("76");
        arr.add("45");
        arr.add("4");
      printlargest(arr);
    }
}