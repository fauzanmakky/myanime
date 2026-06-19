package com.fauzan.myanime.utils

sealed class Failure {
    open class CustomFailure : Failure()
    data class NetworkFailure(val message: String?) : Failure()
    data class UnexpectedFailure(val message: String?) : Failure()
}
