package br.com.solinftec.treinamentospringboot.service;

import br.com.solinftec.treinamentospringboot.dto.equipamento.EquipamentoDto;
import br.com.solinftec.treinamentospringboot.dto.equipamento.GetAllEquipamentosDto;
import br.com.solinftec.treinamentospringboot.dto.fazenda.GetAllFazendaDto;
import br.com.solinftec.treinamentospringboot.model.Equipamento;
import br.com.solinftec.treinamentospringboot.repository.EquipamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EquipamentoService {

    private final EquipamentoRepository repository;
    private final MonitoramentoService monitoramentoService;

    public Equipamento update(Long idEquipamento, Float longitude, Float latitude){
        Equipamento equipamento = repository.findByIdEquipamento(idEquipamento);
        equipamento.setLatitude(latitude);
        equipamento.setLongitude(longitude);
        return repository.save(equipamento);

    }

    public List<GetAllEquipamentosDto> getAll(){

        return repository.findAll().stream()
                .map(equipamento -> new GetAllEquipamentosDto(equipamento))
                .collect(Collectors.toList());

    }
}
