package service;

import ui.Baseclass;
import ui.LoginClass;
import ui.RegisterClass;
import utils.BusinessException;
import utils.UserIo;

import javax.imageio.spi.RegisterableService;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-20 17:31
 */
public class WelcomeClass extends Baseclass {

    public void start(){
        println(getString("info.welcome"));
        UserIo userIo = new UserIo();
        userIo.readUser();
        boolean flag = true;
        while (flag){
            println(getString("info.login.reg"));
            println(getString("info.select"));
            String select = input.nextLine();
            switch (select){
                case "1":
                    try {
                        new LoginClass().login();
                        flag = false;
                        println(getString("login.success"));
                    }catch (BusinessException e){
                        println(getString(e.getMessage()));
                    }
                    break;
                case "2":
                    try {
                        new RegisterClass().register();
                        println(getString("reg.success"));
                        flag = false;
                    }catch (BusinessException e){
                        println(getString("reg.error"));
                    }
                    break;
                default:
                    println(getString("input.error"));
                    break;
            }
        }
    }
}
