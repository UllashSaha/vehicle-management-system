$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href, function(vehicleModel, status){
			$('#idEdit').val(vehicleModel.id);
		
			$('#descriptionEdit').val(vehicleModel.description);
			$('#detailsEdit').val(vehicleModel.details);
			
			
		});
		
		$('#editModal').modal();
		
	});
	
	
	$('table #detailsButton').on('click', function(event){
		
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href,function(vehicleModel, status){
		    $('#idDetails').val(vehicleModel.id);
			
			$('#descriptionDetails').val(vehicleModel.description);
			$('#detailsDetails').val(vehicleModel.details);
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