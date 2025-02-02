package level_1.carryforward;

/*You have given a string A having Uppercase English letters.
You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.*/
public class FindNumberOfPairs {

    public static void main(String[] args) {
        String s = "ABGFG";
        checkItWithBruteForce(s);
        checkItWithEfficientSolution(s);
    }

    private static void checkItWithBruteForce(String s) {
        int pairs = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == 'A' && s.charAt(j) == 'G') {
                    pairs++;
                }
            }
        }

        System.out.println("number of pairs are using BruteForce" + pairs);
    }
    private static void checkItWithEfficientSolution(String s) {
        int pairs=0;
        int As=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                As++;
            }
            if(s.charAt(i)=='G'){
                pairs=pairs+As;
            }
        }
        System.out.println("number of pairs are using efficient approach "+ pairs);
    }
}
