package br.com.solinftec.treinamentospringboot.repository;

import br.com.solinftec.treinamentospringboot.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

    @Query(value = "Select * from EQUIPAMENTO where id = ?1")
    Equipamento findByIdEquipamento(Long idEquipamento);

}
