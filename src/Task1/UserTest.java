package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void checkLoginTest(){
        User user = new User("vasya294", "iamvasya");
        User.LoginAccepter accepter = user.new LoginAccepter();
        assertTrue(accepter.checkLogin("vasya294", "iamvasya"));
        assertFalse(accepter.checkLogin("vlad45", "iamnotvasya"));
    }

}