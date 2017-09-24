static int distributeCandy(int[] score) {
        int children = score[0];
		int highest = 0;
		int performanceMarking = 0; 
		int candies = 0;
        int temp = 0;
        int candiesTemp;
System.out.println(score.length + " length");
		for(int i = 1; i <= score.length -1; i++) {
             System.out.println(score[i]);
			if(score[i] > highest) {
				highest = score[i];
               
			}
		}
System.out.println(highest + " ht");
        for(int q = 1; q<=score.length -1; q++) {
            int temp1 = 0;
            int temp2 = 0;
         
            if(highest == score[q] && ((score.length - 1) > 2)) {
                if(score.length-1 > q+1) {
                    temp1 = score[q +1];  
                    System.out.println("temp1 " + score[q + 1]);
                }
                if(q-1 > 0) {
                    temp2 = score[q -1];
                    System.out.println("temp2 " + score[q - 1]);
                }
                if(temp2 >= temp1){
                    performanceMarking = highest - temp2;
                } else if(temp2 < temp1) {
                    performanceMarking = highest - temp1;
                }   
                candiesTemp = score[q] - performanceMarking;    
               System.out.println("canTem " + candiesTemp);
                candiesTemp = candiesTemp + (score[highest] * 2);
                 System.out.println("canTem2 " + candiesTemp);
                if(candies < candiesTemp) {
                    candies = candiesTemp;
                } 
            } else {
                 candies = score[highest] * 2;
            }
            
           
        }
         System.out.println(performanceMarking + " candies ");
		return candies;
    }
