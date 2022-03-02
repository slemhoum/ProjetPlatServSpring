<!DOCTYPE html>
<html lang="en">
  
<!-- Mirrored from florence-admin-template.multipurposethemes.com/bs4/main/index3.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 12 Jan 2022 13:37:33 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="chefs/images/favicon.ico">

    <title>PlatServ</title>
    
	<!-- Vendors Style-->
	<link rel="stylesheet" href="chefs/main/css/vendors_css.css">
	  
	<!-- Style-->  
	<link rel="stylesheet" href="chefs/main/css/style.css">
	<link rel="stylesheet" href="chefs/main/css/skin_color.css">
     
  </head>

<body class="hold-transition light-skin sidebar-mini theme-primary">
	
<div class="wrapper">

  <header class="main-header">
	<div class="d-flex align-items-center logo-box justify-content-between">
		<a href="#" class="waves-effect waves-light nav-link rounded d-none d-md-inline-block mx-10 push-btn" data-toggle="push-menu" role="button">
			<i class="ti-menu"></i>
		</a>	
		<!-- Logo -->
		<a href="index-2.html" class="logo">
		  <!-- logo-->
		  <div class="logo-lg">
			 <!--  <span class="light-logo"><img src="chefs/images/logo-dark-text.png" alt="logo"></span>
			  <span class="dark-logo"><img src="chefs/images/logo-light-text.png" alt="logo"></span> -->
		  </div>
		</a>	
	</div>  
    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top pl-10">
      <!-- Sidebar toggle button-->
	  <div class="app-menu">
		
	  </div>
		
      <div class="navbar-custom-menu r-side">
        <ul class="nav navbar-nav">	
			<li class="btn-group nav-item d-lg-inline-flex d-none">
				<a href="#" data-provide="fullscreen" class="waves-effect waves-light nav-link rounded full-screen" title="Full Screen">
					<i class="ti-fullscreen"></i>
			    </a>
			</li>	  
		
		  <!-- Notifications -->
		  <li class="dropdown notifications-menu">
			<a href="#" class="waves-effect waves-light dropdown-toggle" data-toggle="dropdown" title="Notifications">
			  <i class="ti-bell"></i>
			</a>
			<ul class="dropdown-menu animated bounceIn">

			  <li class="header">
				<div class="p-20">
					<div class="flexbox">
						<div>
							<h4 class="mb-0 mt-0">Notifications</h4>
						</div>
						<div>
							<a href="#" class="text-danger"></a>
						</div>
					</div>
				</div>
			  </li>

			  <li>
				<!-- inner menu: contains the actual data -->
				<ul class="menu sm-scrol">
				  <li>
					<a href="#">
					  <i class="fa fa-users text-info"></i> Une nouvelle demande.
					</a>
				  </li>
				 
				
				</ul>
			  </li>
			  <li class="footer">
				  <a href="#">Voir tous</a>
			  </li>
			</ul>
		  </li>	
		  
	      <!-- User Account-->
          <li class="dropdown user user-menu">
            <a href="#" class="waves-effect waves-light dropdown-toggle" data-toggle="dropdown" title="User">
				<i class="ti-user"></i>
            </a>
           <ul class="dropdown-menu animated flipInX">
              <li class="user-body">
				
				 <a class="dropdown-item" href="profile.do"><i class="ti-settings text-muted mr-2"></i> Parametre</a>
				 <div class="dropdown-divider"></div>
				 <a class="dropdown-item" href="deconnexion"><i class="ti-lock text-muted mr-2"></i> Deconnection</a>
              </li>
            </ul>
          </li>	
		  
          <!-- Control Sidebar Toggle Button -->
       
			
        </ul>
      </div>
    </nav>
  </header>
  
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar-->
    <section class="sidebar">	
	    <div class="user-profile px-10 py-15">
			<div class="d-flex align-items-center">			
				<div class="image">
					<div class="avatar-lg mx-auto mb-4">
						<div class="avatar-title bg-soft-primary rounded-circle text-primary">
							<i class="mdi mdi-account-circle display-4 m-0 text-primary"></i>
						</div>
					</div>
				  
				</div>
				<div class="info ml-10">
					<p class="mb-0">Bienvenu</p>
					<h5 class="mb-0">${chef.username}</h5>
				</div>
			</div>
        </div>	
		
      <!-- sidebar menu-->
           <ul class="sidebar-menu" data-widget="tree">		
		<li>
          <a href="index3.do">
            <i class="ti-bar-chart-alt"></i>
			<span>Statistique</span>
           
          </a>
         
        </li>	

		<li>
			<a href="demande.do">
			  <i class="ti-layout-grid2"></i>
			  <span>Demande</span>
			 
			</a>
		   
		  </li>	

		  <li>
			<a href="chefProjet.do">
			  <i class="fa fa-user-secret" aria-hidden="true"></i>
			  <span>Chef Projet</span>
			 
			</a>
		   
		  </li>
		  <li>
			<a href="membre.do">
			  <i class="fa fa-user" aria-hidden="true"></i>
			  <span>Membre</span>
			 
			</a>
		   
		  </li>
		  <li>
			<a href="projet.do">
			  <i class="fa fa-line-chart" aria-hidden="true"></i>
			  <span>Projets</span>
			 
			</a>
		   
		  </li>
		  <li>
			<a href="profile.do">
				<i class="ti-settings text-muted mr-2"></i>
			  <span>Parametre</span>
			 
			</a>
		   
		  </li>
		
	
      </ul>
    </section>
	
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
	  <div class="container-full">
		<!-- Main content -->
		<section class="content">
            <div class="row">
                <div class="col-12">
                  <div class="box">
                      <div class="box-header with-border">
                        <h4 class="box-title">Modifier Chef Projet</h4>
                      </div>
                    <div class="box-body">
                        <form action="updateChef.do" method="post">
                            <div class="form-body">
                                <div class="row">
                                   
                                    <!--/span-->
                                  
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label class="font-weight-700 font-size-16">Telephone</label>
                                            <input type="number" class="form-control" value="${chefprojet.tel}"  name="tel">
                                                <input type="hidden" value="${chefprojet.id}" name="id">
                                         </div>
                                       
                                    </div>
                                   
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="font-weight-700 font-size-16">Nom</label>
                                            <input type="text" class="form-control" value="${chefprojet.nom}"  name="nom">
                                         </div>
                                      
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="font-weight-700 font-size-16">Prenom</label>
                                            <input type="text" class="form-control"   value="${chefprojet.prenom}" name="prenom">
                                         </div>
                                        
                                    </div>
                                  
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="font-weight-700 font-size-16">Username</label>
                                            <input type="text" class="form-control" value="${chefprojet.username}"  name="user">
                                         </div>
                                        
                                       
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="font-weight-700 font-size-16">Password</label>
                                            <input type="password" class="form-control" value="${chefprojet.password}" name="pass">
                                            
                                        </div>
                                       
                                    </div>
                                    <div class="form-actions mt-10">
                                        <button type="submit" class="btn btn-primary"> <i class="fa fa-check"></i> Enregistrer</button>
                                        <button type="reset" class="btn btn-danger">Annuler</button>
                                    </div>
                                </div>
                            </div>
                                </form>


                            </div>

                    </div>

                </div>
            </div>
        </div>


                    
		</section>
	
    

	  </div>
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right d-none d-sm-inline-block">
        <ul class="nav nav-primary nav-dotted nav-dot-separated justify-content-center justify-content-md-end">
		 
		</ul>
    </div>
	  &copy; 2022 Prestation.
  </footer>

 
  <!-- /.control-sidebar -->
  
  <!-- Add the sidebar's background. This div must be placed immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
  
</div>
<!-- ./wrapper -->	 
	
	<!-- Vendor JS -->
		<!-- Vendor JS -->
    	<script src="chefs/main/js/vendors.min.js"></script>
    <script src="chefs/assets/icons/feather-icons/feather.min.js"></script>
			<script src="chefs/assets/vendor_components/datatable/datatables.min.js"></script>
        <script src="chefs/assets/vendor_components/jquery.peity/jquery.peity.js"></script>
        
        <!-- Florence Admin App -->
    <script src="chefs/main/js/template.js"></script>
	<script src="chefs/main/js/pages/dashboard3.js"></script>
	<script src="chefs/main/js/demo.js"></script>
        <script src="chefs/main/js/pages/data-table.js"></script>
        <script src="chefs/main/js/pages/app-ticket.js"></script>
	
	
</body>

<!-- Mirrored from florence-admin-template.multipurposethemes.com/bs4/main/index3.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 12 Jan 2022 13:37:35 GMT -->
</html>
