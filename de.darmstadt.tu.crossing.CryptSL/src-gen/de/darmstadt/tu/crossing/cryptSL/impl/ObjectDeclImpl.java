/**
 * generated by Xtext 2.20.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.JvmParameterizedTypeRef;
import de.darmstadt.tu.crossing.cryptSL.ObjectDecl;
import de.darmstadt.tu.crossing.cryptSL.SuperType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ObjectDeclImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ObjectDeclImpl#getArray <em>Array</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ObjectDeclImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ObjectDeclImpl#getObjectName <em>Object Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectDeclImpl extends MinimalEObjectImpl.Container implements ObjectDecl
{
  /**
   * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected JvmType objectType;

  /**
   * The default value of the '{@link #getArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected static final String ARRAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected String array = ARRAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeRef collection;

  /**
   * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectName()
   * @generated
   * @ordered
   */
  protected SuperType objectName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectDeclImpl()
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
    return CryptSLPackage.Literals.OBJECT_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmType getObjectType()
  {
    if (objectType != null && objectType.eIsProxy())
    {
      InternalEObject oldObjectType = (InternalEObject)objectType;
      objectType = (JvmType)eResolveProxy(oldObjectType);
      if (objectType != oldObjectType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.OBJECT_DECL__OBJECT_TYPE, oldObjectType, objectType));
      }
    }
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetObjectType()
  {
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjectType(JvmType newObjectType)
  {
    JvmType oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.OBJECT_DECL__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(String newArray)
  {
    String oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.OBJECT_DECL__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmParameterizedTypeRef getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollection(JvmParameterizedTypeRef newCollection, NotificationChain msgs)
  {
    JvmParameterizedTypeRef oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.OBJECT_DECL__COLLECTION, oldCollection, newCollection);
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
  public void setCollection(JvmParameterizedTypeRef newCollection)
  {
    if (newCollection != collection)
    {
      NotificationChain msgs = null;
      if (collection != null)
        msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.OBJECT_DECL__COLLECTION, null, msgs);
      if (newCollection != null)
        msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.OBJECT_DECL__COLLECTION, null, msgs);
      msgs = basicSetCollection(newCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.OBJECT_DECL__COLLECTION, newCollection, newCollection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SuperType getObjectName()
  {
    return objectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectName(SuperType newObjectName, NotificationChain msgs)
  {
    SuperType oldObjectName = objectName;
    objectName = newObjectName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.OBJECT_DECL__OBJECT_NAME, oldObjectName, newObjectName);
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
  public void setObjectName(SuperType newObjectName)
  {
    if (newObjectName != objectName)
    {
      NotificationChain msgs = null;
      if (objectName != null)
        msgs = ((InternalEObject)objectName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.OBJECT_DECL__OBJECT_NAME, null, msgs);
      if (newObjectName != null)
        msgs = ((InternalEObject)newObjectName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.OBJECT_DECL__OBJECT_NAME, null, msgs);
      msgs = basicSetObjectName(newObjectName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.OBJECT_DECL__OBJECT_NAME, newObjectName, newObjectName));
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
      case CryptSLPackage.OBJECT_DECL__COLLECTION:
        return basicSetCollection(null, msgs);
      case CryptSLPackage.OBJECT_DECL__OBJECT_NAME:
        return basicSetObjectName(null, msgs);
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
      case CryptSLPackage.OBJECT_DECL__OBJECT_TYPE:
        if (resolve) return getObjectType();
        return basicGetObjectType();
      case CryptSLPackage.OBJECT_DECL__ARRAY:
        return getArray();
      case CryptSLPackage.OBJECT_DECL__COLLECTION:
        return getCollection();
      case CryptSLPackage.OBJECT_DECL__OBJECT_NAME:
        return getObjectName();
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
      case CryptSLPackage.OBJECT_DECL__OBJECT_TYPE:
        setObjectType((JvmType)newValue);
        return;
      case CryptSLPackage.OBJECT_DECL__ARRAY:
        setArray((String)newValue);
        return;
      case CryptSLPackage.OBJECT_DECL__COLLECTION:
        setCollection((JvmParameterizedTypeRef)newValue);
        return;
      case CryptSLPackage.OBJECT_DECL__OBJECT_NAME:
        setObjectName((SuperType)newValue);
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
      case CryptSLPackage.OBJECT_DECL__OBJECT_TYPE:
        setObjectType((JvmType)null);
        return;
      case CryptSLPackage.OBJECT_DECL__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case CryptSLPackage.OBJECT_DECL__COLLECTION:
        setCollection((JvmParameterizedTypeRef)null);
        return;
      case CryptSLPackage.OBJECT_DECL__OBJECT_NAME:
        setObjectName((SuperType)null);
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
      case CryptSLPackage.OBJECT_DECL__OBJECT_TYPE:
        return objectType != null;
      case CryptSLPackage.OBJECT_DECL__ARRAY:
        return ARRAY_EDEFAULT == null ? array != null : !ARRAY_EDEFAULT.equals(array);
      case CryptSLPackage.OBJECT_DECL__COLLECTION:
        return collection != null;
      case CryptSLPackage.OBJECT_DECL__OBJECT_NAME:
        return objectName != null;
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
    result.append(" (array: ");
    result.append(array);
    result.append(')');
    return result.toString();
  }

} //ObjectDeclImpl
