package eu.kevin.api.extensions

import io.ktor.http.URLBuilder

fun URLBuilder.appendPath(path: String) {
    pathSegments = path.split("/").filter { it.isNotBlank() }
}
