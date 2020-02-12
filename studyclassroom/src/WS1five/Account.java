package WS1five;

/**
 * @author zyn
 * @description: The WS1five.Account class  has 5 field variables, name,
 * salutation, email, password, and loggedIn of types String, String,
 * String, String, and boolean.
 * @date 2019-11-15
 */
public abstract class Account implements AccountInterface {

    //name for a account
    private String name;
    //salutation for a account
    private String salutation;
    //email for a account
    private String email;
    //password for a account
    private String password;
    //loggedIn status for a account
    private Boolean loggedIn;

    /*
     * @param String name
     * @param String salutation
     * @param String email
     * @param String password
     * @description: constructor for WS1five.Account
     */
    public Account(String name, String salutation, String email, String password) {
        this.name = name;
        this.salutation = salutation;
        this.email = email;
        this.password = password;
        this.loggedIn = false;
    }

    /**
     * Getter method to return the name of the user.
     * @return The name of the user of the account.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Setter method to the name of the user.
     * @param name the new name of the user of the account.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method to return the salutation of the account holder.
     * @return The salutation of the account holder
     */
    @Override
    public String getSalutation() {
        return salutation;
    }

    /**
     * Setter method to the salutation of the user.
     * @param salutation the new salutation of the user of the account.
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * Getter method to return the email address of the account holder.
     * @return The email address of the account holder.
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Setter method to the email of the user.
     * @param email the new email of the user of the account.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method to return the password.
     * @return The password of the account.
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the password.
     * @param password The new password.
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method to compare a provided password with the stored password.
     * @param password The provided password to which the password of the this object is compared.
     * @return true if the password of the account agrees with the argument, false else.
     */
    @Override
    public boolean checkPassword(String password) {
        if (password.equals(getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * setter for loggedIn
     * @param loggedIn New value for the variable loggedIn
     */
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * The user is no longer logged in, that is, the
     * loggedIn variable set to false.
     */
    @Override
    public void logout() {
        setLoggedIn(false);
    }

    /**
     * Getter to check whether a user is logged in.
     * @return true if the user is looged in, false else.
     */
    @Override
    public boolean getLoggedIn() {
        return loggedIn;
    }

    /**
     * Changes the password from old to new if the old password is correct, else an error message is printed.
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(getPassword())) {
            setPassword(newPassword);
        } else {
            System.out.println("Your input old password is wrong");
        }
    }

    /**
     * Standard toString method to represent the object in a human
     * readable form.
     * @return String  The object in a human readable form.
     */
    @Override
    public String toString() {
        return "WS1five.Account{" +
                "name='" + name + '\'' +
                ", salutation='" + salutation + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", loggedIn=" + loggedIn +
                '}';
    }

}
