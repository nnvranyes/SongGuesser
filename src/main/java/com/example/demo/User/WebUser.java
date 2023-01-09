package com.example.demo.User;
import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;

@Entity
@Table
public class WebUser {


    @Id
    @SequenceGenerator(
            name = "id_Sequence",
            sequenceName = "id_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_Sequence"
    )
    private Long userId;
    private String userName;
    private String password;

    public WebUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public WebUser(){
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword(){return password;}

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "WebUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

