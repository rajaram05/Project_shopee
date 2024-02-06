<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Easy to buy Your most liked Products">
    <meta name="keywords" content="HTML, CSS, meta tags, example">
    <meta name="author" content="Harish&RajaRam">
    <title>Header</title>
    <style type="text/css">
        header {
        	top:0;
            transition: top 0.3s;
        }

        .sticky {
            position: fixed;
            top: 0;
            width: 100%;
            background-color: white;
            z-index: 1000;
        }

        #col-1 {
            width: 8.33%;
        }

        #col-2 {
            width: 16.66%;
        }

        #col-3 {
            width: 25%;
        }

        #col-4 {
            width: 33.33%;
        }

        #col-5 {
            width: 41.66%;
        }

        #col-6 {
            width: 50%;
        }

        #col-7 {
            width: 58.33%;
        }

        #col-8 {
            width: 62.66%;
        }

        #col-9 {
            width: 75%;
        }

        #col-10 {
            width: 83.33%;
        }

        #col-11 {
            width: 91.66%;
        }

        #col-12 {
            width: 100%;
        }

        nav,
        header,
        footer {
            display: block;
            margin: 0;
        }

        header {
            position: fixed;
            width: 100%; 
            background-color: white;
            z-index: 1000;
        }

        .sideheader {
            margin: 35px 50px 0 50px;
            display: block;
        }

        .imgs {
            margin: 7.5px 10px 7.5px 2.5px;
            border-radius: 50%;
            width: 50px;
            height: 50px;
            display: block;
        }

        .signup {
            margin: 35px 50px 0 50px;
            display: block;
        }

        p.signup a {
            text-decoration: none;
            color: black;
        }

        .dropdownbar {
            margin: 35px 50px 0 50px;
            text-decoration: none;
            color: black;
        }

        .searchbox {
            margin: 20px 20px 7.5px 10px;
            padding-left: 350px;
            padding-bottom: 20px;
            border-radius: 5px;
            display: block;
        }

        navi ul {
            background-color: #eee;
            overflow: hidden;
            margin: 0;
            padding: 0;
        }

        ul.navi li {
            display: block;
            list-style: none;
            float: left;
        }

        nav ul {
            background-color: #eee;
            overflow: hidden;
            margin: 0;
            padding: 0;
        }

        ul.Nav li {
            display: block;
            list-style: none;
            float: left;
        }

        ul.Nav li a {
            text-decoration: none;
            color: black;
            padding: 100px 100px 100px 100px;
        }

        .row {
            display: flex;
            width: 100%
        }

        .row::after {
            display: block;
            clear: both;
            content: "";
        }

        [class*="col-"] {
            border: 2px solid white;
            padding: 15px;
        }
    </style>
</head>
<body>
<header id="myHeader">
    <div>
        <nav class="pos">
            <ul class="navi">
                <li><img src="images/shoppee-logo.jpg" class="imgs" style="width: 80px; height: 80px"></li>
                <li><input type="search" class="searchbox"></li>
                <li><p class="sideheader"><a href="#" style="color: black; text-decoration: none;"><b>Become a seller</b></a></p></li>
                <li><p class="signup"><a href="#"><b>&#x1F464; Sign in</b></a></p></li>
                <li><p class="sideheader"><a href="#"style="color: black;text-decoration: none;"><b>&#x1f6d2;Cart</b></a></p></li>
                <li><div class="dropdownbar"><a href="#" style="color: black;text-decoration: none;">&#x2630;</a></div></li>
            </ul>
        </nav>
    </div>
    <div>
        <nav>
            <ul class="Nav" id="dropdown">
                <li><a href="#Mens" onclick="dropdownmenu()">Mens</a></li>
                <li><a href="#womens" onclick="dropdownmenu()">Womens</a></li>
                <li><a href="#kids" onclick="dropdownmenu()">Kids</a></li>
                <li><a href="#ele" onclick="dropdownmenu()">Electronics</a></li>
                <li><a href="#home" onclick="dropdownmenu()">Home&Furniture</a></li>
            </ul>
        </nav>
    </div>
</header>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

</body>
</html>

