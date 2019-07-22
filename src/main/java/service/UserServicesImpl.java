package service;

import com.vince.bean.User;
import utils.BusinessException;
import utils.EmptyUtils;
import utils.UserIo;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-21 14:49
 */
public class UserServicesImpl implements UserServices {
    @Override
    public User register(User user) {
        UserIo userIo = new UserIo();
        userIo.addUser(user);
        try {
            userIo.writeUsers();
        }catch (BusinessException e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User login(String username,String password) throws BusinessException{
        if (EmptyUtils.isEmpty(username)){
            throw new BusinessException("用户名不能为空");
        }
        if (EmptyUtils.isEmpty(password)){
            throw new BusinessException("密码不能为空");
        }
        UserIo userIo = new UserIo();
        User user = userIo.findByUsernameAndPassword(username, password);
        return user;
    }
}
