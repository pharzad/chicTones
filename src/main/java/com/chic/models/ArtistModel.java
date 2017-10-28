/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chic.models;

import org.springframework.data.annotation.Id;

/**
 *
 * @author farzadaziminia
 */
public class ArtistModel {
    
    @Id private String id;
    
    private String firstName;
    private String lastName;
    private String lable;

//    public ArtistModel(String firstName, String lastName, String lable) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.lable = lable;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
    
    
}
