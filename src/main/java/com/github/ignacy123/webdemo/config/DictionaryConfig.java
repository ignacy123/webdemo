package com.github.ignacy123.webdemo.config;

import com.github.ignacy123.webdemo.domain.DictionaryFactory;
import com.github.ignacy123.webdemo.domain.MultiDictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;

/**
 * Created by ignacy on 28.04.16.
 */
@Configuration
public class DictionaryConfig {
    @Bean
    public MultiDictionary multiDictionary() {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("dictionary.c5");
        MultiDictionary dictionary = DictionaryFactory.createDictionaryFromC5InputStream(inputStream);
        return dictionary;
    }
}
