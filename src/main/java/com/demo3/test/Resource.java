package com.demo3.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by wuyue on 2019/11/8.
 */
@Configuration
@ConfigurationProperties(prefix = "com.immoc.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
    private String name;
    private String webSite;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
