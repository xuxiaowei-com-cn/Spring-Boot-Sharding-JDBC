package cn.com.xuxiaowei.mapper;

import cn.com.xuxiaowei.entity.TestUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TestUserMapperTests {

    @Resource
    private TestUserMapper testUserMapper;

    @Test
    void insert() {
        TestUser testUser = new TestUser();
        testUser.setUsername("xxw");
        int insert = testUserMapper.insert(testUser);
        System.out.println(insert);
        System.out.println(testUser);
    }

}
