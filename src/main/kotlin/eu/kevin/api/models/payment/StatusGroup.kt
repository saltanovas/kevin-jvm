package eu.kevin.api.models.payment

import eu.kevin.api.serializers.enums.StatusGroupSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = StatusGroupSerializer::class)
enum class StatusGroup {
    @SerialName("started") STARTED,
    @SerialName("pending") PENDING,
    @SerialName("completed") COMPLETED,
    @SerialName("failed") FAILED,
    UNKNOWN_VALUE;
}
