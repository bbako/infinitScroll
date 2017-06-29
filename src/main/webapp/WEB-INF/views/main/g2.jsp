<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="aritcleView">

		<table
			class="table table-striped table-bordered table-hover dataTable no-footer"
			id="dataTables-example" aria-describedby="dataTables-example_info">
			<thead>
				<tr role="row">
					<th class="sorting_asc" tabindex="0"
						aria-controls="dataTables-example" rowspan="1" colspan="1"
						aria-label="Rendering engine: activate to sort column ascending"
						aria-sort="ascending" style="width: 70px;">회원ID</th>
					<th class="sorting" tabindex="0" aria-controls="dataTables-example"
						rowspan="1" colspan="1"
						aria-label="Browser: activate to sort column ascending"
						style="width: 40px;">이름</th>
					<th class="sorting" tabindex="0" aria-controls="dataTables-example"
						rowspan="1" colspan="1"
						aria-label="Platform(s): activate to sort column ascending"
						style="width: 40px;">나이</th>
					<th class="sorting" tabindex="0" aria-controls="dataTables-example"
						rowspan="1" colspan="1"
						aria-label="Engine version: activate to sort column ascending"
						style="width: 40px;">성별</th>
					<th class="sorting" tabindex="0" aria-controls="dataTables-example"
						rowspan="1" colspan="1"
						aria-label="Engine version: activate to sort column ascending"
						style="width: 300px;">주소</th>
			</thead>
			<tbody>


				<tr class="gradeA" id="membertable">


				</tr>

			</tbody>
		</table>
	</div>
	<div class="scrollLocation"></div>
</body>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

						var bno2 = 1;

						var aa = function() {

							console.log("do aa");
							$.post("/main/g2?bno="+bno2, function(data){
								console.log(data);
								
								
								var str="";	
								$(data).each(function(){
									str += "<tr class=" + "'listToChange'" + ">"
					                 + "<td class=" +  "'scrolling'" + " data-bno='" + this.bno +"'>"
					                 + this.bno
					                 + "</td>"
					                 + "<td>"
					                 + this.b
					                 + "</td>"
					                 + "<td>"
					                 + this.c
					                 + "</td>"
					                 + "<td>"
					                 + this.d
					                 + "</td>"
					                 + "<td>"
					                 + this.e
					                 + "</td>"
					                 + "</tr>";
									});
								$(".gradeA").append(str);
					    	
					   		},'json')
						};

						aa();

						$(document).scroll(
								function() {
									var maxHeight = $(document).height();
									var currentScroll = $(window).scrollTop()
											+ $(window).height();

									if (maxHeight <= currentScroll) {
										console.log("down");
										bno2 = bno2 + 1;
										aa();

									}

								});

					});

	
</script>
</html>



