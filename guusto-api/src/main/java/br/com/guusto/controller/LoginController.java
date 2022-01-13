package br.com.guusto.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
@RequestMapping(value = "/")
public class LoginController {

	@ApiIgnore
	@RequestMapping(value = StringUtils.EMPTY, method = RequestMethod.GET)
	public void method(HttpServletResponse httpServletResponse) {
	    httpServletResponse.setHeader("Location", "http://localhost:4200");
	    httpServletResponse.setStatus(302);
	}
	
}
