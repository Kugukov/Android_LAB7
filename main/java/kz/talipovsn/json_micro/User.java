package kz.talipovsn.json_micro;

public class User {
    private String name;
    private String id;
    private String type;


    public User(String name, String id, String type){
        this.name=name;
        this.id =id;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
