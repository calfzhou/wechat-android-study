package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cs;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j extends ap
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS addr_upload2 ( id int  PRIMARY KEY , md5 text  , peopleid text  , uploadtime long  , realname text  , realnamepyinitial text  , realnamequanpin text  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , type int  , moblie text  , email text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int , lvbuf BLOG ) ", "CREATE INDEX IF NOT EXISTS upload_time_index ON addr_upload2 ( uploadtime ) ", "CREATE INDEX IF NOT EXISTS addr_upload_user_index ON addr_upload2 ( username ) " };
  private final h dmb;

  public j(h paramh)
  {
    this.dmb = paramh;
    int i = 0;
    Cursor localCursor = paramh.rawQuery("PRAGMA table_info( " + "addr_upload2" + " )", null);
    while (localCursor.moveToNext())
    {
      int j = localCursor.getColumnIndex("name");
      if ((j >= 0) && ("lvbuf".equalsIgnoreCase(localCursor.getString(j))))
        i = 1;
    }
    localCursor.close();
    if (i == 0)
      paramh.bp("addr_upload2", "Alter table " + "addr_upload2" + " add lvbuf BLOB ");
  }

  private List go(String paramString)
  {
    z.d("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "sql : " + paramString);
    LinkedList localLinkedList = new LinkedList();
    z.d("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "sql : " + paramString);
    Cursor localCursor = this.dmb.rawQuery(paramString, null);
    localCursor.moveToFirst();
    if (localCursor.getCount() <= 0)
    {
      localCursor.close();
      return localLinkedList;
    }
    do
    {
      i locali = new i();
      locali.b(localCursor);
      localLinkedList.add(locali);
    }
    while (localCursor.moveToNext());
    localCursor.close();
    return localLinkedList;
  }

  public final i I(long paramLong)
  {
    i locali = new i();
    String str = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf from addr_upload2 WHERE id=" + Long.toString(paramLong) + ';';
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.moveToFirst())
      locali.b(localCursor);
    localCursor.close();
    return locali;
  }

  public final i O(String paramString1, String paramString2)
  {
    i locali = gn(paramString1);
    if (locali == null)
      locali = gn(paramString2);
    return locali;
  }

  public final int a(String paramString, i parami)
  {
    ContentValues localContentValues = parami.ir();
    int i = localContentValues.size();
    int j = 0;
    if (i > 0)
    {
      h localh = this.dmb;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = i.fR(paramString);
      j = localh.update("addr_upload2", localContentValues, "id=?", arrayOfString);
    }
    if (j > 0)
    {
      if (!parami.vu().equals(paramString))
      {
        b(5, this, paramString);
        b(2, this, parami.vu());
      }
    }
    else
      return j;
    b(3, this, paramString);
    return j;
  }

  public final boolean g(List paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
      return false;
    cs localcs = new cs("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "transaction");
    localcs.addSplit("transation begin");
    long l = this.dmb.dc(Thread.currentThread().getId());
    int i = 0;
    while (true)
      try
      {
        i locali;
        int j;
        boolean bool;
        int k;
        ContentValues localContentValues2;
        int m;
        int n;
        h localh;
        String[] arrayOfString;
        Object[] arrayOfObject2;
        Object[] arrayOfObject3;
        if (i < paramList.size())
        {
          locali = (i)paramList.get(i);
          if (locali == null)
            continue;
          String str1 = locali.vu();
          String str2 = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf from addr_upload2  where addr_upload2.id = \"" + i.fR(str1) + "\"";
          Cursor localCursor = this.dmb.rawQuery(str2, null);
          if (localCursor == null)
          {
            j = 0;
            if (j != 0)
              continue;
            locali.db(-1);
            ContentValues localContentValues1 = locali.ir();
            if ((int)this.dmb.insert("addr_upload2", "id", localContentValues1) == -1)
            {
              Object[] arrayOfObject1 = new Object[2];
              arrayOfObject1[0] = locali.vC();
              arrayOfObject1[1] = locali.vD();
              z.i("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "batchSet insert failed, num:%s email:%s", arrayOfObject1);
              bool = true;
              this.dmb.dd(l);
              localcs.addSplit("transation end");
              localcs.dumpToLog();
              return bool;
            }
          }
          else if (localCursor.getCount() > 0)
          {
            j = 1;
            localCursor.close();
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", localException.getMessage());
        bool = false;
        continue;
        j = 0;
        continue;
        b(2, this, locali.vu());
        continue;
        k = i.fR(locali.vu());
        localContentValues2 = locali.ir();
        m = localContentValues2.size();
        n = 0;
        if (m > 0)
        {
          localh = this.dmb;
          arrayOfString = new String[1];
          arrayOfString[0] = String.valueOf(k);
          n = localh.update("addr_upload2", localContentValues2, "id=?", arrayOfString);
        }
        if (n == 0)
        {
          arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = locali.vC();
          arrayOfObject2[1] = locali.vD();
          z.i("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "batchSet update result=0, num:%s email:%s", arrayOfObject2);
        }
        else
        {
          if (n < 0)
          {
            arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = locali.vC();
            arrayOfObject3[1] = locali.vD();
            z.i("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "batchSet update failed, num:%s email:%s", arrayOfObject3);
            bool = true;
            continue;
          }
          b(3, this, locali.vu());
          continue;
          bool = true;
          continue;
        }
        i++;
      }
  }

  public final String gk(String paramString)
  {
    String str1 = "select addr_upload2.realname from addr_upload2 where addr_upload2.id = \"" + i.fR(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str1, null);
    if (localCursor == null)
      return "";
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      return "";
    }
    String str2 = "";
    if (localCursor.moveToFirst())
      str2 = localCursor.getString(0);
    localCursor.close();
    return str2;
  }

  public final i gl(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    i locali = new i();
    String str = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf from addr_upload2 where addr_upload2.username=\"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    z.d("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "get addrUpload :" + paramString + ", resCnt:" + localCursor.getCount());
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locali.b(localCursor);
    }
    localCursor.close();
    return locali;
  }

  public final Cursor gm(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString != null) && (paramString.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("addr_upload2.realname like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.realnamepyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.realnamequanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.username like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamepyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamequanpin like '%" + paramString + "%' )");
    }
    String str = (String)bg.qW().oQ().get(6);
    if ((str != null) && (!str.equals("")))
      return this.dmb.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf from addr_upload2  where type = 0 and moblie <> " + str + localStringBuilder.toString() + " order by  case when status = 1 then 0  when status = 65536 then 1  when status = 2 then 2 else 3 end  , realnamepyinitial", null);
    return this.dmb.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf from addr_upload2  where type = 0" + localStringBuilder.toString() + " order by  case when status = 1 then 0  when status = 65536 then 1  when status = 2 then 2 else 3 end  , realnamepyinitial", null);
  }

  public final i gn(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    String str = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf from addr_upload2 where addr_upload2.id=\"" + i.fR(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    z.d("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "get addrUpload :" + paramString + ", resCnt:" + localCursor.getCount());
    int i = localCursor.getCount();
    i locali = null;
    if (i != 0)
    {
      localCursor.moveToFirst();
      locali = new i();
      locali.b(localCursor);
    }
    localCursor.close();
    return locali;
  }

  public final boolean h(List paramList)
  {
    if (paramList.size() <= 0)
      return false;
    cs localcs = new cs("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "delete transaction");
    localcs.addSplit("begin");
    long l = this.dmb.dc(Thread.currentThread().getId());
    boolean bool;
    try
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          h localh = this.dmb;
          String[] arrayOfString = new String[1];
          arrayOfString[0] = i.fR(str);
          int i = localh.delete("addr_upload2", "id =?", arrayOfString);
          z.d("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "delete addr_upload2 md5 :" + str + ", res:" + i);
          if (i > 0)
            b(5, this, str);
        }
      }
    }
    catch (Exception localException)
    {
      bool = false;
    }
    while (true)
    {
      this.dmb.dd(l);
      localcs.addSplit("end");
      localcs.dumpToLog();
      return bool;
      bool = true;
    }
  }

  public final boolean i(List paramList)
  {
    cs localcs = new cs("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "set uploaded transaction");
    localcs.addSplit("transation begin");
    long l = this.dmb.dc(Thread.currentThread().getId());
    boolean bool;
    try
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          i locali = new i();
          locali.db(8);
          locali.F(ch.CL());
          ContentValues localContentValues = locali.ir();
          int i = localContentValues.size();
          int j = 0;
          if (i > 0)
          {
            h localh = this.dmb;
            String[] arrayOfString = new String[1];
            arrayOfString[0] = i.fR(str);
            j = localh.update("addr_upload2", localContentValues, "id=?", arrayOfString);
          }
          z.i("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "local contact uploaded : " + str + ", update result: " + j);
        }
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", localException.getMessage());
      bool = false;
    }
    while (true)
    {
      this.dmb.dd(l);
      localcs.addSplit("transation end");
      localcs.dumpToLog();
      if (bool)
        b(3, this, null);
      return bool;
      bool = true;
    }
  }

  public final int vK()
  {
    int i = this.dmb.delete("addr_upload2", null, null);
    z.d("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "delete addr_upload2");
    if (i > 0)
      b(5, this, null);
    return i;
  }

  public final List vL()
  {
    Cursor localCursor = this.dmb.rawQuery("select addr_upload2.md5 from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 1", null);
    LinkedList localLinkedList = new LinkedList();
    while (localCursor.moveToNext())
      localLinkedList.add(localCursor.getString(0));
    localCursor.close();
    return localLinkedList;
  }

  public final List vM()
  {
    Cursor localCursor = this.dmb.rawQuery("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", null);
    LinkedList localLinkedList = new LinkedList();
    while (localCursor.moveToNext())
    {
      String[] arrayOfString = new String[2];
      arrayOfString[0] = localCursor.getString(0);
      arrayOfString[1] = localCursor.getString(1);
      localLinkedList.add(arrayOfString);
    }
    localCursor.close();
    return localLinkedList;
  }

  public final List vN()
  {
    Cursor localCursor = this.dmb.rawQuery("select addr_upload2.moblie from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 0", null);
    LinkedList localLinkedList = new LinkedList();
    while (localCursor.moveToNext())
    {
      String str = a.pR(localCursor.getString(0));
      if (a.uI(str))
        localLinkedList.add(str);
    }
    localCursor.close();
    return localLinkedList;
  }

  public final List vO()
  {
    return go("select  *  from addr_upload2 where ( addr_upload2.username IS NOT NULL AND addr_upload2.username!=\"" + ch.iV("") + "\" )");
  }

  public final List vP()
  {
    return go("select  *  from addr_upload2 where ( addr_upload2.username IS NOT NULL AND addr_upload2.status!=\"0\" AND addr_upload2.username!=\"" + ch.iV("") + "\" )");
  }

  protected final boolean vQ()
  {
    boolean bool = true;
    Object[] arrayOfObject;
    if ((this.dmb == null) || (this.dmb.aHQ()))
    {
      arrayOfObject = new Object[bool];
      if (this.dmb != null)
        break label52;
    }
    label52: for (Object localObject = "null"; ; localObject = Boolean.valueOf(this.dmb.aHQ()))
    {
      arrayOfObject[0] = localObject;
      z.w("!44@/B4Tb64lLpL3lTzROgXSiaEB/XXrrgblbOVxZH2OfNk=", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.j
 * JD-Core Version:    0.6.2
 */