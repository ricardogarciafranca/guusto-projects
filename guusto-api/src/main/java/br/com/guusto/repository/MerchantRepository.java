package br.com.guusto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guusto.entity.Merchant;
import br.com.guusto.enums.Country;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

	List<Merchant> findByNameContainingIgnoreCase(String name);

	List<Merchant> findByCountry(Country country);

}
