package br.com.solinftec.treinamentospringboot.dto.equipamento;

import br.com.solinftec.treinamentospringboot.model.Equipamento;
import br.com.solinftec.treinamentospringboot.model.Monitoramento;
import lombok.Data;

@Data
public class GetAllEquipamentosDto {

    private Long id;
    private Long idTipoEquipamento;
    private String descricao;
    private Float latitude;
    private Float longitude;
    private Boolean ativo;

    public GetAllEquipamentosDto(Equipamento equipamento) {
        this.id = equipamento.getId();
        this.idTipoEquipamento = equipamento.getIdTipoEquipamento();
        this.descricao = equipamento.getDescricao();
        this.latitude = equipamento.getLatitude();
        this.longitude = equipamento.getLongitude();
        this.ativo = equipamento.getAtivo();
    }
}
