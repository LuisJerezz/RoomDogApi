package com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DogDao_DatabaseDogs_Impl implements DogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DogEntity> __insertionAdapterOfDogEntity;

  private final EntityDeletionOrUpdateAdapter<DogEntity> __deletionAdapterOfDogEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public DogDao_DatabaseDogs_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDogEntity = new EntityInsertionAdapter<DogEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `DogEntity` (`id`,`breed`,`image`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DogEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getBreed() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBreed());
        }
        if (entity.getImage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImage());
        }
      }
    };
    this.__deletionAdapterOfDogEntity = new EntityDeletionOrUpdateAdapter<DogEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `DogEntity` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DogEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM dogentity";
        return _query;
      }
    };
  }

  @Override
  public Object insertDog(final DogEntity[] dogs, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDogEntity.insert(dogs);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAllDog(final List<DogEntity> dogs,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDogEntity.insert(dogs);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final DogEntity dog, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDogEntity.handle(dog);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAll(final Continuation<? super List<DogEntity>> continuation) {
    final String _sql = "SELECT * FROM dogentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DogEntity>>() {
      @Override
      @NonNull
      public List<DogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBreed = CursorUtil.getColumnIndexOrThrow(_cursor, "breed");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<DogEntity> _result = new ArrayList<DogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DogEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBreed;
            if (_cursor.isNull(_cursorIndexOfBreed)) {
              _tmpBreed = null;
            } else {
              _tmpBreed = _cursor.getString(_cursorIndexOfBreed);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new DogEntity(_tmpId,_tmpBreed,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getDogsByBreed(final String breed,
      final Continuation<? super List<DogEntity>> continuation) {
    final String _sql = "SELECT * FROM dogentity WHERE breed = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (breed == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, breed);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DogEntity>>() {
      @Override
      @NonNull
      public List<DogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBreed = CursorUtil.getColumnIndexOrThrow(_cursor, "breed");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<DogEntity> _result = new ArrayList<DogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DogEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBreed;
            if (_cursor.isNull(_cursorIndexOfBreed)) {
              _tmpBreed = null;
            } else {
              _tmpBreed = _cursor.getString(_cursorIndexOfBreed);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new DogEntity(_tmpId,_tmpBreed,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
