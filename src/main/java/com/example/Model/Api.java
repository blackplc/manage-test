package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by byhieg on 17/1/5.
 * Mail to byhieg@gmail.com
 */
@Entity
public class Api {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String api_name;
    private String api_info;
    private String api_url;
    private String api_method;
    private Integer api_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApi_name() {
        return api_name;
    }

    public void setApi_name(String api_name) {
        this.api_name = api_name;
    }

    public String getApi_info() {
        return api_info;
    }

    public void setApi_info(String api_info) {
        this.api_info = api_info;
    }

    public String getApi_url() {
        return api_url;
    }

    public void setApi_url(String api_url) {
        this.api_url = api_url;
    }

    public String getApi_method() {
        return api_method;
    }

    public void setApi_method(String api_method) {
        this.api_method = api_method;
    }

    public Integer getApi_id() {
        return api_id;
    }

    public void setApi_id(Integer api_id) {
        this.api_id = api_id;
    }
}
