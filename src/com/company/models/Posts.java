package com.company.models;

public class Posts {
    private String PostID;
    private String Email;
    private String Heading;
    private String Description;

    public Posts(String postID, String email, String heading, String description) {
        PostID = postID;
        Email = email;
        Heading = heading;
        Description = description;

    }

    public String getPostID() {
        return PostID;
    }

    public void setPostID(String postID) {
        PostID = postID;
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

    @Override
    public String toString() {
        return "Posts{" +
                "PostID='" + PostID + '\'' +
                ", Email='" + Email + '\'' +
                ", Heading='" + Heading + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
