package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    protected SqlSessionTemplate sqlSession;

    @Override
    public String selectUserAll() throws Exception {
        return sqlSession.selectOne("sql.selectUserAll");
    }
}
