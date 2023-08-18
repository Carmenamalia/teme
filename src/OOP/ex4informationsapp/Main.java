package OOP.ex4informationsapp;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John Grant");


        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);
        userEntity.getEntity();
        System.out.println("user name: " + user.getName());

        WebSite site = new WebSite();
        site.setUrl("https://hyperskill.org");

        BaseEntity siteEntity = site;
        siteEntity.setId(101);
        siteEntity.setVersion(1);
        siteEntity.getEntity();
        System.out.println("url: " + site.getUrl());

        Visit visit = new Visit();
        visit.setUser(user);
        visit.setSite(site);

        BaseEntity baseVisit = visit;
        baseVisit.setId(102);
        baseVisit.setVersion(103);
        System.out.println("id: " + baseVisit.getId() + " " + "version: " + baseVisit.getVersion());
    }
}
