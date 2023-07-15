package dev.pranav.example

import org.passay.CharacterRule
import org.passay.EnglishCharacterData
import org.passay.PasswordGenerator

class Main {
    private val generator = PasswordGenerator()

    fun main(args: Array<String>) {
        println("Generated Password: ${generatePassword()}")
		System.
    }
	
	fun generatePassword(): String {
	    val digits = CharracterRule(EnglishCharacterData.Alphabetical)
		return generator.generatePassword(10, digits)
	}
	
	class Password {
	    val data = ""
		
		fun get(): String {
		    return data
		}
	}
}
