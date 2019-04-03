package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.UserVO;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    protected SqlSessionTemplate sqlSession;

    @Override
    public List<UserVO> selectUserAll() throws Exception {
        return sqlSession.selectList("sql.selectUserAll");
    }
}
