package com.example.Model;

import java.io.Serializable;

/**
 * Created by byhieg on 16-8-19.
 */
public class ManageUser implements Serializable{

    public static byte[] avatar = null;

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
