package OOP.ex4informationsapp;

public class Visit extends BaseEntity{
  private   BaseEntity user;
  private   BaseEntity site;

    public Visit() {
    }

    @Override
    public void getEntity() {

    }

    @Override
    public String toString() {
        return "Visit{" +
                "user=" + user +
                ", site=" + site +
                '}';
    }

    public BaseEntity getUser() {
        return user;
    }

    public void setUser(BaseEntity user) {
        this.user = user;
    }

    public BaseEntity getSite() {
        return site;
    }

    public void setSite(BaseEntity site) {
        this.site = site;
    }
}
