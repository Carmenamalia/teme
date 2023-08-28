package OOP_pr.ex8companyapp;

public class Company {
    private String name;
    private int yearFounded;
    private Department[] departments;
    private int numberOfDepartmentsAdded;

    public Company(String name, int yearFounded, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.numberOfDepartmentsAdded = 0;
        this.departments = new Department[numberOfDepartments];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartmentsAdded() {
        return numberOfDepartmentsAdded;
    }

    public void setNumberOfDepartmentsAdded(int numberOfDepartmentsAdded) {
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }


    //8.10. scrie o metoda care printeaza toate departamentele din companie ???
    public void printAllDepartments() {
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            System.out.println(departments[i].getName().toString());
        }
        System.out.println("?");
    }

    //8.11. scrie o metoda care printeaza toti angajatii dintr-un anumit departament din companie
    public void printAllEmployeesByDep(String departmentName) {
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (departmentName.equals(departments[i].getName())) {
                System.out.println(departments[i].getEmployees());
            }
        }
    }

    //8.12. scrie o metoda care printeaza cati angajati are un anumit departament din companie
    public void printNumberOfEmployees(String departmentName) {
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (departmentName.equals(departments[i].getName())) {
                System.out.println(departments[i].getNumberOfEmployeesAdded());
            }
        }
    }

    //8.13. scrie o metoda care printeaza toate strazile adreselor angajatilor dintr-un anumit departament din companie
    public void printAllEmployeesStreetsByDepartment(String departmentName) {
        //cautam departamentul in lista de departamente a companiei pe care apelez metoda
        //pe departamentul gasit apelez metoda de printAllEmployeesAdressStreets
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (departmentName.equals(departments[i].getName())) {
                departments[i].printAllEmployeesAddressStreets();
            }
        }
        System.out.println("not found");
    }

    //8.14. scrie o metoda care printeaza strada adresei unui anumit angajat din companie:
    public String getStreetByEmployee(String employeeName) {
        //caut prin fiecare lista de angajati a fiecarui departament angajatul cu numele employeeName
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            //caut angajatul cu numele employeeName in departamentul de la pozitia i
//            Department currentDepartment = departments[i];
//            for (int j = 0; j < currentDepartment.getNumberOfEmployeesAdded(); j++) {
//                Employee currentEmployee = currentDepartment.getEmployees()[j];
//                if (employeeName.equals(currentEmployee.getName())){
//                    return currentEmployee.getAdressStreet();
//                }
//
//            }
            Employee employee = departments[i].getEmployeeByName(employeeName);
            if (employee != null) {
                return employee.getAdressStreet();
            }
        }
        return null;
    }


    //8.17. scrie o metoda care printeaza numarul total de angajati din toate departamentele din companie
    public int getNumberOfEmployees() {
        int count = 0;
        for (int i = 0; i < departments.length; i++) {
            count += departments[i].getEmployees().length;
        }
        return count;
    }

    //8.15. scrie o metoda care cauta un angajat (dupa nume) intr-un anumit departament din companie si ii afiseaza numele, daca il gaseste
    public void printNameOfEmployee(String employeeName) {
        for (int i = 0; i < departments.length; i++) {
            if (employeeName.equals(departments[i].getName())) {
                System.out.println(departments[i].getName());
            }
        }
        System.out.println("not found");
    }

    //8.16. scrie o metoda care printeaza toti angajatii din toate departamentele din companie
    public String[] getAllEmployees() {
        String[] allEmployeesNames = new String[getNumberOfEmployees()];
        int k = 0;
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments[i].getEmployees().length; j++) {
                allEmployeesNames[k] = departments[i].getEmployees()[j].getName();
                k++;
            }
        }
        return allEmployeesNames;
    }
    //8.18. scrie o metoda care cauta un angajat in toate departamentele din companie si ii afiseaza numele, daca il gaseste
    public void searchEmployee(Employee employee){
        for (int i = 0; i < departments.length; i++) {
            if (employee.equals(departments[i].getEmployeeByName(employee.getName()))){
                System.out.println(departments[i].getEmployeeByName(employee.getName()));
            }
        }
        System.out.println("not found");
    }
//8.20. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu din companie
    public void printNameOfEmplWithBiggerSalaryOfComp(){

    }
 //8.21. scrie o metoda care printeaza numele angajatului cu cel mai mic salariu din companie
 public void printNameOfEmplWithSmallerSalaryOfComp(){

 }


}
