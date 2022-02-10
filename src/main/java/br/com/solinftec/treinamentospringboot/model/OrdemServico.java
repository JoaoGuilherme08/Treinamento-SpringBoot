package br.com.solinftec.treinamentospringboot.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUTO")
@Data
@NoArgsConstructor
public class OrdemServico {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "ID_COOPERATIVA")
   private Long idCooperativa;

   @Column(name = "ID_FAZENDA")
   private Long idFazenda;

   @Column(name = "ID_EQUIPAMENTO")
   private Long idEquipamento;

   @Column(name = "ID_PRODUTO")
   private Long idProduto;

   @Column(name = "TIPO_SERVICO")
   private Long tipoServico;

   @Column(name = "DATA_EXECUCAO")
   private Date dataExecucao;

}
