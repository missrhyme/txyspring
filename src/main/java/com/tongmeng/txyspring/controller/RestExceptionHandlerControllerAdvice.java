package com.tongmeng.txyspring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.fasterxml.jackson.annotation.JsonView;
import com.tongmeng.txyspring.ajaxmodel.AjaxJsonViews;
import com.tongmeng.txyspring.ajaxmodel.AjaxResponseBody;
import com.tongmeng.txyspring.ajaxmodel.AjaxResponseBody.RESPONSE_STATUS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;


@ControllerAdvice(annotations = RestController.class)
public class RestExceptionHandlerControllerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandlerControllerAdvice.class);
	
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @JsonView(AjaxJsonViews.Public.class)
    @ResponseBody
    public AjaxResponseBody<Void> exception(Exception exception, WebRequest request) {
    	
    	logger.error(exception.getMessage().toString());
    	logger.error(exception.getCause().toString());
    	
    	return new AjaxResponseBody<Void>(RESPONSE_STATUS.SERVER_ERROR);
    }
	
}