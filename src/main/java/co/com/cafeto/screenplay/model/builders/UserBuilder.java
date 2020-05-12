package co.com.cafeto.screenplay.model.builders;

import co.com.cafeto.screenplay.model.User;
import co.com.cafeto.screenplay.util.Builder;

public class UserBuilder implements Builder<User> {

    private String accountId;
    private String userName;
    private String password;

    private UserBuilder() {
        this.accountId = "753351468442";
        this.userName  = "xxxxxxxx";
        this.password  = "xxxxxxxx";
    }

    public static UserBuilder DefaultCredentials() {
        return new UserBuilder();
    }

    public  UserBuilder WithAccountId(String accountId) {
        this.accountId=accountId;
        return this;
    }

    public  UserBuilder WithUserName(String userName) {
        this.userName=userName;
        return this;
    }

    public  UserBuilder WithPassword(String password) {
        this.password=password;
        return this;
    }

    // GET


    public String getAccountId() {
        return accountId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    //Build

    @Override
    public User build() {
        return new User(this);
    }
}
