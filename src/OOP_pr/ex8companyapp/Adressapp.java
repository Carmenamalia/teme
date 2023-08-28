package OOP_pr.ex8companyapp;

public class Adressapp {
    public static void main(String[] args) {
        Address address1 = new Address("LosAngeles", "rich street", 1);
        Address address2 = new Address("LosAngeles", "rich street", 2);
        Address address3 = new Address("LosAngeles", "rich street", 3);
        Address address4 = new Address("LosAngeles", "rich street", 4);

        Employee employee1 = new Employee("Ionica", "Georgel", 10000, address1);
        Employee employee2 = new Employee("Ionica", "Marcel", 10000, address2);
        Employee employee3 = new Employee("Ionica", "Mirel", 10000, address3);
        Employee employee4 = new Employee("Ionica", "Costel", 10000, address4);
        System.out.println(employee1.getName());//8.1
        System.out.println(employee1.getAdressStreet());//8.2
        employee1.printAdress(); //8.3 printeaza adresa

        Employee[] firstDepEmpList = {employee2, employee1};
        Employee[] secondDepEmpList = {employee3, employee4};
        Department department1 = new Department("dep1", firstDepEmpList, 2);
        Department department2 = new Department("dep2", secondDepEmpList, 2);
        Department[] departments = {department1, department2};
        department1.printNumberOfEmployeeOfDep();//8.4 printeaza nr de angajati
        department1.printAdressOfEmployee("Ionica Georgel"); //8.8 printeaza adresa unui anumit angajat din departament ???
        department1.findAdressByStreet("rich street");//8.9 cauta o adresa (dupa strada) in lista de angajati a dept, si ii afiseaza strada

        Company company = new Company("Tesla", 1980, 2);
        company.getStreetByEmployee("Ionica Mirel");  //8.14. printeaza strada adresei unui anumit angajat din companie
        company.printAllDepartments(); //8.10. printeaza toate departamentele din companie
        department1.getEmployeeByName("Ionica Georgel");
        department2.printAllEmployeesAddressStreets(); //8.7. cauta un anumit angajat dupa nume in departament, si ii afiseaza numele daca il gaseste
        company.printAllEmployeesByDep("dep1"); //8.12. printeaza cati angajati are un anumit departament din companie
        company.printAllEmployeesStreetsByDepartment("dep2"); //8.13. printeaza toate strazile adreselor angajatilor dintr-un anumit departament din companie
        company.getStreetByEmployee("Ionica Georgel"); //8.14. printeaza strada adresei unui anumit angajat din companie
        company.printNameOfEmployee("Ionica Georgel"); //8.15.cauta un angajat (dupa nume) intr-un anumit departament din companie si ii afiseaza numele
        company.getAllEmployees(); //8.16. printeaza toti angajatii din toate departamentele din companie
        company.getNumberOfEmployees(); //8.17.  printeaza numarul total de angajati din toate departamentele din companie
        company.searchEmployee(employee1);  //8.18.cauta un angajat in toate departamentele din companie si ii afiseaza numele, daca il gaseste
        department1.getNameOfEmplWithBiggerSalary();  //8.19. printeaza numele angajatului cu cel mai mare salariu dintr-un anumit departament
        department1.getNameOfEmplWithSmallerSalary(); //8.22.printeaza numele angajatului cu cel mai mic salariu dintr-un anumit departament;



    }
}
