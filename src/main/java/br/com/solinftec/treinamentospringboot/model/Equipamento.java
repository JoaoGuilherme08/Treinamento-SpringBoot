package br.com.solinftec.treinamentospringboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EQUIPAMENTO")
@Data
@NoArgsConstructor
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_TIPO_EQUIPAMENTO")
    private Long idTipoEquipamento;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "LONGITUDE")
    private Float longitude;

    @Column(name = "ATIVO")
    private Boolean ativo;
}
