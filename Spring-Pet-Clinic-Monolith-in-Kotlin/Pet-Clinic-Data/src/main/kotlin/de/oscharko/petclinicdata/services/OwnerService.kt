package de.oscharko.petclinicdata.services

import de.oscharko.petclinicdata.model.Owner


/**
 * Created by oscharko on 16.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.petclinicdata.services
 * --------------------
 */
interface OwnerService : CrudService<Owner, Long> {

    fun findByLastName(lastName: String): Owner
}