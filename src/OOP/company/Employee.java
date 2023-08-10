package OOP.company;

public class Employee implements DeveloperContract,ManagerContract{
    private String name;
    private  double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void implementFeatures() {
        System.out.println("implement as employee");
    }

    @Override
    public void solveBugs() {
        System.out.println("solve bugs as employee");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("write documentation as employee");
    }

    @Override
    public void evaluatePeople() {
        System.out.println("evaluate people");
    }

    @Override
    public void delegateTasks() {
        System.out.println("delegate tasks");
    }
}
