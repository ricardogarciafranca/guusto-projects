package br.com.guusto.templates;

import java.util.Arrays;

import br.com.guusto.enums.Country;
import br.com.guusto.entity.Merchant;
import lombok.Getter;

public class MerchantTemplate extends BaseTemplate {

	@Getter
	private static final MerchantTemplate instance = new MerchantTemplate();

	public Merchant getAmazonUsa() {
		return Merchant.builder().idMerchant(1l).name("Amazon").country(Country.USA).denominations(Arrays.asList(10, 500))
				.locations(Arrays.asList("Online", "In-Store")).image(faker.options().option("image1", "image2"))
				.website(faker.options().option("website1", "website2")).build();
	}
	
	public Merchant getAmazonCan() {
		return Merchant.builder().idMerchant(2l).name("Amazon").country(Country.CAN).denominations(Arrays.asList(5, 1000))
				.locations(Arrays.asList("Online", "In-Store")).image(faker.options().option("image1", "image2"))
				.website(faker.options().option("website1", "website2")).build();
	}
	
	public Merchant getAirbnbUsa() {
		return Merchant.builder().idMerchant(1l).name("Airbnb").country(Country.USA).denominations(Arrays.asList(25, 500))
				.locations(Arrays.asList("Online", "In-Store")).image(faker.options().option("image1", "image2"))
				.website(faker.options().option("website1", "website2")).build();
	}

}
