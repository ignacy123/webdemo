package com.github.ignacy123.webdemo.service;

import com.github.ignacy123.webdemo.domain.Operation;
import com.github.ignacy123.webdemo.dto.OperationResult;
import org.springframework.stereotype.Service;

/**
 * Created by ignacy on 14.04.16.
 */
@Service
public class OperationServiceImpl implements OperationService {

    @Override
    public OperationResult performOperation(Operation operation) {
        OperationResult result = new OperationResult();
        switch (operation.getOperation()) {
            case "/":
                result.setResult(operation.getNumberOne() / operation.getNumberTwo());
                break;
            case "+":
                result.setResult(operation.getNumberOne() + operation.getNumberTwo());
                break;
            case "-":
                result.setResult(operation.getNumberOne() - operation.getNumberTwo());
                break;
            case "*":
                result.setResult(operation.getNumberOne() * operation.getNumberTwo());
                break;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation.getOperation());
        }
        String description = String.format("%s %s %s = %s", operation.getNumberOne(), operation.getOperation(), operation.getNumberTwo(), result.getResult());
        result.setDescription(description);
        return result;
    }
}
