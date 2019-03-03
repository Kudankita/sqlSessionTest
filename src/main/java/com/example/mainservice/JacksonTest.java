package com.example.mainservice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JacksonTest {
  public static JsonObject jacksonTest(String fileName) throws IOException {
    String all = readAll(fileName);
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(all, JsonObject.class);
  }

  public static String readAll(String path) throws IOException {
    StringBuilder builder = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String string = reader.readLine();
      while (string != null) {
        builder.append(string).append(System.getProperty("line.separator"));
        string = reader.readLine();
      }
    }

    return builder.toString();
  }
}
