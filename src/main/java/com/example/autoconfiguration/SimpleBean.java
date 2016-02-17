package com.example.autoconfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wonwoo on 2016. 2. 17..
 */

@Slf4j
@Data
@AllArgsConstructor
public class SimpleBean {
    private String id;
    private String name;

    public void hello(){
      log.info("say hello autoconfig");
    }
}
