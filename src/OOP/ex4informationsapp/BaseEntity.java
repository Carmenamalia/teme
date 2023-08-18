package OOP.ex4informationsapp;

public abstract class BaseEntity {
  private int id;
  private int version;
    public BaseEntity(){}
    public BaseEntity(int id, int version) {
        this.id = id;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
   public abstract void getEntity();

   }

