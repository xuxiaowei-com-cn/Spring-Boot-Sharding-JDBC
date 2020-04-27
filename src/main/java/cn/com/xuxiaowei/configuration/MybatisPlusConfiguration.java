package cn.com.xuxiaowei.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Mybatis Plus 配置
 * <p>
 * 扫描 Mapper 接口
 * <p>
 * 分页插件
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
@EnableTransactionManagement
@MapperScan("cn.com.xuxiaowei.mapper.**")
public class MybatisPlusConfiguration {

    /**
     * 分页插件
     * <p>
     * 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
     * <code>paginationInterceptor.setOverflow(false);</code>
     * <p>
     * 设置最大单页限制数量，默认 500 条，-1 不受限制
     * <code>paginationInterceptor.setLimit(500);</code>
     *
     * @return 返回 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }

}
