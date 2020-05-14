package es.vicboma1.micronaut.hi.controller

import es.vicboma1.micronaut.hi.service.HiService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HiController(val hiService : HiService) {

    @Get("/hi/{name}")
    fun hi(name: String) = hiService.hi(name)
}
