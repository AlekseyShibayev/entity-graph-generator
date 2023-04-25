package com.company.app.telegram.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TargetMessage {

	Long chatId;
	String message;
}
