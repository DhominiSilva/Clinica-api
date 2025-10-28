package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta (

        @NotNull
        Long idConsulta,

        @NotNull(message = "Motivo do cancelamento é obrigatório")
        MotivoCancelamento motivo
){
}
