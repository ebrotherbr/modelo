var Projeto = {
	// inicializando os metodos do projeto
	_init:function() {
		Projeto._jsJumpCep();
		Projeto._detalhePedidos();
		Projeto._cartoes();
		Projeto._menuPrincipalQtdLinks();
		Projeto._bannerTopo();
		Projeto._menuCompras();
		Projeto._addressChoice();
		Projeto._faq();
		Projeto._comboBox();
		Projeto._pie();
		Projeto._indique();
		Projeto._prazo();
		Projeto._aviseMe();
		Projeto._esqueciSenha();
		Projeto._chrome();
		Projeto._jsPlaceholder();
		Projeto._hoverPagination();
		Projeto._focusPagination();
	},
	_jsJumpCep:function() {
		$(".jsNumber").each(function() {
			$(this).Jumper();
		});
	},
	//exibindo e escondendo a sub tabela de historico de pedidos
	_detalhePedidos:function() {
		$(".seeDetails").each(function(i) {
			$(this).click(function(e) {
				e.preventDefault();

					if($(".viewDetails").eq(i).is(":hidden")) {
						$(".viewDetails").eq(i).show();
					}
					else {
						$(".viewDetails").eq(i).hide();
					}
			});
		});
	},
	//alternando na escolha dos cartoes
	_cartoes:function() {
		$(".card ul li a").each(function(i){
			$(this).click(function(e) {
				e.preventDefault();
					switch(i){
						case 0:
							$(".card ul").css("backgroundPosition","0 0px")
						break;

						case 1:
							$(".card ul").css("backgroundPosition","0 -180px")
						break;

						case 2:
							$(".card ul").css("backgroundPosition","0 -361px")
						break;

						case 3:
							$(".card ul").css("backgroundPosition","0 -539px")
						break;

						default:
							$(".card ul").css("backgroundPosition","0 0px")
						break;
					}
			})
		});
	},
	//determinando espaçamento entre links do menu institucional
	_menuPrincipalQtdLinks:function() {
		elements 			= $(".menuInstitutional ul li a");
		var wMenu 			= $(".menuInstitutional ul").width();
		var qtdLinksMenu 	= elements.length;
		var sum 			= 0;
		elements.each(function() {
			sum = sum + $(this).width();
		});
		var padding = parseInt((wMenu - sum) / qtdLinksMenu / 2);
		elements.css('padding', '0px ' + padding + 'px');
	},
	//banner topo
	_bannerTopo:function() {
		try {
			$('.banners').bxSlider({
				moveSlides: 1,
		    	pager:true,
		    	controls:false,
		    	infiniteLoop: true,
		    	auto:true
		 });

		}catch(e){}
	},
	// migalha processo de compra
	_menuCompras:function() {
		var classe = $(".navPurchase ul li a[rel='ativo']").attr('data-name');
		try{
			switch(classe){
				case "carrinho":
					$(".navPurchase").css('backgroundPosition','0 0');
				break;

				case "identificacao":
					$(".navPurchase").css('backgroundPosition','0 -83px');
				break;

				case "entrega":
					$(".navPurchase").css('backgroundPosition','0 -166px');
				break;

				case "pagamento":
					$(".navPurchase").css('backgroundPosition','0 -249px');
				break;

				case "confirmacao":
					$(".navPurchase").css('backgroundPosition','0 -332px');
				break;

				default:
					$(".navPurchase").css('backgroundPosition','0 0');
				break;
			}
		}catch(e){}
	},
	//retirando a margem dos boxes de endereço, que ficam ao lado direito do box
	_addressChoice:function() {
		$(".choice div:odd").css({
			'margin':'0',
			'float':'right'
		});
	},
	//efeito corrediço das perguntas frequentes(faq)
	_faq:function() {
		$('dd',"#faq").css('display','none');
		$("dt","#faq").each(function(i) {
	    	$(this).click(function(e) {
	        	var alvo = e.target;
	        	if($(alvo).next('dd').is(':visible')){
	            	$(this).next('dd').slideUp()
	        	}
				else {
	           		$(this).next('dd').slideDown()
	           		$(this).siblings('dt').next('dd').slideUp()
	        	}
	    	})
		});
	},
	//chamando script para estilização de campo select
	_comboBox:function() {
		try {
			$(".selSearch select").styleCombobox({
	    		classFocus:"comboboxFocus"
	  		});
	  		$("span",$(".selSearch")).addClass('colWhite');
		}catch(e) {}
	},
	//plugin para aplicar sombra e curvas no ie
	_pie:function() {
		try {
			if (window.PIE) {
				$('.rounded').each(function() {
					PIE.attach(this);
	            });
	        }
	    }catch(e){}
	},
	// Modais
	_indique:function(){
		try	{
			$(".jsIndicate").colorbox();
		}catch(message){console.log(message);}
	},
	_prazo:function(){
		try	{
			$(".jsCalcTerm").colorbox();
		}catch(message){console.log(message);}
	},
	_aviseMe:function(){
		try	{
			$(".jsNotifyMe").colorbox();
		}catch(e){}
	},
	_esqueciSenha:function() {
		try	{
			$(".jsForgotPassword").colorbox();
		}catch(e){}
	},
	//adicionando classe ao chrome, caso precise por medidas de incompatibilidade
	_chrome:function() {
		if(navigator.userAgent.indexOf('Chrome') != -1) {
			$("html").addClass("chrome");
		}
	},
	//adicionando atributo de placeholder ao ie7+
	_jsPlaceholder:function() {
		try {
			$(function() {
				if(!$.support.placeholder) {
					var active = document.activeElement;
					//type text
					$(':text').focus(function () {
						if ($(this).attr('placeholder') != '' && $(this).val() == $(this).attr('placeholder')) {
							$(this).val('').removeClass('hasPlaceholder');
						}
						}).blur(function () {
						if ($(this).attr('placeholder') != '' && ($(this).val() == '' || $(this).val() == $(this).attr('placeholder'))) {
							$(this).val($(this).attr('placeholder')).addClass('hasPlaceholder');
						}
					});
					$(':text').blur();
					//type textarea
					$('textarea').focus(function () {
						if ($(this).attr('placeholder') != '' && $(this).val() == $(this).attr('placeholder')) {
							$(this).val('').removeClass('hasPlaceholder');
						}
						}).blur(function () {
						if ($(this).attr('placeholder') != '' && ($(this).val() == '' || $(this).val() == $(this).attr('placeholder'))) {
							$(this).val($(this).attr('placeholder')).addClass('hasPlaceholder');
						}
					});
					$('textarea').blur();
					//type password
					$(':password').focus(function () {
						if ($(this).attr('placeholder') != '' && $(this).val() == $(this).attr('placeholder')) {
							$(this).val('').removeClass('hasPlaceholder');
						}
						}).blur(function () {
						if ($(this).attr('placeholder') != '' && ($(this).val() == '' || $(this).val() == $(this).attr('placeholder'))) {
							$(this).val($(this).attr('placeholder')).addClass('hasPlaceholder');
						}
					});
					$(':password').blur();

					$(active).focus();
					$('form').submit(function () {
						$(this).find('.hasPlaceholder').each(function() { $(this).val(''); });
					});
				}
			});
		}catch(e) {console.log(e);}
	},
	// adicionando classe de evento hover aos elementos de paginação
	_hoverPagination:function() {
		$("a",$(".listPagination")).hover(
			function() {$(this).removeClass('colPrimaryFive').addClass('colPrimaryOne')},
			function() {$(this).removeClass('colPrimaryOne').addClass('colPrimaryFive')}
		);
	},
	// adicionando classe de evento focus aos elementos de paginação
	_focusPagination:function() {
		$("a",$(".listPagination"))
		.focus(
			function() {
				$(this).removeClass('colPrimaryFive').addClass('colSecondary')
			})
		.blur(
			function() {
				$(this).removeClass('colSecondary').addClass('colPrimaryFive')
			});
	}
}

//plugin para saltar os campos de cep e variantes
$.fn.extend({
    Jumper:function(itens) {
        var objeto      = {},
        me              = $(this),
        irmao           = me.next("input"),
        tio             = me.parent().next(),
        itens           = $.extend(objeto,itens);

        me.each(function(i) {
            var max = me.attr('maxlength');
            me.keyup(function() {
                if(me.val().length == max) {
                    if(irmao.length == 0) {
                        tio.find("input:first").focus();
                    }
                    else {
                        irmao.focus();
                    }
                }
            });
        });
    }
});
// chamando os metodos do Projeto
$(document).ready(function() {
	try {
		// chamando a classe Projeto
		Projeto._init();
	}
	catch(e){
		txt = "Existe um erro nessa página.\n\n";
  		txt += "Descrição do erro: " + e.message + "\n\n";
  		console.log(txt);
	}
});
