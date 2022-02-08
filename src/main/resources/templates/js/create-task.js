function ShowHideDiv() {
    var calculation = document.getElementById("calculations");
    var userMethod = document.getElementById("user-method");
    userMethod.style.display = calculation.value == "5" ? "block" : "none";
}