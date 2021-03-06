/*
 * This file is generated by jOOQ.
*/
package com.example.todo.dao.generated.tables.records;


import com.example.todo.dao.generated.tables.TodoItem;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TodoItemRecord extends UpdatableRecordImpl<TodoItemRecord> implements Record5<Long, String, Boolean, Boolean, Long> {

    private static final long serialVersionUID = 1611175559;

    /**
     * Setter for <code>public.todo_item.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.todo_item.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.todo_item.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.todo_item.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.todo_item.checked</code>.
     */
    public void setChecked(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.todo_item.checked</code>.
     */
    public Boolean getChecked() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.todo_item.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.todo_item.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.todo_item.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.todo_item.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Boolean, Boolean, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Boolean, Boolean, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TodoItem.TODO_ITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TodoItem.TODO_ITEM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return TodoItem.TODO_ITEM.CHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TodoItem.TODO_ITEM.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TodoItem.TODO_ITEM.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoItemRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoItemRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoItemRecord value3(Boolean value) {
        setChecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoItemRecord value4(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoItemRecord value5(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoItemRecord values(Long value1, String value2, Boolean value3, Boolean value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TodoItemRecord
     */
    public TodoItemRecord() {
        super(TodoItem.TODO_ITEM);
    }

    /**
     * Create a detached, initialised TodoItemRecord
     */
    public TodoItemRecord(Long id, String name, Boolean checked, Boolean deleted, Long createdBy) {
        super(TodoItem.TODO_ITEM);

        set(0, id);
        set(1, name);
        set(2, checked);
        set(3, deleted);
        set(4, createdBy);
    }
}
