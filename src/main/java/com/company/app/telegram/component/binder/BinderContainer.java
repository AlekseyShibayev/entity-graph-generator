package com.company.app.telegram.component.binder;

import com.company.app.telegram.domain.entity.Chat;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BinderContainer {

	Chat chat;
	String message;
}
