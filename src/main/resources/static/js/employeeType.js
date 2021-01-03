$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href, function(employeeType, status){
			$('#idEdit').val(employeeType.id);
		
			$('#descriptionEdit').val(employeeType.description);
			$('#detailsEdit').val(employeeType.details);
			
			
		});
		
		$('#editModal').modal();
		
	});
	
	
	$('table #detailsButton').on('click', function(event){
		
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href,function(employeeType, status){
		    $('#idDetails').val(employeeType.id);
		
			$('#descriptionDetails').val(employeeType.description);
			$('#detailsDetails').val(employeeType.details);
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