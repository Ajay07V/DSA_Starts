package level_1.carryforward;

public class FaultyBulb {
    public static void main(String[] args) {
        int[] a = {1, 0, 0};
        int count = getMinNumRequiredToLightUpAllTheBulbsBruteForce(a);
        int countMin = getMinNumRequiredToLightUpAllTheBulbsEfficient(a);
        System.out.println("efficient "+ countMin);
        System.out.println("BruteForce "+ count);
    }

    private static int getMinNumRequiredToLightUpAllTheBulbsEfficient(int[] a) {
        int state=0, count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==state){
                count++;
            }
            state = 1 - state;
        }
        return count;
    }

    private static int getMinNumRequiredToLightUpAllTheBulbsBruteForce(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
                for (int j = i; j < a.length; j++) {
                    //toggle switches OFF will be ON and ON will be OFF
                    a[j] = 1 - a[j];
                }
            }
        }

        return count;
    }
}
