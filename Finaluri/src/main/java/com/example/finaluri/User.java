package com.example.finaluri;

public class User {
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String profession;

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public String getProfession(){
        return profession;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public User (String username, String password, String name, String lastname, String profession){
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.profession = profession;
    }

    public User(){

    }
}
