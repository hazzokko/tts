(function($){  
  $(window).on("load",function(){
      $(".js-scroll").mCustomScrollbar({
        theme: "dark-3",
      });
  });

  // 팝업
	$(document).on("click", ".js-pop-open", function(){
		var thisPopup = $(this).attr("data-target");
		$(thisPopup).css("display", "flex");
	});
	$(document).on("click", ".js-pop-close", function(){
		var thisPopup = $(this).closest(".popup_wrap");
		$(thisPopup).hide();
	});

  // 자동평가 클릭
  $(document).on("click", ".js-eval-auto", function(){
    $(this).parent(".content_tab_mini__item").addClass("_on");
    $(this).parent().siblings().removeClass("_on");
    $(".js-on-001").removeClass("--on");
  });

  // 수동평가 클릭
  $(document).on("click", ".js-eval-manu", function(){
    $(this).parent(".content_tab_mini__item").addClass("_on");
    $(this).parent().siblings().removeClass("_on");

    $(".js-on-001").addClass("--on");
    $(".js-ta-disabled").removeAttr("disabled");
    
  });

  // on-off
  $(document).on("click", ".js-on-off", function(){
    var thisTarget = $(this).attr("data-target");
    $("[data-this-target="+thisTarget+"]").addClass("--on");
  });
  
})(jQuery);