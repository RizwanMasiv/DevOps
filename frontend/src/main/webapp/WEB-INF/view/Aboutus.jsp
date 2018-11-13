<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}




* {
    box-sizing: border-box;
}





/* Style the container/contact section */
.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 10px;
}

/* Create two columns that float next to eachother */
.column {
    float: left;
    width: 50%;
    margin-top: 6px;
    padding: 20px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .column, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
    
    .back
{
   height: 700px;
   background-image: url("https://upload.wikimedia.org/wikipedia/commons/6/63/2k16_MZ_logo_reduced_resolution.png");
   background-repeat: no-repeat;
   background-size: 50%;
   
   background-position:center;
}
    
    
    
}
</style>
</head>
<body>
<%@include file="header.jsp"%>
<div class="container">
<div class="row">

 
   <center> <h2>About Us</h2>
    <h4>We provide all categories of samsung mobiles in our showroom</h4></center>
    <center>
  <p>Samsung is a South Korean multinational conglomerate headquartered in Samsung Town, Seoul.It comprises numerous affiliated businesses,most of them united under the Samsung brand, and is the largest South Korean chaebol.
Samsung was founded by Lee Byung-chul in 1938 as a trading company. Over the next three decades, the group diversified into areas including food processing, textiles, insurance, securities and retail. Samsung entered the electronics industry in the late 1960s and the construction and shipbuilding industries in the mid-1970s; these areas would drive its subsequent growth. Following Lee's death in 1987, Samsung was separated into four business groups – Samsung Group, Shinsegae Group, CJ Group and Hansol Group. Since 1990, Samsung has increasingly globalised its activities and electronics; in particular, its mobile phones and semiconductors have become its most important source of income. As of 2017, Samsung has the 6th highest global brand value.
Notable Samsung industrial affiliates include Samsung Electronics (the world's largest information technology company, consumer electronics maker and chipmaker measured by 2017 revenues), Samsung Heavy Industries (the world's 2nd largest shipbuilder measured by 2010 revenues), and Samsung Engineering and Samsung C&T (respectively the world's 13th and 36th largest construction companies). Other notable subsidiaries include Samsung Life Insurance, Samsung Everland and Cheil Worldwide.

    </p>


    
    <div class="col-lg-6 col-sm-12 left">
    <div class="back"></div>
    </div>
     <div class="col-lg-6 col-sm-12 right">
    
            
    </div>
    </div>
    </div>
 

<%@ include file="footer.jsp" %>
</body>
</html>