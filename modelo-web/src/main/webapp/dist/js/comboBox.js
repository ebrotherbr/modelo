(function($) {
//GLOBAL VARIABLES
 var
 	ie = navigator.userAgent.indexOf('IE') != -1,
 	ie6 = navigator.appVersion.indexOf("MSIE 6.0") != -1;

	$.fn.extend({

		// Combobox replace
		styleCombobox: function(options) {
			// IE6
			if (ie && parseInt(ie6) == 6 && typeof window['XMLHttpRequest'] != "object")
				return;

			// Init
			var $selector = $(this),
				classFocus = options.classFocus;

			$selector.each(function() {
				var $combo = $(this),
					initialValue = $combo.attr("title") ? $combo.attr("title") : $combo.find("option:selected").text();

				$combo.css("position","relative").before('<span>'+ initialValue +'</span>');
			});

			$selector.bind("change keypress keydown keyup",function() {
				$(this).prev().html($(this).find("option:selected").text());
			});

			$selector.focus(function() {
				$(this).parent().addClass(classFocus);
			}).blur(function() {
				$(this).parent().removeClass(classFocus);
			});
		}
	});
})(jQuery);