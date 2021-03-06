/**
 * generated by Xtext 2.20.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforce Cons Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.EnforceConsBlock#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getEnforceConsBlock()
 * @model
 * @generated
 */
public interface EnforceConsBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Req</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getEnforceConsBlock_Req()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getReq();

} // EnforceConsBlock
