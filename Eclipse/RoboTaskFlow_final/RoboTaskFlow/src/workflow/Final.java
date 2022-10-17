/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see workflow.WorkflowPackage#getFinal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='One_and_only_one_input_link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot One_and_only_one_input_link='self.outgoing->size() = 0 and self.incoming->size() = 1'"
 *        annotation="gmf.node label.placement='none' label.icon='false' size='70,70' figure='svg' svg.uri='platform:/plugin/RoboTaskFlow/images/Final.svg'"
 * @generated
 */
public interface Final extends Task {
} // Final
