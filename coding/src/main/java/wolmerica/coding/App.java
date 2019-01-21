package wolmerica.coding;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Manager m1 = new Manager("Nikhil",20000,500,1500);
        System.out.println("Salary of Manager= "+m1.getSalary());
        
        Employee e1 = new Employee("Rich", 104000);
        System.out.println("Salary of Employee= "+e1.getSalary());
        
        System.out.println("A. Using abstract class with one method with body");
        Avalanche av1 = new Avalanche();
        av1.retailPrice(28000);
        av1.passengerCapacity();
        av1.propulsionType();
        av1.efficiencyRate();
        
        System.out.println("B. Using interface with all abstract methods/no body");
        Terrain t1 = new Terrain();
        t1.retailPrice();
        t1.passengerCapacity();
        t1.propulsionType();
        t1.efficiencyRate();
    }
}

