/*
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CryptSLStandaloneSetup extends CryptSLStandaloneSetupGenerated {

	def static void doSetup() {
		new CryptSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
