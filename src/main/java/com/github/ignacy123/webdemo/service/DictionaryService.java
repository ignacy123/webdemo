package com.github.ignacy123.webdemo.service;

import com.github.ignacy123.webdemo.domain.TranslationResult;

/**
 * Created by ignacy on 21.04.16.
 */
public interface DictionaryService {

    TranslationResult translate(String word);
}
