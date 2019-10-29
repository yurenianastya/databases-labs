package iot.yurenia.passive.model;

public class Business {

    private Integer id;
    private String name;
    private String service;
    private String email;

    public Business() {

    }

    public Business(String name, String service, String email) {
        this.name = name;
        this.service = service;
        this.email = email;
    }

    public Business(Integer id, String name, String service, String email) {
        this.id = id;
        this.name = name;
        this.service = service;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getService() {
        return service;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
