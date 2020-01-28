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

}
