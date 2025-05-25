public class Demo {
    public static void main(String[] args) {
        
        // While loop 

        // int i=1;

        // while (i <= 5) { // condition until it's true.
        //     System.out.println("hi " + i);

        //     int j = 1;
        //     while(j <= 3){ // nested while loop 
        //         System.out.println("Hello " + j);
        //         j++;
        //     }
        //     i++;
        // }
        // System.out.println("Bye "+ i);

        // Do while loop 
        // int i = 5 ;

        // do{
        //     System.out.println("Hi " + i);
        //     i++;
        // } while(i <= 4);
        
        // For loop 

        // for(int i = 0; i < 4; i++){
        //     System.out.println("Hi "+ i);
        // }

        for(int i =1; i<=5 ;i++){
            System.out.println("Day" + i);

            for(int  j=1 ; j<=9; j++){
                System.out.println(" "+ (j+8) + "-" + (j+9));
            }
        }

        // for (; i<=5 (condition) ; ) <- Syntax must follow.

        // Which loop to Use ?

        // 1. While -> Reading a file from start to end and you don't need to stop in between so While is more suitable for start to end purpose.

        // 2. Do while -> Use when you want to have at least 1 output even thought you know that the condition can be wrong.

        // 3. For loop -> If you know the Number of loops you want to run, Initialization value, Condition, Increment  decrement.


    }
}
