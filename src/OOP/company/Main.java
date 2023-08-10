package OOP.company;

public class Main {
    public static void main(String[] args) {
        DeveloperContract[] developerContracts = new DeveloperContract[3];
        developerContracts[0] = new Employee("Andrei",12000);
        developerContracts[1] = new Freelancer("Anca",100);
        developerContracts[2] = new Employee("Mihai",10000);

        DevDepartment devDepartment = new DevDepartment(developerContracts);
          devDepartment.solveProductionBugs();
    }
}
