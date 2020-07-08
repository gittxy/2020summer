

// function login(){
//     var name=document.getElementById.Value("login_name");
//     var pass=document.getElementById("login_password");


//     req={"username":name, "password":pass, "role_id":role_id}

//     if(name =="1"){
//         window.open("./UserMain.html");
//     }
// }

function login(){
                var name=document.getElementById("name");
                var pass=document.getElementById("passw");
                
                req = {"username":name,"password":pass}
                $.ajax({
                    type: 'POST',
                    url: "/login",
                    data: JSON.stringify(req),
                    dataType:"json",
                    success: function (data) {
                    if(data['role_id']==2) {
                    window.location.href="./producer";
                    }else if(data['status']==1 && data['identity']==2){
                    window.location.href="./seller";
                    }else{
                    alert("Wrong account name or password, please try again.")
                    }
                    }
                });
            }

function register() {
    window.open("./UserRegister.html");
}
   