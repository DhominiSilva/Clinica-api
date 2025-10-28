package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import med.voll.api.domain.consulta.DadosDetalhamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorCancelarAntecedencia implements ValidadorCancelamentoDeConsulta{

    private DadosAgendamentoConsulta dadosAgendamentoConsulta;

    @Override
    public void validar(DadosCancelamentoConsulta dados) {

        var dataConsulta = dadosAgendamentoConsulta.data();
        var dataAgora = LocalDateTime.now();
        var antecederUmDia = Duration.between(dataAgora, dataConsulta).toDays();

        if(antecederUmDia < 1){
            throw new ValidacaoException("Consulta só pode ser cancelada com 24 horas de antecedência!");
        }

    }


}
