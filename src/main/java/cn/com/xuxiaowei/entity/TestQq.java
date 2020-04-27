package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 测试QQ号表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("test_qq")
public class TestQq implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 测试QQ号主键
     */
    @TableId("test_qq_id")
    private Integer testQqId;

    /**
     * 测试QQ号
     */
    @TableField("qq")
    private String qq;

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


    public static final String TEST_QQ_ID = "test_qq_id";

    public static final String QQ = "qq";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_DATE = "update_date";

    public static final String DELETED = "deleted";

}
