package eu.kevin.api.models.payment.payment.request

import kotlinx.serialization.Serializable

@Serializable
data class Account @JvmOverloads constructor(
    val iban: String,
    var sortCodeAccountNumber: String? = null,
    var currencyCode: String? = null
)
