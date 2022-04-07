package eu.kevin.api.services

import eu.kevin.api.Dependencies
import eu.kevin.api.models.payment.payment.webhook.BankPaymentWebhookPayload
import eu.kevin.api.models.payment.payment.webhook.CardPaymentWebhookPayload
import eu.kevin.api.models.payment.payment.webhook.HybridPaymentWebhookPayload
import eu.kevin.api.models.payment.refund.webhook.PaymentRefundWebhookPayload
import kotlinx.serialization.json.Json

/**
 * Deserializes webhook request JSON payloads to JVM objects
 */
class Parser internal constructor(
    private val serializer: Json
) {
    constructor() : this(
        serializer = Dependencies.serializer
    )

    /**
     * Deserializes webhook payload of a bank payment
     *
     * @see eu.kevin.api.services.payment.PaymentClient.initiatePayment
     */
    fun parseBankPaymentWebhookRequest(request: String): BankPaymentWebhookPayload {
        return serializer.decodeFromString(BankPaymentWebhookPayload.serializer(), request)
    }

    /**
     * Deserializes webhook payload of a card payment
     *
     * @see eu.kevin.api.services.payment.PaymentClient.initiatePayment
     */
    fun parseCardPaymentWebhookRequest(request: String): CardPaymentWebhookPayload {
        return serializer.decodeFromString(CardPaymentWebhookPayload.serializer(), request)
    }

    /**
     * Deserializes webhook payload of a hybrid payment
     *
     * @see eu.kevin.api.services.payment.PaymentClient.initiatePayment
     */
    fun parseHybridPaymentWebhookRequest(request: String): HybridPaymentWebhookPayload {
        return serializer.decodeFromString(HybridPaymentWebhookPayload.serializer(), request)
    }

    /**
     * Deserializes webhook payload of a payment refund
     *
     * @see eu.kevin.api.services.payment.PaymentClient.initiatePaymentRefund
     */
    fun parsePaymentRefundWebhookRequest(request: String): PaymentRefundWebhookPayload {
        return serializer.decodeFromString(PaymentRefundWebhookPayload.serializer(), request)
    }
}