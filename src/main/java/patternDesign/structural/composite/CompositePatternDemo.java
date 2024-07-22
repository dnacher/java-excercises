package patternDesign.structural.composite;

/**
 * Daniel Nacher
 * 2024-07-22
 *
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite
 *  pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of
 *  design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
 *
 *  This pattern creates a class contains group of its own objects. This class provides ways to modify its group of
 *  same objects.
 *
 *  We are demonstrating use of Composite pattern via following example in which show employees hierarchy of an
 *  organization.
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
