package com.internet.connection.status

import kotlinx.coroutines.flow.Flow

interface InternetConnection {
    val connectionFlow: Flow<Boolean>
}