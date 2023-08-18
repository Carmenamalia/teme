package OOP.ex4informationsapp;

public class User extends BaseEntity{
private String name;

    public User() {

    }

    public User(int id, int version, String name) {
        super(id, version);
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getEntity() {
        System.out.println("id: " + this.getId() + " version: " + this.getVersion());
    }
}
