package com.kammradt

fun String.exec(): String {
    val process = Runtime.getRuntime().exec(this)
    process.waitFor()
    return process.inputStream.reader().readText().removeSuffix("\n")
}