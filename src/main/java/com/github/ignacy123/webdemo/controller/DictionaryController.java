package com.github.ignacy123.webdemo.controller;

import com.github.ignacy123.webdemo.domain.TranslationRequest;
import com.github.ignacy123.webdemo.domain.TranslationResult;
import com.github.ignacy123.webdemo.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * Created by ignacy on 21.04.16.
 */
@Controller
public class DictionaryController {
    private final DictionaryService dictionaryService;

    @Autowired
    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/dictionary/translate")
    @ResponseBody
    public TranslationResult translate(@RequestBody TranslationRequest translationRequest) {
        return dictionaryService.translate(translationRequest.getWord());
    }
}
