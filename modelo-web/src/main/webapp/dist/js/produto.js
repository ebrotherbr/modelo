$(document).ready(function(){
	try {
		// chamando a classe Projeto
		Produto._init();
	}
	catch(e){
		txt = "Existe um erro nessa página.\n\n";
  		txt += "Descrição do erro: " + e.message + "\n\n";
  		console.log(txt);
	}
});


Produto = {
	_init:function() {
		Produto._makeZoonable();
		Produto._clickProductZoom();
		Produto._carrossel();
		Produto._starRating();
	},
	_makeZoonable:function() {
		$(".zoomImage").jqzoom({
	        xzoom: 200,
	        yzoom: 200,
	        offset: 10,
	        position: "right",
	        zoomWidth: 450,
	        zoomHeight: 450,
	        preloadText: 'Carregando zoom',
	        title: false,
	        showPreload: false,
			alwaysOn:false
		});
	},
	_carrossel:function() {
			$('.jsCarrossel').bxSlider({
				slideWidth:326,
		    	minSlides: 3,
		    	maxSlides: 3,
				moveSlides: 2,
		    	pager:false,
		    	infiniteLoop: true
			});
		$(".bx-controls-direction").appendTo('.jsNavCarousel')
	},
	_clickProductZoom:function() {
		$(".jsNavCarousel li a").bind("click",function(){
			src_resize = $(this).find("img").attr("src").replace(/45/, "160").replace(/31/, "210");
		    src_noresize = $(this).attr("href").replace(/^68$/g, "1").replace(/false/, "true");
		    var title = $(this).attr("title");
		    var img = $('<img>').attr({ 'alt': 'Foto', 'src': src_resize, 'title': title,'width':'209','height':'139' });
		    var link = $('<a>').attr({ 'class': 'zoomImage', 'title': title, 'href': src_noresize });
		    link.append(img);
		    $(".imageWrapper").empty().append(link);
		   Produto._makeZoonable();
		});
		$(".boxCarousel li a").click(function(e) {
			e.preventDefault();
			$(".tt-destaque").text($(this).attr("title"));
		});

		Produto._makeZoonable();
	},
	_starRating:function() {
		$('.star').rating();
	}
}