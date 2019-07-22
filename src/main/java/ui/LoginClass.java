package ui;


import com.vince.bean.User;
import service.UserServices;
import service.UserServicesImpl;
import utils.BusinessException;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-21 16:02
 */
public class LoginClass extends Baseclass{

    public void login(){
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();
        UserServices userServices = new UserServicesImpl();
        User user = userServices.login(username, password);

        if (user!=null){
            currUser = user;
        }
        else {
            throw new BusinessException("登陆失败");
        }
    }
}
