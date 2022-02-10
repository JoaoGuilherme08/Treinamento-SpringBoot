package br.com.solinftec.treinamentospringboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FAZENDA")
@Data
@NoArgsConstructor
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "AREA")
    private Float area;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "LONGITUDE")
    private Float longitude;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDEIRO")
    @JsonManagedReference
    private Fazendeiro fazendeiro;
}
