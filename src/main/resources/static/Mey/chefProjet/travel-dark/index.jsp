<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  
<!-- Mirrored from master-admin-template.multipurposethemes.com/bs5/travel-dark/ by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 15 Jan 2022 20:25:09 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="chefProjet/images/favicon.ico">

    <title>PlatServ</title>
    
	<!-- Vendors Style-->
	<link rel="stylesheet" href="chefProjet/travel-dark/css/vendors_css.css">
	  
	<!-- Style-->  
	<link rel="stylesheet" href="chefProjet/travel-dark/css/style.css">
	<link rel="stylesheet" href="chefProjet/travel-dark/css/skin_color.css">
     
  </head>

<body class="hold-transition dark-skin sidebar-mini theme-primary fixed">
	
<div class="wrapper">
	<div id="loader"></div>
	
  <header class="main-header">
	<div class="d-flex align-items-center logo-box justify-content-start">	
		<!-- Logo -->
		<a href="index.html" class="logo">
		  <!-- logo-->
		  <div class="logo-mini w-30">
			  <span class="light-logo"><img src="chefProjet/images/logo-letter.png" alt="logo"></span>
			  <span class="dark-logo"><img src="chefProjet/images/logo-letter.png" alt="logo"></span>
		  </div>
		  <div class="logo-lg">
			  <span class="light-logo"><img src="chefProjet/images/logo-dark-text.png" alt="logo"></span>
		<!-- 	  <span class="dark-logo"><img src="../images/logo-light-text.png" alt="logo"></span> -->
		  </div>
		</a>	
	</div>  
    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
	  <div class="app-menu">
		<ul class="header-megamenu nav">
			<li class="btn-group nav-item">
				<a href="#" class="waves-effect waves-light nav-link push-btn btn-outline no-border btn-primary-light" data-toggle="push-menu" role="button">
					<i data-feather="align-left"></i>
			    </a>
			</li>				  
			<li class="btn-group d-lg-inline-flex d-none">
				<div class="app-menu">
					<div class="search-bx mx-5">
						<form>
							<div class="input-group">
							  <input type="search" class="form-control" placeholder="Recherche" aria-label="Search" aria-describedby="button-addon2">
							  <div class="input-group-append">
								<button class="btn" type="submit" id="button-addon3"><i data-feather="search"></i></button>
							  </div>
							</div>
						</form>
					</div>
				</div>
			</li>
		
		
		
		</ul> 
	  </div>
		
      <div class="navbar-custom-menu r-side">
        <ul class="nav navbar-nav">		 
			<li class="btn-group nav-item d-lg-inline-flex d-none">
				<a href="#" data-provide="fullscreen" class="waves-effect waves-light nav-link btn-outline no-border full-screen btn-warning-light" title="Full Screen">
					<i data-feather="maximize"></i>
			    </a>
			</li>
		  <!-- Notifications -->
		  <li class="dropdown notifications-menu">
			<a href="#" class="waves-effect waves-light dropdown-toggle btn-outline no-border btn-info-light" data-bs-toggle="dropdown" title="Notifications">
			  <i data-feather="bell"></i>
			</a>
			<ul class="dropdown-menu animated bounceIn">

			  <li class="header">
				<div class="p-20">
					<div class="flexbox">
						<div>
							<h4 class="mb-0 mt-0">Notifications</h4>
						</div>
						<div>
							<a href="#" class="text-danger">C</a>
						</div>
					</div>
				</div>
			  </li>

			 
			</ul>
		  </li>	
		  
	      <!-- User Account-->
          <li class="dropdown user user-menu">
            <a href="#" class="waves-effect waves-light dropdown-toggle no-border p-5" data-bs-toggle="dropdown" title="User">
				<img class="avatar avatar-pill" src="chefProjet/images/user.png" alt="">
            </a>
            <ul class="dropdown-menu animated flipInX">
              <li class="user-body">
				 <a class="dropdown-item" href="profile.da"><i class="ti-user text-muted me-2"></i> Profile</a>
				
				 <div class="dropdown-divider"></div>
				 <a class="dropdown-item" href="deconnexion"><i class="ti-lock text-muted me-2"></i> Deconnexion</a>
              </li>
            </ul>
          </li>			  
          <!-- Control Sidebar Toggle Button -->
          <li>
              <a href="#" data-toggle="control-sidebar" title="Setting" class="waves-effect waves-light btn-outline no-border btn-danger-light">
			  	<i data-feather="settings"></i>
			  </a>
          </li>
			
        </ul>
      </div>
    </nav>
  </header>
  
  <aside class="main-sidebar">
    <!-- sidebar-->
    <section class="sidebar position-relative">	
	  	<div class="multinav">
		  <div class="multinav-scroll" style="height: 100%;">	
			  <!-- sidebar menu-->
			  <ul class="sidebar-menu" data-widget="tree">	
				<li>
				  <a  href="index.da">
					<i class="fa fa-bar-chart-o"></i>
					<span>Statistique</span>
				
				  </a>
				</li>
				<li>
					<a  href="listAllProjet.da">
					  <i class="fa fa-line-chart"></i>
					  <span>Projets</span>
				  
					</a>
				  </li>
			


				  <li>
					<a  href="profile.da">
					  <i class="fa fa-gear"></i>
					  <span>Parametre</span>
				  
					</a>
				  </li>


	 	     
			  </ul>
			  
			 
		  </div>
		</div>
    </section>
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
	  <div class="container-full">
		<!-- Main content -->
		<section class="content">			
			<div class="row">
				<div class="col-xl-6 col-12">
					<div class="box">
						<div class="box-header no-border pb-0">
							<h4 class="box-title">Statistique</h4>
						</div>
						<div class="box-body">
							<div class="row">
								<div class="col-md-6 col-12">
									<div class="info-box bg-transparent no-shadow px-0 min-h-80">
										<span class="info-box-icon bg-danger-light rounded-circle">   <i class="fa fa-line-chart"></i></span>
										<div class="info-box-content pb-0">
										  <p class="mb-0 fs-16">Total Projet</p>
										  <h2 class="my-0 fw-500 text-danger">${TotalP}</h2>
										</div>
									 </div>
								</div>
								<div class="col-md-6 col-12">
									<div class="info-box bg-transparent no-shadow px-0 min-h-80">
										<span class="info-box-icon bg-success-light rounded-circle"> <i class="fa fa-bar-chart"></i></span> 
										<div class="info-box-content pb-0">
										  <p class="mb-0 fs-16">Projet Complet</p>
										  <h2 class="my-0 fw-500 text-success">${TotalPC}</h2>
										</div>
									 </div>
								</div>
								<div class="col-md-6 col-12">
									<div class="info-box bg-transparent no-shadow px-0 min-h-80">
										<span class="info-box-icon bg-primary-light rounded-circle"><span class="icon-Money"><span class="path1"></span><span class="path2"></span></span></span>
										<div class="info-box-content pb-0">
										  <p class="mb-0 fs-16">Projet en cours</p>
										  <h2 class="my-0 fw-500 text-info">${TotalPNc}</h2>
										</div>
									 </div>
								</div>
								<div class="col-md-6 col-12">
									<div class="info-box bg-transparent no-shadow px-0 min-h-80">
										<span class="info-box-icon bg-info-light rounded-circle"><span class="icon-Chart-line1"><span class="path1"></span><span class="path2"></span></span></span>
										<div class="info-box-content pb-0">
										  <p class="mb-0 fs-16">Total Clients</p>
										  <h2 class="my-0 fw-500 text-info">${client}</h2>
										</div>
									 </div>
								</div>
							</div>
						</div>
					</div>	
				</div> 
				<div class="col-xl-6 col-lg-6 col-12">
					<div class="box">
						<div class="box-header no-border pb-0">
							<h4 class="box-title">Statistique</h4>
						</div>
						<div class="box-body">					
							<div id="analytics_chart"></div>																
							<div>
								<div class="d-flex gap-5 mt-30 justify-content-between">
									<h4>
										<span class="fs-12"> Projet complete</span> <br>${TotalPC}%
									</h4>
									<h4>
										<span class="fs-12"> Projet en cours</span> <br>${TotalPNc}%
									</h4>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="col-xl-6 col-12"></div>
				<div class="box">
					<div class="box-header with-border">
					  <h4 class="box-title">Projets</h4>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
					  <c:forEach items="${listAllProjet}" var="p">
						<h4 class="small font-weight-bold">${p.description}</h4>
						   <c:if test="${p.etat>=50}">
						     <div class="progress">
						<div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="${p.etat}" aria-valuemin="0" aria-valuemax="100" style="width: ${p.etat}%">
						  <span class="float-right">${p.etat}%</span>
						</div>
					  </div>
                                               
                                                 
                                              </c:if>
                                              
                                  <c:if test="${p.etat<50}">
						     <div class="progress">
						<div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="${p.etat}" aria-valuemin="0" aria-valuemax="100" style="width: ${p.etat}%">
						  <span class="float-right">${p.etat}%</span>
						</div>
					  </div>
                                               
                                                 
                                              </c:if>
					
					  </c:forEach>
				
					
					</div>
					<!-- /.box-body -->
				  
				
				
			
			
			</div>
		</section>
		<!-- /.content -->
	  </div>
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right d-none d-sm-inline-block">
      
    </div>
	  &copy; 2022 PlatServ
  </footer>


  <!-- /.control-sidebar -->
  
  <!-- Add the sidebar's background. This div must be placed immediately after the control sidebar -->
 
  
