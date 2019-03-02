package com.example.mainservice;

import lombok.Data;

@Data
public class WeatherDto {
  private String city;
  private int tempLo;
  private int tempHi;
  private double prcp;
  private String date;
  private int stud;
}
