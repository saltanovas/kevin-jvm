package eu.kevin.api.serializers.enums

import eu.kevin.api.models.general.projectSettings.ForceRedirectToBankMode

object ForceRedirectToBankModeSerializer :
    EnumIgnoreUnknownSerializer<ForceRedirectToBankMode>(
        values = ForceRedirectToBankMode.values(),
        defaultValue = ForceRedirectToBankMode.UNKNOWN_VALUE
    )
