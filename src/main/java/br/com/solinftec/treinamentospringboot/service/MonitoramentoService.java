package br.com.solinftec.treinamentospringboot.service;


import br.com.solinftec.treinamentospringboot.dto.monitoramento.GetAllMonitoramentoDto;
import br.com.solinftec.treinamentospringboot.dto.monitoramento.MonitoramentoDto;
import br.com.solinftec.treinamentospringboot.dto.monitoramento.SaveMonitoramentoDto;
import br.com.solinftec.treinamentospringboot.model.Monitoramento;
import br.com.solinftec.treinamentospringboot.repository.MonitoramentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MonitoramentoService {

    private final MonitoramentoRepository repository;

    private final EquipamentoService equipamentoService;

    public List<GetAllMonitoramentoDto> getAll() {
        return repository.findAll().stream()
                .map(monitoramento -> new GetAllMonitoramentoDto(monitoramento))
                .collect(Collectors.toList());
    }

    public MonitoramentoDto getById(Long idMonitoramento) throws Exception {
        Optional<Monitoramento> monitoramento = repository.findById(idMonitoramento);

        if(monitoramento.isPresent()) {
            return new MonitoramentoDto(monitoramento.get());
        } else {
            throw new Exception("MONITORAMENTO_NOT_FOUND");
        }
    }

    public SaveMonitoramentoDto save(SaveMonitoramentoDto saveMonitoramentoDto){
        Monitoramento monitoramento = saveMonitoramentoDto.pegarModel();
        repository.save(monitoramento);
        saveMonitoramentoDto.setId(monitoramento.getId());
        equipamentoService.update(saveMonitoramentoDto.getIdEquipamento(),
                saveMonitoramentoDto.getLongitude(), saveMonitoramentoDto.getLatitude());
        return saveMonitoramentoDto;
    }

}
