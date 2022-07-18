package de.oscharko.springpetclinicmonolithinkotlin.model

/**
 * Created by oscharko on 16.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolithinkotlin.model
 * --------------------
 */
open class Person : BaseEntity() {

    private var firstName: String? = null
    private var lastName: String? = null

    open fun getFirstName(): String? {
        return firstName
    }

    open fun setFirstName(firstName: String?) {
        this.firstName = firstName
    }

    open fun getLastName(): String? {
        return lastName
    }

    open fun setLastName(lastName: String?) {
        this.lastName = lastName
    }
}