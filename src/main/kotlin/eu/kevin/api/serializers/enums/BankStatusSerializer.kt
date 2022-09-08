package eu.kevin.api.serializers.enums

import eu.kevin.api.models.payment.BankStatus

object BankStatusSerializer :
    EnumIgnoreUnknownSerializer<BankStatus>(
        BankStatus.values(),
        BankStatus.UNKNOWN_VALUE
    )
