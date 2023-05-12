package com.company.app.telegram.component.api;

import com.company.app.telegram.domain.entity.Chat;

/**
 * Отвечает за активацию чата.
 */
public interface ChatActivationService {

	void activate(Chat chat);

	void deactivate(Chat chat);
}
