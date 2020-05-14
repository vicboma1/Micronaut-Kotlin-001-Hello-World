package es.vicboma1.micronaut.hi.service

import es.vicboma1.micronaut.hi.model.HiModel
import javax.inject.Singleton

@Singleton
class HiService {
    fun hi(name: String) =  HiModel("Hi $name")
}
