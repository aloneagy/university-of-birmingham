package WS1five;

import java.util.ArrayList;

/**
 * @author zyn
 * @description : AccountAdminstrator is a sub-class of WS1five.Account. An adminstrator can
 * reset the accounts of standard users (in case they hae forgotten
 * their password or have attempted to login unsuccessfully to
 * often). An administrator can have arbitrarily many unsuccessful
 * login attempts.
 * @date 2019-11-15
 */
public class AccountAdministrator extends Account implements AccountAdministratorInterface {

    //accounts for WS1five.AccountAdministrator
    private ArrayList<Account> accounts;

    /*
     * @param String name
     * @param String salutation
     * @param String email
     * @param String password
     * @description: constructor for WS1five.AccountAdministrator
     */
    public AccountAdministrator(String name, String salutation, String email, String password) {
        super(name, salutation, email, password);
        accounts = new ArrayList<Account>();
    }

    /**
     * Getter method to return the list of accounts for WS1five.AccountAdministrator
     * @return ArrayList<WS1five.Account> The list of accounts the administrator looks after.
     */
    @Override
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * The method adds an account to the list of accounts the administrator looks after.
     * @param account The new account to be added to the list of accounts the administrator looks after.
     */
    @Override
    public void addAccount(Account account) {
        accounts.add(account);
    }


    /**
     * If an account can no longer be used, since either the user has
     * forgotten their password or in case of a standard user has
     * entered the password incorrectly too often the administrator
     * can reset the account by setting a new password and resetting
     * the number of failed login attempts to zero (the latter only
     * if the account is a standard account).
     * @param account  The account that is to be reset.
     * @param password The new password for the account that is to be reset.
     */
    @Override
    public void resetAccount(Account account, String password) {
        if (getLoggedIn()) {
            account.setPassword(password);
            if (account instanceof AccountStandard) {
                ((AccountStandard) account).setFailedLoginAttempts(0);
            }
        } else {
            System.out.println("Please log in first");
        }
    }

    /**
     * @param  password String
     * The password provided that will be compared to the password stored on the system,
     * If the password provided is correct,the field variable loggedIn is changes to true,
     * else a warning is to be printed.
     */
    @Override
    public void login(String password) {
        if (password.equals(getPassword())) {
            setLoggedIn(true);
        } else {
            setLoggedIn(false);
            System.out.println("Warning : your password is wrong");
        }
    }

    /**
     * Standard toString method to represent the object in a human
     * readable form. If the user is not logged in, only a warning
     * should be printed, but no substantial information be given.
     * @return The object in a human readable form.
     */
    @Override
    public String toString() {
        if (getLoggedIn()) {
            return super.toString() +
                    "WS1five.AccountAdministrator{" +
                    "accounts=" + accounts +
                    '}';
        } else {
            return "first a login is necessary";
        }
    }
}