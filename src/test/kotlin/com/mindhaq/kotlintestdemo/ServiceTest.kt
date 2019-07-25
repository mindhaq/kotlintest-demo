package com.mindhaq.kotlintestdemo

import io.kotlintest.shouldNotBe
import io.kotlintest.specs.StringSpec

class ServiceTest(
    service: Service
) : StringSpec() {

    init {
        "service is wired into spring context" {
            service shouldNotBe null
        }
    }
}