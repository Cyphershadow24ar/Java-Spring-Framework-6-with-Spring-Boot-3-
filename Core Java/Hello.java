class Hello{
    public static void main(String[] args) {
        // variables
        int num1 = 3 ;
        int num2 = 5 ;
        int result = num1 + num2;
        System.out.println(result);
    
        // 1
        System.out.println("Hello, World!");

        // Data Types
        byte by = 127;
        System.out.println(by);
        short sh = 558;
        System.out.println(sh);
        long l = 5854l;
        System.out.println(l);
        float f = 5.5f;
        System.out.println(f);
        double d = 1.7;
        System.out.println(d);
        char c = 'S';
        System.out.println(c);
        boolean b = true;
        System.out.println(b);
        String str = "Spurs are champions.";
        System.out.println(str);

        // literals
        int num3 = 0b101; // binary
        System.out.println(num3);
        int num4 = 0x7E; // hexadecimal
        System.out.println(num4);
        int num5 = 100_000; // underscore in number
        System.out.println(num5);
        double num6 = 12e10; // scientific notation
        System.out.println(num6);
        boolean num7 = false; // boolean literal
        System.out.println(num7);
        char z = 'a'; // character literal
        z++;
        ++z;
        System.out.println(z); // prints 'z'

        // TYpe Conversion
        byte bi = 125;
        int a = 257;
        byte k = (byte) a;
        System.out.println(k);

        float fo = 5.6f; // lost the .6 
        int t = (int) fo;
        System.out.println(t);

        // Type promotion 
        byte ai = 10;
        byte ba = 30;

        int result1 = ai * ba; // value will promoted to int from byte.
        System.out.println(result1);

        // Arithmetic operation 
        int num8 = 7;
        int num9 = 5;

        // int result2 = num8 + num9;
        // int result2 = num8 - num9;
        // int result2 = num8 * num9;
        int result2 = num8 / num9;
        System.out.println(result2);

        // num8 = num8 + 1;
        // num8  += 1;

        num8++; // post increment - fetch the value first then increments it.
        ++num8;  // pre increment - first increment the value then fetch it.
        --num8; // pre decrement 
        num8--; // post decrement
        System.out.println(num8);

        // Relational Operators
        int num10 = 10;
        int num11 = 20;
        boolean isEqual = num10 == num11; // equal to
        System.out.println(isEqual);
        boolean isNotEqual = num10 != num11; // not equal to
        System.out.println(isNotEqual);
        boolean isGreater = num10 > num11; // greater than
        System.out.println(isGreater);
        boolean isLess = num10 < num11; // less than
        System.out.println(isLess);
        boolean isGreaterOrEqual = num10 >= num11; // greater than or equal to
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = num10 <= num11; // less than or equal to
        System.out.println(isLessOrEqual);


        // Logical Operators

        boolean condition1 = true;
        boolean condition2 = false; 

        boolean andCondition = condition1 && condition2; // logical AND
        System.out.println(andCondition);

        boolean orCondition = condition1 || condition2; // logical OR
        System.out.println(orCondition);

        boolean notCondition = !condition1; // logical NOT
        System.out.println(notCondition);

        // if-else statement

        int x1 = 8;
        int y1 = 7;

        if(x1 > y1){
            System.out.println(x1);
            System.out.println("Thank you.");
        }
        else
            System.out.println(y1);

        // If else if 
        int x2 = 8;
        int y2 = 7;
        int z1 = 9;

        if(x2>y2 && x2>z1 ){
            System.out.println(x2+ "X2 is the greatest.");
        }
        else if(y2>z1){
            System.out.println(y2+" y2 is the greatest.");
        }else{
            System.out.println(z1+" Z1 is the greatest.");
        }

        // Ternary OPerator 
        int n =100;
        int result3 = 0;

        // if(n%2 ==0 )
        //     result3 = 10;
        // else
        //     result3 = 20;

        result3 = n%2 == 0 ? 10 : 20;

        // IN ternary operator first we write the condition that check the condition on boolean then after the '?' mark we write the true and false output for the condition 'True' : 'False'.

        System.out.println(result3);  

        // Switch Case Statement

        int n1 = 4;

        switch(n1){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number.");
        }
    }
}

