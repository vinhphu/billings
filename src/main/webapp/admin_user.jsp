<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>User Management</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">


		<!-- Include this in all index page -->
		<jsp:include page="sideBar.jsp"></jsp:include>
		<!-- /.Include this in all index page -->


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>Quản lí người dùng</h1>
			<ol class="breadcrumb">
				<li><a href="index.jsp"><i class="fa fa-dashboard"></i>
						BillingsSystem</a></li>
				<li><a href="#">Quản trị hệ thống</a></li>
				<li class="active">Quản lí người dùng</li>
			</ol>

			</section>

			<!-- Main content -->
			<section class="content">
			<div class="row">

				<!--  -->
				<div class="col-sm-7 pull-left">
					<div class="box box-primary">

						<div class="box-header with-border">
							<h3 class="box-title">
								<i class="glyphicon glyphicon-search"></i> Search
							</h3>
						</div>
						<form action="#" class="form-horizontal">
							<div class="box-body">
								<input class="form-control" id="myInput" type="text"
									placeholder="Search...">
							</div>
						</form>

					</div>
				</div>
				<!--  -->
				<div class="col-sm-3 pull-right">
					<div class="box box-primary">

						<div class="box-header with-border">
							<h3 class="box-title">
								<i class="ion-android-person-add"></i> Add User
							</h3>
						</div>
						<form action="#" class="form-horizontal">
							<div class="box-body">
								<a href="admin_user-add.jsp" class="btn btn-primary btn-block">
									<i class="ion-person-add"></i> Thêm người dùng
								</a>
							</div>
						</form>

					</div>
				</div>

				<!--  -->

				<div class="col-md-12">

					<div class="box box-primary">
						<div class="box-header">
							<h3 class="box-title">Danh sách</h3>
							<ul class="pagination pagination-sm no-margin pull-right">
								<li><a href="#">«</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">»</a></li>
							</ul>
						</div>
						<!-- /.box-header -->
						<div class="box-body no-padding">
							<table id="datatable-responsive"
								class="table table-hover table-condensed table-striped table-bordered dt-responsive nowrap"
								cellspacing="0" width="100%">
								<thead>
									<tr>
										<th>#</th>
										<th>Username</th>
										<th>Công ti</th>
										<th>Quyền truy cập</th>
										<th>Tác vụ</th>
									</tr>
								</thead>
								<tbody id="myTable">
									<tr>
										<td>#</td>
										<c:forEach var="item" items="${listTK}">
											<td><a href="#">${listTK.username}</a></td>
										</c:forEach>
										<c:forEach var="item" items="${listTK}">
											<td><a href="#">${item.congtyID}</a></td>
										</c:forEach>
										<c:forEach var="item" items="${listTK}">
											<td><a href="#">${item.role}</a></td>
										</c:forEach>


									</tr>
								</tbody>
							</table>
						</div>


						<!-- /.box-body -->
						<div class="box-footer clearfix">
							<ul class="pagination pagination-sm no-margin pull-right">
								<li><a href="#">«</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">»</a></li>
							</ul>
						</div>
					</div>
					<!-- /.box -->
				</div>
			</div>
			</section>
		</div>
		<!-- /.content-wrapper -->

		<!-- ---FOOTER--- -->
		<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 1.0.0
		</div>
		<strong>Copyright &copy; 2017 <a href="#">ATHL</a>.
		</strong> All rights reserved. </footer>
	</div>
	<!-- ./wrapper -->

	<!-- REQUIRED JS SCRIPTS -->
	<!-- Search item in table -->
	<script>
		$(document)
				.ready(
						function() {
							$("#myInput")
									.on(
											"keyup",
											function() {
												var value = $(this).val()
														.toLowerCase();
												$("#myTable tr")
														.filter(
																function() {
																	$(this)
																			.toggle(
																					$(
																							this)
																							.text()
																							.toLowerCase()
																							.indexOf(
																									value) > -1)
																});
											});
						});
	</script>
</body>
</html>
