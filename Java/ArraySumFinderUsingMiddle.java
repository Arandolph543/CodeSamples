/*Description: Problem from java2Novice int array finding the middle index with equal sums on both sides.
- See more at: http://www.java2novice.com/java-interview-programs/find-middle-index/#sthash.VG4a10Kr.dpuf
Author: April Randolph
Date: 10/20/2019 */

public class ArraySumFinderUsingMiddle {
    
    static int[] sum = new int[2];
    static int sumLeft;
    static int sumRight;

    public static int[] getLeftRightSums() {
         if(sumLeft > 0 && sumRight > 0) {
            sum[0] = sumLeft;
            sum[1] = sumRight;
         }
         return sum;
    }

    public static int findMiddleIndex(int[] numbers) throws Exception {
 
        int endIndex = numbers.length - 1;
        int startIndex = 0;
        sumLeft = 0;
        sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }
 
    public static void main(String a[]) {
        int[] num = { 2, 4, 4, 5, 4, 1 };
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                            + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        int[] arr = getLeftRightSums();
        System.out.println("The array has the sum1 of " + arr[0] + " and the sum2 is " + arr[1]);
    }
}
 
 
