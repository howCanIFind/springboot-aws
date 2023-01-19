package com.book.spring.springbootaws.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE+USER","일반 사용자");

    private final String key;
    private final String title;
}
