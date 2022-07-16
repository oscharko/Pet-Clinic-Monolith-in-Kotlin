package de.oscharko.petclinicdata

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetClinicDataApplication

fun main(args: Array<String>) {
	runApplication<PetClinicDataApplication>(*args)
}
