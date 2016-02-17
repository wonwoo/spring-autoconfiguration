package com.example.autoconfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wonwoo on 2016. 2. 17..
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("autoconfig.sample")
public class SampleProperties {
    private String id;
    private String name;
}
