package eu.kevin.api.models.general.bank

import eu.kevin.api.serializers.enums.ScaApproachTypeSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = ScaApproachTypeSerializer::class)
enum class ScaApproachType {
    @SerialName("UNKNOWN") UNKNOWN_VALUE,
    @SerialName("REDIRECT") REDIRECT,
    @SerialName("DECOUPLED") DECOUPLED,
    @SerialName("EMBEDDED") EMBEDDED
}
