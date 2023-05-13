package com.company.app.wildberries.component.data;

import com.company.app.core.util.Strings;
import com.company.app.wildberries.component.util.WBUtils;
import com.company.app.wildberries.domain.dto.WildberriesLinkDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseProducts {

	private Integer id;
	private String name;
	private Integer salePriceU;
	private String rating;
	private String feedbacks;
	private List<Size> sizes;

	public WildberriesLinkDto to() {
		return WildberriesLinkDto.builder()
				.price(Strings.cutEnd(this.salePriceU.toString(), 2))
				.link(WBUtils.getUrlForResponse(this.id.toString()))
				.build();
	}
}
