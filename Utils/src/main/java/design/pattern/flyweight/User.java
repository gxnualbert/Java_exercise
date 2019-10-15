package design.pattern.flyweight;

/**
 * @auther gxnualbert
 * @create 2019-10-15-17:25
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
