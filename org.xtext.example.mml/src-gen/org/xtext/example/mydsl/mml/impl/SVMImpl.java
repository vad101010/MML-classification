/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.mml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.mml.MmlPackage;
import org.xtext.example.mydsl.mml.SVM;
import org.xtext.example.mydsl.mml.SVMClassification;
import org.xtext.example.mydsl.mml.SVMKernel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.SVMImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.SVMImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.SVMImpl#isKernelSpecified <em>Kernel Specified</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.SVMImpl#getKernel <em>Kernel</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.SVMImpl#isClassificationSpecified <em>Classification Specified</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.SVMImpl#getSvmclassification <em>Svmclassification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SVMImpl extends MLAlgorithmImpl implements SVM
{
  /**
   * The default value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGamma()
   * @generated
   * @ordered
   */
  protected static final String GAMMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGamma()
   * @generated
   * @ordered
   */
  protected String gamma = GAMMA_EDEFAULT;

  /**
   * The default value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected static final String C_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected String c = C_EDEFAULT;

  /**
   * The default value of the '{@link #isKernelSpecified() <em>Kernel Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKernelSpecified()
   * @generated
   * @ordered
   */
  protected static final boolean KERNEL_SPECIFIED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKernelSpecified() <em>Kernel Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKernelSpecified()
   * @generated
   * @ordered
   */
  protected boolean kernelSpecified = KERNEL_SPECIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKernel()
   * @generated
   * @ordered
   */
  protected static final SVMKernel KERNEL_EDEFAULT = SVMKernel.LINEAR;

  /**
   * The cached value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKernel()
   * @generated
   * @ordered
   */
  protected SVMKernel kernel = KERNEL_EDEFAULT;

  /**
   * The default value of the '{@link #isClassificationSpecified() <em>Classification Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClassificationSpecified()
   * @generated
   * @ordered
   */
  protected static final boolean CLASSIFICATION_SPECIFIED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClassificationSpecified() <em>Classification Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClassificationSpecified()
   * @generated
   * @ordered
   */
  protected boolean classificationSpecified = CLASSIFICATION_SPECIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getSvmclassification() <em>Svmclassification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvmclassification()
   * @generated
   * @ordered
   */
  protected static final SVMClassification SVMCLASSIFICATION_EDEFAULT = SVMClassification.CCLASS;

  /**
   * The cached value of the '{@link #getSvmclassification() <em>Svmclassification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvmclassification()
   * @generated
   * @ordered
   */
  protected SVMClassification svmclassification = SVMCLASSIFICATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SVMImpl()
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
    return MmlPackage.Literals.SVM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGamma()
  {
    return gamma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGamma(String newGamma)
  {
    String oldGamma = gamma;
    gamma = newGamma;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.SVM__GAMMA, oldGamma, gamma));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setC(String newC)
  {
    String oldC = c;
    c = newC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.SVM__C, oldC, c));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isKernelSpecified()
  {
    return kernelSpecified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKernelSpecified(boolean newKernelSpecified)
  {
    boolean oldKernelSpecified = kernelSpecified;
    kernelSpecified = newKernelSpecified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.SVM__KERNEL_SPECIFIED, oldKernelSpecified, kernelSpecified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SVMKernel getKernel()
  {
    return kernel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKernel(SVMKernel newKernel)
  {
    SVMKernel oldKernel = kernel;
    kernel = newKernel == null ? KERNEL_EDEFAULT : newKernel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.SVM__KERNEL, oldKernel, kernel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isClassificationSpecified()
  {
    return classificationSpecified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClassificationSpecified(boolean newClassificationSpecified)
  {
    boolean oldClassificationSpecified = classificationSpecified;
    classificationSpecified = newClassificationSpecified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.SVM__CLASSIFICATION_SPECIFIED, oldClassificationSpecified, classificationSpecified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SVMClassification getSvmclassification()
  {
    return svmclassification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSvmclassification(SVMClassification newSvmclassification)
  {
    SVMClassification oldSvmclassification = svmclassification;
    svmclassification = newSvmclassification == null ? SVMCLASSIFICATION_EDEFAULT : newSvmclassification;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.SVM__SVMCLASSIFICATION, oldSvmclassification, svmclassification));
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
      case MmlPackage.SVM__GAMMA:
        return getGamma();
      case MmlPackage.SVM__C:
        return getC();
      case MmlPackage.SVM__KERNEL_SPECIFIED:
        return isKernelSpecified();
      case MmlPackage.SVM__KERNEL:
        return getKernel();
      case MmlPackage.SVM__CLASSIFICATION_SPECIFIED:
        return isClassificationSpecified();
      case MmlPackage.SVM__SVMCLASSIFICATION:
        return getSvmclassification();
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
      case MmlPackage.SVM__GAMMA:
        setGamma((String)newValue);
        return;
      case MmlPackage.SVM__C:
        setC((String)newValue);
        return;
      case MmlPackage.SVM__KERNEL_SPECIFIED:
        setKernelSpecified((Boolean)newValue);
        return;
      case MmlPackage.SVM__KERNEL:
        setKernel((SVMKernel)newValue);
        return;
      case MmlPackage.SVM__CLASSIFICATION_SPECIFIED:
        setClassificationSpecified((Boolean)newValue);
        return;
      case MmlPackage.SVM__SVMCLASSIFICATION:
        setSvmclassification((SVMClassification)newValue);
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
      case MmlPackage.SVM__GAMMA:
        setGamma(GAMMA_EDEFAULT);
        return;
      case MmlPackage.SVM__C:
        setC(C_EDEFAULT);
        return;
      case MmlPackage.SVM__KERNEL_SPECIFIED:
        setKernelSpecified(KERNEL_SPECIFIED_EDEFAULT);
        return;
      case MmlPackage.SVM__KERNEL:
        setKernel(KERNEL_EDEFAULT);
        return;
      case MmlPackage.SVM__CLASSIFICATION_SPECIFIED:
        setClassificationSpecified(CLASSIFICATION_SPECIFIED_EDEFAULT);
        return;
      case MmlPackage.SVM__SVMCLASSIFICATION:
        setSvmclassification(SVMCLASSIFICATION_EDEFAULT);
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
      case MmlPackage.SVM__GAMMA:
        return GAMMA_EDEFAULT == null ? gamma != null : !GAMMA_EDEFAULT.equals(gamma);
      case MmlPackage.SVM__C:
        return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
      case MmlPackage.SVM__KERNEL_SPECIFIED:
        return kernelSpecified != KERNEL_SPECIFIED_EDEFAULT;
      case MmlPackage.SVM__KERNEL:
        return kernel != KERNEL_EDEFAULT;
      case MmlPackage.SVM__CLASSIFICATION_SPECIFIED:
        return classificationSpecified != CLASSIFICATION_SPECIFIED_EDEFAULT;
      case MmlPackage.SVM__SVMCLASSIFICATION:
        return svmclassification != SVMCLASSIFICATION_EDEFAULT;
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
    result.append(" (gamma: ");
    result.append(gamma);
    result.append(", C: ");
    result.append(c);
    result.append(", kernelSpecified: ");
    result.append(kernelSpecified);
    result.append(", kernel: ");
    result.append(kernel);
    result.append(", classificationSpecified: ");
    result.append(classificationSpecified);
    result.append(", svmclassification: ");
    result.append(svmclassification);
    result.append(')');
    return result.toString();
  }

} //SVMImpl
