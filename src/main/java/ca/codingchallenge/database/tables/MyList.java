/*
 * This file is generated by jOOQ.
*/
package codingchallenge.database.tables;


import codingchallenge.database.Indexes;
import codingchallenge.database.Keys;
import codingchallenge.database.Public;
import codingchallenge.database.tables.records.MyListRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyList extends TableImpl<MyListRecord> {

    private static final long serialVersionUID = -1810685667;

    /**
     * The reference instance of <code>public.my_list</code>
     */
    public static final MyList MY_LIST = new MyList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MyListRecord> getRecordType() {
        return MyListRecord.class;
    }

    /**
     * The column <code>public.my_list.id</code>.
     */
    public final TableField<MyListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('my_list_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.my_list.name</code>.
     */
    public final TableField<MyListRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.my_list.statement</code>.
     */
    public final TableField<MyListRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.my_list.creation_date</code>.
     */
    public final TableField<MyListRecord, String> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.my_list</code> table reference
     */
    public MyList() {
        this(DSL.name("my_list"), null);
    }

    /**
     * Create an aliased <code>public.my_list</code> table reference
     */
    public MyList(String alias) {
        this(DSL.name(alias), MY_LIST);
    }

    /**
     * Create an aliased <code>public.my_list</code> table reference
     */
    public MyList(Name alias) {
        this(alias, MY_LIST);
    }

    private MyList(Name alias, Table<MyListRecord> aliased) {
        this(alias, aliased, null);
    }

    private MyList(Name alias, Table<MyListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MY_LIST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MyListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MY_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MyListRecord> getPrimaryKey() {
        return Keys.MY_LIST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MyListRecord>> getKeys() {
        return Arrays.<UniqueKey<MyListRecord>>asList(Keys.MY_LIST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyList as(String alias) {
        return new MyList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyList as(Name alias) {
        return new MyList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MyList rename(String name) {
        return new MyList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MyList rename(Name name) {
        return new MyList(name, null);
    }
}
