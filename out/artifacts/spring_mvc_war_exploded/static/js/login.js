(function () {
    function getInputNickname() {
        let response = fetch('/api/chats', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;utf-8'
            },
            body: JSON.stringify({
                nickname: document.getElementById("nickname").value
            })
        })
    }
    document.getElementById('login').addEventListener('click', getInputNickname, true);
})();