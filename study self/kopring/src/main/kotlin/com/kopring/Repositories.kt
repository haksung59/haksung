package com.kopring

import org.springframework.data.repository.CrudRepository
import java.util.*

interface MemberRepository:CrudRepository<Member, String>{
    override fun findById(id:String): Optional<Member>
}
