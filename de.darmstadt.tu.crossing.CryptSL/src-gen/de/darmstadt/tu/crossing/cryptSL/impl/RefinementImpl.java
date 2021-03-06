/**
 * generated by Xtext 2.20.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.Operations;
import de.darmstadt.tu.crossing.cryptSL.Refinement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.RefinementImpl#getRefinementId <em>Refinement Id</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.RefinementImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinementImpl extends DomainmodelImpl implements Refinement
{
  /**
   * The default value of the '{@link #getRefinementId() <em>Refinement Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinementId()
   * @generated
   * @ordered
   */
  protected static final String REFINEMENT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefinementId() <em>Refinement Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinementId()
   * @generated
   * @ordered
   */
  protected String refinementId = REFINEMENT_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected Operations operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefinementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CryptSLPackage.Literals.REFINEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRefinementId()
  {
    return refinementId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRefinementId(String newRefinementId)
  {
    String oldRefinementId = refinementId;
    refinementId = newRefinementId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.REFINEMENT__REFINEMENT_ID, oldRefinementId, refinementId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operations getOperations()
  {
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperations(Operations newOperations, NotificationChain msgs)
  {
    Operations oldOperations = operations;
    operations = newOperations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.REFINEMENT__OPERATIONS, oldOperations, newOperations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperations(Operations newOperations)
  {
    if (newOperations != operations)
    {
      NotificationChain msgs = null;
      if (operations != null)
        msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.REFINEMENT__OPERATIONS, null, msgs);
      if (newOperations != null)
        msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.REFINEMENT__OPERATIONS, null, msgs);
      msgs = basicSetOperations(newOperations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.REFINEMENT__OPERATIONS, newOperations, newOperations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CryptSLPackage.REFINEMENT__OPERATIONS:
        return basicSetOperations(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CryptSLPackage.REFINEMENT__REFINEMENT_ID:
        return getRefinementId();
      case CryptSLPackage.REFINEMENT__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CryptSLPackage.REFINEMENT__REFINEMENT_ID:
        setRefinementId((String)newValue);
        return;
      case CryptSLPackage.REFINEMENT__OPERATIONS:
        setOperations((Operations)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CryptSLPackage.REFINEMENT__REFINEMENT_ID:
        setRefinementId(REFINEMENT_ID_EDEFAULT);
        return;
      case CryptSLPackage.REFINEMENT__OPERATIONS:
        setOperations((Operations)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CryptSLPackage.REFINEMENT__REFINEMENT_ID:
        return REFINEMENT_ID_EDEFAULT == null ? refinementId != null : !REFINEMENT_ID_EDEFAULT.equals(refinementId);
      case CryptSLPackage.REFINEMENT__OPERATIONS:
        return operations != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (refinementId: ");
    result.append(refinementId);
    result.append(')');
    return result.toString();
  }

} //RefinementImpl
