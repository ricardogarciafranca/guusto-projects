package br.com.guusto.converter;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.guusto.dto.MerchantDto;
import br.com.guusto.entity.Merchant;
import br.com.guusto.enums.Country;

@Component
public class MerchantConverter {
    
    public MerchantDto toDto(Merchant entity) {
        ModelMapper modelMapper = new ModelMapper();
        MerchantDto dto = entity != null ? modelMapper.map(entity, MerchantDto.class) : null;
       
        if(Country.fromValue(entity.getCountry().name()) != null) {
        	dto.setCountry(entity.getCountry().name());
        }                
        return dto;
    }

    public Merchant toEntity(MerchantDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        Merchant entity = dto != null ? modelMapper.map(dto, Merchant.class) : null;  
        
        if(Country.fromValue(dto.getCountry()) != null) {
        	entity.setCountry(Country.valueOf(dto.getCountry()));
        }
        
        return entity;
    }

}
