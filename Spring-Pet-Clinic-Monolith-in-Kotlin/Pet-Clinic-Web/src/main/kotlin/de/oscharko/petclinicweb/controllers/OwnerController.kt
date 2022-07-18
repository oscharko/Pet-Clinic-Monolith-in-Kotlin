package de.oscharko.petclinicweb.controllers

import de.oscharko.springpetclinicmonolithinkotlin.services.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by oscharko on 17.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Web
 * Inside the package - de.oscharko.springpetclinicmonolithinkotlin.controllers
 * --------------------
 */
@RequestMapping("/owners")
@Controller
class OwnerController(val ownerService: OwnerService) {


    @RequestMapping("", "/", "/index", "/index.html")
    fun listOwners(model: Model): String? {
        println(this.ownerService.findAll().size)
        model.addAttribute("owners", ownerService.findAll())
        return "owners/index"
    }
}