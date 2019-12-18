/*
 * Copyright (c) 2011-2020, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.com.xuxiaowei.configuration.p6spy;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * P6spy SQL 打印策略
 * </p>
 *
 * @author hubin
 * @since 2019-02-20
 */
public class P6SpyLogger implements MessageFormattingStrategy {

    /**
     * @param connectionId 连接的ID
     * @param now          当前的时间（以毫秒表示）
     * @param elapsed      操作完成的时间（以毫秒为单位）
     * @param category     操作类别
     * @param prepared     所有绑定变量都替换为实际值的SQL语句
     * @param sql          SQL
     * @param url          执行sql语句的数据库URL
     */
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category,
                                String prepared, String sql, String url) {

        return StringUtils.isNotBlank(sql) ? " 消耗时间：" + elapsed + " ms " + now +
                "\n 执行SQL：" + sql.replaceAll("[\\s]+", " ") + "\n" : "";
    }

}
