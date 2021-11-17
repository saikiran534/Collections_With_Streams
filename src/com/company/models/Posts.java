package com.company.models;

public class Posts {
    private Comments newPostID;
    private String Email;
    private String Heading;
    private String Description;

    public Posts(Comments newPostID, String email, String heading, String description) {
        this.newPostID = newPostID;
        Email = email;
        Heading = heading;
        Description = description;
    }

    public Comments getNewPostID() {
        return newPostID;
    }

    public void setNewPostID(Comments newPostID) {
        this.newPostID = newPostID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
