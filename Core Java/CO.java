
// class and Object 

// class Calculator{ // Creating a class and putting value into it.
//     int a;

//     public int add(int n1, int n2){ // parameters for taking input from the main class
//         int r = n1 + n2;
//         return r;
//     }
// }


// Methods
class Computer {
    public void playMusic(){
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost) {
        
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

// Method Overloading 
class Calculator{
    public int add(int n1, int n2, int n3){ // 3 parameters method
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2){ // 2 parameters method 
        return n1 + n2;
    }

    public double add(double n1, double n2){ // different data type method.
        return n1 + n2;
    }
    // return type doesn't matter the method and it's Data Type matters.
}


public class CO {
    public static void main(String[] args){
        // int num1 = 4;
        // int num2 = 5;

        // Calculator calc = new Calculator(); // Making object

        // int result = calc.add(num1, num2); // pass values in the calculator class in the add function.

        // System.out.println(result);

// Methods 
        Computer obj = new Computer(); // Obj -> reference variable.
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);

// Method Overloading
        Calculator obj1 = new  Calculator();
            int r1 = obj1.add(10,4);
            System.out.println(r1);

    }
}
