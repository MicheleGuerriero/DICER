/**
 */
package tosca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public class ToscaAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ToscaPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ToscaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToscaPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ToscaSwitch<Adapter> modelSwitch =
        new ToscaSwitch<Adapter>() {
			@Override
			public Adapter caseNodeTemplate(NodeTemplate object) {
				return createNodeTemplateAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseTopologyTemplate(TopologyTemplate object) {
				return createTopologyTemplateAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter casePolicy(Policy object) {
				return createPolicyAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseInstances(Instances object) {
				return createInstancesAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseSimpleValue(SimpleValue object) {
				return createSimpleValueAdapter();
			}
			@Override
			public Adapter caseGetAttribute(GetAttribute object) {
				return createGetAttributeAdapter();
			}
			@Override
			public Adapter caseFirewallRule(FirewallRule object) {
				return createFirewallRuleAdapter();
			}
			@Override
			public Adapter caseMonitoringProperty(MonitoringProperty object) {
				return createMonitoringPropertyAdapter();
			}
			@Override
			public Adapter caseEnvironmentVariable(EnvironmentVariable object) {
				return createEnvironmentVariableAdapter();
			}
			@Override
			public Adapter caseConcat(Concat object) {
				return createConcatAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link tosca.NodeTemplate <em>Node Template</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.NodeTemplate
	 * @generated
	 */
    public Adapter createNodeTemplateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Interface
	 * @generated
	 */
    public Adapter createInterfaceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Relationship
	 * @generated
	 */
    public Adapter createRelationshipAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Property
	 * @generated
	 */
    public Adapter createPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Requirement
	 * @generated
	 */
    public Adapter createRequirementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Operation
	 * @generated
	 */
    public Adapter createOperationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.TopologyTemplate <em>Topology Template</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TopologyTemplate
	 * @generated
	 */
    public Adapter createTopologyTemplateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Import
	 * @generated
	 */
    public Adapter createImportAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Group
	 * @generated
	 */
    public Adapter createGroupAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Policy
	 * @generated
	 */
    public Adapter createPolicyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Capability
	 * @generated
	 */
    public Adapter createCapabilityAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Parameter
	 * @generated
	 */
    public Adapter createParameterAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Artifact
	 * @generated
	 */
    public Adapter createArtifactAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Instances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Instances
	 * @generated
	 */
    public Adapter createInstancesAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Configuration
	 * @generated
	 */
    public Adapter createConfigurationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Argument
	 * @generated
	 */
    public Adapter createArgumentAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Expression
	 * @generated
	 */
    public Adapter createExpressionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Value
	 * @generated
	 */
    public Adapter createValueAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.SimpleValue
	 * @generated
	 */
    public Adapter createSimpleValueAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.GetAttribute <em>Get Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.GetAttribute
	 * @generated
	 */
    public Adapter createGetAttributeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.FirewallRule <em>Firewall Rule</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.FirewallRule
	 * @generated
	 */
    public Adapter createFirewallRuleAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.MonitoringProperty <em>Monitoring Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.MonitoringProperty
	 * @generated
	 */
    public Adapter createMonitoringPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.EnvironmentVariable <em>Environment Variable</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.EnvironmentVariable
	 * @generated
	 */
    public Adapter createEnvironmentVariableAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link tosca.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.Concat
	 * @generated
	 */
	public Adapter createConcatAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //ToscaAdapterFactory
