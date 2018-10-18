<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
    <%@include file ="Header.jsp"%>
<body>
<style>
body {
    
    background-size: cover;
}

*[role="form"] {
    max-width: 530px;
    padding: 15px;
    margin: 0 auto;
    border-radius: 0.3em;
    background-color: #f2f2f2;
}

*[role="form"] h2 { 
    font-family: 'Open Sans' , sans-serif;
    font-size: 40px;
    font-weight: 600;
    color: #000000;
    margin-top: 5%;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 4px;
}

</style>


<div class="container">
		<spring:form action="${pageContext.request.contextPath}/addUserDetail" modelAttribute="user" method="POST" class="form-horizontal" role="form">
                <h2>Registration</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">First Name</label>
                    <div class="col-sm-9">
                        <spring:input type="text" id="firstName" placeholder="First Name" class="form-control"   path="firstName"  autofocus="true" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastName" class="col-sm-3 control-label">Last Name</label>
                    <div class="col-sm-9">
                        <spring:input type="text" id="lastName" placeholder="Last Name" class="form-control"  path="lastName" autofocus="true" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email* </label>
                    <div class="col-sm-9">
                        <spring:input type="email" id="emailId" placeholder="Email" class="form-control" name= "email" path="emailId" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password*</label>
                    <div class="col-sm-9">
                        <spring:input type="password" id="password" placeholder="Password" class="form-control" path="password" />
                    </div>
                </div>
               
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth*</label>
                    <div class="col-sm-9">
                        <spring:input type="date" id="birthDate"  placeholder="DD-MM-YYYY" class="form-control" path="birthDate" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <spring:input type="phoneNumber" id="phoneNumber" placeholder="Phone Number" class="form-control" path="phoneNumber" />
                        <span class="help-block">Your phone number won't be disclosed anywhere </span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                                <label class="radiobutton">
                                    <spring:radiobutton id="gender" value="Female" path="gender" />Female
                                </label>
                            <div class="col-sm-4">
                                <label class="radiobutton">
                                    <spring:radiobutton id="gender" value="Male" path="gender" />Male
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <span class="help-block">*Required fields</span>
                    </div>
                </div>
                <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
                
                <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
            </spring:form> <!-- /form -->
        </div> 
        
</body>
</html>