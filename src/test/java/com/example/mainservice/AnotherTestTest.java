package com.example.mainservice;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class AnotherTestTest {

  @org.junit.Before
  public void setUp() throws Exception {}

  @org.junit.After
  public void tearDown() throws Exception {}

  @org.junit.Test
  public void anotherSelect() {}

  @org.junit.Test
  public void anotherCount() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    AnotherTest anotherTest = new AnotherTest();
    assertEquals(2, anotherTest.anotherCount(sqlSession));
  }
}
