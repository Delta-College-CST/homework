//Delta College - CST 183 - Homework 2
// LineFun Class Test Driver 3
// Name:

public class TestCoffee
{
    public static void main( String args[] )
    {

        // Test no-arg constructor
        CoffeeBeanOrder order1 = new CoffeeBeanOrder();
        System.out.println(order1);

        // Test setters, toString(), and calculations
        order1.setWeight(3.1);
        order1.setQuality(1);
        System.out.println(order1);
        System.out.println(order1.calcCost());
        System.out.println(order1.calcShipping());

        // Test parameterized constructor, and calculations
        CoffeeBeanOrder order2 = new CoffeeBeanOrder(7.2,2);
        System.out.println(order2);
        System.out.println(order1.calcCost());
        System.out.println(order1.calcShipping());

    }
}  

