package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.UserVO;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserDao userDao;

    @Override
    public List<UserVO> selectUserAll() throws Exception {
        return userDao.selectUserAll();
    }
}
