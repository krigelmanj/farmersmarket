package com.example.Farmer.s.Market.models;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull
    @Size(min=3, max=10)
    private String name;





    @NotNull
    @Size(min=3, max=10)
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
    }



    public String getPassword() {
        return password;
    }


}


