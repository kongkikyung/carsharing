package dao;

import vo.UserVO;

import java.util.List;

public interface UserDao {
    public List<UserVO> selectUserAll() throws Exception;

}
