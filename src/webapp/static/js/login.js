(function () {
    function getInputNickname() {
        let inputValue = document.getElementById("nickname").value;

    }
    document.getElementById('login').addEventListener('click', getInputNickname, true);
})();