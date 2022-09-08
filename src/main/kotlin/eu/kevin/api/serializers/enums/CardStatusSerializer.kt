package eu.kevin.api.serializers.enums

import eu.kevin.api.models.payment.CardStatus

object CardStatusSerializer :
    EnumIgnoreUnknownSerializer<CardStatus>(
        values = CardStatus.values(),
        defaultValue = CardStatus.UNKNOWN_VALUE
    )
