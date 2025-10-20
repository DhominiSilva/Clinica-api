package med.voll.api.domain.consulta;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum MotivoCancelamento {

    PACIENTE_DESISTIU,
    MEDICO_CANCELOU,
    OUTROS;

}
