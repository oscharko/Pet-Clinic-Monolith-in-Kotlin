package de.oscharko.petclinicdata.services.map

import de.oscharko.petclinicdata.model.Vet
import de.oscharko.petclinicdata.services.CrudService


/**
 * Created by oscharko on 17.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.petclinicdata.services.map
 * --------------------
 */
class VetServiceMap : AbstractMapService<Vet, Long>(), CrudService<Vet, Long> {
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