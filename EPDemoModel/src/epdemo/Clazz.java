/**
 */
package epdemo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link epdemo.Clazz#getId <em>Id</em>}</li>
 *   <li>{@link epdemo.Clazz#getName <em>Name</em>}</li>
 *   <li>{@link epdemo.Clazz#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link epdemo.Clazz#getStudents <em>Students</em>}</li>
 * </ul>
 * </p>
 *
 * @see epdemo.EpdemoPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see epdemo.EpdemoPackage#getClazz_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link epdemo.Clazz#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see epdemo.EpdemoPackage#getClazz_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link epdemo.Clazz#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
	 * The list contents are of type {@link epdemo.Teacher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teachers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' containment reference list.
	 * @see epdemo.EpdemoPackage#getClazz_Teachers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link epdemo.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see epdemo.EpdemoPackage#getClazz_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

} // Clazz
