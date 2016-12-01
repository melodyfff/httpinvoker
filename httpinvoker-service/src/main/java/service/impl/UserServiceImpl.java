package service.impl;

import model.User;
import service.UserService;

/**
 * Description：
 * Created by ChenXin on 2016/12/1.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add(User u) {
        System.out.println("add user[" + u.getName() + "]");
    }
}
