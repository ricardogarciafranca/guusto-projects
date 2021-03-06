package br.com.guusto.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.guusto.controller.handler.ResponseObject.ResponseError;
import br.com.guusto.exceptions.BusinessException;
import br.com.guusto.exceptions.NotFoundException;

@ControllerAdvice
public class ApiExceptionHandler {

  @ExceptionHandler({BusinessException.class})
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ResponseObject businessExceptionHandler(BusinessException ex) {
    ResponseError error = new ResponseError();
    error.setMessage(ex.getMessage());
    return new ResponseBuilder<>().withError(error).build();
  }
  
  @ExceptionHandler({NotFoundException.class})
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  @ResponseBody
  public ResponseObject notFoundExceptionHandler(NotFoundException ex) {
    ResponseError error = new ResponseError();
    error.setMessage(ex.getMessage());
    return new ResponseBuilder<>().withError(error).build();
  }
}
