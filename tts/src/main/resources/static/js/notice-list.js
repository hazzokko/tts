$(function() {
	
	loadNotices(0);
    let isFirstLoad = true; // 페이지 최초 로딩 여부 확인

    const pagination = new Pagination({
        paginationElement: '#pagination .pagination_list',
        pageChangeCallback: function(page) {
            loadNotices(page);
        }
    });

    function loadNotices(page) {
        $.ajax({
            url: '/api/v1/notices/ajax',
            method: 'GET',
            data: { page: page },
            dataType: 'json',
            success: function(data) {
                const tbody = $('.list_table tbody');
                tbody.empty();

                // 페이지 최초 로딩 시에만 '공지사항 목록 조회 성공' 메시지 출력
                if (isFirstLoad) {
                    alert(data.message);
                    isFirstLoad = false;
                }

                if (data.data.pages.content.length === 0) {
                    $('.list_none').show();
                    $('.list_table').hide();
                } else {
                    $('.list_none').hide();
                    $('.list_table').show();
					
					// 게시글 목록 동적 생성
                    data.data.pages.content.forEach((notice, index) => {
                        const row = `<tr>
                            <td>${index + 1 + (data.data.pages.number * data.data.pages.size)}</td>
                            <td><a href="./notices/${notice.id}" class="list_table_link">${notice.title || ''}</a></td>
                            <td>${notice.username || ''}</td>
                            <td>${notice.createdAt || ''}</td>
                        </tr>`;
                        tbody.append(row);
                    });

                    // 총 게시글 갯수
                    $('#total-count').text(data.data.pages.totalElements);

                    // Pagination
                    const totalPages = data.data.pages.totalPages;
                    const currentPage = data.data.pages.number;
                    pagination.render(currentPage, totalPages);
                }
            },
            error: function(xhr, status, error) {
                console.error('Error occurred while fetching data: ', status, error);
                alert('공지사항 목록을 불러오는데 실패했습니다.');
            }
        });
    }
});