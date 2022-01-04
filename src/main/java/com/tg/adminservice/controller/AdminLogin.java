package com.tg.adminservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Admin Controller")
@RequestMapping("/api")
@RestController
public class AdminLogin {

    @Value("${spring.datasource.username}")
    private String userBucketPath;

    @ApiOperation(value = "Get Tests ", response = Iterable.class, tags = "getUsersTest")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not Authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not Found!") })

    @RequestMapping(value = "/getTest",method = RequestMethod.GET)
    public ResponseEntity<Object> getUsersTest() {
        return ResponseEntity.status(HttpStatus.OK).body("Test APIss"+userBucketPath);
    }
}
