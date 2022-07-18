package de.oscharko.petclinicweb.bootstrap

import de.oscharko.springpetclinicmonolithinkotlin.model.Owner
import de.oscharko.springpetclinicmonolithinkotlin.model.Vet
import de.oscharko.springpetclinicmonolithinkotlin.services.OwnerService
import de.oscharko.springpetclinicmonolithinkotlin.services.VetService
import de.oscharko.springpetclinicmonolithinkotlin.services.map.OwnerServiceMap
import de.oscharko.springpetclinicmonolithinkotlin.services.map.VetServiceMap
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


/**
 * Created by oscharko on 18.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Web
 * Inside the package - de.oscharko.petclinicweb.bootstrap
 * --------------------
 */
@Component
class DataLoader : CommandLineRunner {
    private val ownerService: OwnerService
    private val vetService: VetService

    init {
        ownerService = OwnerServiceMap()
        vetService = VetServiceMap()
    }

    @Throws(Exception::class)
    override fun run(vararg args: String?) {
        val owner1 = Owner()
        owner1.setFirstName("Michael")
        owner1.setLastName("Weston")

        ownerService.save(owner1)

        val owner2 = Owner()
        owner2.setFirstName("Fiona")
        owner2.setLastName("Glenna")

        ownerService.save(owner2)

        println("Loaded Owners...")

        val vet1 = Vet()
        vet1.setFirstName("Sam")
        vet1.setLastName("Axe")

        vetService.save(vet1)

        val vet2 = Vet()
        vet2.setFirstName("Jessie")
        vet2.setLastName("Porter")

        vetService.save(vet2)

        println("Loaded Vets...")

    }
}