package day5;

import javax.security.auth.login.LoginException;

public class Demo {
    private static String[] names={"bill","hill","jill"};

    public static void main(String[] args) {
        try{
            checkUserName("nill");
            System.out.println("succeed");
        }catch (LoginException e){
            e.printStackTrace();
        }
    }

    private static boolean checkUserName(String unname) throws LoginException{
        for(String name:names){
            if(name.equals(unname)){
                throw new LoginException(name+"已经被注册了");
            }
        }
        return true;
    }
}
