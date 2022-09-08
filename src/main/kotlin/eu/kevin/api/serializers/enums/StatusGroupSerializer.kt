package eu.kevin.api.serializers.enums

import eu.kevin.api.models.payment.StatusGroup

object StatusGroupSerializer :
    EnumIgnoreUnknownSerializer<StatusGroup>(
        values = StatusGroup.values(),
        defaultValue = StatusGroup.UNKNOWN_VALUE
    )
