package com.github.ignacy123.webdemo.client;

import com.github.ignacy123.webdemo.domain.SessionWord;
import com.github.ignacy123.webdemo.dto.SessionRequest;
import com.github.ignacy123.webdemo.dto.TranslationRequest;
import com.github.ignacy123.webdemo.dto.TranslationResult;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ignacy on 21.04.16.
 */
public class DictionarySessionTester {
    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        SessionRequest sessionRequest = new SessionRequest();
        sessionRequest.setSize(20);

        ResponseEntity<List> resultResponseEntity = restTemplate.postForEntity(
                "http://localhost:8080/dictionary/session",
                sessionRequest,
                List.class);
        System.out.println(resultResponseEntity.getStatusCode());
        System.out.println(resultResponseEntity.getBody());

    }
}
