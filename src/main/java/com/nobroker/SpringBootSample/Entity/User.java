package com.nobroker.SpringBootSample.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    String name ;
    String email ;
    String phone ;
}
