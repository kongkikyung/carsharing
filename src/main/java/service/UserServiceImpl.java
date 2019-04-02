package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserDao userDao;

    @Override
    public String selectUserAll() throws Exception {
        return userDao.selectUserAll();
    }
}
