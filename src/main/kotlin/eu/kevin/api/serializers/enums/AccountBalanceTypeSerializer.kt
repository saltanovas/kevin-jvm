package eu.kevin.api.serializers.enums

import eu.kevin.api.models.account.balance.response.AccountBalanceType

object AccountBalanceTypeSerializer :
    EnumIgnoreUnknownSerializer<AccountBalanceType>(
        values = AccountBalanceType.values(),
        defaultValue = AccountBalanceType.UNKNOWN_VALUE
    )
