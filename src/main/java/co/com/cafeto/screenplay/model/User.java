package co.com.cafeto.screenplay.model;

import co.com.cafeto.screenplay.model.builders.UserBuilder;

public class User {

    private String accountId;
    private String userName;
    private String password;

    public User(UserBuilder userBuilder) {
        this.accountId = userBuilder.getAccountId();
        this.userName = userBuilder.getUserName();
        this.password = userBuilder.getPassword();
    }

    public String getAccountId() {
        return accountId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
