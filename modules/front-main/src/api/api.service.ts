// NB! this file should be generated using `gradlew generateApi`

import {autoinject} from "aurelia-framework";
import {ApiClient} from "./api-client";

import {
  AddTodoItem$Request, AddTodoItem$Response,
  CheckTodoItem$Request, CheckTodoItem$Response,
  ClearTodoList$Request, ClearTodoList$Response,
  DeleteTodoItem$Request, DeleteTodoItem$Response,
  GetTodoList$Request, GetTodoList$Response,
  UncheckTodoItem$Request, UncheckTodoItem$Response,
} from "./api-types";

@autoinject
export class ApiService {
    public todo: TodoOperations;

    constructor(private api: ApiClient) {
        this.todo = new TodoOperations(this.api);
    }

}

export class TodoOperations {
  constructor(private api: ApiClient) {}

  addTodoItem(request: AddTodoItem$Request): Promise<AddTodoItem$Response> {
    return this.api.execute("addTodoItem", request);
  }
  checkTodoItem(): Promise<CheckTodoItem$Response> {
    return this.api.execute("checkTodoItem", {});
  }
  clearTodoList(): Promise<ClearTodoList$Response> {
    return this.api.execute("clearTodoList", {});
  }
  deleteTodoItem(): Promise<DeleteTodoItem$Response> {
    return this.api.execute("deleteTodoItem", {});
  }
  getTodoList(): Promise<GetTodoList$Response> {
    return this.api.execute("getTodoList", {});
  }
  uncheckTodoItem(): Promise<UncheckTodoItem$Response> {
    return this.api.execute("uncheckTodoItem", {});
  }

}
