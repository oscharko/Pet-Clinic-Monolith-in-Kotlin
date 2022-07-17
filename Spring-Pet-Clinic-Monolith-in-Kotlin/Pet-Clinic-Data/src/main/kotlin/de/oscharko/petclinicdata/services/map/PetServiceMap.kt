package de.oscharko.petclinicdata.services.map

import de.oscharko.petclinicdata.model.Pet
import de.oscharko.petclinicdata.services.CrudService


/**
 * Created by oscharko on 17.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.petclinicdata.services.map
 * --------------------
 */
class PetServiceMap : AbstractMapService<Pet, Long>(), CrudService<Pet, Long> {
    override fun findAll(): Set<Pet> {
        return super.findAll()
    }

    override fun findById(id: Long): Pet {
        return super.findById(id)
    }

    override fun save(`object`: Pet): Pet {
        return super.save(`object`.getId(), `object`)
    }

    override fun delete(`object`: Pet) {
        super.delete(`object`)
    }

    override fun deleteById(id: Long) {
        super.deleteById(id)
    }
}