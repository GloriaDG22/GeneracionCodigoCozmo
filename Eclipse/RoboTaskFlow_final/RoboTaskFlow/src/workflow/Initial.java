/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see workflow.WorkflowPackage#getInitial()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='One_and_only_one_output_link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot One_and_only_one_output_link='self.incoming->size() = 0 and self.outgoing->size() = 1'"
 *        annotation="gmf.node label.placement='none' label.icon='false' size='70,70' figure='svg' svg.uri='platform:/plugin/RoboTaskFlow/images/Initial.svg'"
 * @generated
 */
public interface Initial extends Task {
} // Initial
