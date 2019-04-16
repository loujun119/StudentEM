$(function() {
	var pageNO = $("#toPref").val();
	var lastPage = $("#toLast").val();
	if (pageNO == 1) {
		$("#page2,#page3").hide()
	}
	if (pageNO == lastPage) {
		$("#page4,#page5").hide()
	}

	$("#box2").keydown(function() {
		if (event.keyCode == "13") {
			var inputID = $("#findPageNO").val();
			if (inputID == null || inputID == "") {
				return false;
			} else {
				var id = /^[0-9]+$/;
				if (!id.tesr(inputID)) {
					return false;
				} else {
					$("#findPage").submit();
				}

			}
		}
	});

	$("#findButton").click(function() {
		var inputID = $("#findPageNO").val();
		if (inputID == null || inputID == "") {
			return false;
		} else {
			var id = /^[0-9]+$/;
			if (!id.test(inputID)) {
				return false;
			} else {
				$("#findPage").submit();
			}

		}

	})

	$("#btnExport").click(function() {
		html2canvas(document.getElementById('table'), {
			onrendered : function(canvas) {
				var data = canvas.toDataURL();
				var docDefinition = {
					content : [ {
						image : data,
						width : 500
					} ]
				};
				pdfMake.createPdf(docDefinition).download("student.pdf");
			}
		})

	});

	$("#studentList").hide();
	// ajax验证姓名
	/*
	 * 1.导入jQuery库 2.获取 name="name"的元素节点 3.为该节点添加 change事件，当name状态发送变化时发起请求
	 * 3.1获取name的value属性值，去除前后空格后且不为空，准备发送ajax请求 3.2发送ajax请求，检验name是否可用
	 * 3.3在controller验证完成后，直接返回一个html片段 3.4在jsp页面把其直接添加到#checkname的html中。
	 */
//
//	$("#btnExport").click(function() {
//		var url = "getAllStudent";
//		$.post(url, function(data) {
//            $("c:forEach").html(data);
//            html2canvas(document.getElementById('studentList'), {
//    			onrendered : function(canvas) {
//    				var data = canvas.toDataURL();
//    				var docDefinition = {
//    					content : [ {
//    						image : data,
//    						width : 500
//    					} ]
//    				};
//    				pdfMake.createPdf(docDefinition).download("student.pdf");
//    			}
//    		})
//
//
//		})
//	})

});
