$(document).ready(function() {
    
    // 입력 필드 변경 시 버튼 활성화/비활성화
    $('input[name="id"], input[name="password"]').on('input', function() {
        var username = $('input[name="id"]').val();
        var password = $('input[name="password"]').val();

        if (username && password) {
            $('.btn_login').prop('disabled', false).removeClass('btn_login').addClass('btn_login_on');
        } else {
            $('.btn_login_on').prop('disabled', true).removeClass('btn_login_on').addClass('btn_login');
        }
    });
});