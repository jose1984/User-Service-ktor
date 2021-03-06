package de.novatec

import org.jetbrains.exposed.sql.Table
import java.util.*

object Users : Table() {
    val id = uuid("id").primaryKey()
    val name = text("name")
    val avatar = text("avatar")
    val gender = text("gender")
    val adult = bool("adult")
}


data class User(
    val id: UUID,
    val name: String,
    val gender: Gender,
    val adult: Boolean,
    val avatar: Avatar
)

data class RequestUser(
    val name: String,
    val gender: Gender,
    val adult: Boolean,
    val avatar: Avatar
)

enum class Gender { MALE, FEMALE, NONE }

enum class Avatar{OCTOCAT, MARIO, ASH, POKEBALL, BULBASAUR, CHARMANDER, SQUIRTLE, KIRBY}