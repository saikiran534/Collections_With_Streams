package com.company.models;

public class Customer {
    private String Name;
//    private String Email;
    private Posts newPosts;


    public Customer(String name, Posts newPosts) {
        Name = name;
        this.newPosts = newPosts;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Posts getNewPosts() {
        return newPosts;
    }

    public void setNewPosts(Posts newPosts) {
        this.newPosts = newPosts;
    }
}
