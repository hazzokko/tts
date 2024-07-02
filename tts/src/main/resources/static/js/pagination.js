(function(global) {
	
    global.Pagination = function(options) {
        this.paginationElement = $(options.paginationElement);
        this.pageChangeCallback = options.pageChangeCallback;

        this.init();
    };

    Pagination.prototype.init = function() {
        this.bindEvents();
    };

	// 동적으로 페이지 넘버를 할당하여 클릭 이벤트를 바인딩
    Pagination.prototype.bindEvents = function() {
        const self = this;
        $(document).on('click', '.page_link', function(event) {
            event.preventDefault(); // 링크 클릭 시 페이지 이동 차단
            const page = $(this).data('page');
            if (page !== undefined) {
                self.pageChangeCallback(page);
            }
        });
    };

	// 동적으로 페이징 버튼 UI 구현
    Pagination.prototype.render = function(currentPage, totalPages) {
        const pagination = this.paginationElement;
        pagination.empty();

        let pageHtml = ``;

        // 첫 페이지가 아니라면 firstPage 및 prevPage 버튼 활성화
        if (currentPage > 0) {
            pageHtml += `
            <li class="page_item">
                <a href="#" class="page_link _first" data-page="0"></a>
            </li>
            <li class="page_item">
                <a href="#" class="page_link _prev" data-page="${currentPage - 1}"></a>
            </li>`;
        }

		// 각 페이지 번호에 대한 링크를 동적으로 생성
        for (let i = 1; i <= totalPages; i++) {
            pageHtml += `<li class="page_item">
                <a href="#" class="page_link${i === currentPage + 1 ? ' _active' : ''}" data-page="${i - 1}">${i}</a>
            </li>`;
        }

        // 마지막 페이지가 아니라면 nextPage 및 lastPage 버튼 활성화
        if (currentPage + 1 < totalPages) {
            pageHtml += `
            <li class="page_item">
                <a href="#" class="page_link _next" data-page="${currentPage + 1}"></a>
            </li>
            <li class="page_item">
                <a href="#" class="page_link _last" data-page="${totalPages - 1}"></a>
            </li>`;
        }

        pagination.html(pageHtml); // 생성된 페이징 HTML을 DOM에 추가
    };

})(window);