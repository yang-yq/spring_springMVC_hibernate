package com.yang.example.DAO.DAOimpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

//@SpringJUnit4ClassRunner，是指我们要在spring的管理下进行我们的测试工作，这一步可能需要引入新的包，添加maven dependicy即可。
//@ContextConfigurate，指向的是我们spring的配置文件，请根据项目的实际情况指向你的spring配置文件。
//@Transactional，这是因为我们项目架构的原因，我们在项目中引入了事务，只有事务的开启的时候才可以进行Hibernate的操作，如过操作出现问题就会回滚，但是我们仅仅在service层开启了事务，在dao层并没有，所以如果对我们DAO层的程序代码进行测试就需要添加这句，表示在测试程序中开启事务，以便我们正常的完成测试过程。

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/META-INF/applicationContext.xml")
@Transactional


public class UserDaoImplTest {

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void queryById() throws Exception {
    }

    @Test
    public void queryAll() throws Exception {
    }

}