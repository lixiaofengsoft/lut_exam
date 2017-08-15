$(document).ready(function() {

	$('.pagination').jqPagination({
		link_string	: 'nihao?page={page_number}',
		max_page	: 10,
		paged		: function(page) {
			$('.log').prepend('<li>Requested page ' + page + '</li>');
		}
	});

});