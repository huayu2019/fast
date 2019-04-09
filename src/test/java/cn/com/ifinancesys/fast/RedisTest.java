package cn.com.ifinancesys.fast;

import cn.com.ifinancesys.fast.common.utils.RedisUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void contextLoads() {

        User user = new User();
        user.setName("hylbx2000@qq.com");
        user.setPassword("123456");
        redisUtils.set("User", user);

        System.out.println("#######################################################");
        System.out.println(ToStringBuilder.reflectionToString(redisUtils.get("User")));
    }
}

class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String name;
    private String password;

}