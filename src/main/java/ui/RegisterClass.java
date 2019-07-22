package ui;

import com.vince.bean.User;
import service.UserServices;
import service.UserServicesImpl;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-21 14:39
 */
public class RegisterClass extends Baseclass{

    public void register(){
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();
        User user = new User(username,password);
        UserServices userServices = new UserServicesImpl();
        userServices.register(user);
    }
}
