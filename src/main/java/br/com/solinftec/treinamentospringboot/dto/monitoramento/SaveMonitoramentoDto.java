package br.com.solinftec.treinamentospringboot.dto.monitoramento;


import br.com.solinftec.treinamentospringboot.model.Monitoramento;
import lombok.Data;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class SaveMonitoramentoDto {

    private Long id;
    @NotNull(message = "ID_EQUIPAMENTO_NULL")
    private Long idEquipamento;
    @NotNull(message = "ID_ORDEM_SERVICO_NULL")
    private Long idOrdemServico;
    @NotNull(message = "LATITUDE_NULL")
    private Float latitude;
    @NotNull(message = "LONGITUDE_NULL")
    private Float longitude;
    @NotNull(message = "DATE_NULL")
    private Date dataHora;

    public Monitoramento pegarModel() {
        Monitoramento monitoramento = new Monitoramento();
        monitoramento.setIdEquipamento(this.idEquipamento);
        monitoramento.setIdOrdemServico(this.idOrdemServico);
        monitoramento.setLatitude(this.latitude);
        monitoramento.setLongitude(this.longitude);
        monitoramento.setDataHora(this.dataHora);

        return monitoramento;
    }

}
