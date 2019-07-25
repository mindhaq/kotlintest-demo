package io.kotlintest.provided

import io.kotlintest.AbstractProjectConfig
import io.kotlintest.extensions.ProjectLevelExtension
import io.kotlintest.spring.SpringAutowireConstructorExtension

/**
 * Customize kotlintest for all tests. Required for SpringBootTest to work.
 *
 * https://github.com/kotlintest/kotlintest/blob/master/doc/reference.md#project-config
 * https://github.com/kotlintest/kotlintest/blob/master/doc/reference.md#constructor-injection
 *
 * @author Rüdiger Schulz <rs@mindhaq.com>
 */
object ProjectConfig : AbstractProjectConfig() {
    override fun extensions(): List<ProjectLevelExtension> = listOf(SpringAutowireConstructorExtension)
}
