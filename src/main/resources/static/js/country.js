
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href, function(country, status){
			
			$('#editId').val(country.id);
			$('#editDescription').val(country.description);
			$('#editCapital').val(country.capital);
			$('#editCode').val(country.code);
			$('#editContinent').val(country.continent);
			$('#editNationality').val(country.nationality);
			
		});
		
		$('#editModal').modal();
		
	});
	
	
	
	
	$('table #detailsButton').on('click', function(event){
		
		event.preventDefault();
		
		var href=$(this).attr('href');
		
		$.get(href, function(country, status){
		    $('#detailsId').val(country.id);
			$('#detailsDescription').val(country.description);
			$('#detailsCapital').val(country.capital);
			$('#detailsCode').val(country.code);
			$('#detailsContinent').val(country.continent);
			$('#detailsNationality').val(country.nationality);
			
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