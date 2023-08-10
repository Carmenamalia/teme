package OOP.company;

public class Freelancer implements DeveloperContract {
    private String name;
    private int hourlyRate;

    public Freelancer(String name, int hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void implementFeatures() {
        System.out.println("freelancer implement");
    }

    @Override
    public void solveBugs() {
        System.out.println("bugs freelancer");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("docs freelancer");
    }
}
