package dev.udd.sso.backendapi.backendapi.entity;

public class UserEntity {

    private String sso;
    private String name;
    private String mobNo;

    public UserEntity(String sso, String name, String mobNo) {
        this.sso = sso;
        this.name = name;
        this.mobNo = mobNo;
    }

    public String getSso() {
        return sso;
    }

    public void setSso(String sso) {
        this.sso = sso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
