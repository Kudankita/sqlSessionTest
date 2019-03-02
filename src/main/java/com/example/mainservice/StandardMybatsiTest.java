package com.example.mainservice;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
public class StandardMybatsiTest {

  public void standardMybatsiTest() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    int ans = sqlSession.selectOne("countAll");
    log.info("employeeテーブルの件数: " + String.valueOf(ans));

    WeatherDto weatherDto = new WeatherDto();
    weatherDto.setCity("Naha");
    weatherDto.setTempLo(30);
    weatherDto.setTempHi(34);
    weatherDto.setPrcp(0.3);
    weatherDto.setDate("1994-11-27");
    sqlSession.insert("insertData", weatherDto);

    AnotherTest at = new AnotherTest();
    List<WeatherDto> lw = at.anotherSelect(sqlSession);
    log.info(lw.toString());




    sqlSession.commit();
  }
}
