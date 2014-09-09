package com.tencent.mm.sdk.f;

import android.content.ContentValues;
import android.database.Cursor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class a
{
  private static final Map dJu = new HashMap();
  private static final Map dJv = new HashMap();
  private static final Map iGw = new HashMap();

  static
  {
    try
    {
      dJu.put([B.class, new b());
      dJu.put(Short.TYPE, new m());
      dJu.put(Short.class, new w());
      dJu.put(Boolean.TYPE, new x());
      dJu.put(Boolean.class, new y());
      dJu.put(Integer.TYPE, new z());
      dJu.put(Integer.class, new aa());
      dJu.put(Float.TYPE, new ab());
      dJu.put(Float.class, new ac());
      dJu.put(Double.TYPE, new c());
      dJu.put(Double.class, new d());
      dJu.put(Long.TYPE, new e());
      dJu.put(Long.class, new f());
      dJu.put(String.class, new g());
      dJv.put([B.class, new h());
      dJv.put(Short.TYPE, new i());
      dJv.put(Short.class, new j());
      dJv.put(Boolean.TYPE, new k());
      dJv.put(Boolean.class, new l());
      dJv.put(Integer.TYPE, new n());
      dJv.put(Integer.class, new o());
      dJv.put(Float.TYPE, new p());
      dJv.put(Float.class, new q());
      dJv.put(Double.TYPE, new r());
      dJv.put(Double.class, new s());
      dJv.put(Long.TYPE, new t());
      dJv.put(Long.class, new u());
      dJv.put(String.class, new v());
      iGw.put([B.class, "BLOB");
      iGw.put(Short.TYPE, "SHORT");
      iGw.put(Short.class, "SHORT");
      iGw.put(Boolean.TYPE, "INTEGER");
      iGw.put(Boolean.class, "INTEGER");
      iGw.put(Integer.TYPE, "INTEGER");
      iGw.put(Integer.class, "INTEGER");
      iGw.put(Float.TYPE, "FLOAT");
      iGw.put(Float.class, "FLOAT");
      iGw.put(Double.TYPE, "DOUBLE");
      iGw.put(Double.class, "DOUBLE");
      iGw.put(Long.TYPE, "LONG");
      iGw.put(Long.class, "LONG");
      iGw.put(String.class, "TEXT");
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static String b(Class paramClass)
  {
    return (String)iGw.get(paramClass);
  }

  public static void keep_getBlob(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      paramContentValues.put(ad.a(paramField), (byte[])paramField.get(paramObject));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getBoolean(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      String str = ad.a(paramField);
      if (paramField.getBoolean(paramObject));
      for (int i = 1; ; i = 0)
      {
        paramContentValues.put(str, Integer.valueOf(i));
        return;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getDouble(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      if (!paramField.getType().equals(Double.TYPE))
      {
        paramContentValues.put(ad.a(paramField), (Double)paramField.get(paramObject));
        return;
      }
      paramContentValues.put(ad.a(paramField), Double.valueOf(paramField.getDouble(paramObject)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getFloat(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      if (!paramField.getType().equals(Float.TYPE))
      {
        paramContentValues.put(ad.a(paramField), (Float)paramField.get(paramObject));
        return;
      }
      paramContentValues.put(ad.a(paramField), Float.valueOf(paramField.getFloat(paramObject)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getInt(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      if (!paramField.getType().equals(Integer.TYPE))
      {
        paramContentValues.put(ad.a(paramField), (Integer)paramField.get(paramObject));
        return;
      }
      paramContentValues.put(ad.a(paramField), Integer.valueOf(paramField.getInt(paramObject)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getLong(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      if (!paramField.getType().equals(Long.TYPE))
      {
        paramContentValues.put(ad.a(paramField), (Long)paramField.get(paramObject));
        return;
      }
      paramContentValues.put(ad.a(paramField), Long.valueOf(paramField.getLong(paramObject)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getShort(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      paramContentValues.put(ad.a(paramField), Short.valueOf(paramField.getShort(paramObject)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_getString(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    try
    {
      paramContentValues.put(ad.a(paramField), (String)paramField.get(paramObject));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setBlob(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      paramField.set(paramObject, paramCursor.getBlob(paramInt));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setBoolean(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    while (true)
    {
      try
      {
        if (paramField.getType().equals(Boolean.TYPE))
        {
          if (paramCursor.getInt(paramInt) != 0)
          {
            bool = true;
            paramField.setBoolean(paramObject, bool);
          }
        }
        else
        {
          paramField.set(paramObject, Integer.valueOf(paramCursor.getInt(paramInt)));
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      boolean bool = false;
    }
  }

  public static void keep_setDouble(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      if (paramField.getType().equals(Double.TYPE))
      {
        paramField.setDouble(paramObject, paramCursor.getDouble(paramInt));
        return;
      }
      paramField.set(paramObject, Double.valueOf(paramCursor.getDouble(paramInt)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setFloat(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      if (paramField.getType().equals(Float.TYPE))
      {
        paramField.setFloat(paramObject, paramCursor.getFloat(paramInt));
        return;
      }
      paramField.set(paramObject, Float.valueOf(paramCursor.getFloat(paramInt)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setInt(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      if (paramField.getType().equals(Integer.TYPE))
      {
        paramField.setInt(paramObject, paramCursor.getInt(paramInt));
        return;
      }
      paramField.set(paramObject, Integer.valueOf(paramCursor.getInt(paramInt)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setLong(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      if (paramField.getType().equals(Long.TYPE))
      {
        paramField.setLong(paramObject, paramCursor.getLong(paramInt));
        return;
      }
      paramField.set(paramObject, Long.valueOf(paramCursor.getLong(paramInt)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setShort(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      if (paramField.getType().equals(Short.TYPE))
      {
        paramField.setShort(paramObject, paramCursor.getShort(paramInt));
        return;
      }
      paramField.set(paramObject, Short.valueOf(paramCursor.getShort(paramInt)));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void keep_setString(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    try
    {
      paramField.set(paramObject, paramCursor.getString(paramInt));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.a
 * JD-Core Version:    0.6.2
 */