package br.com.guusto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guusto.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

	List<Merchant> findByName(String name);

	List<Merchant> findByCountry(String country);

}
