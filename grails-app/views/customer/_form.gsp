<%@ page import="com.area_b.samples.Customer" %>



<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="customer.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${customerInstance?.name}"/>
</div>

