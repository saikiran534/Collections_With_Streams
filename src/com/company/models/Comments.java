package com.company.models;

public class Comments {
    private String PostID;
    private String Email;
    private String Comment;

    public Comments(String postID, String email, String comment) {
        PostID = postID;
        Email = email;
        Comment = comment;
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

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
