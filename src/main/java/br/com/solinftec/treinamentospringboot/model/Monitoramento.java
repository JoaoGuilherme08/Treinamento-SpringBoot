package br.com.solinftec.treinamentospringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MONITORAMENTO")
@Data
@NoArgsConstructor
public class Monitoramento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_EQUIPAMENTO")
    private Long idEquipamento;

    @Column(name = "ID_ORDEM_SERVICO")
    private Long idOrdemServico;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "LONGITUDE")
    private Float longitude;

    @Column(name = "DATA_HORA")
    private Date dataHora;

    @ManyToMany
    @JoinColumn(name = "ID_EQUIPAMENTO")
    @JsonManagedReference
    private Equipamento equipamento;

}
