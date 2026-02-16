package ${package};


<#if classPackages??>
<#list classPackages as classPackage>
import ${classPackage};
</#list>
</#if>

<#if classannotations??>
<#list classannotations as classannotation>
@${classannotation}
</#list>
</#if>
public ${type} ${name} <#if interface??> implements ${interface}</#if> <#if extendedclass??> extends ${extendedclass}</#if>{

	<#if classvariablelist??>
	<#list classvariablelist as classvariable>
	${classvariable};
	</#list>
	</#if>
	
	
	
	<#if membervariablelist??>
	<#list membervariablelist as membervariable>
	private ${membervariable};
	</#list>
	</#if>
	
	<#if childpolicylists??> 
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
	<#list childpolicylists as item>
		childs.addAll(${item});
	</#list>
		return childs;
	}
	</#if>
	
	
	<#if classmethods??>
	<#list classmethods as method>
	${method.accessSpecifier} ${method.returnType} ${method.methodName} (<#if method.params??>${method.params}</#if>) <#if method.throwsSection??>${method.throwsSection}</#if> {
	  <#if method.body??>${method.body}</#if>
	  <#if method.returnValue??>${method.returnValue}</#if>
	}
	</#list>
	</#if>
	
	
	<#if interfacemethods??>
	<#list interfacemethods as method>
	@Override
	${method.accessSpecifier} ${method.returnType} ${method.methodName} (<#if method.params??>${method.params}</#if>) <#if method.throwsSection??>${method.throwsSection}</#if> {
	  <#if method.body??>${method.body}</#if>
	  <#if method.returnValue??>${method.returnValue}</#if>
	}
	</#list>
	</#if>
	
	
	


	<#if getters??>
	<#list getters?keys as key>
	public ${key} {
		return ${getters[key]};
	}
	</#list>
	</#if>
	
	<#if setters??>
	<#list setters?keys as key>
	public void ${key} {
		this.${setters[key]} = ${setters[key]};
	}
	</#list>
	</#if>
}