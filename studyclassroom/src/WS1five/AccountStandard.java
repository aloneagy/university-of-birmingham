package WS1five;

import java.util.ArrayList;

/**
 * @author zyn
 * @description : A standard account is an account for customers who can download
 * music from the music web site. They are represented by 3 field
 * variables: balance, titlesBought, and failedLoginAttempts of types
 * int, ArrayList<WS1five.MusicTitle>, and int, respectively. Only three
 * login attempts are possible. If the password is entered 3 times
 * incorrectly, the account is disabled and only an administrator can
 * reinstate it.
 * @date 2019-11-15
 */
public class AccountStandard extends Account implements AccountStandardInterface {

    //balance for a standard account
    private int balance;

    //titlesBought for a standard account
    private ArrayList<MusicTitle> titlesBought;

    //failedLoginAttempts for a standard account
    private int failedLoginAttempts;

    //limited failedLoginAttempts
    public static final int MAXIMAL_LOGIN_ATTEMPTS = 3;

    /**
     * @param name       String
     * @param salutation String
     * @param email      String
     * @param password   String
     * @description: constructor for WS1five.AccountStandard
     */
    public AccountStandard(String name, String salutation, String email, String password) {
        super(name, salutation, email, password);
        titlesBought = new ArrayList<MusicTitle>();
        failedLoginAttempts = 0;
        balance = 0;
    }

    /**
     * Getter method to return the balance.
     * @return int The balance of the account.
     */
    @Override
    public int getBalance() {
        return balance;
    }


    /**
     * @param password The password provided for the login; this is to be compared to the password stored on the system.
     * @description: Method for a user to log in to their account by providing a password. It is first checked whether
     * the account is still active (that is, not too many failed login attempts were made in the past) and secondly
     * whether the password provided is correct. In case of a correct login the number of login attempts is reset
     * to 0, else increased by 1.
     */
    @Override
    public void login(String password) {
        if (getFailedLoginAttempts() < MAXIMAL_LOGIN_ATTEMPTS) {
            if (!password.equals(getPassword())) {
                System.out.println("Your input passwrd is wrong!");
                setFailedLoginAttempts(getFailedLoginAttempts() + 1);
            } else {
                setLoggedIn(true);
                setFailedLoginAttempts(0);
            }
        }
    }

    /**
     * @param amount The amount being deposited.
     * @description: Adds the amount - if positive - to the current balance.
     * For non-positive amounts the action does nothing.
     */
    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     *  Setter for the balance.
     *  @param balance The new balance of the account.
     */
    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Getter method to return the number of failed login attempts.
     * @return int The number of failed login attempts.
     */
    @Override
    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /**
     *  Setter for the failed login attempts.
     *  @param failedLoginAttempts The new number of failed login attempts.
     */
    @Override
    public void setFailedLoginAttempts(int failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }





    /*
     * @param musicTitle1
     * @description: if user has been logged in and balance is greater than the price of musicTitle,
     *               the user can buy the music.
     */
    public void buy(MusicTitle musicTitle1) {
        if (getLoggedIn()) {
            if (balance > musicTitle1.getPrice()) {
                titlesBought.add(musicTitle1);
                setBalance(getBalance() - musicTitle1.getPrice());
            } else {
                System.out.println("Your money is not enough");
            }
        } else {
            System.out.println("Please log in first");
        }

    }

    /*
     * @return java.lang.String
     * @description: override toString method
     */
    @Override
    public String toString() {
        if (getLoggedIn()) {
            return super.toString() +
                    "WS1five.AccountStandard{" +
                    "balance=" + balance +
                    ", titlesBought=" + titlesBought +
                    ", failedLoginAttempts=" + failedLoginAttempts +
                    '}';
        } else {
            return "first a login is necessary";
        }
    }

    /*
     * @return java.util.ArrayList<WS1five.MusicTitle>
     * @description: return titlesBought for account
     */
    public ArrayList<MusicTitle> getTitlesBought() {
        return titlesBought;
    }
}
