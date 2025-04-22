package org.fleetime.testwithios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect val num: Int
