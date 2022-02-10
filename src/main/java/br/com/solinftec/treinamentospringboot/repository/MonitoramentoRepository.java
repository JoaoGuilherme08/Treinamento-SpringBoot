package br.com.solinftec.treinamentospringboot.repository;

import br.com.solinftec.treinamentospringboot.model.Monitoramento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitoramentoRepository extends JpaRepository<Monitoramento, Long> {

}
