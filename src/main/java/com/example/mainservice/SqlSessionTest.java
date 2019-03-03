package com.example.mainservice;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

@Slf4j
public class SqlSessionTest {
  public static void main(String[] args) throws IOException {
    //
    StandardMybatsiTest standardMybatsiTest = new StandardMybatsiTest();
    standardMybatsiTest.standardMybatsiTest();

    // 文字列を0詰め
    int num = 12;
    log.info(String.format("%08d", num));
    log.info(StringUtils.rightPad("AB345", 18, "0"));
    log.info(StringUtils.rightPad("US123456", 18, "0"));
    String cd = System.getProperty("user.dir");
    log.info("カレントディレクトリ："+cd);
    JsonObject jsonObject = JacksonTest.jacksonTest("src\\main\\resources\\input.json");
    log.info(jsonObject.toString());
  }
}
