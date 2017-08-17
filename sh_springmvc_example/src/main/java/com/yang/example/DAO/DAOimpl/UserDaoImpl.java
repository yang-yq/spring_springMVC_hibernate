package com.yang.example.DAO.DAOimpl;

import com.yang.example.DAO.UserDao;
import com.yang.example.entity.User;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository持久层组件，用于标注数据访问组件，即DAO组件
@Repository
public class UserDaoImpl extends BaseDAOImpl<User> implements UserDao {

//补全父类中的构造方法
    public UserDaoImpl(){
        super(User.class);
    }


//自动装载之前在配置文件中配置的 SessionFactory，获取当前session后获取所有的用户，
//service封装业务逻辑层代码，我把每个service方法封装为一个事务。
// （PS:上面的SessionFactory获取当前Session是依赖于事务的，如果不在某个事务之内， 会报错：No Session found for current thread。)

//    @Autowired
//    private SessionFactory sessionFactory;
//    public int save(User u) {
//        return (Integer) sessionFactory.getCurrentSession().save(u);
//    }
//    public List<User> findAll() {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
//        return criteria.list();
//    }
}
