package com.juhao666.apilife;

import com.juhao666.apilife.mapper.UserMapper;
import com.juhao666.apilife.model.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
@Slf4j
class ApiLifeApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        int count = jdbcTemplate.queryForObject("select count(*) from emp", Integer.class);
        log.info("the count of emp is {}", count);
        log.info("the datasource is {}", dataSource.getClass());
    }

    @Test
    void testEmp() {
        Emp emp = userMapper.selectById("2");
        log.info("Data by mybatis plus is {}", emp);
    }

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    @Test
    void testRedis() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("city", "xi'an");
        String city = ops.get("city");
        log.info("the current city is {}", city);
        log.info("the data is {}", ops.get("name"));
        System.out.println(redisConnectionFactory.getClass());
    }
}

