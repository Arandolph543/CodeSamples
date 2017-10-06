import java.io.*;  
import java.util.*;  
import java.text.*;  
import java.math.*;  
import java.util.regex.*;

public class ChocolateDistributionCopy {  
    static boolean DBG = false;

    // Min number in the Array.
    static int min;

    //Find the minimised action counts 
    static int MinRound(int[] counts) {

        int[][] results = new int[counts.length][3];
        for (int i = 0; i< counts.length; i++){
            for (int j = 0; j<3; j++){

               int delta = counts[i] - min +j;
				System.out.println("Delta: " + delta);
                results[i][j] = 0;
                while(true){
                    // Greedy approach
                    if( delta >=5 ){
                        delta -= 5;
                        results[i][j]++;
						System.out.println("Adding for 5");
                    }else if(delta >=2){
                        delta -= 2;
                        results[i][j]++;
						System.out.println("Adding for 2");
                    }else if (delta >= 1){
                        delta -= 1;
                        results[i][j]++;
						System.out.println("Adding for 1");
                    } else {
                        break;
                    }
                }
            } 
        }
        int finalResult = -1;
        // Compare results from different baseline cases (keep min, take 1, 2 ). 
        for (int i = 0; i< 3; i++){
            int subFinal = 0;
            for (int j =  0; j < counts.length; j++){
                subFinal += results[j][i];
               // if(DBG) System.out.format("results[%d][%d] = %d \n",j,i,results[j][i]);
            }
           // if(DBG) System.out.println(subFinal);
            if(finalResult < 0 || finalResult > subFinal){ finalResult = subFinal;}
        }

        return finalResult;
    }

    public static void main(String[] args) {

        int casesCount = 0;

        Scanner s = new Scanner(System.in);

         if(s.hasNextInt()){
        casesCount = s.nextInt();
         }
        s.nextLine(); // throw away the newline.

        int[] outputArrary = new int[casesCount];

        for(int i = 0; i < casesCount; i++){
            int count = 0;
            if(s.hasNextInt()){
                count = s.nextInt();
            }
            s.nextLine();

            int[] numbers = new int[count];
            min = -1;
            for (int j = 0; j < count; j++){
                if (s.hasNextInt()) {
                    numbers[j] = s.nextInt();
                    // get min value from input array
                     if (numbers[j] < min || min < 0){
                        min = numbers[j];
                     }
                } else {
                    System.out.println("You didn't provide enough numbers");
                    break;
                }
            }
            //SortCounts(numbers);
            outputArrary[i] = MinRound(numbers); 

        }

        for(int i = 0; i < casesCount; i++){
            System.out.println(outputArrary[i]);          
        }
    }
}
