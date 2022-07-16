package de.oscharko.petclinicweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetClinicWebApplication

fun main(args: Array<String>) {
	runApplication<PetClinicWebApplication>(*args)
}
