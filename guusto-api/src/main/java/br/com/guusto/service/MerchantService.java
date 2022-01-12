package br.com.guusto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guusto.converter.MerchantConverter;
import br.com.guusto.dto.MerchantDto;
import br.com.guusto.repository.MerchantRepository;

@Service
public class MerchantService {

	@Autowired
	private MerchantRepository repository;

	@Autowired
	private MerchantConverter converter;

	public List<MerchantDto> findByName(String name) {
		return repository.findByName(name).stream().map(m -> converter.toDto(m)).collect(Collectors.toList());
	}

	public List<MerchantDto> findByCountry(String country) {
		return repository.findByCountry(country).stream().map(m -> converter.toDto(m)).collect(Collectors.toList());
	}

	public List<MerchantDto> findAll() {
		return repository.findAll().stream().map(m -> converter.toDto(m)).collect(Collectors.toList());
	}

}
