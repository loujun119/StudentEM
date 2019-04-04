$(function(){
	$("#box2").keydown(function() {
        if (event.keyCode == "13") {//keyCode=13是回车键
        	var inputid = $("#upid").val();
        	var inputname = $("#upname").val();
        	var inputbirthday = $("#upbir").val();
        	var inputage = $("#upage").val();
        	var inputscore = $("#upscore").val();
        	var inputclassid = $("#upclassid").val();

        	if(inputid==null ||inputid==""){
        		alert("学生のIDを入力してください");
        		return false;
        	}else{
        		var putidval = /^[0-9]+$/;
        		if(!putidval.test($("#upid").val())){
        			alert("数字を入力してください");
    				return false;
        		}else{
        	      	if(inputname==null || inputname==""){
                		alert("学生の名前を入力してください");
                		return false;
                	}else{
                		var putnameval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
            			if(!putnameval.test($("#upname").val())){
            				alert("数字が使えません");
            				return false;
                	}else{
                		if(inputbirthday==null || inputbirthday==""){
                    		alert("学生の生年月日を入力してください");
                    		return false;
                	}else{
                		var putbirval = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
            			if(!putbirval.test($("#upbir").val())){
            				alert("yyyy-mm-ddとおりに入力してください");
            				return false;
                	}else{
                		if(inputage==null || inputage==""){
                    		alert("学生の年齢を入力してください");
                    		return false;
                	}else{
                		var putageval = /^[0-9]+$/;
            			if(!putageval.test($("#upage").val())){
            				alert("数字を入力してください");
            				return false;
                	}else{
                		if(inputscore==null || inputscore==""){
                    		alert("学生の成績を入力してください");
                    		return false;
                	}else{
                		var putscoreval = /^(([^0][0-9]+|0)\.([0-9]{1,2})$)|^(([^0][0-9]+|0)$)|^(([1-9]+)\.([0-9]{1,2})$)|^(([1-9]+)$)/;
            			if(!putscoreval.test($("#upscore").val())){
            				alert("数字を入力してください");
            				return false;
                	}else{
                		if(inputclassid==null || inputclassid==""){
                    		alert("学生のクラスナンバーを入力してください");
                    		return false;
                	}else{
                		var putclassidval = /^[0-9]+$/;
            			if(!putclassidval.test($("#upclassid").val())){
            				alert("数字を入力してください");
            				return false;
                	}else{
                		alert("ok");
        				$("#upStudent").submit();
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
        	}

        }
    });


	$("#upSub").click(function(){
    	var inputid = $("#upid").val();
    	var inputname = $("#upname").val();
    	var inputbirthday = $("#upbir").val();
    	var inputage = $("#upage").val();
    	var inputscore = $("#upscore").val();
    	var inputclassid = $("#upclassid").val();

    	if(inputid==null ||inputid==""){
    		alert("学生のIDを入力してください");
    		return false;
    	}else{
    		var putidval = /^[0-9]+$/;
    		if(!putidval.test($("#upid").val())){
    			alert("数字を入力してください");
				return false;
    		}else{
    	      	if(inputname==null || inputname==""){
            		alert("学生の名前を入力してください");
            		return false;
            	}else{
            		var putnameval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
        			if(!putnameval.test($("#upname").val())){
        				alert("数字が使えません");
        				return false;
            	}else{
            		if(inputbirthday==null || inputbirthday==""){
                		alert("学生の生年月日を入力してください");
                		return false;
            	}else{
            		var putbirval = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        			if(!putbirval.test($("#upbir").val())){
        				alert("yyyy-mm-ddとおりに入力してください");
        				return false;
            	}else{
            		if(inputage==null || inputage==""){
                		alert("学生の年齢を入力してください");
                		return false;
            	}else{
            		var putageval = /^[0-9]+$/;
        			if(!putageval.test($("#upage").val())){
        				alert("数字を入力してください");
        				return false;
            	}else{
            		if(inputscore==null || inputscore==""){
                		alert("学生の成績を入力してください");
                		return false;
            	}else{
            		var putscoreval = /^(([^0][0-9]+|0)\.([0-9]{1,2})$)|^(([^0][0-9]+|0)$)|^(([1-9]+)\.([0-9]{1,2})$)|^(([1-9]+)$)/;
        			if(!putscoreval.test($("#upscore").val())){
        				alert("数字を入力してください");
        				return false;
            	}else{
            		if(inputclassid==null || inputclassid==""){
                		alert("学生のクラスナンバーを入力してください");
                		return false;
            	}else{
            		var putclassidval = /^[0-9]+$/;
        			if(!putclassidval.test($("#upclassid").val())){
        				alert("数字を入力してください");
        				return false;
            	}else{
            		alert("ok");
    				$("#upStudent").submit();
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
    	}

	})

	$("#box3").keydown(function() {
        if (event.keyCode == "13") {
        	var putid= $("#StuId").val;
        	var putcode= $("#PostalCode").val;
        	var putaddress= $("#Address").val;
        	if(putid==null||putid==""){
        		alert("学生のIDを入力してください");
        		return false;
        	}else{
        		var putidval = /^[0-9]+$/;
        		if(!putidval.test($("#StuId").val())){
        			alert("数字を入力してください");
    				return false;
        	}else{
        		if(putcode==null|putcode==""){
        			alert("学生の郵便番号を入力してください");
            		return false;
        		}else{
        			var putcodeval = /[0-9]{3}-?[0-9]{4}/;
            		if(!putcodeval.test($("#PostalCode").val())){
            			alert("郵便番号をチェックしてください");
        				return false;
        		}else{
        			if(putaddress==null||putaddress==""){
        				alert("学生の住所を入力してください");
        				return false;
        			}else{
        				var addressval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
                		if(!addressval.test($("#Address").val())){
                			alert("学生の住所をチェックします");
            				return false;
        			}else{
        				alert("ok");
        				$("#upaddress").submit();
        			}
        			}

        		}
        		}
        	}
        	}

        }
	});


	$("#addSub").click(function(){
    	var putid= $("#StuId").val;
    	var putcode= $("#PostalCode").val;
    	var putaddress= $("#Address").val;
    	if(putid==null||putid==""){
    		alert("学生のIDを入力してください");
    		return false;
    	}else{
    		var putidval = /^[0-9]+$/;
    		if(!putidval.test($("#StuId").val())){
    			alert("数字を入力してください");
				return false;
    	}else{
    		if(putcode == null || putcode == ""){
    			alert("学生の郵便番号を入力してください");
        		return false;
    		}else{
    			var putcodeval =/[0-9]{3}-?[0-9]{4}/;
        		if(!putcodeval.test($("#PostalCode").val())){
        			alert("郵便番号をチェックしてください");
    				return false;
    		}else{
    			if(putaddress==null||putaddress==""){
    				alert("学生の住所を入力してください");
    				return false;
    			}else{
    				var addressval = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
            		if(!addressval.test($("#Address").val())){
            			alert("学生の住所をチェックします");
        				return false;
    			}else{
    				alert("ok");
    				$("#upaddress").submit();
    			}
    			}

    		}
    		}
    	}
    	}
	});


});