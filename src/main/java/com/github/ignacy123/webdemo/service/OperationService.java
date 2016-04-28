package com.github.ignacy123.webdemo.service;

import com.github.ignacy123.webdemo.domain.Operation;
import com.github.ignacy123.webdemo.dto.OperationResult;

/**
 * Created by ignacy on 14.04.16.
 */
public interface OperationService {
    OperationResult performOperation(Operation operation);

}
