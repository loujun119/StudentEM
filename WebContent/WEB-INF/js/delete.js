$(function() {
	$("#box2").keydown(function() {
		if (event.keyCode == "13") {
			var putid = $("#delID").val();
			putid = $.trim(putid);
			if (putid == null || putid == "") {
				alert("学生のIDを入力してください");
				return false;
			} else {
				var putval = /^[0-9]+$/;
				if (!putval.test(putid)) {
					alert("数字を入力してください");
					return false;
				} else {
					alert("ok");
					$("#delStudent").submit();
				}
			}
		}
	});

	$("#delsub").click(function() {
		var putid = $("#delID").val();
		putid = $.trim(putid);
		if (putid == null || putid == "") {
			alert("学生のIDを入力してください");
			return false;
		} else {
			var putval = /^[0-9]+$/;
			if (!putval.test(putid)) {
				alert("数字を入力してください");
				return false;
			} else {
				alert("ok");
				$("#delStudent").submit();
			}
		}
	})

})