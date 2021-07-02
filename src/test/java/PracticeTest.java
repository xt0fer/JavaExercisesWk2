import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PracticeTest {


    @Test

    public void testForLoop() {
        Practice practiceTest = new Practice();
        practiceTest.forLoop();
    }

    @Test
    public void testSumOfIntegers() {
        Practice practiceTest = new Practice();
        practiceTest.sumOfIntegers();

    }

    @Test
    public void testSmallestInteger() {
        Practice practiceTest = new Practice();
        Integer[] a = {9, 5, 6, 3, 8, 2, 4};

        Integer expected = 2;
        Integer actual = practiceTest.smallestInteger(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBiggestInteger() {
        Practice practiceTest = new Practice();
        Integer[] a = {9, 5, 6, 3, 8, 2, 4};

        Integer expected = 9;
        Integer actual = practiceTest.biggestInteger(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstTrue() {
        Practice practiceTest = new Practice();
        Boolean[] a = {false, false, false, true, false};

        Integer expected = 3;
        Integer actual = practiceTest.firstTrue(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstTrueWhile() {
        Practice practiceTest = new Practice();
        Boolean[] a = {false, false, false, true, false};

        Integer expected = 3;
        Integer actual = practiceTest.firstTrueWhile(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddFiveToArray() {
        Practice practiceTest = new Practice();
        Integer[] a = {1, 2, 3, 4, 5};

        Integer[] expected = {6, 7, 8, 9, 10};
        Integer[] actual = practiceTest.addFiveToArray(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideArray() {
        Practice practiceTest = new Practice();
        Double[] a = {1.3, 2.6, 3.9};

        Double[] expected = {1.0, 2.0, 3.0};
        Double[] actual = practiceTest.divideDoubleArray(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRaiseToPowerAndSubtract() {
        Practice practiceTest = new Practice();
        Double[] a = {1.3, 5.4, 6.1};

        Double[] expected = {1.8, 155.7, 224.9};
        Double[] actual = practiceTest.raiseToPowerAndSubtract(a);
    }

    @Test
    public void testMultiplyBySeven() {
        Practice practiceTest = new Practice();
        Integer[][] a = {
                {1,2,3},
                {1,2,3}
        };

        Integer[][] expected = {{7,14,21},{7,14,21}};
        Integer[][] actual = practiceTest.multiplyBySeven(a);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testBooleanArray() {
        Practice practiceTest = new Practice();
        Integer[][] a = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
        };

        Boolean[][] expected = {
                {false,true,false,true,false},
                {false,true,false,true,false},
                {false,true,false,true,false},
                {false,true,false,true,false},
                {false,true,false,true,false},
        };

        Boolean[][] actual = practiceTest.booleanArray(a);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDoubleParameters() {
        Practice practiceTest = new Practice();
        Double d = 3.0;
        Double x = 2.0;

        Double expected = 9.0;
        Double actual = practiceTest.doubleParameter(d,x);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFishOrNot() {
        Practice practiceTest = new Practice();
        Fish fish = new Fish();

        Boolean expected = true;
        Boolean actual = practiceTest.fishOrNot(fish);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFishOrNot1() {
        Practice practiceTest = new Practice();
        Object object = new Object();

        Boolean expected = false;
        Boolean actual = practiceTest.fishOrNot(object);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBalance() {
        Practice practiceTest = new Practice();
        double d = 50.23;

        String expected = "$50.23";
        String actual = practiceTest.findBalance(d);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testBalance1() {
        Practice practiceTest = new Practice();
        double d = 1.0;

        String expected = "Paid Off";
        String actual = practiceTest.findBalance(d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetTemp() {
        Practice practiceTest = new Practice();
        double d = 70.0;

        String expected = "Turn on heat";
        String actual = practiceTest.getTemp(d);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetTemp1() {
        Practice practiceTest = new Practice();
        double d = 78.0;

        String expected = "Turn on A/C";
        String actual = practiceTest.getTemp(d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGreaterThanPi() {
        Practice practiceTest = new Practice();
        Double[] a = {3.0, 2.8, 4.7};
        practiceTest.greaterThanPi(a);


    }

    @Test
    public void testGetValue() {
        Practice practiceTest = new Practice();

        Xaction x1 = new Xaction(2);
        Xaction x2 = new Xaction(4);
        Xaction x3 = new Xaction();

        Xaction[] xArray = { x1, x2, x3 };

        Integer expected = 6;
        Integer actual = practiceTest.getValue(xArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseArray() {
        Practice practiceTest = new Practice();
        Xaction x1 = new Xaction(2);
        Xaction x2 = new Xaction(4);
        Xaction x3 = new Xaction();

        Xaction[] objectArray = {x1, x2, x3};

        Xaction[] expected = {x3, x2, x1};
        Xaction[] actual = practiceTest.reverseArray(objectArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCreateTimesTable() {
        Practice practiceTest = new Practice();
        String expected =
                "  1 |  2 |  3 |  4 |  5 |\n" +
                "  2 |  4 |  6 |  8 | 10 |\n" +
                "  3 |  6 |  9 | 12 | 15 |\n" +
                "  4 |  8 | 12 | 16 | 20 |\n" +
                "  5 | 10 | 15 | 20 | 25 |\n";

        String actual = practiceTest.createTimesTable(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHypotenuse() {
        Practice practiceTest = new Practice();
        double d = 9.0;
        double x = 7.0;

        Double expected = 11.40;
        Double actual = practiceTest.getHypotenuse(d,x);

        Assert.assertEquals(expected, actual);

    }





}
