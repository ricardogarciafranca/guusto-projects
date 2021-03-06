package br.com.guusto.controller.handler;

import br.com.guusto.controller.handler.ResponseObject.ResponseError;

public class ResponseBuilder<T> {

  private ResponseObject.ResponseError error;

  public ResponseBuilder<T> withError(ResponseError error) {
    this.error = error;
    return this;
  }

  public ResponseObject build() {
    ResponseObject dto = new ResponseObject();
    dto.setError(error);
    return dto;
  }
}
