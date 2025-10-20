package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    @Query("""
            select exists(
            select 1 from Consulta c where
            c.medico.id = :idMedico
            and
            c.data = :data
            )
            """)
    Boolean existsByMedicoIdAndData(@Param("idMedico") Long idMedico, @Param("data") LocalDateTime data);
}
