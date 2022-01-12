package br.com.guusto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guusto.converter.MerchantConverter;
import br.com.guusto.dto.MerchantDto;
import br.com.guusto.enums.Country;
import br.com.guusto.exceptions.NotFoundException;
import br.com.guusto.repository.MerchantRepository;

@Service
public class MerchantService {

	@Autowired
	private MerchantRepository repository;

	@Autowired
	private MerchantConverter converter;

	public List<MerchantDto> findByName(String name) {
		return repository.findByNameContainingIgnoreCase(name).stream().map(m -> converter.toDto(m)).collect(Collectors.toList());
	}

	public List<MerchantDto> findByCountry(String country) throws NotFoundException{
		
		if(Country.fromValue(country.toUpperCase()) == null) {
			throw new NotFoundException("Country Not Found");
		}
		
		return repository.findByCountry(Country.valueOf(country.toUpperCase())).stream().map(m -> converter.toDto(m)).collect(Collectors.toList());
	}

	public List<MerchantDto> findAll() {
		return repository.findAll().stream().map(m -> converter.toDto(m)).collect(Collectors.toList());
	}

}
