package eu.kevin.api.models.general.projectSettings

import eu.kevin.api.serializers.enums.ForceRedirectToBankModeSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = ForceRedirectToBankModeSerializer::class)
enum class ForceRedirectToBankMode {
    @SerialName("soft") SOFT,
    @SerialName("hard") HARD,
    @SerialName("none") NONE,
    UNKNOWN_VALUE;
}
