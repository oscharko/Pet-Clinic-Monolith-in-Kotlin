package de.oscharko.petclinicdata.model

import java.io.Serializable

/**
 * Created by oscharko on 16.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.petclinicdata.model
 * --------------------
 */
open class BaseEntity() : Serializable {
    constructor(id: Long) : this()
}