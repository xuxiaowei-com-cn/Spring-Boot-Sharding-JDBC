/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.TestUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 测试用户表 服务类 测试类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@SpringBootTest
class ITestUserServiceTests {

    @Autowired
    private ITestUserService iTestUserService;

    /**
     * 根据 主键 查询
     */
    @Test
    void getById() {
        TestUser testUser = iTestUserService.getById(1);
        log.info(String.valueOf(testUser));
    }

    /**
     * 查询所有
     */
    @Test
    void list() {
        List<TestUser> testUserList = iTestUserService.list();
        for (TestUser testUser : testUserList) {
            log.info(String.valueOf(testUser));
        }
    }

}
