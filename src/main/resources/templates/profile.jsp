<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<a href="index3.do" class="logo">
		  <!-- logo-->
		 <div class="logo-lg">
			  <!-- <span class="light-logo"><img src="chefs/images/logo-dark-text.png" alt="logo"></span>
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
          <li>
              <a href="#" data-toggle="control-sidebar" title="Setting" class="waves-effect waves-light">
			  	<i class="ti-settings"></i>
			  </a>
          </li>
			
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
                <div class="col-12 col-lg-7 col-xl-8">

                    <div class="box p-15">		
						<form class="form-horizontal form-element col-12">
						  <div class="form-group row">
							<label for="inputName" class="col-sm-2 control-label">Nom</label>

							<div class="col-sm-10">
							  <input type="email" class="form-control" id="inputName" value="${chef.nom}">
							</div>
						  </div>
						  <div class="form-group row">
							<label for="inputEmail"  class="col-sm-2 control-label">Prenom</label>

							<div class="col-sm-10">
							  <input type="email"   value="${chef.prenom}" class="form-control" id="inputEmail" placeholder="">
							</div>
						  </div>
						  <div class="form-group row">
							<label for="inputPhone" class="col-sm-2 control-label">Telephone</label>

							<div class="col-sm-10">
							  <input type="tel"   value="${chef.tel}"  class="form-control" id="inputPhone" placeholder="">
							</div>
						  </div>
						  <div class="form-group row">
							<label for="inputExperience" class="col-sm-2 control-label">Username</label>

							<div class="col-sm-10">
                                <input type="text" class="form-control"  value="${chef.username}"  placeholder="">
                              </div>
						  </div>
					
						 
						  <div class="form-group row">
							<div class="ml-auto col-sm-10">
							  <button type="submit" class="btn btn-success">Submit</button>
                              <button type="reset" class="btn btn-danger">Annuler</button>
							</div>
						  </div>
						</form>
					</div>
                </div>
                <div class="col-12 col-lg-5 col-xl-4">
                    <div class="box box-widget widget-user">
                       <!-- Add the bg color to the header using any of the bg-* classes -->
                       <div class="widget-user-header bg-black" style="background: url('chefs/images/gallery/full/10.jpg') center center;">
                         <h3 class="widget-user-username">${chef.nom} ${chef.prenom}</h3>
                         <h6 class="widget-user-desc">Chef Service</h6>
                       </div>
                       <div class="widget-user-image">
                      <div class="avatar-lg mx-auto mb-4">
						<div class="avatar-title bg-soft-primary rounded-circle text-primary">
							<i class="mdi mdi-account-circle display-4 m-0 text-primary"></i>
						</div>
					</div>
                       </div>
                       <div class="box-footer">
                         <div class="row">
                            <div class="box-body box-profile">            
                                <div class="row">
                                  <div class="col-12">
                                      <div>
                                          <p>Username :<span class="text-gray pl-10">${chef.username}</span> </p>
                                          <p>Telephone :<span class="text-gray pl-10">${chef.tel}</span></p>
                                          <button  class="btn btn-danger">Modifier Mot de pass</button>
                                         
                                      </div>
                                  </div>
                               
                                
                                </div>
                              </div>
                           <!-- /.col -->
                         </div>
                         <!-- /.row -->
                       </div>
                     </div>
                   

                    </div>
            </div>

		</section>
		<!-- /.content -->
	  </div>
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right d-none d-sm-inline-block">
        <ul class="nav nav-primary nav-dotted nav-dot-separated justify-content-center justify-content-md-end">
		 
		</ul>
    </div>
	  &copy; 2022 Prestation	
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar">
	  
	<div class="rpanel-title"><span class="pull-right btn btn-circle btn-danger"><i class="ion ion-close text-white" data-toggle="control-sidebar"></i></span> </div>  <!-- Create the tabs -->
    <ul class="nav nav-tabs control-sidebar-tabs">
      <li class="nav-item"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="mdi mdi-message-text"></i></a></li>
      <li class="nav-item"><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="mdi mdi-playlist-check"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane" id="control-sidebar-home-tab">
          <div class="flexbox">
			<a href="javascript:void(0)" class="text-grey">
				<i class="ti-more"></i>
			</a>	
			<p>Users</p>
			<a href="javascript:void(0)" class="text-right text-grey"><i class="ti-plus"></i></a>
		  </div>
		  <div class="lookup lookup-sm lookup-right d-none d-lg-block">
			<input type="text" name="s" placeholder="Search" class="w-p100">
		  </div>
          <div class="media-list media-list-hover mt-20">
			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-success" href="#">
				<img src="../images/avatar/1.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Tyler</strong></a>
				</p>
				<p>Praesent tristique diam...</p>
				  <span>Just now</span>
			  </div>
			</div>

			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-danger" href="#">
				<img src="../images/avatar/2.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Luke</strong></a>
				</p>
				<p>Cras tempor diam ...</p>
				  <span>33 min ago</span>
			  </div>
			</div>

			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-warning" href="#">
				<img src="../images/avatar/3.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Evan</strong></a>
				</p>
				<p>In posuere tortor vel...</p>
				  <span>42 min ago</span>
			  </div>
			</div>

			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-primary" href="#">
				<img src="../images/avatar/4.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Evan</strong></a>
				</p>
				<p>In posuere tortor vel...</p>
				  <span>42 min ago</span>
			  </div>
			</div>			
			
			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-success" href="#">
				<img src="../images/avatar/1.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Tyler</strong></a>
				</p>
				<p>Praesent tristique diam...</p>
				  <span>Just now</span>
			  </div>
			</div>

			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-danger" href="#">
				<img src="../images/avatar/2.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Luke</strong></a>
				</p>
				<p>Cras tempor diam ...</p>
				  <span>33 min ago</span>
			  </div>
			</div>

			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-warning" href="#">
				<img src="../images/avatar/3.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Evan</strong></a>
				</p>
				<p>In posuere tortor vel...</p>
				  <span>42 min ago</span>
			  </div>
			</div>

			<div class="media py-10 px-0">
			  <a class="avatar avatar-lg status-primary" href="#">
				<img src="../images/avatar/4.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<p class="font-size-16">
				  <a class="hover-primary" href="#"><strong>Evan</strong></a>
				</p>
				<p>In posuere tortor vel...</p>
				  <span>42 min ago</span>
			  </div>
			</div>
			  
		  </div>

      </div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
          <div class="flexbox">
			<a href="javascript:void(0)" class="text-grey">
				<i class="ti-more"></i>
			</a>	
			<p>Todo List</p>
			<a href="javascript:void(0)" class="text-right text-grey"><i class="ti-plus"></i></a>
		  </div>
        <ul class="todo-list mt-20">
			<li class="py-15 px-5 by-1">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_1" class="filled-in">
			  <label for="basic_checkbox_1" class="mb-0 h-15"></label>
			  <!-- todo text -->
			  <span class="text-line">Nulla vitae purus</span>
			  <!-- Emphasis label -->
			  <small class="badge bg-danger"><i class="fa fa-clock-o"></i> 2 mins</small>
			  <!-- General tools such as edit or delete-->
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_2" class="filled-in">
			  <label for="basic_checkbox_2" class="mb-0 h-15"></label>
			  <span class="text-line">Phasellus interdum</span>
			  <small class="badge bg-info"><i class="fa fa-clock-o"></i> 4 hours</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5 by-1">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_3" class="filled-in">
			  <label for="basic_checkbox_3" class="mb-0 h-15"></label>
			  <span class="text-line">Quisque sodales</span>
			  <small class="badge bg-warning"><i class="fa fa-clock-o"></i> 1 day</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_4" class="filled-in">
			  <label for="basic_checkbox_4" class="mb-0 h-15"></label>
			  <span class="text-line">Proin nec mi porta</span>
			  <small class="badge bg-success"><i class="fa fa-clock-o"></i> 3 days</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5 by-1">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_5" class="filled-in">
			  <label for="basic_checkbox_5" class="mb-0 h-15"></label>
			  <span class="text-line">Maecenas scelerisque</span>
			  <small class="badge bg-primary"><i class="fa fa-clock-o"></i> 1 week</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_6" class="filled-in">
			  <label for="basic_checkbox_6" class="mb-0 h-15"></label>
			  <span class="text-line">Vivamus nec orci</span>
			  <small class="badge bg-info"><i class="fa fa-clock-o"></i> 1 month</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5 by-1">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_7" class="filled-in">
			  <label for="basic_checkbox_7" class="mb-0 h-15"></label>
			  <!-- todo text -->
			  <span class="text-line">Nulla vitae purus</span>
			  <!-- Emphasis label -->
			  <small class="badge bg-danger"><i class="fa fa-clock-o"></i> 2 mins</small>
			  <!-- General tools such as edit or delete-->
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_8" class="filled-in">
			  <label for="basic_checkbox_8" class="mb-0 h-15"></label>
			  <span class="text-line">Phasellus interdum</span>
			  <small class="badge bg-info"><i class="fa fa-clock-o"></i> 4 hours</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5 by-1">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_9" class="filled-in">
			  <label for="basic_checkbox_9" class="mb-0 h-15"></label>
			  <span class="text-line">Quisque sodales</span>
			  <small class="badge bg-warning"><i class="fa fa-clock-o"></i> 1 day</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
			<li class="py-15 px-5">
			  <!-- checkbox -->
			  <input type="checkbox" id="basic_checkbox_10" class="filled-in">
			  <label for="basic_checkbox_10" class="mb-0 h-15"></label>
			  <span class="text-line">Proin nec mi porta</span>
			  <small class="badge bg-success"><i class="fa fa-clock-o"></i> 3 days</small>
			  <div class="tools">
				<i class="fa fa-edit"></i>
				<i class="fa fa-trash-o"></i>
			  </div>
			</li>
		  </ul>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  
  <!-- Add the sidebar's background. This div must be placed immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
  
</div>
<!-- ./wrapper -->	 
	
	
	
	
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