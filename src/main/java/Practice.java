import java.sql.SQLOutput;
import java.util.ArrayList;

public class Practice {


    public void forLoop() {
        for(int i = 100; i >= 5; i -= 5){
            System.out.println(i);
        }
    }

    public void sumOfIntegers() {
        int sum = 0;
        for(int i = 9; i <= 17; i++){
            sum += i;
        }
        System.out.println(sum);
    }

   // a = [9, 5, 6, 3, 8, 2, 4]
    public Integer smallestInteger(Integer[] a) {
        int smallestNumber = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < smallestNumber){
                smallestNumber = a[i];
            }
        }
        return smallestNumber;
    }

    public Integer biggestInteger(Integer[] a) {
        int biggestNumber = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > biggestNumber){
                biggestNumber = a[i];
            }
        }
        return biggestNumber;
    }

    public Integer firstTrue(Boolean[] a) {
        int firstTrueInArray = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == true){
            firstTrueInArray = i;
            }
        }
        return firstTrueInArray;
    }

    public Integer firstTrueWhile(Boolean[] a) {
        int i = 0;
        // a = [false, false, true, false]
        while(a[i] != true){
            i++;
        }
        return i;
        }

    public Integer[] addFiveToArray(Integer[] a) {
        // a = [1,2,3,4,5]
        for(int i = 0; i < a.length; i++){
              a[i] += 5;
        }
        return a;
    }

    public Double[] divideDoubleArray(Double[] a) {
        for(int i = 0; i < a.length; i++) {
            a[i] /= 1.3;
        }
        return a;
    }

    public Double[] raiseToPowerAndSubtract(Double[] a) {
        for(int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 3) - (a[i] / 3.0);
        }
        return a;
    }

//   0 {1,2,3},
//   1 {1,2,3}
    public Integer[][] multiplyBySeven(Integer[][] a){
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                a[row][col] *= 7;
            }
        }
        return a;
    }


    //    {1,2,3,4,5},
    //    {1,2,3,4,5},
    //    {1,2,3,4,5},
    //    {1,2,3,4,5},
    //    {1,2,3,4,5},
    // create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans.
    // each element in the result should be true if the value in the argument array is even, else it's false.
    public Boolean[][] booleanArray(Integer[][] a) {
        Boolean[][] newArray = new Boolean[a.length][a[0].length];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                if(a[row][col] % 2 == 0){
                   newArray[row][col] = true;
                } else if(a[row][col] % 2 != 0){
                    newArray[row][col] = false;
                }
            }
        }
        return newArray;
    }

    // create a method that takes two doubles and returns the first parameter raised to the second parameter's value
    public Double doubleParameter(double d, double x){
       return Math.pow(d,x);
    }

    public Boolean fishOrNot(Object object) {
        return object instanceof Fish;
    }

    //There is an object x which has a method (double)Balance().
    // Build an IF statement that prints "Paid Off" if the result
    // of the balance call is less than of equal to 1.0, else it prints
    // the balance as a Dollar figure (2 decimal places)

    public String findBalance(double d) {
        String result = "";
        if(d <= 1.0) {
            result += "Paid Off";
        } else{
            result += "$" + String.format("%.2f", d);
        }
        return result;
    }

    //Build a WHILE loop that turns on the heat if the thermo.getTemp() is less than 72.0
    // else it turns on the A/C if thermo.getTemp() is greater that 76.0.
    public String getTemp(double d) {
        String result = "";
        if(d < 72.0){
            result += "Turn on heat";
        } else if(d > 76.0){
            result += "Turn on A/C";
        }
        return result;
    }

    //Find a number greater than Pi in a double array, print number and its index.
    public void greaterThanPi(Double[] a) {
        double biggerThanPi = 0.0;
        int indexNumber = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > 3.14){
                biggerThanPi += a[i];
                indexNumber += i;
            }
        }
        System.out.println(biggerThanPi + " " + indexNumber);
    }

    //Given an array of objects (of class Xaction) w/nulls,
    // sum all the values of the objects in the array, using Xaction::getValue(). Print the sum.
    public int getValue(Xaction[] objectArray) {
       int sum = 0;

       for(Xaction x : objectArray) {
           if (x.getValue() != null) {
               sum += x.getValue();
           }
       }
       return sum;
    }

    public Xaction[] reverseArray(Xaction[] objectArray) {
        Xaction[] newArray = new Xaction[objectArray.length];
        int j = 0;
        for(int i = objectArray.length - 1; i >= 0; i--) {
            newArray[j]= objectArray[i];
            j++;
        }
        return newArray;
    }

    //Print a 5's times table
    public String createTimesTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                String row = String.format("%3d |", i * j);
                table.append(row);
            }
            table.append("\n");
        }
        return table.toString();
    }

    //determine the hypotenuse of a 9 by 7 right triangle, assign it to a double
    public Double getHypotenuse(double d, double x) {
        double hypotenuse = 0.0;
        double j = 0;
        double k = 0;
        j = Math.pow(d, 2) + Math.pow(x, 2);
        k = Math.sqrt(j);
        hypotenuse = Math.round(k * 10.0) / 10.0;

        return hypotenuse;

    }

}







