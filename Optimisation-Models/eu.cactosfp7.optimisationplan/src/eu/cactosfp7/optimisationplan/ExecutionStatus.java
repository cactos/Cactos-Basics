/**
 */
package eu.cactosfp7.optimisationplan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Execution Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getExecutionStatus()
 * @model
 * @generated
 */
public enum ExecutionStatus implements Enumerator {
	/**
	 * The '<em><b>READY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_VALUE
	 * @generated
	 * @ordered
	 */
	READY(0, "READY", "READY"),

	/**
	 * The '<em><b>IN EXECUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_EXECUTION_VALUE
	 * @generated
	 * @ordered
	 */
	IN_EXECUTION(1, "IN_EXECUTION", "IN_EXECUTION"),

	/**
	 * The '<em><b>COMPLETED SUCCESSFUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_SUCCESSFUL_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED_SUCCESSFUL(2, "COMPLETED_SUCCESSFUL", "COMPLETED_SUCCESSFUL"),

	/**
	 * The '<em><b>COMPLETED FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED_FAILED(3, "COMPLETED_FAILED", "COMPLETED_FAILED");

	/**
	 * The '<em><b>READY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READY_VALUE = 0;

	/**
	 * The '<em><b>IN EXECUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN EXECUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_EXECUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_EXECUTION_VALUE = 1;

	/**
	 * The '<em><b>COMPLETED SUCCESSFUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETED SUCCESSFUL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_SUCCESSFUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_SUCCESSFUL_VALUE = 2;

	/**
	 * The '<em><b>COMPLETED FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETED FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_FAILED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Execution Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExecutionStatus[] VALUES_ARRAY = new ExecutionStatus[] { READY, IN_EXECUTION,
			COMPLETED_SUCCESSFUL, COMPLETED_FAILED, };

	/**
	 * A public read-only list of all the '<em><b>Execution Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExecutionStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Execution Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionStatus get(int value) {
		switch (value) {
		case READY_VALUE:
			return READY;
		case IN_EXECUTION_VALUE:
			return IN_EXECUTION;
		case COMPLETED_SUCCESSFUL_VALUE:
			return COMPLETED_SUCCESSFUL;
		case COMPLETED_FAILED_VALUE:
			return COMPLETED_FAILED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExecutionStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ExecutionStatus
