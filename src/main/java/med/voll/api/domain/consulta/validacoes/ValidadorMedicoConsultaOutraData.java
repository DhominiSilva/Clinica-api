package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorMedicoConsultaOutraData {

    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados){

        var medicoPossuiOutraConsultaNoMesmoHorario = consultaRepository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoPossuiOutraConsultaNoMesmoHorario){
            throw new RuntimeException("Médico já possui consulta agendada nesse mesmo horário!");
        }

    }

}
