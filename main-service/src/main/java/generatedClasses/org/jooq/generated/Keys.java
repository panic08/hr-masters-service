/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.generated.tables.FlywaySchemaHistory;
import org.jooq.generated.tables.UsersTable;
import org.jooq.generated.tables.records.FlywaySchemaHistoryRecord;
import org.jooq.generated.tables.records.UsersTableRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<UsersTableRecord> USERS_TABLE_EMAIL_KEY = Internal.createUniqueKey(UsersTable.USERS_TABLE, DSL.name("users_table_email_key"), new TableField[] { UsersTable.USERS_TABLE.EMAIL }, true);
    public static final UniqueKey<UsersTableRecord> USERS_TABLE_PKEY = Internal.createUniqueKey(UsersTable.USERS_TABLE, DSL.name("users_table_pkey"), new TableField[] { UsersTable.USERS_TABLE.ID }, true);
}
