/**
 * Created by byhieg on 16-8-19.
 */

var address = "http://localhost:8080/apiManage/";
function getRegister() {
    window.location.href = address + "register";
}

function getCancel() {
    window.location.href = address + "login";
}
function putHeadPic() {
    window.location.href = address + "upload";
}

function getApiDetail(id) {
    window.location.href = address + "api/v1/" + id + "/apiDetail/md";
}

function getRunDetail(id) {
    window.location.href = address +  "index/runDetail/" + id;
}