package eu.kevin.api.serializers.enums

import eu.kevin.api.models.payment.HybridStatus

object HybridStatusSerializer :
    EnumIgnoreUnknownSerializer<HybridStatus>(
        values = HybridStatus.values(),
        defaultValue = HybridStatus.UNKNOWN_VALUE
    )
