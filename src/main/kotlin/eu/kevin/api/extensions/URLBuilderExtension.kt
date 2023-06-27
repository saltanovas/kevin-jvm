package eu.kevin.api.extensions

import io.ktor.http.URLBuilder

internal fun URLBuilder.appendPath(path: String) {
    pathSegments = path.split("/").filter { it.isNotBlank() }
}
