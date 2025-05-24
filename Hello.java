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

        
    }
}

