package cn.com.ifinancesys.fast;

import cn.com.ifinancesys.fast.modules.app.JwtUtils;
import io.jsonwebtoken.Claims;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JwtTest {

    @Autowired
    private JwtUtils jwtUtils;

    @Test
    public void test() {
        String token = jwtUtils.generateToken(1);

        Claims claims = jwtUtils.getClaimByToken(token);

        System.out.println("token = " + token);
        System.out.println("expiration = " + claims.getExpiration());
    }
}