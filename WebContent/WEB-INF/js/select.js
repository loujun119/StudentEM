$(function(){

	$("#bot").keydown(function() {
        if (event.keyCode == "13") {//keyCode=13是回车键

        	var input = $("#mesId").val();
        	input = $.trim(input);
    		if(input==null||input==""){
    			alert("学生のIDを入力してください");
    			return false;
    		}else{
    			var putval = /^[0-9]+$/;
    			if(!putval.test(input)){
    				alert("数字を入力してください");
    				return false;
    			}else{
    				alert("ok");
    				$("#selId").submit();
    			}
    		}
        }
    });

	$("#bot").click(function(){
		var input = $("#mesId").val();
    	input = $.trim(input);
		if(input==null||input==""){
			alert("学生のIDを入力してください");
			return false;
		}else{
			var putval = /^[0-9]+$/;
			if(!putval.test(input)){
				alert("数字を入力してください");
				return false;
			}else{
				alert("ok");
				$("#selId").submit();
			}
		}
	})

	$("#bot1").keydown(function() {
        if (event.keyCode == "13") {//keyCode=13是回车键

        	var input = $("#mesname").val();
    		if(input==null||input==""){
    			alert("学生の名前を入力してください");
    			return false;
    		}else{
    			var putval =  /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
    			if(!putval.test($("#mesname").val())){
    				alert("数字が使えません");
    				return false;
    			}else{
    				alert("ok");
    				$("#selName").submit();
    			}
    		}
        }
    });

	$("#bot1").click(function(){
		var input = $("#mesname").val();
		if(input==null||input==""){
			alert("学生の名前を入力してください");
			return false;
		}else{
			var putval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
			if(!putval.test($("#mesname").val())){
				alert("数字が使えません");
				return false;
			}else{
				alert("ok");
				$("#selName").submit();
			}
		}
	})

});