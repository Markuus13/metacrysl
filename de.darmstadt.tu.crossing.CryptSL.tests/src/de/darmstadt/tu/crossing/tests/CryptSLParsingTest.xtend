package de.darmstadt.tu.crossing.tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import de.darmstadt.tu.crossing.cryptSL.Domainmodel

class CryptSLParsingTest {
	@Inject
	ParseHelper<Domainmodel> parseHelper
	
	@Test
	def void basicCryslProgram() {
		Assertions.assertNotNull(
			parseHelper.parse(
				'''
				SPEC 	javax.crypto.Cipher
				OBJECTS 
					java.lang.String trans;
					byte[] plainText; 
					java.security.Key key;
					byte[] cipherText;
				EVENTS 
					Get: getInstance(trans); 
					Init: init(encmode, key); 
					doFinal: cipherText = doFinal(plainText); 
				ORDER 
					Get, Init, (doFinal)+ 
				CONSTRAINTS  
					encmode in {1,2,3,4};
					part(0, "/", trans) in {"AES", "Blowfish", "DESede", ..., "RSA"};
					part(0, "/", trans) in {"AES"} => part(1, "/", trans) in {"CBC"};
				REQUIRES 
					generatedKey[key, part(0, "/", trans)];
				ENSURES 
					encrypted[cipherText, plainText];
  				'''
			)
		)
	}
	
	@Test
	def void parseDefineRuleForRefinement() {
		Assertions.assertNotNull(
			parseHelper.parse(
				'''
				SPEC MessageDigest REFINES java.security.MessageDigest {
					define algorithm = {"SHA-256", "SHA-384", "SHA-512"};
				}
				'''
			)
		)
	}
	
	@Test
	def void parseAddConstraint() {
		Assertions.assertNotNull(
			parseHelper.parse(
				'''
				SPEC KeyGenerator REFINES javax.crypto.KeyGenerator {
					add constraint alg in {"AES"} => keySize in {128, 192, 256};
				}
				'''
			)
		)
	}

}