</div>
<!-- ./wrapper -->

	
	<!-- Page Content overlay -->
	
	
	<!-- Vendor JS -->
	<script src="chefProjet/travel-dark/js/vendors.min.js"></script>
	<script src="chefProjet/travel-dark/js/pages/chat-popup.js"></script>
    <script src="chefProjet/assets/icons/feather-icons/feather.min.js"></script>
	
	<script src="chefProjet/assets/vendor_components/apexcharts-bundle/dist/apexcharts.js"></script>
	<script src="chefProjet/assets/vendor_components/jvectormap/lib2/jquery-jvectormap-2.0.2.min.js"></script>
    <script src="chefProjet/assets/vendor_components/jvectormap/lib2/jquery-jvectormap-world-mill-en.js"></script>
	
	<!-- Master Admin App -->
	<script src="chefProjet/travel-dark/js/template.js"></script>

	
	    <script type="text/javascript">
		$(document).ready(function(){
	
      
		var options = {
          series: [${TotalPC},${TotalPNc}],
			labels: ['Projet complete','Projet en cours'],
          chart: {
          width: 202,
          type: 'donut',
        },
		colors: ['#7367F0', '#EA5455'],
        dataLabels: {
          enabled: false
        },
        responsive: [{
          breakpoint: 480,
          options: {
            chart: {
              width: 200
            },
            legend: {
              show: false
            }
          }
        }],
        legend: {
          show: false
        }
        };

        var chart = new ApexCharts(document.querySelector("#analytics_chart"), options);
        chart.render();
        
	});
	
	</script>
	
</body>

<!-- Mirrored from master-admin-template.multipurposethemes.com/bs5/travel-dark/ by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 15 Jan 2022 20:26:06 GMT -->
</html>
