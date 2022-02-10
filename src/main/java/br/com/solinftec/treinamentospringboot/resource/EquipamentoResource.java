package br.com.solinftec.treinamentospringboot.resource;

import br.com.solinftec.treinamentospringboot.dto.equipamento.GetAllEquipamentosDto;
import br.com.solinftec.treinamentospringboot.dto.fazenda.GetAllFazendaDto;
import br.com.solinftec.treinamentospringboot.service.EquipamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
@RequiredArgsConstructor
public class EquipamentoResource {

    private final EquipamentoService service;

    @GetMapping("")
    public ResponseEntity<List<GetAllEquipamentosDto>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }
}
