/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.SelectField;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.Keys;
import org.jooq.generated.Public;
import org.jooq.generated.tables.UsersTable.UsersTablePath;
import org.jooq.generated.tables.records.ParsedCandidatesTableRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParsedCandidatesTable extends TableImpl<ParsedCandidatesTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.parsed_candidates_table</code>
     */
    public static final ParsedCandidatesTable PARSED_CANDIDATES_TABLE = new ParsedCandidatesTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParsedCandidatesTableRecord> getRecordType() {
        return ParsedCandidatesTableRecord.class;
    }

    /**
     * The column <code>public.parsed_candidates_table.id</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("gen_random_uuid()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.parsed_candidates_table.user_id</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.parsed_candidates_table.fido</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, String> FIDO = createField(DSL.name("fido"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.parsed_candidates_table.picture_url</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, String> PICTURE_URL = createField(DSL.name("picture_url"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.parsed_candidates_table.position_name</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, String> POSITION_NAME = createField(DSL.name("position_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.parsed_candidates_table.salary</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, Integer> SALARY = createField(DSL.name("salary"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.parsed_candidates_table.cv_url</code>.
     */
    public final TableField<ParsedCandidatesTableRecord, String> CV_URL = createField(DSL.name("cv_url"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private ParsedCandidatesTable(Name alias, Table<ParsedCandidatesTableRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ParsedCandidatesTable(Name alias, Table<ParsedCandidatesTableRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.parsed_candidates_table</code> table
     * reference
     */
    public ParsedCandidatesTable(String alias) {
        this(DSL.name(alias), PARSED_CANDIDATES_TABLE);
    }

    /**
     * Create an aliased <code>public.parsed_candidates_table</code> table
     * reference
     */
    public ParsedCandidatesTable(Name alias) {
        this(alias, PARSED_CANDIDATES_TABLE);
    }

    /**
     * Create a <code>public.parsed_candidates_table</code> table reference
     */
    public ParsedCandidatesTable() {
        this(DSL.name("parsed_candidates_table"), null);
    }

    public <O extends Record> ParsedCandidatesTable(Table<O> path, ForeignKey<O, ParsedCandidatesTableRecord> childPath, InverseForeignKey<O, ParsedCandidatesTableRecord> parentPath) {
        super(path, childPath, parentPath, PARSED_CANDIDATES_TABLE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ParsedCandidatesTablePath extends ParsedCandidatesTable implements Path<ParsedCandidatesTableRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ParsedCandidatesTablePath(Table<O> path, ForeignKey<O, ParsedCandidatesTableRecord> childPath, InverseForeignKey<O, ParsedCandidatesTableRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ParsedCandidatesTablePath(Name alias, Table<ParsedCandidatesTableRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ParsedCandidatesTablePath as(String alias) {
            return new ParsedCandidatesTablePath(DSL.name(alias), this);
        }

        @Override
        public ParsedCandidatesTablePath as(Name alias) {
            return new ParsedCandidatesTablePath(alias, this);
        }

        @Override
        public ParsedCandidatesTablePath as(Table<?> alias) {
            return new ParsedCandidatesTablePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<ParsedCandidatesTableRecord> getPrimaryKey() {
        return Keys.PARSED_CANDIDATES_TABLE_PKEY;
    }

    @Override
    public List<ForeignKey<ParsedCandidatesTableRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PARSED_CANDIDATES_TABLE__PARSED_CANDIDATES_TABLE_USER_ID_FKEY);
    }

    private transient UsersTablePath _usersTable;

    /**
     * Get the implicit join path to the <code>public.users_table</code> table.
     */
    public UsersTablePath usersTable() {
        if (_usersTable == null)
            _usersTable = new UsersTablePath(this, Keys.PARSED_CANDIDATES_TABLE__PARSED_CANDIDATES_TABLE_USER_ID_FKEY, null);

        return _usersTable;
    }

    @Override
    public ParsedCandidatesTable as(String alias) {
        return new ParsedCandidatesTable(DSL.name(alias), this);
    }

    @Override
    public ParsedCandidatesTable as(Name alias) {
        return new ParsedCandidatesTable(alias, this);
    }

    @Override
    public ParsedCandidatesTable as(Table<?> alias) {
        return new ParsedCandidatesTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ParsedCandidatesTable rename(String name) {
        return new ParsedCandidatesTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ParsedCandidatesTable rename(Name name) {
        return new ParsedCandidatesTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ParsedCandidatesTable rename(Table<?> name) {
        return new ParsedCandidatesTable(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ParsedCandidatesTable where(Condition condition) {
        return new ParsedCandidatesTable(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ParsedCandidatesTable where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ParsedCandidatesTable where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ParsedCandidatesTable where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ParsedCandidatesTable where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ParsedCandidatesTable where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ParsedCandidatesTable where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ParsedCandidatesTable where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ParsedCandidatesTable whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ParsedCandidatesTable whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, UUID, String, String, String, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super UUID, ? super UUID, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super UUID, ? super UUID, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
