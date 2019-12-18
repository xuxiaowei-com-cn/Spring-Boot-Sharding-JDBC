package cn.com.xuxiaowei.mapper;


import cn.com.xuxiaowei.entity.TestUser;
import cn.com.xuxiaowei.entity.TestUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xuxiaowei
 */
public interface TestUserMapper {
    long countByExample(TestUserExample example);

    int deleteByExample(TestUserExample example);

    int deleteByPrimaryKey(Integer testUserId);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    List<TestUser> selectByExample(TestUserExample example);

    TestUser selectByPrimaryKey(Integer testUserId);

    int updateByExampleSelective(@Param("record") TestUser record, @Param("example") TestUserExample example);

    int updateByExample(@Param("record") TestUser record, @Param("example") TestUserExample example);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}