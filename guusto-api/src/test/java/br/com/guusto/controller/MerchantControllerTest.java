package br.com.guusto.controller;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.type.TypeReference;

import br.com.guusto.dto.MerchantDto;
import br.com.guusto.entity.Merchant;
import br.com.guusto.repository.MerchantRepository;
import br.com.guusto.templates.MerchantTemplate;

public class MerchantControllerTest extends BaseTest {

	@Autowired
	protected MockMvc mvc;

	@MockBean
	private MerchantRepository merchantRespository;

	private final MerchantTemplate merchantTemplate = MerchantTemplate.getInstance();

	@Test
	public void findAllMerchantsFoundTest() throws Exception {

		Merchant amazonCan = merchantTemplate.getAmazonCan();
		Merchant amazonUsa = merchantTemplate.getAmazonUsa();

		when(merchantRespository.findAll()).thenReturn(Arrays.asList(amazonCan, amazonUsa));

		final MvcResult mvcResult = mvc
				.perform(MockMvcRequestBuilders.get(BASE_URL).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();

		List<MerchantDto> actual = mapper.readValue(mvcResult.getResponse().getContentAsString(),
				new TypeReference<List<MerchantDto>>() {
				});

		Assert.assertEquals(
				actual.stream().filter(a -> a.getName().equals(amazonCan.getName())).findFirst().isPresent(), true);

		Assert.assertEquals(
				actual.stream().filter(a -> a.getName().equals(amazonUsa.getName())).findFirst().isPresent(), true);
	}

	@Test
	public void findMerchantsByNameFoundTest() throws Exception {

		Merchant airbnbUsa = merchantTemplate.getAirbnbUsa();

		when(merchantRespository.findByName(any())).thenReturn(Arrays.asList(airbnbUsa));

		final MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.get(BASE_URL + "/name/Airbnb").contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();

		List<MerchantDto> actual = mapper.readValue(mvcResult.getResponse().getContentAsString(),
				new TypeReference<List<MerchantDto>>() {
				});

		Assert.assertEquals(1, actual.size());

		Assert.assertEquals(
				actual.stream().filter(a -> a.getName().equals(airbnbUsa.getName())).findFirst().isPresent(), true);
	}
	
	@Test
	public void findMerchantsByNameNotFoundTest() throws Exception {

		Merchant airbnbUsa = merchantTemplate.getAirbnbUsa();

		when(merchantRespository.findByName(any())).thenReturn(Arrays.asList(airbnbUsa));

		final MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.get(BASE_URL + "/name/x").contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();

		List<MerchantDto> actual = mapper.readValue(mvcResult.getResponse().getContentAsString(),
				new TypeReference<List<MerchantDto>>() {
				});

		Assert.assertEquals(0, actual.size());
	}

	@Test
	public void findMerchantsByCountryFoundTest() throws Exception {

		Merchant amazonCan = merchantTemplate.getAmazonCan();

		when(merchantRespository.findByCountry(any())).thenReturn(Arrays.asList(amazonCan));

		final MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.get(BASE_URL + "/country/CAN").contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();

		List<MerchantDto> actual = mapper.readValue(mvcResult.getResponse().getContentAsString(),
				new TypeReference<List<MerchantDto>>() {
				});

		Assert.assertEquals(1, actual.size());

		Assert.assertEquals(
				actual.stream().filter(a -> a.getName().equals(amazonCan.getName())).findFirst().isPresent(), true);
	}
	
	@Test
	public void findMerchantsByCountryNotFoundTest() throws Exception {

		Merchant amazonCan = merchantTemplate.getAmazonCan();

		when(merchantRespository.findByCountry(any())).thenReturn(Arrays.asList(amazonCan));

		final MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.get(BASE_URL + "/country/y").contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();

		List<MerchantDto> actual = mapper.readValue(mvcResult.getResponse().getContentAsString(),
				new TypeReference<List<MerchantDto>>() {
				});

		Assert.assertEquals(0, actual.size());

	}

}
