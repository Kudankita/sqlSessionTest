package com.example.mainservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JsonObject {
  @JsonProperty("value")
  private int vaaalue;
  private String string;
  private Mp mp;
  private String[] list;
}
