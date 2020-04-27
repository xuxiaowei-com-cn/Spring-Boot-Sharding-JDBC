package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.entity.TestUser;
import cn.com.xuxiaowei.mapper.TestUserMapper;
import cn.com.xuxiaowei.service.ITestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试用户表 服务实现类
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-04-27
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements ITestUserService {

}
