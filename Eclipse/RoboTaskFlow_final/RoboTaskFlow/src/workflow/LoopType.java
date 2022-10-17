/**
 */
package workflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Loop Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage#getLoopType()
 * @model
 * @generated
 */
public enum LoopType implements Enumerator {
	/**
	 * The '<em><b>WHILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE(0, "WHILE", "WHILE"),

	/**
	 * The '<em><b>DO WHILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO_WHILE_VALUE
	 * @generated
	 * @ordered
	 */
	DO_WHILE(1, "DO_WHILE", "DO_WHILE"),

	/**
	 * The '<em><b>COUNTER BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTER_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTER_BASED(2, "COUNTER_BASED", "COUNTER_BASED");

	/**
	 * The '<em><b>WHILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_VALUE = 0;

	/**
	 * The '<em><b>DO WHILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DO WHILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DO_WHILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DO_WHILE_VALUE = 1;

	/**
	 * The '<em><b>COUNTER BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COUNTER BASED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTER_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUNTER_BASED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Loop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LoopType[] VALUES_ARRAY =
		new LoopType[] {
			WHILE,
			DO_WHILE,
			COUNTER_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Loop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LoopType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Loop Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoopType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoopType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loop Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoopType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoopType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loop Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoopType get(int value) {
		switch (value) {
			case WHILE_VALUE: return WHILE;
			case DO_WHILE_VALUE: return DO_WHILE;
			case COUNTER_BASED_VALUE: return COUNTER_BASED;
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
	private LoopType(int value, String name, String literal) {
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
	
} //LoopType
