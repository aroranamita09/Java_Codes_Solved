package main.GoldMan;
//21.	Given a 2 dimensional array that holds student name and score, calculate the maximum average score.  A student can have multiple entry with different score.
//        Input:
//        [
//        {
//        "Bob",80
//        "Charles",85
//        "Rob",70
//        "Bob",100
//        "Charles",75
//       }
//        ]
//        Output would be 90

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AverageScore {
    static void avgScore(String[][] scores){
        HashMap<String, ArrayList<String>> student_Map=new HashMap<>();

        for(int i=0;i<scores.length;i++)
        {
            String key=scores[i][0];
            String val=scores[i][1];
            ArrayList<String> list=new ArrayList<String>();
            if(student_Map.containsKey(key))
                student_Map.get(key).add(val);
            else{
                list.add(val);
                student_Map.put(key,list);
            }
        }
        System.out.println(student_Map.values());
    }
    public static void main(String args[] ){
       String[][] arr=
        {
                {"Bob","80"},
                {"Charles","85"},
                {"Rob","70"},
                {"Bob","100"},
                {"Charles","75"}
        };
        avgScore(arr);
    }
}
