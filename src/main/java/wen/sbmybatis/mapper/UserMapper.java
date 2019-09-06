package wen.sbmybatis.mapper;

import wen.sbmybatis.model.User;
import wen.sbmybatis.param.UserParam;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);

    List<User> getList(UserParam userParam);

    int getCount(UserParam userParam);
}
