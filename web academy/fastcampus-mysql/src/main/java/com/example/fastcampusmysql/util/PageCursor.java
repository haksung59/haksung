package com.example.fastcampusmysql.util;

import java.util.List;

public record PageCursor<T>(
        CursorRequest nextRequest,
        List<T> body
) {
}
