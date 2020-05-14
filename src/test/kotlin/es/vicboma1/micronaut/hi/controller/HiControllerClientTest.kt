package es.vicboma1.micronaut

import es.vicboma1.micronaut.hi.client.HiClient
import io.micronaut.context.ApplicationContext.run
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.HttpClient.create
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject


@MicronautTest
class HiControllerClientTest {

    @Inject
    lateinit var hiclient: HiClient

    @Test
    fun testHiControllerClient() {
        val expected  = "HiModel(key=Hi vicboma1)"
        var result = hiclient
                .hi("vicboma1")
                .toString()

        assertEquals(expected, result)
    }
}


