package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 测试用户表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("test_user")
public class TestUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 测试用户表主键
     */
    @TableId(value = "test_user_id", type = IdType.AUTO)
    private Integer testUserId;

    /**
     * 测试用户名
     */
    @TableField("username")
    private String username;

    /**
     * 测试用户密码
     */
    @TableField("password")
    private String password;

    /**
     * 创建时间，MySQL 自动生成
     */
    @TableField("create_date")
    private LocalDateTime createDate;

    /**
     * 更新时间，MySQL 自动生成
     */
    @TableField("update_date")
    private LocalDateTime updateDate;

    /**
     * 逻辑删除，0 未删除，1 删除，MySQL 默认值 0，不为 NULL，注解@TableLogic。
     */
    @TableField("deleted")
    @TableLogic
    private Boolean deleted;


    public static final String TEST_USER_ID = "test_user_id";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_DATE = "update_date";

    public static final String DELETED = "deleted";

}
