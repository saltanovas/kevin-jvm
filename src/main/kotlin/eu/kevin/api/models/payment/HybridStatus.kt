package eu.kevin.api.models.payment

import eu.kevin.api.serializers.enums.HybridStatusSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = HybridStatusSerializer::class)
enum class HybridStatus {
    @SerialName("unknown") UNKNOWN_VALUE,
    @SerialName("created") CREATED,
    @SerialName("cancelled") CANCELLED,
    @SerialName("expired") EXPIRED,
}
