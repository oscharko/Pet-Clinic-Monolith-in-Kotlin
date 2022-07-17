package de.oscharko.petclinicweb.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


/**
 * Created by oscharko on 17.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Web
 * Inside the package - de.oscharko.springpetclinicmonolithinkotlin.controllers
 * --------------------
 */
@Controller
class VetController {

    @RequestMapping("/vets", "/vets/index", "/vets/index.html")
    fun listVets(): String? {
        return "vets/index"
    }
}