package dubbo.out.food.service;

import dubbo.out.food.model.Address;

public interface AddressService {
	boolean deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}
