package eu.kevin.api.models.account.transaction.request

import eu.kevin.api.models.account.AccountRequestHeaders
import java.time.LocalDateTime

data class GetAccountTransactionsRequest(
    val accountId: String,
    val dateFrom: LocalDateTime,
    val dateTo: LocalDateTime,
    val headers: AccountRequestHeaders
)
