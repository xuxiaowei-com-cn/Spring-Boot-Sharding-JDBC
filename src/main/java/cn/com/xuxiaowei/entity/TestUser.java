package cn.com.xuxiaowei.entity;

/**
 * @author xuxiaowei
 */
public class TestUser {
    private Integer testUserId;

    private String username;

    private String password;

    public Integer getTestUserId() {
        return testUserId;
    }

    public void setTestUserId(Integer testUserId) {
        this.testUserId = testUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "testUserId=" + testUserId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}