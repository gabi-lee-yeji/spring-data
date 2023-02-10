package com.example.jdbc.connection;

import java.sql.Connection;

// assertj 패키지 내의 Assertions 사용!
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class DBConnectionUtilTest {
    
    @Test
    void connection(){
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }
}
