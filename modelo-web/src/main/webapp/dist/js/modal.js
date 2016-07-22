/*
    @autor	: 	André Luz da Silva
    @email	:	andre@f1solucoes.com.br
    @nome	: 	ModalF1
    @data	:	03/02/2011
    @versao	:	00001
*/

/*
 * 	IMPORTANTE
 * 	Leia no final deste documento
 * 	como chamar a modal
 */

//criando o plugin
$.fn.extend({
    modal: function(opcoes){

        //criando o objeto
        var $div = $('<div>').attr("class", "modal");
        var $content = $('<iframe frameborder="0">');

        //link fechar
        var $link = $('<div class="fechar"><a class="close" title="Fechar"></a></div>');
        var $salvar = $('.actions');

        /*
         * 	Lista de Itens a serem customizados
         * 	de acordo como a modal deva aparecer
         */
        var itens = {
            largura: 400,//largura da modal
            altura: 250,//altura da modal
            opacidade:0.9,//controle da intencidade da cor de fundo da modal
            background: '#000000',//cor de fundo da modal
            botaoFechar: 'url(img/bt-close.png) no-repeat',//imagem de fechar a modal
            posicao: 'right',//posicao da imagem que fecha a modal
            btFecharLargura: '48px',//largura do botão que fecha a modal
            btFecharAltura: '48px',//altura do botão que fecha a modal
            btOffsetX: '-13px',//posição X do botão q fecha a modal
            btOffsetY: '-24px'//posição Y do botão q fecha a modal
        };

        //extendo o objeto
        opcoes = $.extend(itens, opcoes);

        //largura e altura da tela e do documento
        var docH = $(document).height();
        var docW = $(document).width();

        var screenW = $(window).width();
        var screenH = $(window).height();

        //aki começa a folia
        this.unbind('click');
        this.live('click', function(e){
            e.preventDefault();

            //url da pagina a ser aberta
            var url = $(this).attr('href');

            $div.prependTo('body');
            $div.css({
                'background': opcoes.background,
                'opacity': opcoes.opacidade,
                'width': docW,
                'height': docH,
                'position': 'fixed',
                'z-index': 999,
                'top': 0,
                'left': 0
            });

            //efeito de aparecer e sumir modal
            $div.fadeIn(1000);
            $div.fadeTo('slow', opcoes.opacidade);

            //div fechar envolvendo o conteudo
            $content.appendTo($link);

            //modal envolvendo tudo
            $link.appendTo('body');
            $link.after($div);

            //customizando o conteudo
            $link.css({
                'zIndex':9999,
                'width': opcoes.largura,
                'height':opcoes.altura,
                'position': 'fixed',
                'textAlign': 'right',
                'display':'block'
            });

            $link.css({
                'left':screenW/2 - $link.width()/2
            });

            //animação
            $link.animate({
                'top': screenH/2 - $link.height() / 2
            });

            $link.find('a.close').fadeIn(1000);
            $link.find('a.close').css({
                'background': opcoes.botaoFechar,
                'display': 'block',
                'overflow': 'hidden',
                'textIndent': '-9000em',
                'float': opcoes.posicao,
                'position': 'absolute',
                'cursor': 'pointer',
                'width': opcoes.btFecharLargura,
                'height': opcoes.btFecharAltura,
                'backgroundPosition': 'right',
                'right': opcoes.btOffsetX,
                'top': opcoes.btOffsetY,
                'zIndex':99999
            });


            //iframe
            $content.attr({
                'hspace': '0',
                'src': url,
                'allowTransparency': 'true',
                'border':0
            });

            //centraliza conteudo
            $content.css({
                'border': 'none',
                'position':'fixed',
                'top': screenH/2 - $link.height() / 2,
                'left':screenW/2 - $link.width()/2,
                'width': opcoes.largura,
                'height': opcoes.altura
            });
        });

        //ocultando a modal
        $div.click(function(){
            $(this).fadeOut();
            $link.css('display','none');
        });

        //fechando a modal com o botao esc
        $('body').keydown(function(e){
            var windows = (navigator.appVersion.indexOf('Windows') != -1) ? 'windows' : 'linux';
            if (windows && e.keyCode == 27) {
                $div.fadeOut();
                $link.css('display','none');
            }
            else
            if (e.keyCode == 1) {
                $div.fadeOut();
                $link.css('display','none');
            }
        });

        //fechando a modal com o botao close
        $link.find('a.close').bind('click', function(){
            $div.fadeOut();
            $link.css('display','none');
        });


    }//fim da function modal

});//fim do plugin

/* chamada padrao da modal,
 * crie um arquivo js e
 * customize de acordo a sua necessidade,
 * alterando sempre a lista
 * de Itens que compõe a modal
 */
$(function(){

    /****************************************************************************
     * Se o projeto for "croogo"
     * para pegar o caminho das imagens
     * utilize o
     * Croogo.basePath
     * ex:botaoFechar:'url('+Croogo.basePath+'img/bt-close.png) no-repeat'
     *
     * Agora se for outro tipo de projeto
     * verefique como eh buscado o 'PATH'.
     *
     * ex:
     * var path = PATH.basename + '/';
     * botaoFechar:'url('+path+'img/bt-close.png) no-repeat'
     *****************************************************************************/

    /***
         * Exemplo
         *
            $('class|id').modal({
                    largura: 400,
                    altura: 200,
                    opacidade:0.9,
                    background: '#000000',
                    botaoFechar: 'url(../img/bt-close.png) no-repeat',
                    posicao: 'right',
                    btFecharLargura: '48px',
                    btFecharAltura: '48px',
                    btOffsetX: '-13px',
                    btOffsetY: '-24px'
            });
         **/

});
