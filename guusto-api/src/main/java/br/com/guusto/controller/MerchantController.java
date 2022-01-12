package br.com.guusto.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.guusto.dto.MerchantDto;
import br.com.guusto.service.MerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Merchants")
@RestController
@RequestMapping(value = "/merchants")
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@ApiOperation(value = "Find all merchants")
	@RequestMapping(value = StringUtils.EMPTY, produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<List<MerchantDto>> findAll() {
		return ResponseEntity.ok(merchantService.findAll());
	}

	@ApiOperation(value = "Find merchants by name ")
	@RequestMapping(value = "/name/{name}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<List<MerchantDto>> findByName(@PathVariable final String name) {
		return ResponseEntity.ok(merchantService.findByName(name));
	}

	@ApiOperation(value = "Find merchants by country ")
	@RequestMapping(value = "/country/{country}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<List<MerchantDto>> findByCountry(@PathVariable final String country) {
		return ResponseEntity.ok(merchantService.findByCountry(country));
	}

}
