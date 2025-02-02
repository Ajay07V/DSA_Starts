package level_1.carryforward;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an integer array A containing N distinct integers,
you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.*/
public class LeadersOfAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        ArrayList<Integer> leadersOFAnArrayBruteForce = leadersOfAnArrayBruteForce(arrayList);
        System.out.println("BruteForce Method :::");
        for (Integer leader : leadersOFAnArrayBruteForce) {
            System.out.print(leader + " ");
        }
        System.out.println();
        System.out.println("==================");
        System.out.println("Efficient Method :::");
        ArrayList<Integer> leadersOFAnArrayEfficient = leadersOFAnArrayEfficient(arrayList);
        for (Integer leader : leadersOFAnArrayEfficient) {
            System.out.print(leader + " ");
        }

    }

    private static ArrayList<Integer> leadersOfAnArrayBruteForce(ArrayList<Integer> arrayList) {
        //use boolean operator based on that elements can be added to arrayList
        ArrayList<Integer> lightUpArray = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) <= arrayList.get(j)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                lightUpArray.add(arrayList.get(i));
            }
        }
        return lightUpArray;
    }

    private static ArrayList<Integer> leadersOFAnArrayEfficient(ArrayList<Integer> arrayList) {
        /*If we start from the end, we only need to keep track of one value - the maximum so far
         *
         *
         *
         * */
        ArrayList<Integer> resultantList =new ArrayList<>();
        int max= arrayList.get(arrayList.size()-1);
        resultantList.add(max);
        for(int i=arrayList.size()-1;i>=0;i--){
            if(max<arrayList.get(i)){
                max=arrayList.get(i);
                resultantList.add(max);
            }
        }

        return resultantList;
    }
}
