package com.kopring

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Member(
    @Id var id:String,
    var pw:String,
    var name:String,
    var sex:String
)