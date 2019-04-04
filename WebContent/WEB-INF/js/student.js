$(function(){
	var pageNO = $("#toPref").val();
	var lastPage = $("#toLast").val();
	if(pageNO == 1){
		$("#page2,#page3").hide()
	}
	if(pageNO == lastPage){
		$("#page4,#page5").hide()
	}

	$("#box2").keydown(function() {
		if (event.keyCode == "13") {
			var inputID =$("#findPageNO").val();
			if(inputID==null || inputID==""){
	                return false;
			}else{
				var id =/^[0-9]+$/;
				if(!id.tesr(inputID)){
					return false;
				}else{
					$("#findPage").submit();
				}

			}
		}
	});

	$("#findButton").click(function(){
		var inputID =$("#findPageNO").val();
		if(inputID==null || inputID==""){
                return false;
		}else{
			var id =/^[0-9]+$/;
			if(!id.test(inputID)){
				return false;
			}else{
				$("#findPage").submit();
			}

		}

	})

});

