package de.oscharko.springpetclinicmonolithinkotlin.services.map

import de.oscharko.springpetclinicmonolithinkotlin.model.Vet
import de.oscharko.springpetclinicmonolithinkotlin.services.VetService


/**
 * Created by oscharko on 17.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolithinkotlin.services.map
 * --------------------
 */
class VetServiceMap : AbstractMapService<Vet, Long>(), VetService {
    override fun findAll(): Set<Vet> {
        return super.findAll()
    }

    override fun findById(id: Long): Vet {
        return super.findById(id)
    }

    override fun save(`object`: Vet): Vet {
        return super.save(`object`.getId(), `object`)
    }

    override fun delete(`object`: Vet) {
        super.delete(`object`)
    }

    override fun deleteById(id: Long) {
        super.deleteById(id)
    }
}