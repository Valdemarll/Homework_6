package Task1;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public class LoginAccepter{
        public boolean checkLogin(String checkLogin, String checkPassword){
            if (login.equals(checkLogin) && password.equals(checkPassword)){
                return true;
            }else{
                return false;
            }
        }
    }
}
