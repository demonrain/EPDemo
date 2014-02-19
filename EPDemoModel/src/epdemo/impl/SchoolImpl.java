/**
 */
package epdemo.impl;

import epdemo.Clazz;
import epdemo.EpdemoPackage;
import epdemo.School;
import epdemo.Student;
import epdemo.Teacher;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link epdemo.impl.SchoolImpl#getId <em>Id</em>}</li>
 *   <li>{@link epdemo.impl.SchoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link epdemo.impl.SchoolImpl#getClazzes <em>Clazzes</em>}</li>
 *   <li>{@link epdemo.impl.SchoolImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link epdemo.impl.SchoolImpl#getTeachers <em>Teachers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchoolImpl extends MinimalEObjectImpl.Container implements School {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClazzes() <em>Clazzes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> clazzes;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teachers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpdemoPackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpdemoPackage.SCHOOL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpdemoPackage.SCHOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getClazzes() {
		if (clazzes == null) {
			clazzes = new EObjectContainmentEList<Clazz>(Clazz.class, this, EpdemoPackage.SCHOOL__CLAZZES);
		}
		return clazzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, EpdemoPackage.SCHOOL__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectContainmentEList<Teacher>(Teacher.class, this, EpdemoPackage.SCHOOL__TEACHERS);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpdemoPackage.SCHOOL__CLAZZES:
				return ((InternalEList<?>)getClazzes()).basicRemove(otherEnd, msgs);
			case EpdemoPackage.SCHOOL__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case EpdemoPackage.SCHOOL__TEACHERS:
				return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EpdemoPackage.SCHOOL__ID:
				return getId();
			case EpdemoPackage.SCHOOL__NAME:
				return getName();
			case EpdemoPackage.SCHOOL__CLAZZES:
				return getClazzes();
			case EpdemoPackage.SCHOOL__STUDENTS:
				return getStudents();
			case EpdemoPackage.SCHOOL__TEACHERS:
				return getTeachers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EpdemoPackage.SCHOOL__ID:
				setId((String)newValue);
				return;
			case EpdemoPackage.SCHOOL__NAME:
				setName((String)newValue);
				return;
			case EpdemoPackage.SCHOOL__CLAZZES:
				getClazzes().clear();
				getClazzes().addAll((Collection<? extends Clazz>)newValue);
				return;
			case EpdemoPackage.SCHOOL__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case EpdemoPackage.SCHOOL__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Teacher>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EpdemoPackage.SCHOOL__ID:
				setId(ID_EDEFAULT);
				return;
			case EpdemoPackage.SCHOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EpdemoPackage.SCHOOL__CLAZZES:
				getClazzes().clear();
				return;
			case EpdemoPackage.SCHOOL__STUDENTS:
				getStudents().clear();
				return;
			case EpdemoPackage.SCHOOL__TEACHERS:
				getTeachers().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EpdemoPackage.SCHOOL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EpdemoPackage.SCHOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EpdemoPackage.SCHOOL__CLAZZES:
				return clazzes != null && !clazzes.isEmpty();
			case EpdemoPackage.SCHOOL__STUDENTS:
				return students != null && !students.isEmpty();
			case EpdemoPackage.SCHOOL__TEACHERS:
				return teachers != null && !teachers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Id: ");
		result.append(id);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchoolImpl
