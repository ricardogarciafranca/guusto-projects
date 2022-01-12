package br.com.guusto.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonType;

import br.com.guusto.enums.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TypeDef(name = "json", typeClass = JsonType.class)
@Entity
@Table(name = "tb_merchant")
@SequenceGenerator(sequenceName = "tb_merchant_id_merchant_seq", name = "id_merchant", allocationSize = 1)
public class Merchant implements Serializable {

	private static final long serialVersionUID = -451111024512400696L;

	@Id
	@Column(name = "id_merchant", nullable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_merchant")
	private Long idMerchant;

	@Column(name = "name")
	private String name;
	
	@Type(type = "json")
	@Column(name = "locations", columnDefinition = "jsonb")
	private List<String> locations;
	
	@Type(type = "json")
	@Column(name = "denominations", columnDefinition = "jsonb")
	private List<Integer> denominations;

	@Column(name = "website")
	private String website;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "country")
	@Enumerated(EnumType.STRING)
	private Country country;
	
}
