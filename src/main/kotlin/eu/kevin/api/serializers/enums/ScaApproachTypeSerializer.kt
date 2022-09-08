package eu.kevin.api.serializers.enums

import eu.kevin.api.models.general.bank.ScaApproachType

object ScaApproachTypeSerializer :
    EnumIgnoreUnknownSerializer<ScaApproachType>(
        values = ScaApproachType.values(),
        defaultValue = ScaApproachType.UNKNOWN_VALUE
    )
