package wen.sbmybatis.model;

import wen.sbmybatis.enums.GenderEnum;

public class User {

    private Long id;
    private String username;
    private String password;
    private GenderEnum gender;
    private String nickname;


    public User() {
        super();
    }

    public User(String username, String password, GenderEnum gender) {
        super();
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "username " + this.username + ", password " + this.password + "gender " + gender.name();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
