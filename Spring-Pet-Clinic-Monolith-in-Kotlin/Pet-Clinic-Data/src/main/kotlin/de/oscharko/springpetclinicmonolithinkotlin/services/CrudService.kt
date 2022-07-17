package de.oscharko.springpetclinicmonolithinkotlin.services

/**
 * Created by oscharko on 16.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolithinkotlin.services
 * --------------------
 */
interface CrudService<T, ID> {

    fun findAll(): Set<T>

    fun findById(id: ID): T

    fun save(`object`: T): T

    fun delete(`object`: T)

    fun deleteById(id: ID)
}