package ${package};


<#if classPackages??>
<#list classPackages as classPackage>
import ${classPackage};
</#list>
</#if>

@SpringBootApplication
@RestController
<#if classAnnotations??>
	<#list classAnnotations as classAnnotation>
     	@${classAnnotation}
	</#list>
</#if>
public class ${name}
{

public static void main(String[] args) {
		SpringApplication.run(${name}.class, args);
	}

@GetMapping("/")
public ${return} ${methodname}(${params})
{
   ${body}
       return ${val}
}

}