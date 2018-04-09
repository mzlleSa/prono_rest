<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en-gb">

<head>

     <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SEZSPORT.com</title>
   <!--  <link href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet" type="text/css"> -->
    <!--    <link href="resources/resources/images/favicon.ico" rel="shortcut icon" type="image/vnd.microsoft.icon"> -->
    <link href="resources/css/akslider.css" rel="stylesheet" type="text/css" />
  <!--  <link href="css/donate.css" rel="stylesheet" type="text/css" />-->
    <link href="resources/css/theme.css" rel="stylesheet" type="text/css" />
   <!--  <script type="text/javascript" src="resources/js/jquery.js"></script> -->
    <!-- --><script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/mootools/1.3.1/mootools-yui-compressed.js'></script>
    <link rel="stylesheet" href="resources/css/style.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
   
</head>

<body class="tm-isblog">
        <c:if test="${!empty sessionScope.utilisateur}">
    <div class="over-wrap">
<!--<div class="includedbaremenu"></div>-->
<div class="tm-menu-box">
    
                <div style="height: 70px;" class="uk-sticky-placeholder">
                    <nav style="margin: 0px;" class="tm-navbar uk-navbar" data-uk-sticky="">
                        <div class="uk-container uk-container-center">
                                <span> <a href="Profile.html">Bonjour Mr Charafeddine ELKORTAS</a></span>
                            <a class="tm-logo uk-float-left" href="indexconnect.html">
                                <img src="resources/images/logo-loader.png" alt="logo" title="logo"> <span>SEZSPORT<em>.Com</em></span>
                              
                            </a>
                            
                            <ul class="uk-navbar-nav uk-hidden-small">
                                <li><a href="indexconnect.html">Accueil</a>
                                </li>
                                <li><a href="competitions">Competitions</a>
                                </li>
                                <li><a href="profile.html">Profile</a>
                                </li>
                                <li><a href="news.html">Deconnexion</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
    
            </div>

            <div class="tm-top-a-box tm-full-width tm-box-bg-1 ">
                    <div class="uk-container uk-container-center">
                        <section id="tm-top-a" class="tm-top-a uk-grid uk-grid-collapse" data-uk-grid-match="{target:'> div > .uk-panel'}" data-uk-grid-margin="">
        
                            <div class="uk-width-1-1 uk-row-first">
                                <div class="uk-panel">
                                    <div class="uk-cover-background uk-position-relative head-wrap" style="height: 220px; background-image: url('resources/images/head-bg-match.jpg');">
                                        <img class="uk-invisible" src="resources/images/head-bg.jpg" alt="" height="220" width="1920">
                                        <div class="uk-position-cover uk-flex uk-flex-center head-title">
                                            <h1>Matchs</h1>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                    </div>
                </div>
                                            
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>

        <div class="tm-top-b-box tm-full-width mb-5" id="dernier-resultat">
            <div class="uk-container uk-container-center">
                <section id="tm-top-b" class="tm-top-b uk-grid" data-uk-grid-match="{target:'> div > .uk-panel'}" data-uk-grid-margin="">

                    <div class="uk-width-1-1">
                        <div class="uk-panel">

                            <div class="va-latest-wrap">
                                <div class="uk-container uk-container-center">
                                    <div class="va-latest-top">
                                        <h3><span>Matchs</span></h3>
                                    </br>
                                    
                                    </div>
                                <c:forEach var="match" items="${listeMatchs}">
                                    <div class="tm-main uk-width-medium-8-12 uk-push-1-6">
                                            <main id="tm-content" class="tm-content">
                                                <div class="match-list-wrap">
                                                    <div class="match-list-item alt">
                                                            <div class="date"><c:out value="${match.dateMatch}" /></div>
                                                    <c:forEach var="equipe" items="${match.equipes}">
                                                        <div class="logo">
                                                           
                                                            <img src="resources/images/team-ava.png" class="img-polaroid"></a>                                     
                                                        </div>
                                                        
                                                        <div class="team-name">
                                                                <c:out value="${equipe.identifiant}" />   
                                                                <div class="versus">VS</div>             
                                                        </div>
                                                        
                                                    </c:forEach>
                                                       
                                                        <div class="va-view-wrap">
                                                            <a class="view-article" href="pronostic?idMatch=<c:out value="${match.id}" />">pronostiquer</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </main>
                                        </div>
                                </c:forEach>
                                    
                                    </div>
                               <!--
                                   les poules 
                               -->

                               
                          

                            </br></br>
                                <div class="uk-container uk-container-center">
                                    <div class="va-latest-bottom">
                                        

                                        <div class="uk-grid">
                                            <div class="uk-width-1-1">
                                                
                                                    <a class="read-more">*****</a>
                                             
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </section>
            </div>
        </div>
        <br/>
        <br/>
        <br/>
        <br/>






        
        <div class="bottom-wrapper">
            <div class="tm-bottom-f-box  ">
                <div class="uk-container uk-container-center">
                    <section id="tm-bottom-f" class="tm-bottom-f uk-grid" data-uk-grid-match="{target:'> div > .uk-panel'}" data-uk-grid-margin="">

                        <div class="uk-width-1-1">
                            <div class="uk-panel">
                                <div class="footer-logo">
                                    <a href="/"><img src="resources/images/footer-logo-img.png" alt=""><span>SEZSPORT</span>.com</a>
                                </div>
                                <div class="footer-socials">
                                    <div class="social-top">
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-facebook"></span></a>
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-twitter"></span></a>
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-google"></span></a>
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-pinterest"></span></a>
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-youtube"></span></a>
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-instagram"></span></a>
                                        <a href="#"><span class="uk-icon-small uk-icon-hover uk-icon-flickr"></span></a>
                                    </div>
                                </div>
                               
                        </div>
                    </section>
                </div>
            </div>

            <footer id="tm-footer" class="tm-footer">


                <div class="uk-panel">
                    <div class="uk-container uk-container-center">
                        <div class="uk-grid">
                            <div class="uk-width-1-1">
                                <div class="footer-wrap">
                                    <div class="copyrights">Copyright © 2018 <a href="/">SEZ Team</a>. All Rights Reserved.</div>
                                    <div class="clear"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>

        </div>

    </div>

    

<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/uikit.js"></script>
<script type="text/javascript" src="resources/js/SimpleCounter.js"></script>
<script type="text/javascript" src="resources/js/components/grid.js"></script>
<script type="text/javascript" src="resources/js/components/slider.js"></script>
<script type="text/javascript" src="resources/js/components/slideshow.js"></script>
<script type="text/javascript" src="resources/js/components/slideset.js"></script>
<script type="text/javascript" src="resources/js/components/sticky.js"></script>
<script type="text/javascript" src="resources/js/components/lightbox.js"></script>
<script type="text/javascript" src="resources/js/isotope.pkgd.min.js"></script>

<script type="text/javascript" src="resources/js/theme.js"></script>


</c:if>
</body>

</html>