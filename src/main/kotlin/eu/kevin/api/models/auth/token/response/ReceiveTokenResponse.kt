package eu.kevin.api.models.auth.token.response

import eu.kevin.api.serializers.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class ReceiveTokenResponse(
    @Serializable(with = UUIDSerializer::class)
    val authId: UUID? = null,
    val tokenType: String,
    val accessToken: String,
    val accessTokenExpiresIn: Long,
    val refreshToken: String,
    val refreshTokenExpiresIn: Long
)
