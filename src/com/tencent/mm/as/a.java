package com.tencent.mm.as;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

final class a
{
  private static final Pattern ikY = Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);
  private String cGy = "";
  private String dqq;
  private e ikZ;
  private String ila = "";
  private boolean ilb = false;
  String ilc = "";

  private boolean Ae(String paramString)
  {
    Cursor localCursor1 = this.ikZ.rawQuery("select DISTINCT  tbl_name from sqlite_master;", null);
    if (localCursor1 == null)
      return false;
    this.ikZ.execSQL("ATTACH DATABASE '" + paramString + "' AS old KEY ''");
    this.ikZ.beginTransaction();
    int i = 0;
    int j;
    if (i < localCursor1.getCount())
    {
      localCursor1.moveToPosition(i);
      Cursor localCursor2 = this.ikZ.rawQuery("select * from old.sqlite_master where tbl_name = '" + localCursor1.getString(0) + "'", null);
      if (localCursor2 == null)
        break label272;
      j = localCursor2.getCount();
      localCursor2.close();
    }
    while (true)
    {
      if (j == 0)
        z.w("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "In old db not found :" + localCursor1.getString(0));
      while (true)
      {
        i++;
        break;
        try
        {
          by("old." + localCursor1.getString(0), localCursor1.getString(0));
        }
        catch (Exception localException)
        {
          z.w("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "Insertselect FAILED :" + localCursor1.getString(0));
          localCursor1.close();
          this.ikZ.endTransaction();
          return false;
        }
      }
      this.ikZ.endTransaction();
      localCursor1.close();
      this.ikZ.execSQL("DETACH DATABASE old;");
      return true;
      label272: j = 0;
    }
  }

  private boolean a(String paramString1, long paramLong, String paramString2, int paramInt)
  {
    int i = PreferenceManager.getDefaultSharedPreferences(ak.getContext()).getInt(paramString1, 0);
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(ak.getContext()).edit();
    if (i > 2)
    {
      z.e("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "db crash count extends limit ,rename db ");
      String str = paramString1 + "err" + ch.CM();
      c.renameTo(new File(paramString1), new File(str));
      localEditor.putInt(paramString1, 0).commit();
    }
    this.dqq = f.d((paramString2 + paramLong).getBytes()).substring(0, 7);
    this.ikZ = e.b(paramString1, this.dqq, paramInt, false);
    if (this.ikZ == null)
    {
      this.cGy = ("Endbinit open failed: [" + paramLong + "] dev: [" + paramString2 + "]");
      return false;
    }
    if (i == 1)
    {
      int j = i + 1;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(this.ikZ.isDatabaseIntegrityOk());
      z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "check db Integrity %b", arrayOfObject2);
      localEditor.putInt(paramString1, j).commit();
    }
    try
    {
      Cursor localCursor = this.ikZ.rawQuery("select count(*) from sqlite_master limit 1;", null);
      localCursor.moveToNext();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(localCursor.getInt(0));
      z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "openEncryptDatabase check master tables:%d", arrayOfObject1);
      if (localCursor != null)
        localCursor.close();
      return true;
    }
    catch (Exception localException1)
    {
      z.e("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "Check EnDB Key failed :" + localException1.getMessage());
      this.cGy = ("Endbinit check failed: [" + paramLong + "] dev: [" + paramString2 + "] msg:[" + localException1.getMessage() + "] stack:[" + localException1.getStackTrace() + "]");
    }
    try
    {
      this.ikZ.close();
      label414: this.ikZ = null;
      this.dqq = null;
      return false;
    }
    catch (Exception localException2)
    {
      break label414;
    }
  }

  private boolean a(String paramString, HashMap paramHashMap, boolean paramBoolean)
  {
    if (this.ikZ != null)
    {
      this.ikZ.close();
      this.ikZ = null;
    }
    boolean bool1 = c.ac(paramString);
    this.ikZ = e.b(paramString, null, 0, false);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Boolean.valueOf(bool1);
    arrayOfObject[2] = paramString;
    z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "initSysDbByEnSo checkini:%b exist:%b db:%s ", arrayOfObject);
    if (this.ikZ == null)
      return false;
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    a(paramHashMap, paramBoolean, bool2);
    return true;
  }

  private boolean a(HashMap paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Boolean.valueOf(paramBoolean1);
    if (paramHashMap == null);
    StringBuilder localStringBuilder;
    for (int i = -1; ; i = paramHashMap.size())
    {
      arrayOfObject1[1] = Integer.valueOf(i);
      z.d("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "createtables checkCreateIni:%b  tables:%d", arrayOfObject1);
      str1 = "";
      if (!paramBoolean1)
        break label319;
      this.ila = (this.ikZ.getPath() + ".ini");
      localStringBuilder = new StringBuilder();
      if (paramHashMap == null)
        break;
      Iterator localIterator2 = paramHashMap.values().iterator();
      while (localIterator2.hasNext())
      {
        j localj = (j)localIterator2.next();
        if (localj.kF() == null)
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = localj.getClass().toString();
          z.e("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "factory.getSQLs() is null: %s", arrayOfObject4);
          Assert.assertTrue("factory.getSQLs() is null:" + localj.getClass().toString(), false);
        }
        String[] arrayOfString2 = localj.kF();
        int i1 = arrayOfString2.length;
        for (int i2 = 0; i2 < i1; i2++)
          localStringBuilder.append(arrayOfString2[i2].hashCode());
      }
    }
    String str1 = f.d(localStringBuilder.toString().getBytes());
    if (!paramBoolean2)
    {
      String str4 = g.getValue(this.ila, "createmd5");
      if ((!ch.jb(str4)) && (str1.equals(str4)))
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = this.ikZ.getPath();
        z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "Create table factories not changed , no need create !  %s", arrayOfObject3);
        return true;
      }
    }
    label319: String str2 = str1;
    this.ikZ.execSQL("pragma auto_vacuum = 0 ");
    this.ikZ.rawQuery("pragma journal_mode=\"WAL\"", null).close();
    l locall = new l();
    this.ikZ.beginTransaction();
    if (paramHashMap != null)
    {
      Iterator localIterator1 = paramHashMap.values().iterator();
      int n;
      for (j = 0; localIterator1.hasNext(); j = n)
      {
        String[] arrayOfString1 = ((j)localIterator1.next()).kF();
        int k = arrayOfString1.length;
        int m = 0;
        n = j;
        while (true)
          if (m < k)
          {
            String str3 = arrayOfString1[m];
            try
            {
              this.ikZ.execSQL(str3);
              n++;
              m++;
            }
            catch (Exception localException)
            {
              while (true)
              {
                Matcher localMatcher = ikY.matcher(str3);
                if ((localMatcher != null) && (localMatcher.matches()))
                  Assert.assertTrue("CreateTable failed:[" + str3 + "][" + localException.getMessage() + "]", false);
                else
                  z.f("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "CreateTable failed:[" + str3 + "][" + localException.getMessage() + "]");
              }
            }
          }
      }
    }
    int j = 0;
    long l = locall.nM();
    this.ikZ.endTransaction();
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Long.valueOf(l);
    arrayOfObject2[1] = Long.valueOf(locall.nM());
    arrayOfObject2[2] = Integer.valueOf(j);
    z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "createtables end sql:%d trans:%d sqlCount:%d", arrayOfObject2);
    if (paramBoolean1)
      g.h(this.ila, "createmd5", str2);
    return true;
  }

  private void by(String paramString1, String paramString2)
  {
    HashSet localHashSet = new HashSet();
    Cursor localCursor1 = this.ikZ.rawQuery("select * from " + paramString1 + " limit 1 ", null);
    if (localCursor1.getCount() == 0)
    {
      localCursor1.close();
      return;
    }
    localCursor1.moveToFirst();
    for (int i = 0; i < localCursor1.getColumnCount(); i++)
      localHashSet.add(localCursor1.getColumnName(i));
    localCursor1.close();
    Cursor localCursor2 = this.ikZ.rawQuery("PRAGMA table_info( " + paramString2 + " )", null);
    String str1 = "";
    while (localCursor2.moveToNext())
    {
      String str4 = localCursor2.getString(localCursor2.getColumnIndex("name"));
      if (localHashSet.contains(str4))
      {
        String str5 = str1 + str4;
        str1 = str5 + ",";
      }
    }
    localCursor2.close();
    String str2 = str1.substring(0, -1 + str1.length());
    String str3 = "insert into " + paramString2 + "(" + str2 + ") select " + str2 + " from " + paramString1 + ";";
    this.ikZ.execSQL(str3);
  }

  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, HashMap paramHashMap, boolean paramBoolean)
  {
    boolean bool1;
    boolean bool2;
    boolean bool4;
    label86: int i;
    label94: Object[] arrayOfObject;
    if (!ch.jb(paramString2))
    {
      bool1 = true;
      Assert.assertTrue("create SqliteDB enDbCachePath == null ", bool1);
      this.ilc = (paramString2 + ".errreport");
      if (this.ikZ != null)
      {
        this.ikZ.close();
        this.ikZ = null;
      }
      bool2 = c.ac(paramString2);
      boolean bool3 = c.ac(paramString1);
      if ((bool2) || (!bool3))
        break label245;
      bool4 = true;
      if (!bool4)
        break label251;
      i = 1;
      this.ilb = a(paramString2, paramLong, paramString3, i);
      arrayOfObject = new Object[7];
      arrayOfObject[0] = paramString2;
      arrayOfObject[1] = Boolean.valueOf(bool2);
      arrayOfObject[2] = Boolean.valueOf(bool3);
      arrayOfObject[3] = Boolean.valueOf(bool4);
      arrayOfObject[4] = Boolean.valueOf(this.ilb);
      if (this.ikZ == null)
        break label257;
    }
    label257: for (boolean bool5 = true; ; bool5 = false)
    {
      arrayOfObject[5] = Boolean.valueOf(bool5);
      arrayOfObject[6] = Thread.currentThread().getName();
      z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "initDb(en) path:%s enExist:%b oldExist:%b copyold:%b dbopenSUCC:%b db:%b thr:%s", arrayOfObject);
      if ((this.ikZ != null) || (ch.jb(paramString1)))
        break label263;
      this.dqq = null;
      z.e("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "Failed to Use ENCRYPT database!");
      this.ilb = false;
      return a(paramString1, paramHashMap, false);
      bool1 = false;
      break;
      label245: bool4 = false;
      break label86;
      label251: i = 0;
      break label94;
    }
    label263: if (!bool2);
    for (boolean bool6 = true; ; bool6 = false)
    {
      a(paramHashMap, paramBoolean, bool6);
      if (bool4)
        break;
      return true;
    }
    if (Ae(paramString1))
      return true;
    z.e("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "Failed to COPY OLD DATA to ENCRYPT database!");
    this.dqq = null;
    this.ikZ.close();
    this.ikZ = null;
    this.ilb = false;
    return a(paramString1, paramHashMap, paramBoolean);
  }

  public final boolean a(String paramString, HashMap paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.ikZ != null)
    {
      this.ikZ.close();
      this.ikZ = null;
    }
    boolean bool1 = c.ac(paramString);
    this.ikZ = e.M(paramString, paramBoolean2);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean1);
    arrayOfObject[1] = Boolean.valueOf(bool1);
    arrayOfObject[2] = paramString;
    z.i("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "initSysDB checkini:%b exist:%b db:%s ", arrayOfObject);
    if (this.ikZ == null)
      return false;
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    a(paramHashMap, paramBoolean1, bool2);
    return true;
  }

  public final e aKM()
  {
    return this.ikZ;
  }

  public final String aKN()
  {
    if ((ch.jb(this.cGy)) || (ch.jb(this.ilc)))
      return "";
    if (!ch.jb(g.getValue(this.ilc, "Reported")))
      return "";
    g.h(this.ilc, "Reported", "true");
    return this.cGy;
  }

  public final void aKO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.ila;
    z.d("!24@/B4Tb64lLpJhDvI2AsvrCQ==", "resetIniCache iniFilename:%s", arrayOfObject);
    c.deleteFile(this.ila);
  }

  public final String getKey()
  {
    return this.dqq;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.a
 * JD-Core Version:    0.6.2
 */