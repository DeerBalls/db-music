<%@ page import="com.db.res.Tag" %>



<div class="fieldcontain ${hasErrors(bean: tagInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="tag.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${tagInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: tagInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="tag.type.label" default="Type" />
		
	</label>
	<g:textField name="type" value="${tagInstance?.type}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: tagInstance, field: 'note', 'error')} ">
	<label for="note">
		<g:message code="tag.note.label" default="Note" />
		
	</label>
	<g:textField name="note" value="${tagInstance?.note}"/>
</div>

