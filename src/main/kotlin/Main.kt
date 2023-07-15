package dev.pranav.example

import org.passay.CharacterRule
import org.passay.EnglishCharacterData
import org.passay.PasswordGenerator

class Main {
    private val generator = PasswordGenerator()

    fun main(args: Array<String>) {
        println("Generated Password: ${generatePassword()}")
    }
	
    fun generatePassword(): String {
        val digits = CharracterRule(EnglishCharacterData.Alphabetical)
        return generator.generatePassword(10, digits)
    }
}
