package com.github.ignacy123.webdemo.controller;

import com.github.ignacy123.webdemo.domain.Operation;
import com.github.ignacy123.webdemo.domain.OperationResult;
import com.github.ignacy123.webdemo.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ignacy on 14.04.16.
 */
@Controller
public class OperationController {
    private final OperationService operationService;
    @Autowired
    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/operation")
    @ResponseBody
    public OperationResult operation(@RequestBody Operation operation) {
        return operationService.performOperation(operation);
    }
}
