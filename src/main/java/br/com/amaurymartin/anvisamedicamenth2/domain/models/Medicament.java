package br.com.amaurymartin.anvisamedicamenth2.domain.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "meds")
@NoArgsConstructor
public class Medicament implements Serializable {
  private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_med")
  @Getter
	private Integer id;

	@Column(name = "tx_princ_ativo", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_princ_ativo;

	@Column(name = "tx_cnpj", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_cnpj;

	@Column(name = "tx_lab", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_lab;

	@Column(name = "cd_ggrem", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String cd_ggrem;

	@Column(name = "cd_reg", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String cd_reg;

	@Column(name = "cd_ean", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String cd_ean;

	@Column(name = "tx_prod", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_prod;

	@Column(name = "tx_conc", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_conc;

	@Column(name = "tx_forma_farma", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_forma_farma;

	@Column(name = "tx_apres", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_apres;

	@Column(name = "tx_class_terap", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_class_terap;

	@Column(name = "tx_tipo_prod", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_tipo_prod;

	@Column(name = "bl_restr_hosp", nullable = false)
  @Getter @Setter
	private Boolean bl_restr_hosp;

	@Column(name = "bl_comerc", nullable = true)
  @Getter @Setter
	private Boolean bl_comerc;

	@Column(name = "tx_tarja", columnDefinition = "text", nullable = false)
  @Getter @Setter
	private String tx_tarja;

}
