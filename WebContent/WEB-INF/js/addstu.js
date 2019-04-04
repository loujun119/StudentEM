$(function(){
	$("#bot").keydown(function() {
        if (event.keyCode == "13") {//keyCode=13是回车键
        	var inputname = $("#addname").val();
        	inputname = $.trim(inputname);
        	var inputbirthday = $("#addbirthday").val();
        	inputbirthday = $.trim(inputbirthday);
        	var inputage = $("#addage").val();
        	inputage = $.trim(inputage);
        	var inputscore = $("#addscore").val();
        	inputscore = $.trim(inputscore);
        	var inputclassid = $("#addclassid").val();
        	inputclassid = $.trim(inputclassid);

        	if(inputname==null || inputname==""){
        		alert("学生の名前を入力してください");
        		return false;
        	}else{
        		var putnameval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
    			if(!putnameval.test($("#addname").val())){
    				alert("数字が使えません");
    				return false;
        	}else{
        		if(inputbirthday==null || inputbirthday==""){
            		alert("学生の生年月日を入力してください");
            		return false;
        	}else{
        		var putbirval = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
    			if(!putbirval.test($("#addbirthday").val())){
    				alert("yyyy-mm-ddとおりに入力してください");
    				return false;
        	}else{
        		if(inputage==null || inputage==""){
            		alert("学生の年齢を入力してください");
            		return false;
        	}else{
        		var putageval = /^[0-9]+$/;
    			if(!putageval.test($("#addage").val())){
    				alert("数字を入力してください");
    				return false;
        	}else{
        		if(inputscore==null || inputscore==""){
            		alert("学生の成績を入力してください");
            		return false;
        	}else{
        		var putscoreval = /^(([^0][0-9]+|0)\.([0-9]{1,2})$)|^(([^0][0-9]+|0)$)|^(([1-9]+)\.([0-9]{1,2})$)|^(([1-9]+)$)/;
    			if(!putscoreval.test($("#addscore").val())){
    				alert("数字を入力してください");
    				return false;
        	}else{
        		if(inputclassid==null || inputclassid==""){
            		alert("学生のクラスナンバーを入力してください");
            		return false;
        	}else{
        		var putclassidval = /^[0-9]+$/;
    			if(!putclassidval.test($("#addclassid").val())){
    				alert("数字を入力してください");
    				return false;
        	}else{
        		alert("ok");
				$("#addStudent").submit();
        	}
        	}
        	}
        	}
        	}
        	}
        	}
        	}
        	}
        	}

        }
    });


	$("#bot").click(function(){
		var inputname = $("#addname").val();
    	inputname = $.trim(inputname);
    	var inputbirthday = $("#addbirthday").val();
    	inputbirthday = $.trim(inputbirthday);
    	var inputage = $("#addage").val();
    	inputage = $.trim(inputage);
    	var inputscore = $("#addscore").val();
    	inputscore = $.trim(inputscore);
    	var inputclassid = $("#addclassid").val();
    	inputclassid = $.trim(inputclassid);

    	if(inputname==null || inputname==""){
    		alert("学生の名前を入力してください");
    		return false;
    	}else{
    		var putnameval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
			if(!putnameval.test($("#addname").val())){
				alert("数字が使えません");
				return false;
    	}else{
    		if(inputbirthday==null || inputbirthday==""){
        		alert("学生の生年月日を入力してください");
        		return false;
    	}else{
    		var putbirval = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
			if(!putbirval.test($("#addbirthday").val())){
				alert("yyyy-mm-ddとおりに入力してください");
				return false;
    	}else{
    		if(inputage==null || inputage==""){
        		alert("学生の年齢を入力してください");
        		return false;
    	}else{
    		var putageval = /^[0-9]+$/;
			if(!putageval.test($("#addage").val())){
				alert("数字を入力してください");
				return false;
    	}else{
    		if(inputscore==null || inputscore==""){
        		alert("学生の成績を入力してください");
        		return false;
    	}else{
    		var putscoreval = /^(([^0][0-9]+|0)\.([0-9]{1,2})$)|^(([^0][0-9]+|0)$)|^(([1-9]+)\.([0-9]{1,2})$)|^(([1-9]+)$)/;
			if(!putscoreval.test($("#addscore").val())){
				alert("数字を入力してください");
				return false;
    	}else{
    		if(inputclassid==null || inputclassid==""){
        		alert("学生のクラスナンバーを入力してください");
        		return false;
    	}else{
    		var putclassidval = /^[0-9]+$/;
			if(!putclassidval.test($("#addclassid").val())){
				alert("数字を入力してください");
				return false;
    	}else{
    		alert("ok");
			$("#addStudent").submit();
    	}
    	}
    	}
    	}
    	}
    	}
    	}
    	}
    	}
    	}

	})
//ajax验证姓名
/*
 * 1.导入jQuery库
 * 2.获取 name="name"的元素节点
 * 3.为该节点添加 change事件，当name状态发送变化时发起请求
 * 3.1获取name的value属性值，去除前后空格后且不为空，准备发送ajax请求
 * 3.2发送ajax请求，检验name是否可用
 * 3.3在controller验证完成后，直接返回一个html片段
 * 3.4在jsp页面把其直接添加到#checkname的html中。
 */

	$(":input[name='name']").change(function(){
		var stuname = $(this).val();
		stuname = $.trim(stuname);
		if(stuname !=null || stuname !=""){
			var url="checkStudentName.do";
			var args = {"studentName":stuname,"time":new Date()};
			$.post(url,args,function(data){
				$("#checkname").html(data);
			})
		}
	})


});