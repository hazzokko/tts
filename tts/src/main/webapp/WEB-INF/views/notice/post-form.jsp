<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="wrap">
	<section class="layout_body">
		<div class="layout_content">
			<article class="content">
				<h1 class="content_main_title">공지사항</h1>
				<p class="content_main_title_txt">공지사항 관리</p>
				<br />

				<article class="view_content">
					<div class="view_content__header">
						<div class="form_group__row">
							<label for="" class="search_form__label w60">제목</label> <input
								type="text" name="" id="" class="form_item_text w80p">

							<div class="form_inline_group ml10">
								<label for="cck01" class="form_check__item_type01">긴급 <input
									type="checkbox" id="cck01" disabled="disabled"
									checked="checked"> <span></span>
								</label>
							</div>
						</div>
						<div class="form_group__row">
							<span class="search_form__label w60">첨부파일</span> <label
								for="file01" class="form_item_search"> <input
								type="file" name="" id="file01"> <span
								class="btn_form_item_search">찾기</span>
							</label>
							<div class="form_item_search__file">
								<div class="form_item_search__file__item">
									<span class="form_item_search__file_txt">첨부파일.txt</span>
									<button type="button" class="form_item_search__file_del">
										<span hidden>파일 삭제</span>
									</button>
								</div>
								<div class="form_item_search__file__item">
									<span class="form_item_search__file_txt">첨부파일.txt</span>
									<button type="button" class="form_item_search__file_del">
										<span hidden>파일 삭제</span>
									</button>
								</div>
							</div>
						</div>
					</div>
					<div class="view_content__body">
						<textarea name="" id="" class="form_item_textarea"></textarea>
					</div>
				</article>

				<div class="search_btn_group">
					<button type="button" class="btn_submit">생성</button>
				</div>

			</article>
		</div>
	</section>
</div>