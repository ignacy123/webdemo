package com.github.ignacy123.webdemo.service;

import com.github.ignacy123.webdemo.domain.TranslationResult;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by ignacy on 21.04.16.
 */
@Service
public class DictionaryServiceImpl implements DictionaryService{

    @Override
    public TranslationResult translate(String word) {
        TranslationResult translationResult = new TranslationResult();
        translationResult.setTranslations(Arrays.asList("jabłko"));
        return translationResult;
    }
}
