package com.example.basicofall;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBhandler extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DB_NAME = "todo";
    private static final String TABLE_NAME = "todo";

    /*
    *
    *  Tracked Entity instances table
    *
    * */

    private static final String TEI_TABLE = "TEI_TABLE";
    private static final String ID = "ID";
    private static final String OU = "OU";
    private static final String DOR = "DOR";
    private static final String GN_AREA = "GN_AREA" ;
    private static final String REG_NUM = "REG_NUM" ;
    private static final String NAME_CHILD = "NAME_CHILD";
    private static final String SEX = "SEX";
    private static final String DOB = "DOB";
    private static final String ETHNICITY = "ETHNICITY";
    private static final String ADDRESS = "ADDRESS";
    private static final String SECTOR = "SECTOR";
    private static final String LANDLINE = "LANDLINE";
    private static final String MOBILE = "MOBILE";
    private static final String NAME_MOTHER = "NAME_MOTHER";
    private static final String NIC = "NIC";
    private static final String MOTHER_DOB = "MOTHER_DOB";
    private static final String NUM_CHILD = "NUM_CHILD";
    private static final String HIGHEST_EDU = "HIGHEST_EDU";
    private static final String OCCUPATION = "OCCUPATION";
    private static final String REL_TO_CHILD = "REL_TO_CHILD";
    private static final String CAREGIVER_NAME = "CAREGIVER_NAME";
    private static final String BIRTH_WEIGHT = "BIRTH_WEIGHT";
    private static final String BIRTH_LENGTH = "BIRTH_LENGTH";
    private static final String TEI = "TEI";
    private static final String SYNCED = "SYNCED";



    public DBhandler(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         String TABLE_TEI_CREATE_QUERY =  "CREATE TABLE " + TEI_TABLE + " " +
                 "("
                 + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                 + OU + " TEXT, "
                 + DOR + " TEXT, "
                 + GN_AREA + " TEXT, "
                 + REG_NUM + " TEXT, "
                 + NAME_CHILD + " TEXT, "
                 + SEX + " TEXT, "
                 + DOB + " TEXT, "
                 + ETHNICITY + " TEXT, "
                 + ADDRESS + " TEXT, "
                 + SECTOR + " TEXT, "
                 + LANDLINE + " TEXT, "
                 + MOBILE + " TEXT, "
                 + NAME_MOTHER + " TEXT, "
                 + NIC + " TEXT, "
                 + MOTHER_DOB + " TEXT, "
                 + NUM_CHILD + " INTEGER, "
                 + HIGHEST_EDU + " TEXT, "
                 + OCCUPATION + " TEXT, "
                 + REL_TO_CHILD + " TEXT, "
                 + CAREGIVER_NAME + " TEXT, "
                 + BIRTH_WEIGHT + " INTEGER, "
                 + BIRTH_LENGTH + " INTEGER, "
                 + TEI + " TEXT,"
                 + SYNCED + " BOOLEAN "
                 + ");" ;

         db.execSQL(TABLE_TEI_CREATE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String DROP_TEI_TABLE_QUERY = "DROP TABLE IF EXISTS " + TEI_TABLE;

        //Drop older table if exists
        db.execSQL(DROP_TEI_TABLE_QUERY);

        // Create table again
        onCreate(db);
    }

    public void addNewChild(childModel newChild)
    {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(NAME_CHILD, newChild.getNAME_CHILD());
        contentValues.put(DOB, newChild.getDOB());

        // saving to table
        sqLiteDatabase.insert(TEI_TABLE, null, contentValues);

        // close database
        sqLiteDatabase.close();

    }

    public int countTEI()
    {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        String query = "SELECT * FROM " + TEI_TABLE;

        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        return cursor.getCount();
    }

    public List<childModel> getAllChildren()
    {
        List<childModel> children = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT * FROM " + TEI_TABLE;

        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToFirst())
        {
            do{
                childModel c = new childModel();
                c.setID(cursor.getInt(0));
                c.setNAME_CHILD(cursor.getString(5));
                c.setDOB(cursor.getString(7));

                children.add(c);
            }while(cursor.moveToNext());
        }
        return children;
    }

    public void deleteChild(int id)
    {
        SQLiteDatabase db = getWritableDatabase();

        db.delete(TEI_TABLE, ID + " =?", new String[]{String.valueOf(id)} );

        db.close();
    }

    public childModel getChild(int id)
    {
        SQLiteDatabase db = getWritableDatabase();
        Cursor c = db.query(TEI_TABLE, new String[]{ID, NAME_CHILD, DOB}, ID + "=?",
                new String[]{String.valueOf(id)}, null,
                null, null, null);

        childModel child = new childModel();
        if(c != null)
        {
            c.moveToFirst();
            child.setNAME_CHILD(c.getString(1));
            child.setDOB(c.getString(2));
            return child;
        }
        return null;
    }

}
