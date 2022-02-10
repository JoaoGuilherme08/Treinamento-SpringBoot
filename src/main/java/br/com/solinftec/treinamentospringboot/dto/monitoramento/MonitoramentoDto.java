package br.com.solinftec.treinamentospringboot.dto.monitoramento;

import br.com.solinftec.treinamentospringboot.dto.equipamento.EquipamentoDto;
import br.com.solinftec.treinamentospringboot.model.Monitoramento;

import java.util.Date;

public class MonitoramentoDto {
    private Long id;
    private Long idEquipamento;
    private Long idOrdemServico;
    private Float latitude;
    private Float longitude;
    private Date dataHora;

    public MonitoramentoDto(Monitoramento monitoramento) {
        this.id = monitoramento.getId();
        this.idEquipamento = monitoramento.getIdEquipamento();
        this.idOrdemServico = monitoramento.getIdOrdemServico();
        this.latitude = monitoramento.getLatitude();
        this.longitude = monitoramento.getLongitude();
        this.dataHora = monitoramento.getDataHora();
    }
}
