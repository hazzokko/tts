<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="wrap">
    <section class="layout_body">
        <div class="layout_content">
            <article class="content">
                <h1 class="content_main_title">공지사항</h1>
                <p class="content_main_title_txt">공지사항 관리</p>

                <section>
                    <section class="search_form_group">
                        <div class="search_form__row">
                            <label for="startDate" class="search_form__label">기간</label>
                            <div class="form_inline_group">
                                <input type="text" name="startDate" id="startDate" class="form_item_date">
                                <span class="_tilde">~</span> 
                                <input type="text" name="endDate" id="endDate" class="form_item_date">
                            </div>
                        </div>
                        <div class="search_form__row">
                            <label for="searchKeyword" class="search_form__label">검색어</label>
                            <div class="form_inline_group">
                                <select name="searchCategory" id="searchCategory" class="form_item_select">
                                    <option value="">전체</option>
                                    <!-- 다른 옵션들 -->
                                </select> 
                                <input type="text" name="searchKeyword" id="searchKeyword" class="form_item_text w540">
                            </div>
                        </div>
                    </section>
                    <div class="search_btn_group">
                        <button type="button" class="search_btn_reset">초기화</button>
                        <button type="button" class="search_btn_search">검색</button>
                    </div>

                    <section class="list_table_group">
                        <div class="list_table_group__header _between">
                            <div class="list_table__total">
                                총 <strong id="total-count"></strong> 건
                            </div>
                        </div>
                        <div class="list_table_group__body">
                            <table class="list_table">
                                <colgroup>
                                    <col style="width: auto">
                                    <col style="width: auto">
                                    <col style="width: auto">
                                    <col style="width: auto">
                                    <col style="width: auto">
                                    <col style="width: auto">
                                </colgroup>

                                <thead>
                                    <tr>
                                        <th>순번</th>
                                        <th>제목</th>
                                        <th>작성자</th>
                                        <th>작성일</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <!-- 게시글 목록 출력 -->
                                </tbody>
                            </table>
                            
                            <div class="list_none">검색된 내용이 없습니다.</div>
                        </div>
                    </section>
                </section>
            </article>
        </div>
    </section>
</div>