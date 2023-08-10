package OOP.company;

public class DevDepartment {
    private DeveloperContract[] developerContract;

    public DevDepartment(DeveloperContract[] developerContract) {
        this.developerContract = developerContract;
    }

    public DeveloperContract[] getDeveloperContract() {
        return developerContract;
    }

    public void setDeveloperContract(DeveloperContract[] developerContract) {
        this.developerContract = developerContract;
    }
    public void solveProductionBugs(){
        for (int i = 0;i<developerContract.length;i++){
            this.developerContract[i].solveBugs();
        }
    }
}
