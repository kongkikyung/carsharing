package service;

import vo.UserVO;

import java.util.List;

public interface UserService {
    public List<UserVO> selectUserAll() throws Exception;
}
