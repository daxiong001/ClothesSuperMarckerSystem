package service;

import com.vince.bean.User;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-21 14:48
 */
public interface UserServices {

    public User register(User user);

    public User login(String username,String password);
}
