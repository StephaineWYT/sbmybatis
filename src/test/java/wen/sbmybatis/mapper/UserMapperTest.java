package wen.sbmybatis.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import wen.sbmybatis.enums.GenderEnum;
import wen.sbmybatis.model.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aa", "a123456", GenderEnum.FEMALE));
        userMapper.insert(new User("bb", "b123456", GenderEnum.MALE));
        userMapper.insert(new User("cc", "c123456", GenderEnum.FEMALE));
        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        if (users == null || users.size() == 0) {
            System.out.println("is null");
        } else {
            System.out.println(users.toString());
        }
    }

    @Test
    public void TestUpdate() throws Exception {
        User user = userMapper.getOne(29L);
        System.out.println(user.toString());
        user.setNickname("papa");
        userMapper.update(user);
        Assert.assertTrue("papa".equals(userMapper.getOne(29L).getNickname()));
    }
}
