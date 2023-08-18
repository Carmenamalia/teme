package OOP.ex4informationsapp;

public class WebSite extends BaseEntity {
 private String url;
    public WebSite(){}
    public WebSite(int id, int version, String url) {
        super(id, version);
        this.url = url;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "url='" + url + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void getEntity() {
        System.out.println("id: " + this.getId() + " version: " + this.getVersion());
    }
}
