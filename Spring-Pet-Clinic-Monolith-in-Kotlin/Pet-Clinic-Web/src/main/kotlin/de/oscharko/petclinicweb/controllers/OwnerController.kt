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
@RequestMapping("/owners")
@Controller
class OwnerController {

    @RequestMapping("", "/", "/index", "/index.html")
    fun listOwner(): String? {
        return "owners/index"
    }
}