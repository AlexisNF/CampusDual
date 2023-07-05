package org.campusdual.bootcamp.ingenieros;

import java.util.LinkedList;

public class User {

    private int userId;
    private String name;
    private LinkedList<User> listFollowingUsers = new LinkedList<User>();
    private LinkedList<Post> postsUser = new LinkedList<Post>();


    public User(int userId, String name, LinkedList<User> listFollowingUsers, LinkedList<Post> postsUser) {
        this.userId = userId;
        this.name = name;
        this.listFollowingUsers = listFollowingUsers;
        this.postsUser = postsUser;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<User> getListFollowingUsers() {
        return listFollowingUsers;
    }

    public void setListFollowingUsers(LinkedList<User> listFollowingUsers) {
        this.listFollowingUsers = listFollowingUsers;
    }

    public LinkedList<Post> getPostsUser() {
        return postsUser;
    }

    public void setPostsUser(LinkedList<Post> postsUser) {
        this.postsUser = postsUser;
    }

    //Usuario. Contendrá nombre, una lista de los usuarios a los que sigue, lista de posts.

}
