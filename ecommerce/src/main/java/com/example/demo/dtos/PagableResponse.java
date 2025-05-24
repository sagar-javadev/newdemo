package com.example.demo.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagableResponse<T> {
	
	 private List<T> content;
	    private Integer pageNumber;
	    private Integer pageSize;
	    private Long totalElement;

	    private Integer totalPages;
	    private boolean lastPage;
		public List<T> getContent() {
			return content;
		}
		public void setContent(List<T> content) {
			this.content = content;
		}
		public Integer getPageNumber() {
			return pageNumber;
		}
		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
		public Long getTotalElement() {
			return totalElement;
		}
		public void setTotalElement(Long totalElement) {
			this.totalElement = totalElement;
		}
		public Integer getTotalPages() {
			return totalPages;
		}
		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}
		public boolean isLastPage() {
			return lastPage;
		}
		public void setLastPage(boolean lastPage) {
			this.lastPage = lastPage;
		}
	    
	    

}
