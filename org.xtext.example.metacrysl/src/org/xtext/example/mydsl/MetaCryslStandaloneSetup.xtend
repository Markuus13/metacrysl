/*
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MetaCryslStandaloneSetup extends MetaCryslStandaloneSetupGenerated {

	def static void doSetup() {
		new MetaCryslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
