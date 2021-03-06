package com.example.todo.api;

import com.example.BaseMethod;
import com.example.PrototypeComponent;
import com.example.todo.dao.generated.tables.daos.TodoItemDao;
import com.example.todo.dao.generated.tables.pojos.TodoItemRow;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

@PrototypeComponent
@RequiredArgsConstructor
public class GetTodoList extends BaseMethod<GetTodoList.Request, GetTodoList.Response> {

    @Getter
    @RequiredArgsConstructor
    public static class Response {
        private final List<Item> items;

        @Getter
        @RequiredArgsConstructor
        private static class Item {
            private final Long id;
            private final String name;
            private final boolean checked;
            private final boolean deleted;
        }
    }

    @Getter
    @RequiredArgsConstructor
    public static class Request {
    }

    private final TodoItemDao todoItemDao;

    public Response execute() {
        List<Response.Item> all = todoItemDao.fetchByDeleted(false).stream()
                .sorted(comparing(TodoItemRow::getId))
                .map(row -> new Response.Item(row.getId(),
                row.getName(),
                row.getChecked(),
                        row.getDeleted()))
                .collect(toList());

        return new Response(all);
    }

}
