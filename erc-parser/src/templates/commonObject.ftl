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
public ${type} ${name} <#if interface??> implements ${interface}</#if>{
	<#if membervariablelist??>
	<#list membervariablelist as membervariable>
	private ${membervariable};
	</#list>
	</#if>
	
	
	<#if interface??> 
	@Override
	public ${overriddenmethod} {
		${overriddenmethodbody}
	}
	</#if>


	<#if getters??>
	<#list getters?keys as key>
	public ${key} {
		${getters[key]};
	}
	</#list>
	</#if>
	
	<#if setters??>
	<#list setters?keys as key>
	public void ${key} {
		${setters[key]};
	}
	</#list>
	</#if>
}