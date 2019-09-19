package com.onlinecredits;

public class Login {
    private int userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "userName=" + userName +
                ", password='" + password + '\'' +
                '}';
    }
}
