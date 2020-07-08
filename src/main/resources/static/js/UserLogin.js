

// function login(){
//     var name=document.getElementById.Value("login_name");
//     var pass=document.getElementById("login_password");


//     req={"username":name, "password":pass, "role_id":role_id}

//     if(name =="1"){
//         window.open("./UserIndex.html");
//     }
// }


function login() {
    var name = document.getElementById("name");
    var pass = document.getElementById("passw");
    alert("进入方法");
    // req = {"username": name, "password": pass}
    $.ajax({
        type: 'POST',
        url: "http://localhost:8081/login",
        dataType:"json",
        data: {"username":name,"password":pass,"role_id":role_id},
        success: function (data) {
            if(data["password"]=pass){
                if(data["role_id"]=2){
                    window.open("./UserIndex");  //用户主页
                }
                if (data["role_id"]=3){
                    window.open("./UserIndex");  //商家主页
                }
                if(data["role_id"]=1){
                    window.open("./ManageIndex");
                }
                else{
                    alert("用户id或密码错误");
                }
            }
        }
    });
}


function register() {
    window.open("./UserRegister.html");
}
   