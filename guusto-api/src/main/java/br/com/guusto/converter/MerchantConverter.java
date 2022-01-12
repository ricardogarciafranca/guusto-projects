package br.com.guusto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.guusto.dto.MerchantDto;
import br.com.guusto.entity.Merchant;

@Component
public class MerchantConverter {
    
    public MerchantDto toDto(Merchant entity) {
        ModelMapper modelMapper = new ModelMapper();
        return entity != null ? modelMapper.map(entity, MerchantDto.class) : null;
    }

    public Merchant toEntity(MerchantDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return dto != null ? modelMapper.map(dto, Merchant.class) : null;
    }

}
