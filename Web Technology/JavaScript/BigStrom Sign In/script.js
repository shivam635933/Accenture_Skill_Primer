function signIn(){ 
    try{ 
        var name =  document.getElementById("name").value; 
        var password = document.getElementById("password").value; 
        if(passwordValidate(password)) 
            document.getElementById("demo").innerHTML="Sign In successful!!! Welcome "+name+" Learn More with BigStorm" 
        else 
            document.getElementById("demo").innerHTML="Please enter a valid password (password should be of minimum 8 characters having at least 1 small letter(a-z),1 capital letter(A-Z), 1 digit(0-9), 1 special character)"
    }
    catch(err){ 
        document.getElementById("demo").innerHTML="Function signin: "+err; 
    } 
    return false; 
} 
function passwordValidate(password){ 
    try{ 
        var pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[\W_]).{8,}$/;
        return pattern.test(password); 
    }
    catch(err){ 
        document.getElementById("demo").innerHTML="Function passwordValidate: "+err; 
    }
}