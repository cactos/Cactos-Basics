/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.optimisationplan.OptimisationplanFactory
 * @model kind="package"
 * @generated
 */
public interface OptimisationplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "optimisationplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/OptimisationPlan/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "optimisationplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptimisationplanPackage eINSTANCE = eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl <em>Optimisation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationStep()
	 * @generated
	 */
	int OPTIMISATION_STEP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__SEQUENTIAL_STEPS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__PARALLEL_STEPS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__OPTIMISATION_PLAN = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__EXECUTION_STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__EXECUTION_STARTED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP__EXECUTION_STOPPED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Optimisation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Optimisation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_STEP_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationActionStepImpl <em>Optimisation Action Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationActionStepImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationActionStep()
	 * @generated
	 */
	int OPTIMISATION_ACTION_STEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__ID = OPTIMISATION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS = OPTIMISATION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__PARALLEL_STEPS = OPTIMISATION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN = OPTIMISATION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__EXECUTION_STATUS = OPTIMISATION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__EXECUTION_STARTED = OPTIMISATION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED = OPTIMISATION_STEP__EXECUTION_STOPPED;

	/**
	 * The number of structural features of the '<em>Optimisation Action Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP_FEATURE_COUNT = OPTIMISATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Optimisation Action Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ACTION_STEP_OPERATION_COUNT = OPTIMISATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.SequentialStepsImpl <em>Sequential Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.SequentialStepsImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getSequentialSteps()
	 * @generated
	 */
	int SEQUENTIAL_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__ID = OPTIMISATION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__SEQUENTIAL_STEPS = OPTIMISATION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__PARALLEL_STEPS = OPTIMISATION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__OPTIMISATION_PLAN = OPTIMISATION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__EXECUTION_STATUS = OPTIMISATION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__EXECUTION_STARTED = OPTIMISATION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__EXECUTION_STOPPED = OPTIMISATION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Optimisation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS__OPTIMISATION_STEPS = OPTIMISATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequential Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS_FEATURE_COUNT = OPTIMISATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Sequential Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_STEPS_OPERATION_COUNT = OPTIMISATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.ParallelStepsImpl <em>Parallel Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.ParallelStepsImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getParallelSteps()
	 * @generated
	 */
	int PARALLEL_STEPS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__ID = OPTIMISATION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__SEQUENTIAL_STEPS = OPTIMISATION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__PARALLEL_STEPS = OPTIMISATION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__OPTIMISATION_PLAN = OPTIMISATION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__EXECUTION_STATUS = OPTIMISATION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__EXECUTION_STARTED = OPTIMISATION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__EXECUTION_STOPPED = OPTIMISATION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Optimisation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS__OPTIMISATION_STEPS = OPTIMISATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS_FEATURE_COUNT = OPTIMISATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Parallel Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEPS_OPERATION_COUNT = OPTIMISATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl <em>Optimisation Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationPlan()
	 * @generated
	 */
	int OPTIMISATION_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__EXECUTION_STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__CREATION_DATE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__EXECUTION_STARTED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__EXECUTION_STOPPED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optimisation Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN__OPTIMISATION_STEP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Optimisation Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Optimisation Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanRepositoryImpl <em>Optimisation Plan Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationPlanRepositoryImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationPlanRepository()
	 * @generated
	 */
	int OPTIMISATION_PLAN_REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Optimisation Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS = 0;

	/**
	 * The number of structural features of the '<em>Optimisation Plan Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optimisation Plan Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_PLAN_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl <em>Vm Placement Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVmPlacementAction()
	 * @generated
	 */
	int VM_PLACEMENT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Target Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__TARGET_HOST = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vm Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__VM_IMAGE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pu Affinity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__PU_AFFINITY = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proposed Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__PROPOSED_MEMORY = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Proposed Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__PROPOSED_STORAGE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Proposed Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unassigned Virtual Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Vm Placement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Vm Placement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PLACEMENT_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl <em>Vm Migration Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVmMigrationAction()
	 * @generated
	 */
	int VM_MIGRATION_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Migrated Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__MIGRATED_VM = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__TARGET_HOST = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pu Affinity After Migration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION__SOURCE_HOST = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vm Migration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Vm Migration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MIGRATION_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.VerticalScalingActionImpl <em>Vertical Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.VerticalScalingActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVerticalScalingAction()
	 * @generated
	 */
	int VERTICAL_SCALING_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The number of structural features of the '<em>Vertical Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Vertical Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StopVmActionImpl <em>Stop Vm Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StopVmActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStopVmAction()
	 * @generated
	 */
	int STOP_VM_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Stopped Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION__STOPPED_VM = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stop Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stop Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VM_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.LogicalMemoryScalingActionImpl <em>Logical Memory Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.LogicalMemoryScalingActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getLogicalMemoryScalingAction()
	 * @generated
	 */
	int LOGICAL_MEMORY_SCALING_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__ID = VERTICAL_SCALING_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__SEQUENTIAL_STEPS = VERTICAL_SCALING_ACTION__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__PARALLEL_STEPS = VERTICAL_SCALING_ACTION__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__OPTIMISATION_PLAN = VERTICAL_SCALING_ACTION__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__EXECUTION_STATUS = VERTICAL_SCALING_ACTION__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__EXECUTION_STARTED = VERTICAL_SCALING_ACTION__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__EXECUTION_STOPPED = VERTICAL_SCALING_ACTION__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Proposed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaled Virtual Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Memory Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION_FEATURE_COUNT = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = VERTICAL_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Logical Memory Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MEMORY_SCALING_ACTION_OPERATION_COUNT = VERTICAL_SCALING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.LogicalStorageScalingActionImpl <em>Logical Storage Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.LogicalStorageScalingActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getLogicalStorageScalingAction()
	 * @generated
	 */
	int LOGICAL_STORAGE_SCALING_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__ID = VERTICAL_SCALING_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__SEQUENTIAL_STEPS = VERTICAL_SCALING_ACTION__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__PARALLEL_STEPS = VERTICAL_SCALING_ACTION__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__OPTIMISATION_PLAN = VERTICAL_SCALING_ACTION__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__EXECUTION_STATUS = VERTICAL_SCALING_ACTION__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__EXECUTION_STARTED = VERTICAL_SCALING_ACTION__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__EXECUTION_STOPPED = VERTICAL_SCALING_ACTION__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Proposed Local Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VM Image Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Storage Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION_FEATURE_COUNT = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = VERTICAL_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Logical Storage Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_STORAGE_SCALING_ACTION_OPERATION_COUNT = VERTICAL_SCALING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.PhysicalFrequencyScalingActionImpl <em>Physical Frequency Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.PhysicalFrequencyScalingActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getPhysicalFrequencyScalingAction()
	 * @generated
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__ID = VERTICAL_SCALING_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__SEQUENTIAL_STEPS = VERTICAL_SCALING_ACTION__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__PARALLEL_STEPS = VERTICAL_SCALING_ACTION__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__OPTIMISATION_PLAN = VERTICAL_SCALING_ACTION__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__EXECUTION_STATUS = VERTICAL_SCALING_ACTION__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__EXECUTION_STARTED = VERTICAL_SCALING_ACTION__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__EXECUTION_STOPPED = VERTICAL_SCALING_ACTION__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Scaled Physical Processing Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proposed Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Frequency Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION_FEATURE_COUNT = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = VERTICAL_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Physical Frequency Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FREQUENCY_SCALING_ACTION_OPERATION_COUNT = VERTICAL_SCALING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StartVmActionImpl <em>Start Vm Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StartVmActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartVmAction()
	 * @generated
	 */
	int START_VM_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Started Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION__STARTED_VM = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Start Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VM_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.SuspendVmActionImpl <em>Suspend Vm Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.SuspendVmActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getSuspendVmAction()
	 * @generated
	 */
	int SUSPEND_VM_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Suspended Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION__SUSPENDED_VM = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suspend Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Suspend Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VM_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.ManagePhysicalNodeActionImpl <em>Manage Physical Node Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.ManagePhysicalNodeActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getManagePhysicalNodeAction()
	 * @generated
	 */
	int MANAGE_PHYSICAL_NODE_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Managed Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manage Physical Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Manage Physical Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGE_PHYSICAL_NODE_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.VirtualCoresScalingActionImpl <em>Virtual Cores Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.VirtualCoresScalingActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVirtualCoresScalingAction()
	 * @generated
	 */
	int VIRTUAL_CORES_SCALING_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__ID = VERTICAL_SCALING_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__SEQUENTIAL_STEPS = VERTICAL_SCALING_ACTION__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__PARALLEL_STEPS = VERTICAL_SCALING_ACTION__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__OPTIMISATION_PLAN = VERTICAL_SCALING_ACTION__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__EXECUTION_STATUS = VERTICAL_SCALING_ACTION__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__EXECUTION_STARTED = VERTICAL_SCALING_ACTION__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__EXECUTION_STOPPED = VERTICAL_SCALING_ACTION__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Proposed Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaledvirtual Pu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Cores Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION_FEATURE_COUNT = VERTICAL_SCALING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = VERTICAL_SCALING_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Virtual Cores Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CORES_SCALING_ACTION_OPERATION_COUNT = VERTICAL_SCALING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StartApplicationImpl <em>Start Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StartApplicationImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartApplication()
	 * @generated
	 */
	int START_APPLICATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Application Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION__APPLICATION_TEMPLATE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Start Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StopApplicationImpl <em>Stop Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StopApplicationImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStopApplication()
	 * @generated
	 */
	int STOP_APPLICATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION__APPLICATION_INSTANCE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stop Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stop Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_APPLICATION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.ScaleOutImpl <em>Scale Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.ScaleOutImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getScaleOut()
	 * @generated
	 */
	int SCALE_OUT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Load Balancer Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__LOAD_BALANCER_INSTANCE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaling Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT__SCALING_CONNECTOR = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scale Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scale Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OUT_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.ScaleInImpl <em>Scale In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.ScaleInImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getScaleIn()
	 * @generated
	 */
	int SCALE_IN = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Load Balancer Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__LOAD_BALANCER_INSTANCE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaled VM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN__SCALED_VM = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scale In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scale In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_IN_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StartWhiteBoxApplicationImpl <em>Start White Box Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StartWhiteBoxApplicationImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartWhiteBoxApplication()
	 * @generated
	 */
	int START_WHITE_BOX_APPLICATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__ID = START_APPLICATION__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__SEQUENTIAL_STEPS = START_APPLICATION__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__PARALLEL_STEPS = START_APPLICATION__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__OPTIMISATION_PLAN = START_APPLICATION__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__EXECUTION_STATUS = START_APPLICATION__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__EXECUTION_STARTED = START_APPLICATION__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__EXECUTION_STOPPED = START_APPLICATION__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Application Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__APPLICATION_TEMPLATE = START_APPLICATION__APPLICATION_TEMPLATE;

	/**
	 * The feature id for the '<em><b>White Box User Behaviour Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE = START_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start White Box Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION_FEATURE_COUNT = START_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = START_APPLICATION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Application Template Must Be Whit Box Application Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION___APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTICCHAIN_MAP = START_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>Start White Box Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WHITE_BOX_APPLICATION_OPERATION_COUNT = START_APPLICATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StartGreyBoxApplicationImpl <em>Start Grey Box Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StartGreyBoxApplicationImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartGreyBoxApplication()
	 * @generated
	 */
	int START_GREY_BOX_APPLICATION = 22;

	/**
	 * The number of structural features of the '<em>Start Grey Box Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_GREY_BOX_APPLICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Start Grey Box Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_GREY_BOX_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.StartBlackBoxApplicationImpl <em>Start Black Box Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.StartBlackBoxApplicationImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartBlackBoxApplication()
	 * @generated
	 */
	int START_BLACK_BOX_APPLICATION = 23;

	/**
	 * The number of structural features of the '<em>Start Black Box Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_BLACK_BOX_APPLICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Start Black Box Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_BLACK_BOX_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.ConnectVmActionImpl <em>Connect Vm Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.ConnectVmActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getConnectVmAction()
	 * @generated
	 */
	int CONNECT_VM_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__SOURCE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION__TARGET = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connect Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Connect Vm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_VM_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl <em>Resource Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getResourceControlAction()
	 * @generated
	 */
	int RESOURCE_CONTROL_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__ID = OPTIMISATION_ACTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Sequential Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__SEQUENTIAL_STEPS = OPTIMISATION_ACTION_STEP__SEQUENTIAL_STEPS;

	/**
	 * The feature id for the '<em><b>Parallel Steps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__PARALLEL_STEPS = OPTIMISATION_ACTION_STEP__PARALLEL_STEPS;

	/**
	 * The feature id for the '<em><b>Optimisation Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__OPTIMISATION_PLAN = OPTIMISATION_ACTION_STEP__OPTIMISATION_PLAN;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__EXECUTION_STATUS = OPTIMISATION_ACTION_STEP__EXECUTION_STATUS;

	/**
	 * The feature id for the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__EXECUTION_STARTED = OPTIMISATION_ACTION_STEP__EXECUTION_STARTED;

	/**
	 * The feature id for the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__EXECUTION_STOPPED = OPTIMISATION_ACTION_STEP__EXECUTION_STOPPED;

	/**
	 * The feature id for the '<em><b>Affected Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__AFFECTED_VM = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__RESOURCE_SHARE = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controlled Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION_FEATURE_COUNT = OPTIMISATION_ACTION_STEP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OPTIMISATION_ACTION_STEP___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_ACTION_OPERATION_COUNT = OPTIMISATION_ACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.optimisationplan.ExecutionStatus <em>Execution Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.optimisationplan.ExecutionStatus
	 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getExecutionStatus()
	 * @generated
	 */
	int EXECUTION_STATUS = 26;

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.OptimisationActionStep <em>Optimisation Action Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Action Step</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationActionStep
	 * @generated
	 */
	EClass getOptimisationActionStep();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.OptimisationStep <em>Optimisation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Step</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep
	 * @generated
	 */
	EClass getOptimisationStep();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getSequentialSteps <em>Sequential Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sequential Steps</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getSequentialSteps()
	 * @see #getOptimisationStep()
	 * @generated
	 */
	EReference getOptimisationStep_SequentialSteps();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getParallelSteps <em>Parallel Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parallel Steps</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getParallelSteps()
	 * @see #getOptimisationStep()
	 * @generated
	 */
	EReference getOptimisationStep_ParallelSteps();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getOptimisationPlan <em>Optimisation Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Optimisation Plan</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getOptimisationPlan()
	 * @see #getOptimisationStep()
	 * @generated
	 */
	EReference getOptimisationStep_OptimisationPlan();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStatus <em>Execution Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Status</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStatus()
	 * @see #getOptimisationStep()
	 * @generated
	 */
	EAttribute getOptimisationStep_ExecutionStatus();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStarted <em>Execution Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Started</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStarted()
	 * @see #getOptimisationStep()
	 * @generated
	 */
	EAttribute getOptimisationStep_ExecutionStarted();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStopped <em>Execution Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Stopped</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStopped()
	 * @see #getOptimisationStep()
	 * @generated
	 */
	EAttribute getOptimisationStep_ExecutionStopped();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.SequentialSteps <em>Sequential Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Steps</em>'.
	 * @see eu.cactosfp7.optimisationplan.SequentialSteps
	 * @generated
	 */
	EClass getSequentialSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.optimisationplan.SequentialSteps#getOptimisationSteps <em>Optimisation Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optimisation Steps</em>'.
	 * @see eu.cactosfp7.optimisationplan.SequentialSteps#getOptimisationSteps()
	 * @see #getSequentialSteps()
	 * @generated
	 */
	EReference getSequentialSteps_OptimisationSteps();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.ParallelSteps <em>Parallel Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Steps</em>'.
	 * @see eu.cactosfp7.optimisationplan.ParallelSteps
	 * @generated
	 */
	EClass getParallelSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.optimisationplan.ParallelSteps#getOptimisationSteps <em>Optimisation Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optimisation Steps</em>'.
	 * @see eu.cactosfp7.optimisationplan.ParallelSteps#getOptimisationSteps()
	 * @see #getParallelSteps()
	 * @generated
	 */
	EReference getParallelSteps_OptimisationSteps();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.OptimisationPlan <em>Optimisation Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Plan</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan
	 * @generated
	 */
	EClass getOptimisationPlan();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStatus <em>Execution Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Status</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStatus()
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	EAttribute getOptimisationPlan_ExecutionStatus();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getCreationDate()
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	EAttribute getOptimisationPlan_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStarted <em>Execution Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Started</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStarted()
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	EAttribute getOptimisationPlan_ExecutionStarted();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStopped <em>Execution Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Stopped</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStopped()
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	EAttribute getOptimisationPlan_ExecutionStopped();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getRepository()
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	EReference getOptimisationPlan_Repository();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getOptimisationStep <em>Optimisation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimisation Step</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getOptimisationStep()
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	EReference getOptimisationPlan_OptimisationStep();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.OptimisationPlanRepository <em>Optimisation Plan Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Plan Repository</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlanRepository
	 * @generated
	 */
	EClass getOptimisationPlanRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.optimisationplan.OptimisationPlanRepository#getOptimisationPlans <em>Optimisation Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optimisation Plans</em>'.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlanRepository#getOptimisationPlans()
	 * @see #getOptimisationPlanRepository()
	 * @generated
	 */
	EReference getOptimisationPlanRepository_OptimisationPlans();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.VmPlacementAction <em>Vm Placement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm Placement Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction
	 * @generated
	 */
	EClass getVmPlacementAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getTargetHost <em>Target Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Host</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getTargetHost()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EReference getVmPlacementAction_TargetHost();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getVmImage <em>Vm Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Image</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getVmImage()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EReference getVmPlacementAction_VmImage();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getPuAffinity <em>Pu Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pu Affinity</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getPuAffinity()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EReference getVmPlacementAction_PuAffinity();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedMemory <em>Proposed Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Memory</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedMemory()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EAttribute getVmPlacementAction_ProposedMemory();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedStorage <em>Proposed Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Storage</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedStorage()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EAttribute getVmPlacementAction_ProposedStorage();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedVirtualCores <em>Proposed Virtual Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Virtual Cores</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedVirtualCores()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EAttribute getVmPlacementAction_ProposedVirtualCores();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getUnassignedVirtualMachine <em>Unassigned Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unassigned Virtual Machine</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction#getUnassignedVirtualMachine()
	 * @see #getVmPlacementAction()
	 * @generated
	 */
	EReference getVmPlacementAction_UnassignedVirtualMachine();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.VmMigrationAction <em>Vm Migration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm Migration Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmMigrationAction
	 * @generated
	 */
	EClass getVmMigrationAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getMigratedVm <em>Migrated Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Migrated Vm</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmMigrationAction#getMigratedVm()
	 * @see #getVmMigrationAction()
	 * @generated
	 */
	EReference getVmMigrationAction_MigratedVm();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getTargetHost <em>Target Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Host</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmMigrationAction#getTargetHost()
	 * @see #getVmMigrationAction()
	 * @generated
	 */
	EReference getVmMigrationAction_TargetHost();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getPuAffinityAfterMigration <em>Pu Affinity After Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pu Affinity After Migration</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmMigrationAction#getPuAffinityAfterMigration()
	 * @see #getVmMigrationAction()
	 * @generated
	 */
	EReference getVmMigrationAction_PuAffinityAfterMigration();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getSourceHost <em>Source Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Host</em>'.
	 * @see eu.cactosfp7.optimisationplan.VmMigrationAction#getSourceHost()
	 * @see #getVmMigrationAction()
	 * @generated
	 */
	EReference getVmMigrationAction_SourceHost();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.VerticalScalingAction <em>Vertical Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Scaling Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.VerticalScalingAction
	 * @generated
	 */
	EClass getVerticalScalingAction();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StopVmAction <em>Stop Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Vm Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.StopVmAction
	 * @generated
	 */
	EClass getStopVmAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.StopVmAction#getStoppedVm <em>Stopped Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stopped Vm</em>'.
	 * @see eu.cactosfp7.optimisationplan.StopVmAction#getStoppedVm()
	 * @see #getStopVmAction()
	 * @generated
	 */
	EReference getStopVmAction_StoppedVm();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction <em>Logical Memory Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Memory Scaling Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction
	 * @generated
	 */
	EClass getLogicalMemoryScalingAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getProposedSize <em>Proposed Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Size</em>'.
	 * @see eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getProposedSize()
	 * @see #getLogicalMemoryScalingAction()
	 * @generated
	 */
	EAttribute getLogicalMemoryScalingAction_ProposedSize();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getScaledVirtualMemory <em>Scaled Virtual Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scaled Virtual Memory</em>'.
	 * @see eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getScaledVirtualMemory()
	 * @see #getLogicalMemoryScalingAction()
	 * @generated
	 */
	EReference getLogicalMemoryScalingAction_ScaledVirtualMemory();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction <em>Logical Storage Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Storage Scaling Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.LogicalStorageScalingAction
	 * @generated
	 */
	EClass getLogicalStorageScalingAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getProposedLocalSize <em>Proposed Local Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Local Size</em>'.
	 * @see eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getProposedLocalSize()
	 * @see #getLogicalStorageScalingAction()
	 * @generated
	 */
	EAttribute getLogicalStorageScalingAction_ProposedLocalSize();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getVMImageInstance <em>VM Image Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VM Image Instance</em>'.
	 * @see eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getVMImageInstance()
	 * @see #getLogicalStorageScalingAction()
	 * @generated
	 */
	EReference getLogicalStorageScalingAction_VMImageInstance();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction <em>Physical Frequency Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Frequency Scaling Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction
	 * @generated
	 */
	EClass getPhysicalFrequencyScalingAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getScaledPhysicalProcessingUnit <em>Scaled Physical Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scaled Physical Processing Unit</em>'.
	 * @see eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getScaledPhysicalProcessingUnit()
	 * @see #getPhysicalFrequencyScalingAction()
	 * @generated
	 */
	EReference getPhysicalFrequencyScalingAction_ScaledPhysicalProcessingUnit();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getProposedFrequency <em>Proposed Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Frequency</em>'.
	 * @see eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getProposedFrequency()
	 * @see #getPhysicalFrequencyScalingAction()
	 * @generated
	 */
	EAttribute getPhysicalFrequencyScalingAction_ProposedFrequency();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StartVmAction <em>Start Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Vm Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartVmAction
	 * @generated
	 */
	EClass getStartVmAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.StartVmAction#getStartedVm <em>Started Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Started Vm</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartVmAction#getStartedVm()
	 * @see #getStartVmAction()
	 * @generated
	 */
	EReference getStartVmAction_StartedVm();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.SuspendVmAction <em>Suspend Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend Vm Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.SuspendVmAction
	 * @generated
	 */
	EClass getSuspendVmAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.SuspendVmAction#getSuspendedVm <em>Suspended Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suspended Vm</em>'.
	 * @see eu.cactosfp7.optimisationplan.SuspendVmAction#getSuspendedVm()
	 * @see #getSuspendVmAction()
	 * @generated
	 */
	EReference getSuspendVmAction_SuspendedVm();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction <em>Manage Physical Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manage Physical Node Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction
	 * @generated
	 */
	EClass getManagePhysicalNodeAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State</em>'.
	 * @see eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getTargetState()
	 * @see #getManagePhysicalNodeAction()
	 * @generated
	 */
	EAttribute getManagePhysicalNodeAction_TargetState();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getManagedNode <em>Managed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Managed Node</em>'.
	 * @see eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getManagedNode()
	 * @see #getManagePhysicalNodeAction()
	 * @generated
	 */
	EReference getManagePhysicalNodeAction_ManagedNode();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction <em>Virtual Cores Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Cores Scaling Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.VirtualCoresScalingAction
	 * @generated
	 */
	EClass getVirtualCoresScalingAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getProposedNumberOfCores <em>Proposed Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Number Of Cores</em>'.
	 * @see eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getProposedNumberOfCores()
	 * @see #getVirtualCoresScalingAction()
	 * @generated
	 */
	EAttribute getVirtualCoresScalingAction_ProposedNumberOfCores();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getScaledvirtualPu <em>Scaledvirtual Pu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scaledvirtual Pu</em>'.
	 * @see eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getScaledvirtualPu()
	 * @see #getVirtualCoresScalingAction()
	 * @generated
	 */
	EReference getVirtualCoresScalingAction_ScaledvirtualPu();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StartApplication <em>Start Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Application</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartApplication
	 * @generated
	 */
	EClass getStartApplication();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.StartApplication#getApplicationTemplate <em>Application Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Template</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartApplication#getApplicationTemplate()
	 * @see #getStartApplication()
	 * @generated
	 */
	EReference getStartApplication_ApplicationTemplate();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StopApplication <em>Stop Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Application</em>'.
	 * @see eu.cactosfp7.optimisationplan.StopApplication
	 * @generated
	 */
	EClass getStopApplication();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.StopApplication#getApplicationInstance <em>Application Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Instance</em>'.
	 * @see eu.cactosfp7.optimisationplan.StopApplication#getApplicationInstance()
	 * @see #getStopApplication()
	 * @generated
	 */
	EReference getStopApplication_ApplicationInstance();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.ScaleOut <em>Scale Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Out</em>'.
	 * @see eu.cactosfp7.optimisationplan.ScaleOut
	 * @generated
	 */
	EClass getScaleOut();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ScaleOut#getLoadBalancerInstance <em>Load Balancer Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Balancer Instance</em>'.
	 * @see eu.cactosfp7.optimisationplan.ScaleOut#getLoadBalancerInstance()
	 * @see #getScaleOut()
	 * @generated
	 */
	EReference getScaleOut_LoadBalancerInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ScaleOut#getScalingConnector <em>Scaling Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scaling Connector</em>'.
	 * @see eu.cactosfp7.optimisationplan.ScaleOut#getScalingConnector()
	 * @see #getScaleOut()
	 * @generated
	 */
	EReference getScaleOut_ScalingConnector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.ScaleIn <em>Scale In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale In</em>'.
	 * @see eu.cactosfp7.optimisationplan.ScaleIn
	 * @generated
	 */
	EClass getScaleIn();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ScaleIn#getLoadBalancerInstance <em>Load Balancer Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Balancer Instance</em>'.
	 * @see eu.cactosfp7.optimisationplan.ScaleIn#getLoadBalancerInstance()
	 * @see #getScaleIn()
	 * @generated
	 */
	EReference getScaleIn_LoadBalancerInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ScaleIn#getScaledVM <em>Scaled VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scaled VM</em>'.
	 * @see eu.cactosfp7.optimisationplan.ScaleIn#getScaledVM()
	 * @see #getScaleIn()
	 * @generated
	 */
	EReference getScaleIn_ScaledVM();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StartWhiteBoxApplication <em>Start White Box Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start White Box Application</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartWhiteBoxApplication
	 * @generated
	 */
	EClass getStartWhiteBoxApplication();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.optimisationplan.StartWhiteBoxApplication#getWhiteBoxUserBehaviourTemplate <em>White Box User Behaviour Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Box User Behaviour Template</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartWhiteBoxApplication#getWhiteBoxUserBehaviourTemplate()
	 * @see #getStartWhiteBoxApplication()
	 * @generated
	 */
	EReference getStartWhiteBoxApplication_WhiteBoxUserBehaviourTemplate();

	/**
	 * Returns the meta object for the '{@link eu.cactosfp7.optimisationplan.StartWhiteBoxApplication#ApplicationTemplateMustBeWhitBoxApplicationTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Application Template Must Be Whit Box Application Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Application Template Must Be Whit Box Application Template</em>' operation.
	 * @see eu.cactosfp7.optimisationplan.StartWhiteBoxApplication#ApplicationTemplateMustBeWhitBoxApplicationTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStartWhiteBoxApplication__ApplicationTemplateMustBeWhitBoxApplicationTemplate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StartGreyBoxApplication <em>Start Grey Box Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Grey Box Application</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartGreyBoxApplication
	 * @generated
	 */
	EClass getStartGreyBoxApplication();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.StartBlackBoxApplication <em>Start Black Box Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Black Box Application</em>'.
	 * @see eu.cactosfp7.optimisationplan.StartBlackBoxApplication
	 * @generated
	 */
	EClass getStartBlackBoxApplication();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.ConnectVmAction <em>Connect Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Vm Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.ConnectVmAction
	 * @generated
	 */
	EClass getConnectVmAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ConnectVmAction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eu.cactosfp7.optimisationplan.ConnectVmAction#getSource()
	 * @see #getConnectVmAction()
	 * @generated
	 */
	EReference getConnectVmAction_Source();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ConnectVmAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eu.cactosfp7.optimisationplan.ConnectVmAction#getTarget()
	 * @see #getConnectVmAction()
	 * @generated
	 */
	EReference getConnectVmAction_Target();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.optimisationplan.ResourceControlAction <em>Resource Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Control Action</em>'.
	 * @see eu.cactosfp7.optimisationplan.ResourceControlAction
	 * @generated
	 */
	EClass getResourceControlAction();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getAffectedVm <em>Affected Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Vm</em>'.
	 * @see eu.cactosfp7.optimisationplan.ResourceControlAction#getAffectedVm()
	 * @see #getResourceControlAction()
	 * @generated
	 */
	EReference getResourceControlAction_AffectedVm();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getResourceShare <em>Resource Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Share</em>'.
	 * @see eu.cactosfp7.optimisationplan.ResourceControlAction#getResourceShare()
	 * @see #getResourceControlAction()
	 * @generated
	 */
	EAttribute getResourceControlAction_ResourceShare();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getControlledHypervisor <em>Controlled Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlled Hypervisor</em>'.
	 * @see eu.cactosfp7.optimisationplan.ResourceControlAction#getControlledHypervisor()
	 * @see #getResourceControlAction()
	 * @generated
	 */
	EReference getResourceControlAction_ControlledHypervisor();

	/**
	 * Returns the meta object for enum '{@link eu.cactosfp7.optimisationplan.ExecutionStatus <em>Execution Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Status</em>'.
	 * @see eu.cactosfp7.optimisationplan.ExecutionStatus
	 * @generated
	 */
	EEnum getExecutionStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OptimisationplanFactory getOptimisationplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationActionStepImpl <em>Optimisation Action Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationActionStepImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationActionStep()
		 * @generated
		 */
		EClass OPTIMISATION_ACTION_STEP = eINSTANCE.getOptimisationActionStep();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl <em>Optimisation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationStep()
		 * @generated
		 */
		EClass OPTIMISATION_STEP = eINSTANCE.getOptimisationStep();

		/**
		 * The meta object literal for the '<em><b>Sequential Steps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_STEP__SEQUENTIAL_STEPS = eINSTANCE.getOptimisationStep_SequentialSteps();

		/**
		 * The meta object literal for the '<em><b>Parallel Steps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_STEP__PARALLEL_STEPS = eINSTANCE.getOptimisationStep_ParallelSteps();

		/**
		 * The meta object literal for the '<em><b>Optimisation Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_STEP__OPTIMISATION_PLAN = eINSTANCE.getOptimisationStep_OptimisationPlan();

		/**
		 * The meta object literal for the '<em><b>Execution Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_STEP__EXECUTION_STATUS = eINSTANCE.getOptimisationStep_ExecutionStatus();

		/**
		 * The meta object literal for the '<em><b>Execution Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_STEP__EXECUTION_STARTED = eINSTANCE.getOptimisationStep_ExecutionStarted();

		/**
		 * The meta object literal for the '<em><b>Execution Stopped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_STEP__EXECUTION_STOPPED = eINSTANCE.getOptimisationStep_ExecutionStopped();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.SequentialStepsImpl <em>Sequential Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.SequentialStepsImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getSequentialSteps()
		 * @generated
		 */
		EClass SEQUENTIAL_STEPS = eINSTANCE.getSequentialSteps();

		/**
		 * The meta object literal for the '<em><b>Optimisation Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_STEPS__OPTIMISATION_STEPS = eINSTANCE.getSequentialSteps_OptimisationSteps();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.ParallelStepsImpl <em>Parallel Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.ParallelStepsImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getParallelSteps()
		 * @generated
		 */
		EClass PARALLEL_STEPS = eINSTANCE.getParallelSteps();

		/**
		 * The meta object literal for the '<em><b>Optimisation Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_STEPS__OPTIMISATION_STEPS = eINSTANCE.getParallelSteps_OptimisationSteps();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl <em>Optimisation Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationPlan()
		 * @generated
		 */
		EClass OPTIMISATION_PLAN = eINSTANCE.getOptimisationPlan();

		/**
		 * The meta object literal for the '<em><b>Execution Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_PLAN__EXECUTION_STATUS = eINSTANCE.getOptimisationPlan_ExecutionStatus();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_PLAN__CREATION_DATE = eINSTANCE.getOptimisationPlan_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Execution Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_PLAN__EXECUTION_STARTED = eINSTANCE.getOptimisationPlan_ExecutionStarted();

		/**
		 * The meta object literal for the '<em><b>Execution Stopped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_PLAN__EXECUTION_STOPPED = eINSTANCE.getOptimisationPlan_ExecutionStopped();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_PLAN__REPOSITORY = eINSTANCE.getOptimisationPlan_Repository();

		/**
		 * The meta object literal for the '<em><b>Optimisation Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_PLAN__OPTIMISATION_STEP = eINSTANCE.getOptimisationPlan_OptimisationStep();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanRepositoryImpl <em>Optimisation Plan Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationPlanRepositoryImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getOptimisationPlanRepository()
		 * @generated
		 */
		EClass OPTIMISATION_PLAN_REPOSITORY = eINSTANCE.getOptimisationPlanRepository();

		/**
		 * The meta object literal for the '<em><b>Optimisation Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS = eINSTANCE
				.getOptimisationPlanRepository_OptimisationPlans();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl <em>Vm Placement Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVmPlacementAction()
		 * @generated
		 */
		EClass VM_PLACEMENT_ACTION = eINSTANCE.getVmPlacementAction();

		/**
		 * The meta object literal for the '<em><b>Target Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_PLACEMENT_ACTION__TARGET_HOST = eINSTANCE.getVmPlacementAction_TargetHost();

		/**
		 * The meta object literal for the '<em><b>Vm Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_PLACEMENT_ACTION__VM_IMAGE = eINSTANCE.getVmPlacementAction_VmImage();

		/**
		 * The meta object literal for the '<em><b>Pu Affinity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_PLACEMENT_ACTION__PU_AFFINITY = eINSTANCE.getVmPlacementAction_PuAffinity();

		/**
		 * The meta object literal for the '<em><b>Proposed Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_PLACEMENT_ACTION__PROPOSED_MEMORY = eINSTANCE.getVmPlacementAction_ProposedMemory();

		/**
		 * The meta object literal for the '<em><b>Proposed Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_PLACEMENT_ACTION__PROPOSED_STORAGE = eINSTANCE.getVmPlacementAction_ProposedStorage();

		/**
		 * The meta object literal for the '<em><b>Proposed Virtual Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES = eINSTANCE.getVmPlacementAction_ProposedVirtualCores();

		/**
		 * The meta object literal for the '<em><b>Unassigned Virtual Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE = eINSTANCE
				.getVmPlacementAction_UnassignedVirtualMachine();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl <em>Vm Migration Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVmMigrationAction()
		 * @generated
		 */
		EClass VM_MIGRATION_ACTION = eINSTANCE.getVmMigrationAction();

		/**
		 * The meta object literal for the '<em><b>Migrated Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_MIGRATION_ACTION__MIGRATED_VM = eINSTANCE.getVmMigrationAction_MigratedVm();

		/**
		 * The meta object literal for the '<em><b>Target Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_MIGRATION_ACTION__TARGET_HOST = eINSTANCE.getVmMigrationAction_TargetHost();

		/**
		 * The meta object literal for the '<em><b>Pu Affinity After Migration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION = eINSTANCE
				.getVmMigrationAction_PuAffinityAfterMigration();

		/**
		 * The meta object literal for the '<em><b>Source Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_MIGRATION_ACTION__SOURCE_HOST = eINSTANCE.getVmMigrationAction_SourceHost();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.VerticalScalingActionImpl <em>Vertical Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.VerticalScalingActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVerticalScalingAction()
		 * @generated
		 */
		EClass VERTICAL_SCALING_ACTION = eINSTANCE.getVerticalScalingAction();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StopVmActionImpl <em>Stop Vm Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StopVmActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStopVmAction()
		 * @generated
		 */
		EClass STOP_VM_ACTION = eINSTANCE.getStopVmAction();

		/**
		 * The meta object literal for the '<em><b>Stopped Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_VM_ACTION__STOPPED_VM = eINSTANCE.getStopVmAction_StoppedVm();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.LogicalMemoryScalingActionImpl <em>Logical Memory Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.LogicalMemoryScalingActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getLogicalMemoryScalingAction()
		 * @generated
		 */
		EClass LOGICAL_MEMORY_SCALING_ACTION = eINSTANCE.getLogicalMemoryScalingAction();

		/**
		 * The meta object literal for the '<em><b>Proposed Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE = eINSTANCE
				.getLogicalMemoryScalingAction_ProposedSize();

		/**
		 * The meta object literal for the '<em><b>Scaled Virtual Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY = eINSTANCE
				.getLogicalMemoryScalingAction_ScaledVirtualMemory();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.LogicalStorageScalingActionImpl <em>Logical Storage Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.LogicalStorageScalingActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getLogicalStorageScalingAction()
		 * @generated
		 */
		EClass LOGICAL_STORAGE_SCALING_ACTION = eINSTANCE.getLogicalStorageScalingAction();

		/**
		 * The meta object literal for the '<em><b>Proposed Local Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE = eINSTANCE
				.getLogicalStorageScalingAction_ProposedLocalSize();

		/**
		 * The meta object literal for the '<em><b>VM Image Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE = eINSTANCE
				.getLogicalStorageScalingAction_VMImageInstance();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.PhysicalFrequencyScalingActionImpl <em>Physical Frequency Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.PhysicalFrequencyScalingActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getPhysicalFrequencyScalingAction()
		 * @generated
		 */
		EClass PHYSICAL_FREQUENCY_SCALING_ACTION = eINSTANCE.getPhysicalFrequencyScalingAction();

		/**
		 * The meta object literal for the '<em><b>Scaled Physical Processing Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT = eINSTANCE
				.getPhysicalFrequencyScalingAction_ScaledPhysicalProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Proposed Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY = eINSTANCE
				.getPhysicalFrequencyScalingAction_ProposedFrequency();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StartVmActionImpl <em>Start Vm Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StartVmActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartVmAction()
		 * @generated
		 */
		EClass START_VM_ACTION = eINSTANCE.getStartVmAction();

		/**
		 * The meta object literal for the '<em><b>Started Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_VM_ACTION__STARTED_VM = eINSTANCE.getStartVmAction_StartedVm();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.SuspendVmActionImpl <em>Suspend Vm Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.SuspendVmActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getSuspendVmAction()
		 * @generated
		 */
		EClass SUSPEND_VM_ACTION = eINSTANCE.getSuspendVmAction();

		/**
		 * The meta object literal for the '<em><b>Suspended Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUSPEND_VM_ACTION__SUSPENDED_VM = eINSTANCE.getSuspendVmAction_SuspendedVm();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.ManagePhysicalNodeActionImpl <em>Manage Physical Node Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.ManagePhysicalNodeActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getManagePhysicalNodeAction()
		 * @generated
		 */
		EClass MANAGE_PHYSICAL_NODE_ACTION = eINSTANCE.getManagePhysicalNodeAction();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE = eINSTANCE.getManagePhysicalNodeAction_TargetState();

		/**
		 * The meta object literal for the '<em><b>Managed Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE = eINSTANCE.getManagePhysicalNodeAction_ManagedNode();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.VirtualCoresScalingActionImpl <em>Virtual Cores Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.VirtualCoresScalingActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getVirtualCoresScalingAction()
		 * @generated
		 */
		EClass VIRTUAL_CORES_SCALING_ACTION = eINSTANCE.getVirtualCoresScalingAction();

		/**
		 * The meta object literal for the '<em><b>Proposed Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES = eINSTANCE
				.getVirtualCoresScalingAction_ProposedNumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Scaledvirtual Pu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU = eINSTANCE
				.getVirtualCoresScalingAction_ScaledvirtualPu();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StartApplicationImpl <em>Start Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StartApplicationImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartApplication()
		 * @generated
		 */
		EClass START_APPLICATION = eINSTANCE.getStartApplication();

		/**
		 * The meta object literal for the '<em><b>Application Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_APPLICATION__APPLICATION_TEMPLATE = eINSTANCE.getStartApplication_ApplicationTemplate();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StopApplicationImpl <em>Stop Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StopApplicationImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStopApplication()
		 * @generated
		 */
		EClass STOP_APPLICATION = eINSTANCE.getStopApplication();

		/**
		 * The meta object literal for the '<em><b>Application Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_APPLICATION__APPLICATION_INSTANCE = eINSTANCE.getStopApplication_ApplicationInstance();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.ScaleOutImpl <em>Scale Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.ScaleOutImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getScaleOut()
		 * @generated
		 */
		EClass SCALE_OUT = eINSTANCE.getScaleOut();

		/**
		 * The meta object literal for the '<em><b>Load Balancer Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALE_OUT__LOAD_BALANCER_INSTANCE = eINSTANCE.getScaleOut_LoadBalancerInstance();

		/**
		 * The meta object literal for the '<em><b>Scaling Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALE_OUT__SCALING_CONNECTOR = eINSTANCE.getScaleOut_ScalingConnector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.ScaleInImpl <em>Scale In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.ScaleInImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getScaleIn()
		 * @generated
		 */
		EClass SCALE_IN = eINSTANCE.getScaleIn();

		/**
		 * The meta object literal for the '<em><b>Load Balancer Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALE_IN__LOAD_BALANCER_INSTANCE = eINSTANCE.getScaleIn_LoadBalancerInstance();

		/**
		 * The meta object literal for the '<em><b>Scaled VM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALE_IN__SCALED_VM = eINSTANCE.getScaleIn_ScaledVM();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StartWhiteBoxApplicationImpl <em>Start White Box Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StartWhiteBoxApplicationImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartWhiteBoxApplication()
		 * @generated
		 */
		EClass START_WHITE_BOX_APPLICATION = eINSTANCE.getStartWhiteBoxApplication();

		/**
		 * The meta object literal for the '<em><b>White Box User Behaviour Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE = eINSTANCE
				.getStartWhiteBoxApplication_WhiteBoxUserBehaviourTemplate();

		/**
		 * The meta object literal for the '<em><b>Application Template Must Be Whit Box Application Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation START_WHITE_BOX_APPLICATION___APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getStartWhiteBoxApplication__ApplicationTemplateMustBeWhitBoxApplicationTemplate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StartGreyBoxApplicationImpl <em>Start Grey Box Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StartGreyBoxApplicationImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartGreyBoxApplication()
		 * @generated
		 */
		EClass START_GREY_BOX_APPLICATION = eINSTANCE.getStartGreyBoxApplication();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.StartBlackBoxApplicationImpl <em>Start Black Box Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.StartBlackBoxApplicationImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getStartBlackBoxApplication()
		 * @generated
		 */
		EClass START_BLACK_BOX_APPLICATION = eINSTANCE.getStartBlackBoxApplication();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.ConnectVmActionImpl <em>Connect Vm Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.ConnectVmActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getConnectVmAction()
		 * @generated
		 */
		EClass CONNECT_VM_ACTION = eINSTANCE.getConnectVmAction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_VM_ACTION__SOURCE = eINSTANCE.getConnectVmAction_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_VM_ACTION__TARGET = eINSTANCE.getConnectVmAction_Target();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl <em>Resource Control Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getResourceControlAction()
		 * @generated
		 */
		EClass RESOURCE_CONTROL_ACTION = eINSTANCE.getResourceControlAction();

		/**
		 * The meta object literal for the '<em><b>Affected Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROL_ACTION__AFFECTED_VM = eINSTANCE.getResourceControlAction_AffectedVm();

		/**
		 * The meta object literal for the '<em><b>Resource Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROL_ACTION__RESOURCE_SHARE = eINSTANCE.getResourceControlAction_ResourceShare();

		/**
		 * The meta object literal for the '<em><b>Controlled Hypervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR = eINSTANCE
				.getResourceControlAction_ControlledHypervisor();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.optimisationplan.ExecutionStatus <em>Execution Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.optimisationplan.ExecutionStatus
		 * @see eu.cactosfp7.optimisationplan.impl.OptimisationplanPackageImpl#getExecutionStatus()
		 * @generated
		 */
		EEnum EXECUTION_STATUS = eINSTANCE.getExecutionStatus();

	}

} //OptimisationplanPackage
