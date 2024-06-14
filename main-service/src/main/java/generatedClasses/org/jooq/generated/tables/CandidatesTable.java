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
import org.jooq.generated.tables.records.CandidatesTableRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidatesTable extends TableImpl<CandidatesTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.candidates_table</code>
     */
    public static final CandidatesTable CANDIDATES_TABLE = new CandidatesTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CandidatesTableRecord> getRecordType() {
        return CandidatesTableRecord.class;
    }

    /**
     * The column <code>public.candidates_table.id</code>.
     */
    public final TableField<CandidatesTableRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("gen_random_uuid()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.candidates_table.user_id</code>.
     */
    public final TableField<CandidatesTableRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.candidates_table.fido</code>.
     */
    public final TableField<CandidatesTableRecord, String> FIDO = createField(DSL.name("fido"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.candidates_table.picture_url</code>.
     */
    public final TableField<CandidatesTableRecord, String> PICTURE_URL = createField(DSL.name("picture_url"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.candidates_table.position_name</code>.
     */
    public final TableField<CandidatesTableRecord, String> POSITION_NAME = createField(DSL.name("position_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.candidates_table.salary</code>.
     */
    public final TableField<CandidatesTableRecord, Integer> SALARY = createField(DSL.name("salary"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.candidates_table.cv_url</code>.
     */
    public final TableField<CandidatesTableRecord, String> CV_URL = createField(DSL.name("cv_url"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private CandidatesTable(Name alias, Table<CandidatesTableRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private CandidatesTable(Name alias, Table<CandidatesTableRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.candidates_table</code> table reference
     */
    public CandidatesTable(String alias) {
        this(DSL.name(alias), CANDIDATES_TABLE);
    }

    /**
     * Create an aliased <code>public.candidates_table</code> table reference
     */
    public CandidatesTable(Name alias) {
        this(alias, CANDIDATES_TABLE);
    }

    /**
     * Create a <code>public.candidates_table</code> table reference
     */
    public CandidatesTable() {
        this(DSL.name("candidates_table"), null);
    }

    public <O extends Record> CandidatesTable(Table<O> path, ForeignKey<O, CandidatesTableRecord> childPath, InverseForeignKey<O, CandidatesTableRecord> parentPath) {
        super(path, childPath, parentPath, CANDIDATES_TABLE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class CandidatesTablePath extends CandidatesTable implements Path<CandidatesTableRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> CandidatesTablePath(Table<O> path, ForeignKey<O, CandidatesTableRecord> childPath, InverseForeignKey<O, CandidatesTableRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private CandidatesTablePath(Name alias, Table<CandidatesTableRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public CandidatesTablePath as(String alias) {
            return new CandidatesTablePath(DSL.name(alias), this);
        }

        @Override
        public CandidatesTablePath as(Name alias) {
            return new CandidatesTablePath(alias, this);
        }

        @Override
        public CandidatesTablePath as(Table<?> alias) {
            return new CandidatesTablePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CandidatesTableRecord> getPrimaryKey() {
        return Keys.CANDIDATES_TABLE_PKEY;
    }

    @Override
    public List<ForeignKey<CandidatesTableRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CANDIDATES_TABLE__CANDIDATES_TABLE_USER_ID_FKEY);
    }

    private transient UsersTablePath _usersTable;

    /**
     * Get the implicit join path to the <code>public.users_table</code> table.
     */
    public UsersTablePath usersTable() {
        if (_usersTable == null)
            _usersTable = new UsersTablePath(this, Keys.CANDIDATES_TABLE__CANDIDATES_TABLE_USER_ID_FKEY, null);

        return _usersTable;
    }

    @Override
    public CandidatesTable as(String alias) {
        return new CandidatesTable(DSL.name(alias), this);
    }

    @Override
    public CandidatesTable as(Name alias) {
        return new CandidatesTable(alias, this);
    }

    @Override
    public CandidatesTable as(Table<?> alias) {
        return new CandidatesTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CandidatesTable rename(String name) {
        return new CandidatesTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CandidatesTable rename(Name name) {
        return new CandidatesTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CandidatesTable rename(Table<?> name) {
        return new CandidatesTable(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CandidatesTable where(Condition condition) {
        return new CandidatesTable(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CandidatesTable where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CandidatesTable where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CandidatesTable where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CandidatesTable where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CandidatesTable where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CandidatesTable where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CandidatesTable where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CandidatesTable whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CandidatesTable whereNotExists(Select<?> select) {
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