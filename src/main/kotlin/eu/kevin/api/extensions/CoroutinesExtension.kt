package eu.kevin.api.extensions

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.future.future
import java.util.concurrent.CompletableFuture


@OptIn(DelicateCoroutinesApi::class)
fun <T> suspendingToCompletableFuture(block: suspend () -> T): CompletableFuture<T> = GlobalScope.future { block() }
