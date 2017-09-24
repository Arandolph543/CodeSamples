public class Prime {
    
    public Prime() {
        
    }
    
    public void checkPrime(int num1, int num2) {
        checkPrime(num1);
        checkPrime(num2);
    }
    
     public void checkPrime(int num1, int num2, int num3) {
        checkPrime(num1);
        checkPrime(num2);
        checkPrime(num3);
    }
    
     public void checkPrime(int num1, int num2, int num3, int num4) {
        checkPrime(num1);
        checkPrime(num2);
        checkPrime(num3);
        checkPrime(num4);
    }
    
     public void checkPrime(int num1, int num2, int num3, int num4, int num5) {
        checkPrime(num1);
        checkPrime(num2);
        checkPrime(num3);
        checkPrime(num4);
        checkPrime(num5);
    }
    
    public void checkPrime(int number) {
        int tempAdditionNPN = 0;
        int divisor = 0;
        int multiple = 0;
        boolean prime = true;
        for(int i = 0; i<number; i++) {
            if(number %2 == 0) {
                divisor = number/2;
                if(divisor > i) {
                    multiple = divisor * i;
                    if(multiple == number) {
                        prime = false;
                        
                    }
                }
            } 
            
        }
        if(prime) {
            System.out.println(number + " is a prime number.");
        }   
    }   
	
	
}