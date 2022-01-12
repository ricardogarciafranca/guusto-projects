package br.com.guusto.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerchantDto {

	private Long idMerchant;
	private String name;
	private List<String> locations;
	private List<Integer> denominations;
	private String website;
	private String image;
	private String country;

}
