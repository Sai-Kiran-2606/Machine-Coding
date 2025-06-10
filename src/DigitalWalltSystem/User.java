package DigitalWalltSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private List<Account> accounts;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}