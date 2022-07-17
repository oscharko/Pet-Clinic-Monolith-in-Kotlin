package de.oscharko.petclinicdata.services.map

import de.oscharko.petclinicdata.model.Owner
import de.oscharko.petclinicdata.services.CrudService


/**
 * Created by oscharko on 17.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.petclinicdata.services.map
 * --------------------
 */
class OwnerServiceMap : AbstractMapService<Owner, Long>(), CrudService<Owner, Long> {
    override fun findAll(): Set<Owner> {
        return super.findAll()
    }

    override fun findById(id: Long): Owner {
        return super.findById(id)
    }

    override fun save(`object`: Owner): Owner {
        return super.save(`object`.getId(), `object`)
    }

    override fun delete(`object`: Owner) {
        super.delete(`object`)
    }

    override fun deleteById(id: Long) {
        super.deleteById(id)
    }
}