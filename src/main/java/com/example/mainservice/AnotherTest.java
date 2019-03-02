package com.example.mainservice;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AnotherTest {
  public List<WeatherDto> anotherSelect(SqlSession sqlSession) {
    return sqlSession.selectList("findByTempLo");
  }
}
