$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href, function(vehicleStatus, status){
			$('#idEdit').val(vehicleStatus.id);
		
			$('#descriptionEdit').val(vehicleStatus.description);
			$('#detailsEdit').val(vehicleStatus.details);
			
			
		});
		
		$('#editModal').modal();
		
	});
	
	
	$('table #detailsButton').on('click', function(event){
		
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href,function(vehicleStatus, status){
		    $('#idDetails').val(vehicleStatus.id);
		
			$('#descriptionDetails').val(vehicleStatus.description);
			$('#detailsDetails').val(vehicleStatus.details);
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