package dubbo.out.food.service;

import java.util.List;

import dubbo.out.food.model.User;

public interface UserService {
	int deleteByPrimaryKey(Integer id);

	Boolean insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> selectByUserName(String userName);
}
