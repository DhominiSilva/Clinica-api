package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

public interface ValidadorCancelamentoDeConsulta {

    public void validar(DadosCancelamentoConsulta dados);
}
