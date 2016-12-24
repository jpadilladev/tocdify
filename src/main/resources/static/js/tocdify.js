var tocdify = (function(){
	
	var tabListeners  = function(linkObj, defaultLink){
		for(var linkElement in linkObj){
			var tabElement = linkObj[linkElement];
			if(linkElement === defaultLink){
				$("#"+linkElement).attr("class", "active");
				$("#"+tabElement).show();
			} else {
				$("#"+linkElement).attr("class", "");
				$("#"+tabElement).hide();
			}
			$("#"+linkElement).click(function(){
				for(var link in linkObj){
					var el = linkObj[link];
					$("#"+el).hide();
					$("#"+link).attr("class", "");
					if($(this).attr("id") === link){
						$("#"+el).show();
						$("#"+link).attr("class", "active");
					}
				}
			});
		}
		
	};
	
	return {
		tabListeners : tabListeners
	};
	
})();