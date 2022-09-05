package eu.kevin.api.serializers.enums

import eu.kevin.api.models.ErrorCode

object ErrorCodeSerializer :
    EnumIgnoreUnknownSerializer<ErrorCode>(
        values = ErrorCode.values(),
        defaultValue = ErrorCode.UNKNOWN_VALUE
    )
