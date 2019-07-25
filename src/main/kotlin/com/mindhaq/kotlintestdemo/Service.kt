package com.mindhaq.kotlintestdemo

import org.springframework.stereotype.Service

@Service
class Service(
    private val component: Component    // could not autowire, test should fail!
)