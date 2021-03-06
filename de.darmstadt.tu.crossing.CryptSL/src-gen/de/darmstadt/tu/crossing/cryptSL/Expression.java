/**
 * generated by Xtext 2.20.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Expression#getOrderEv <em>Order Ev</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Expression#getElementop <em>Elementop</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Expression#getOrderop <em>Orderop</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Expression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Order Ev</b></em>' reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order Ev</em>' reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getExpression_OrderEv()
   * @model
   * @generated
   */
  EList<Event> getOrderEv();

  /**
   * Returns the value of the '<em><b>Elementop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementop</em>' attribute.
   * @see #setElementop(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getExpression_Elementop()
   * @model
   * @generated
   */
  String getElementop();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Expression#getElementop <em>Elementop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elementop</em>' attribute.
   * @see #getElementop()
   * @generated
   */
  void setElementop(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Orderop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orderop</em>' attribute.
   * @see #setOrderop(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getExpression_Orderop()
   * @model
   * @generated
   */
  String getOrderop();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Expression#getOrderop <em>Orderop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orderop</em>' attribute.
   * @see #getOrderop()
   * @generated
   */
  void setOrderop(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Expression
