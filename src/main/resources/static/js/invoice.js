$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href, function(invoice, status){
			$('#idEdit').val(invoice.id);
			var invoiceDate=invoice.invoiceDate.substr(0,10);
			$('#dateEdit').val(invoiceDate);
			$('#ddlInvoiceStatusEdit').val(invoice.invoicestatusid);
			$('#ddlClientEdit').val(invoice.clientid);
			$('#remarksEdit').val(invoice.remarks);
		
		});
		
		$('#editModal').modal();
		
	});
	
	
	$('table #detailsButton').on('click', function(event){
		
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href,function(invoice, status){
		   $('#idDetails').val(invoice.id);
			var invoiceDate=invoice.invoiceDate.substr(0,10);
			$('#dateDetails').val(invoiceDate);
			$('#ddlInvoiceStatusDetails').val(invoice.invoiceStatus.description);
			$('#ddlClientDetails').val(invoice.client.name);
			$('#remarksDetails').val(invoice.remarks);
		});
		
		
		$('#detailsModal').modal();
	});
	

	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #confirmDeleteButton').attr('href', href);
		$('#deleteModal').modal();		
	});
	
});