package br.com.solinftec.treinamentospringboot.resource;

import br.com.solinftec.treinamentospringboot.dto.fazenda.GetAllFazendaDto;
import br.com.solinftec.treinamentospringboot.dto.monitoramento.GetAllMonitoramentoDto;
import br.com.solinftec.treinamentospringboot.dto.monitoramento.MonitoramentoDto;
import br.com.solinftec.treinamentospringboot.dto.monitoramento.SaveMonitoramentoDto;
import br.com.solinftec.treinamentospringboot.model.Cooperativa;
import br.com.solinftec.treinamentospringboot.model.Monitoramento;
import br.com.solinftec.treinamentospringboot.service.FazendaService;
import br.com.solinftec.treinamentospringboot.service.MonitoramentoService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitoramento")
@RequiredArgsConstructor
public class MonitoramentoResource {

    private static final Logger logger = LoggerFactory.getLogger(Monitoramento.class);

    private final MonitoramentoService service;

    @GetMapping("")
    public ResponseEntity<List<GetAllMonitoramentoDto>> getAll() {

        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{idMonitoramento}")
    public ResponseEntity<MonitoramentoDto> getMonitoramento(@PathVariable("idMonitoramento") Long idMonitoramento){
        try {
            return ResponseEntity.ok().body(service.getById(idMonitoramento));
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<SaveMonitoramentoDto> postMonitoramento(SaveMonitoramentoDto saveMonitoramentoDto){
        try {
            return ResponseEntity.ok().body(service.save(saveMonitoramentoDto));
        } catch (Exception e) {
            logger.error("Erro ao salvar saveMonitoramentoDto: {}", saveMonitoramentoDto);
            return ResponseEntity.badRequest().build();
        }
    }
}
