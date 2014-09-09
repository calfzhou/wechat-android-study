package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.a.d;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.platformtools.cd;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public final class aw extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS message ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT ) ", "CREATE INDEX IF NOT EXISTS  messageIdIndex ON message ( msgId )", "CREATE INDEX IF NOT EXISTS  messageSvrIdIndex ON message ( msgSvrId )", "DROP INDEX IF EXISTS messageTalkerIndex", "DROP INDEX IF EXISTS messageTalkerTypeIndex ", "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTypeTimeIndex ON message ( talker,type,createTime )", "CREATE INDEX IF NOT EXISTS  messageTalkerStatusIndex ON message ( talker,status )", "CREATE INDEX IF NOT EXISTS  messageCreateTimeIndex ON message ( createTime )", "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTimeIndex ON message ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  messageSendCreateTimeIndex ON message ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  messageTalkerCreateTimeIsSendIndex ON message ( talker,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  messageTalkerSvrIdIndex ON message ( talker,msgSvrId )", "CREATE TABLE IF NOT EXISTS qmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT ) ", "CREATE INDEX IF NOT EXISTS  qmessageSvrIdIndex ON qmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  qmessageTalkerIndex ON qmessage ( talker )", "CREATE INDEX IF NOT EXISTS  qmessageTalerStatusIndex ON qmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  qmessageCreateTimeIndex ON qmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  qmessageCreateTaklerTimeIndex ON qmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  qmessageSendCreateTimeIndex ON qmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  qmessageTalkerSvrIdIndex ON qmessage ( talker,msgSvrId )", "CREATE TABLE IF NOT EXISTS tmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT ) ", "CREATE INDEX IF NOT EXISTS  tmessageSvrIdIndex ON tmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  tmessageTalkerIndex ON tmessage ( talker )", "CREATE INDEX IF NOT EXISTS  tmessageTalerStatusIndex ON tmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  tmessageCreateTimeIndex ON tmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  tmessageCreateTaklerTimeIndex ON tmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  tmessageSendCreateTimeIndex ON tmessage ( status,isSend,createTime )", "CREATE TABLE IF NOT EXISTS bottlemessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT ) ", "CREATE INDEX IF NOT EXISTS  bmessageSvrIdIndex ON bottlemessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bmessageTalkerIndex ON bottlemessage ( talker )", "CREATE INDEX IF NOT EXISTS  bmessageTalerStatusIndex ON bottlemessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bmessageCreateTimeIndex ON bottlemessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bmessageCreateTaklerTimeIndex ON bottlemessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bmessageSendCreateTimeIndex ON bottlemessage ( status,isSend,createTime )" };
  private final h dmb;
  private final long iiv = 86400L;
  private List ijO;
  private final d ijP = new d(100);
  private final d ijQ = new d(100);
  private final d ijR = new d(100);
  private final d ijS = new d(100);
  private final d ijT = new d(100);
  private y ijU = new y();
  private final am ijV = new ax(this);
  private boolean ijW = false;
  private Map ijX = new HashMap();

  public aw(h paramh)
  {
    this.dmb = paramh;
    a(paramh, "message");
    a(paramh, "qmessage");
    a(paramh, "tmessage");
    a(paramh, "bottlemessage");
    if (this.ijO == null)
      this.ijO = new LinkedList();
    this.ijO.clear();
    this.ijO.add(new az(1, "message", 1L, 1000000L));
    this.ijO.add(new az(2, "qmessage", 1000001L, 1500000L));
    this.ijO.add(new az(4, "tmessage", 1500001L, 2000000L));
    this.ijO.add(new az(8, "bottlemessage", 2000001L, 2500000L));
    for (int i = 0; i < this.ijO.size(); i++)
    {
      Cursor localCursor = this.dmb.rawQuery("select max(msgid) from " + ((az)this.ijO.get(i)).getName(), null);
      if (localCursor.moveToFirst())
      {
        int j = localCursor.getInt(0);
        if (j >= ((az)this.ijO.get(i)).xL())
          ((az)this.ijO.get(i)).eK(j + 1);
      }
      localCursor.close();
      z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "loading new msg id:" + ((az)this.ijO.get(i)).xL());
    }
  }

  private static void a(h paramh, String paramString)
  {
    int i = 0;
    Cursor localCursor = paramh.rawQuery("PRAGMA table_info( " + paramString + " )", null);
    int j = 0;
    while (localCursor.moveToNext())
    {
      int k = localCursor.getColumnIndex("name");
      if (k >= 0)
      {
        String str = localCursor.getString(k);
        if ("lvbuffer".equalsIgnoreCase(str))
          j = 1;
        else if ("transContent".equalsIgnoreCase(str))
          i = 1;
      }
    }
    localCursor.close();
    if (j == 0)
      paramh.bp(paramString, "Alter table " + paramString + " add lvbuffer BLOB ");
    if (i == 0)
      paramh.bp(paramString, "Alter table " + paramString + " add transContent TEXT ");
  }

  private void a(ba paramba)
  {
    if (this.ijV.ae(paramba))
      this.ijV.Bo();
  }

  private void a(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    long l1 = ch.CL() - 172800L;
    String str = "SELECT msgSvrId,createTime FROM " + paramString1 + " WHERE createTime > " + l1 * 1000L;
    if (!ch.jb(paramString2))
      str = str + " AND " + paramString2;
    Cursor localCursor = this.dmb.rawQuery(str, paramArrayOfString);
    if (localCursor != null);
    for (int i = localCursor.getCount(); ; i = 0)
    {
      if (i > 0)
      {
        ArrayList localArrayList1 = new ArrayList(i);
        ArrayList localArrayList2 = new ArrayList(i);
        localCursor.moveToFirst();
        while (!localCursor.isAfterLast())
        {
          int j = localCursor.getInt(0);
          long l2 = localCursor.getLong(1) / 1000L;
          localArrayList1.add(Integer.valueOf(j));
          localArrayList2.add(Long.valueOf(l2));
          localCursor.moveToNext();
        }
        this.ijU.c(localArrayList1, localArrayList2);
      }
      if (localCursor != null)
        localCursor.close();
      return;
    }
  }

  private void aKn()
  {
    boolean bool;
    long l;
    HashSet localHashSet;
    if (this.ijO != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      l = ch.CM() - 300000L;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "older than %s will mark as failed", arrayOfObject);
      localHashSet = new HashSet();
    }
    for (int i = 0; ; i++)
    {
      if (i >= this.ijO.size())
        break label293;
      String str1 = "select talker from " + ((az)this.ijO.get(i)).getName() + " where createTime<" + l + " and status=1";
      Cursor localCursor = this.dmb.rawQuery(str1, null);
      if (localCursor.moveToFirst())
        while (true)
        {
          String str2;
          Iterator localIterator;
          if (!localCursor.isAfterLast())
          {
            String str3 = localCursor.getString(0);
            localCursor.moveToNext();
            if (!ch.jb(str3))
            {
              localHashSet.add(str3);
              continue;
              bool = false;
              break;
            }
          }
        }
      localCursor.close();
      str2 = "update " + ((az)this.ijO.get(i)).getName() + " set status=5" + " where createTime<" + l + " and status=1";
      this.dmb.bp(((az)this.ijO.get(i)).getName(), str2);
    }
    label293: localIterator = localHashSet.iterator();
    while (localIterator.hasNext())
    {
      Bo();
      a(new ba((String)localIterator.next(), "update", null));
    }
  }

  private String cZ(long paramLong)
  {
    for (int i = 0; i < this.ijO.size(); i++)
      if (((az)this.ijO.get(i)).da(paramLong))
        return ((az)this.ijO.get(i)).getName();
    return null;
  }

  private String zI(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      return zJ(paramString).getName();
    }
  }

  private az zJ(String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    String str;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool2 = bool1;
      Assert.assertTrue(bool2);
      str = ar.yB(paramString);
      if (str.length() <= 0)
        break label99;
      label33: Assert.assertTrue(bool1);
    }
    for (int i = 0; ; i++)
    {
      if (i >= this.ijO.size())
        break label110;
      if (str.equals(((az)this.ijO.get(i)).getName()))
      {
        return (az)this.ijO.get(i);
        bool2 = false;
        break;
        label99: bool1 = false;
        break label33;
      }
    }
    label110: Assert.assertTrue(false);
    return null;
  }

  public final int A(ar paramar)
  {
    int i = 0;
    if (paramar != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("content", paramar.getContent());
      localContentValues.put("status", Integer.valueOf(paramar.getStatus()));
      h localh = this.dmb;
      String str = cZ(paramar.kk());
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramar.kk());
      i = localh.update(str, localContentValues, "msgId=?", arrayOfString);
      if (i != 0)
      {
        Bo();
        a(new ba(paramar.kt(), "update", paramar));
      }
    }
    return i;
  }

  public final ar A(int paramInt, String paramString)
  {
    if (this.ijO == null)
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsg failed lstTable is null");
      return null;
    }
    ar localar = new ar();
    if (ch.jb(paramString));
    for (String str1 = ""; ; str1 = paramString.replaceFirst("and", "where"))
    {
      long l = 0L;
      for (int i = 0; i < this.ijO.size(); i++)
        if ((paramInt & ((az)this.ijO.get(i)).aKt()) != 0)
        {
          String str2 = "select * from " + ((az)this.ijO.get(i)).getName() + str1 + "  order by createTime DESC limit 1";
          Cursor localCursor = this.dmb.rawQuery(str2, null);
          if (localCursor.getCount() != 0)
          {
            localCursor.moveToFirst();
            if (l < localCursor.getLong(localCursor.getColumnIndex("createTime")))
            {
              l = localCursor.getLong(localCursor.getColumnIndex("createTime"));
              localar.b(localCursor);
            }
          }
          localCursor.close();
        }
    }
    return localar;
  }

  public final int Bm(String paramString)
  {
    String str = "SELECT COUNT(*) FROM " + zI(paramString) + " WHERE talker='" + ch.iV(paramString) + "' AND type IN (3,39,13)";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final int a(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1);
    while (true)
    {
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = paramString;
      arrayOfObject1[1] = Long.valueOf(paramLong2);
      arrayOfObject1[2] = Long.valueOf(paramLong1);
      z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "talker %s, get count fromCreateTime %d, toCreateTime %d", arrayOfObject1);
      String str = "SELECT COUNT(msgId) FROM " + zI(paramString) + " WHERE talker= '" + ch.iV(paramString) + "' AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1;
      z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get count sql: " + str);
      Cursor localCursor = this.dmb.rawQuery(str, null);
      if (localCursor == null)
      {
        z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get count error, cursor is null");
        return 0;
      }
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "result msg count %d", arrayOfObject2);
        localCursor.close();
        return i;
      }
      localCursor.close();
      return 0;
      long l = paramLong2;
      paramLong2 = paramLong1;
      paramLong1 = l;
    }
  }

  public final void a(long paramLong, ar paramar)
  {
    h localh = this.dmb;
    String str = cZ(paramLong);
    ContentValues localContentValues = paramar.ir();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    if (localh.update(str, localContentValues, "msgId=?", arrayOfString) != 0)
    {
      Bo();
      a(new ba(paramar.kt(), "update", paramar));
    }
  }

  public final void a(ay paramay)
  {
    this.ijV.remove(paramay);
  }

  public final void a(ay paramay, Looper paramLooper)
  {
    this.ijV.a(paramay, paramLooper);
  }

  public final Cursor aIA()
  {
    if (this.ijO.size() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      return this.dmb.a(((az)this.ijO.get(0)).getName(), null, "msgId=?", new String[] { "-1" }, null, null);
    }
  }

  public final void aKl()
  {
    this.ijW = true;
    lock();
  }

  public final void aKm()
  {
    this.ijW = false;
    Iterator localIterator = this.ijX.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a((ba)this.ijX.get(str));
    }
    this.ijX.clear();
    unlock();
    Bo();
  }

  public final List aKo()
  {
    aKn();
    ArrayList localArrayList = new ArrayList();
    boolean bool;
    if (this.ijO != null)
    {
      bool = true;
      Assert.assertTrue(bool);
    }
    for (int i = 0; ; i++)
    {
      if (i >= this.ijO.size())
        break label180;
      Cursor localCursor = this.dmb.a(((az)this.ijO.get(i)).getName(), null, "status=1 and isSend=1", null, null, "createTime DESC ");
      if (localCursor.moveToFirst())
        while (true)
          if (!localCursor.isAfterLast())
          {
            ar localar = new ar();
            localar.b(localCursor);
            localCursor.moveToNext();
            if ((localar.aJD()) || (localar.aJB()) || (localar.aJC()) || (localar.aJJ()))
            {
              localArrayList.add(localar);
              continue;
              bool = false;
              break;
            }
          }
      localCursor.close();
    }
    label180: return localArrayList;
  }

  public final List aKp()
  {
    aKn();
    ArrayList localArrayList = new ArrayList();
    boolean bool;
    if (this.ijO != null)
    {
      bool = true;
      Assert.assertTrue(bool);
    }
    for (int i = 0; ; i++)
    {
      if (i >= this.ijO.size())
        break label156;
      Cursor localCursor = this.dmb.a(((az)this.ijO.get(i)).getName(), null, "status=1 and isSend=1", null, null, "createTime DESC ");
      if (localCursor.moveToFirst())
        while (true)
          if (!localCursor.isAfterLast())
          {
            ar localar = new ar();
            localar.b(localCursor);
            localCursor.moveToNext();
            if (localar.aJF())
            {
              localArrayList.add(localar);
              continue;
              bool = false;
              break;
            }
          }
      localCursor.close();
    }
    label156: return localArrayList;
  }

  public final Cursor aKq()
  {
    return this.dmb.a("message", new String[] { "talker", "count(*) as unReadCount" }, "isSend=? AND status!=?", new String[] { "0", "4" }, "talker", null);
  }

  public final List ah(String paramString, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.ijO != null);
    Cursor localCursor;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      String str = "SELECT * FROM " + zI(paramString) + " WHERE talker = '" + ch.iV(paramString) + "'  AND isSend = " + 0 + " ORDER BY createTime DESC LIMIT " + paramInt;
      localCursor = this.dmb.rawQuery(str, null);
      if (!localCursor.moveToFirst())
        break;
      while (!localCursor.isAfterLast())
      {
        ar localar = new ar();
        localar.b(localCursor);
        localCursor.moveToNext();
        if (localar.aJD())
          localArrayList.add(localar);
      }
    }
    localCursor.close();
    return localArrayList;
  }

  public final int ai(String paramString, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramInt);
    arrayOfObject[2] = cl.aHP();
    z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "deleteByTalkerFrom :%s  :%d stack:%s", arrayOfObject);
    ar localar = q(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localar.kt()));
    String str1 = zI(paramString);
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = localar.kn();
    arrayOfString1[1] = paramString;
    a(str1, "createTime<=? AND talker=?", arrayOfString1);
    h localh = this.dmb;
    String str2 = zI(paramString);
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = localar.kn();
    arrayOfString2[1] = paramString;
    int i = localh.delete(str2, "createTime<=? AND talker=?", arrayOfString2);
    if (i != 0)
    {
      Bo();
      a(new ba(paramString, "delete", null));
    }
    return i;
  }

  public final Cursor aj(String paramString, int paramInt)
  {
    ar localar = q(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localar.kt()));
    h localh = this.dmb;
    String str = zI(paramString);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = localar.kn();
    return localh.a(str, null, "createTime<=? AND talker=?", arrayOfString, null, null);
  }

  public final Cursor ak(String paramString, int paramInt)
  {
    String str = "SELECT * FROM " + zI(paramString) + " WHERE talker= '" + ch.iV(paramString) + "' ORDER BY createTime ASC LIMIT -1 OFFSET " + paramInt;
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getCursor talk:" + paramString + " from:" + paramInt + " [" + str + "]");
    return this.dmb.rawQuery(str, null);
  }

  public final Cursor al(String paramString, int paramInt)
  {
    return this.dmb.a(zI(paramString), null, "isSend=? AND talker=? AND status!=?  order by msgId DESC limit " + paramInt, new String[] { "0", paramString, "4" }, null, null);
  }

  public final int am(String paramString, int paramInt)
  {
    String str = "SELECT COUNT(*) FROM " + zI(paramString) + " WHERE talker='" + ch.iV(paramString) + "' AND type = " + paramInt;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final ar[] an(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramInt <= 0))
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsgList, invalid argument, talker = " + paramString + ", limit = " + paramInt);
      return null;
    }
    String str = "select * from " + zI(paramString) + " where talker = '" + ch.iV(paramString) + "'  order by createTime DESC limit " + paramInt;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    int i = localCursor.getCount();
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsgList, talker = " + paramString + ", limit = " + paramInt + ", count = " + i);
    if (i == 0)
    {
      z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsgList, cursor is empty");
      localCursor.close();
      return null;
    }
    ar[] arrayOfar = new ar[i];
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      arrayOfar[(-1 + (i - j))] = new ar();
      arrayOfar[(-1 + (i - j))].b(localCursor);
    }
    localCursor.close();
    return arrayOfar;
  }

  public final Cursor b(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1);
    while (true)
    {
      String str = "SELECT * FROM " + zI(paramString) + " WHERE talker= '" + ch.iV(paramString) + "' AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1 + " ORDER BY createTime ASC ";
      z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get cursor: " + str);
      return this.dmb.rawQuery(str, null);
      long l = paramLong2;
      paramLong2 = paramLong1;
      paramLong1 = l;
    }
  }

  public final void b(long paramLong, ar paramar)
  {
    if (ch.ja(paramar.kt()).length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("no talker set when update by svrid", bool);
      h localh = this.dmb;
      String str = zI(paramar.kt());
      ContentValues localContentValues = paramar.ir();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramLong);
      if (localh.update(str, localContentValues, "msgSvrId=?", arrayOfString) != 0)
      {
        Bo();
        a(new ba(paramar.kt(), "update", paramar));
      }
      return;
    }
  }

  public final ar bt(String paramString1, String paramString2)
  {
    if (ch.jb(paramString1))
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsg failed : talker:%s", new Object[] { paramString1 });
      return null;
    }
    ar localar = new ar();
    String str = "select * from " + zI(paramString1) + " where talker = '" + ch.iV(paramString1) + "' " + paramString2 + " order by createTime DESC limit 1";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.moveToFirst())
      localar.b(localCursor);
    localCursor.close();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = Long.valueOf(localar.kk());
    z.i("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsg talker:%s msgid:%d", arrayOfObject);
    return localar;
  }

  public final Cursor bu(String paramString1, String paramString2)
  {
    String str1 = "SELECT * FROM " + zI(paramString1) + " WHERE talker= '" + ch.iV(paramString1) + "' AND content LIKE '%" + paramString2 + "%' AND type = 1";
    String str2 = str1 + " ORDER BY createTime DESC";
    return this.dmb.rawQuery(str2, null);
  }

  public final List c(String paramString, long paramLong, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getImgMessage fail, argument is invalid, limit = 10");
      return null;
    }
    String str1 = "select createTime from " + zI(paramString) + " where msgId = " + paramLong;
    Cursor localCursor1 = this.dmb.rawQuery(str1, null);
    if (localCursor1.moveToFirst());
    for (long l = localCursor1.getLong(0); ; l = 0L)
    {
      localCursor1.close();
      if (l == 0L)
      {
        z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getImgMessage fail, msg is null");
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      String str2;
      Cursor localCursor2;
      if (paramBoolean)
      {
        str2 = "select * from " + zI(paramString) + " where talker = '" + ch.iV(paramString) + "' AND type IN (3,39,13,43,44) AND createTime" + " > " + l + "  order by createTime ASC limit 10";
        localCursor2 = this.dmb.rawQuery(str2, null);
        if (!localCursor2.moveToFirst());
      }
      else
      {
        while (true)
        {
          if (localCursor2.isAfterLast())
            break label342;
          ar localar = new ar();
          localar.b(localCursor2);
          localCursor2.moveToNext();
          if (paramBoolean)
          {
            localArrayList.add(localar);
            continue;
            str2 = "select * from " + zI(paramString) + " where talker = '" + ch.iV(paramString) + "' AND type IN (3,39,13,43,44) AND createTime" + " < " + l + "  order by createTime DESC limit 10";
            break;
          }
          localArrayList.add(0, localar);
        }
      }
      label342: localCursor2.close();
      return localArrayList;
    }
  }

  public final boolean c(long paramLong, String paramString1, String paramString2)
  {
    String str = "UPDATE " + ar.yB(paramString1) + " SET transContent = '" + ch.iV(paramString2) + "' WHERE msgId = " + paramLong;
    return this.dmb.bp(null, str);
  }

  public final int cQ(long paramLong)
  {
    int i = 0;
    int j = 0;
    while (i < this.ijO.size())
    {
      if ((0x2 & ((az)this.ijO.get(i)).aKt()) != 0)
      {
        String str = "select *  from " + ((az)this.ijO.get(i)).getName() + " where " + ((az)this.ijO.get(i)).getName() + ".status != 4" + " and " + ((az)this.ijO.get(i)).getName() + ".isSend = 0" + " and " + ((az)this.ijO.get(i)).getName() + ".createTime > " + paramLong;
        Cursor localCursor = this.dmb.rawQuery(str, null);
        j += localCursor.getCount();
        localCursor.close();
      }
      i++;
    }
    return j;
  }

  public final ar cV(long paramLong)
  {
    ar localar = new ar();
    h localh = this.dmb;
    String str = cZ(paramLong);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localh.a(str, null, "msgId=?", arrayOfString, null, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localar.b(localCursor);
    }
    localCursor.close();
    return localar;
  }

  public final int cW(long paramLong)
  {
    ar localar = cV(paramLong);
    String str1 = localar.kt();
    this.ijU.b((int)(ch.CL() / 86400L), localar.kl(), localar.kn() / 1000L);
    h localh = this.dmb;
    String str2 = cZ(paramLong);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    int i = localh.delete(str2, "msgId=?", arrayOfString);
    if (i != 0)
    {
      Ba("delete_id " + paramLong);
      ba localba = new ba(str1, "delete", null);
      localba.ikf = paramLong;
      a(localba);
    }
    return i;
  }

  public final boolean cX(long paramLong)
  {
    return this.ijU.cU(paramLong);
  }

  public final boolean cY(long paramLong)
  {
    for (int i = 0; ; i++)
    {
      int j = this.ijO.size();
      boolean bool = false;
      if (i < j)
      {
        if (((az)this.ijO.get(i)).da(paramLong))
          bool = true;
      }
      else
        return bool;
    }
  }

  public final int d(String paramString, long paramLong, int paramInt)
  {
    String str = "SELECT * FROM " + zI(paramString) + " WHERE talker= '" + ch.iV(paramString) + "' AND createTime < " + paramLong + " ORDER BY createTime ASC LIMIT -1 OFFSET " + paramInt;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    int i = localCursor.getCount();
    localCursor.close();
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getPositionByCreateTime talk:" + paramString + " time:" + paramLong + " count " + i + " [" + str + "]");
    return i;
  }

  public final void lock()
  {
    super.lock();
    this.ijV.lock();
  }

  public final ar ol(int paramInt)
  {
    if (this.ijO == null)
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getLastMsg failed lstTable is null");
      return null;
    }
    ar localar = new ar();
    long l = 0L;
    for (int i = 0; i < this.ijO.size(); i++)
      if ((paramInt & ((az)this.ijO.get(i)).aKt()) != 0)
      {
        String str = "select * from " + ((az)this.ijO.get(i)).getName() + "  order by createTime DESC limit 1";
        Cursor localCursor = this.dmb.rawQuery(str, null);
        if (localCursor.getCount() != 0)
        {
          localCursor.moveToFirst();
          if (l < localCursor.getLong(localCursor.getColumnIndex("createTime")))
          {
            l = localCursor.getLong(localCursor.getColumnIndex("createTime"));
            localar.b(localCursor);
          }
        }
        localCursor.close();
      }
    return localar;
  }

  public final List p(String paramString, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    String str = "SELECT * FROM " + zI(paramString) + " WHERE type = 49 ORDER BY createTime" + " DESC LIMIT " + paramInt1 + " , " + paramInt2;
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getAppMsgTypeList sql=%s", new Object[] { str });
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.moveToFirst())
      while (!localCursor.isAfterLast())
      {
        ar localar = new ar();
        localar.b(localCursor);
        localCursor.moveToNext();
        if (localar.aJu())
          localArrayList.add(localar);
      }
    localCursor.close();
    return localArrayList;
  }

  public final ar q(String paramString, long paramLong)
  {
    ar localar = new ar();
    h localh = this.dmb;
    String str = zI(paramString);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localh.a(str, null, "msgSvrId=?", arrayOfString, null, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localar.b(localCursor);
    }
    localCursor.close();
    return localar;
  }

  public final boolean r(String paramString, long paramLong)
  {
    ar localar = new ar();
    h localh = this.dmb;
    String str = zI(paramString);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localh.a(str, null, "createTime=?", arrayOfString, null, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localar.b(localCursor);
    }
    localCursor.close();
    return localar.kk() > 0L;
  }

  public final int s(String paramString, long paramLong)
  {
    ar localar = q(paramString, paramLong);
    this.ijU.b((int)(ch.CL() / 86400L), localar.kl(), localar.kn() / 1000L);
    h localh = this.dmb;
    String str = zI(paramString);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    int i = localh.delete(str, "msgSvrId=?", arrayOfString);
    if (i != 0)
    {
      Bo();
      a(new ba(paramString, "delete", null));
    }
    return i;
  }

  public final int t(String paramString, long paramLong)
  {
    ar localar = cV(paramLong);
    if (localar.kk() == 0L)
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getCountEarlyThan fail, msg does not exist");
      return 0;
    }
    String str = "SELECT COUNT(*) FROM " + zI(paramString) + " INDEXED BY messageCreateTaklerTypeTimeIndex  WHERE talker='" + ch.iV(paramString) + "' AND type IN (3,39,13,43,44) AND createTime" + " < " + localar.kn();
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final long u(String paramString, long paramLong)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Long.valueOf(paramLong);
    arrayOfObject1[2] = Integer.valueOf(18);
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", arrayOfObject1);
    String str = "SELECT createTime FROM " + zI(paramString) + " WHERE talker= '" + ch.iV(paramString) + "' AND createTime < " + paramLong + " ORDER BY createTime DESC  LIMIT " + 18;
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get up inc msg create time sql: %s", new Object[] { str });
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
    {
      z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get inc msg create time error, cursor is null");
      return paramLong;
    }
    if (localCursor.moveToLast())
    {
      long l = localCursor.getLong(0);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(l);
      z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "result msg create time %d", arrayOfObject2);
      localCursor.close();
      return l;
    }
    localCursor.close();
    z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get result fail");
    return paramLong;
  }

  public final void unlock()
  {
    super.unlock();
    this.ijV.unlock();
  }

  public final long v(String paramString, long paramLong)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Long.valueOf(paramLong);
    arrayOfObject1[2] = Integer.valueOf(18);
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get down inc create time, talker %s, fromCreateTime %d, targetIncCount %d", arrayOfObject1);
    String str = "SELECT createTime FROM " + zI(paramString) + " WHERE talker= '" + ch.iV(paramString) + "' AND createTime > " + paramLong + " ORDER BY createTime ASC  LIMIT " + 18;
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get down inc msg create time sql: %s", new Object[] { str });
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
    {
      z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get down inc msg create time error, cursor is null");
      return paramLong;
    }
    if (localCursor.moveToLast())
    {
      long l = localCursor.getLong(0);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(l);
      z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "result msg create time %d", arrayOfObject2);
      localCursor.close();
      return l;
    }
    localCursor.close();
    z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get result fail");
    return paramLong;
  }

  public final int w(String paramString, long paramLong)
  {
    String str = "SELECT type FROM " + zI(paramString) + " WHERE talker=? AND msgId" + "=?";
    h localh = this.dmb;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString;
    arrayOfString[1] = String.valueOf(paramLong);
    Cursor localCursor = localh.rawQuery(str, arrayOfString);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final int x(ar paramar)
  {
    if ((paramar == null) || (ch.jb(paramar.kt())))
      return 0;
    String str = "SELECT count(msgId) FROM " + zI(paramar.kt()) + " WHERE talker = '" + ch.iV(paramar.kt()) + "'  AND isSend = " + 0 + " AND msgId >= " + paramar.kk() + " ORDER BY createTime DESC";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToFirst();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final String x(String paramString, long paramLong)
  {
    ar localar = cV(paramLong);
    if (localar.kk() == 0L)
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getCountEarlyThan fail, msg does not exist");
      return null;
    }
    String str1 = "EXPLAIN QUERY PLAN SELECT COUNT(*) FROM " + zI(paramString) + " INDEXED BY messageCreateTaklerTypeTimeIndex  WHERE talker='" + ch.iV(paramString) + "' AND type IN (3,39,13,43,44) AND createTime" + " < " + localar.kn();
    Cursor localCursor = this.dmb.rawQuery(str1, null);
    String str2 = "";
    if (localCursor.moveToFirst())
      for (int i = 0; i < localCursor.getColumnCount(); i++)
        str2 = str2 + localCursor.getString(i) + " ";
    localCursor.close();
    return str2;
  }

  public final long y(ar paramar)
  {
    if ((paramar == null) || (ch.jb(paramar.kt())))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = paramar;
      if (paramar == null);
      for (String str1 = "-1"; ; str1 = paramar.kt())
      {
        arrayOfObject1[1] = str1;
        z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "Error insert message msg:%s talker:%s", arrayOfObject1);
        return -1L;
      }
    }
    az localaz = zJ(paramar.kt());
    if (localaz == null)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = paramar.kt();
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "Error insert message getTableByTalker failed. talker:%s", arrayOfObject4);
      return -1L;
    }
    paramar.o(localaz.xL());
    localaz.aKs();
    if (paramar.kl() != 0L)
      paramar.kE();
    if ((paramar.aJu()) && (ch.jb(paramar.ku())));
    try
    {
      String str2 = paramar.getContent();
      int i = str2.indexOf("<msg>");
      if ((i > 0) && (i < str2.length()))
        str2 = str2.substring(i).trim();
      Map localMap = x.bB(str2, "msg");
      if ((localMap != null) && (localMap.size() > 0))
        paramar.bL(cd.u(localMap));
      ContentValues localContentValues = paramar.ir();
      long l = this.dmb.insert(localaz.getName(), "msgId", localContentValues);
      Object[] arrayOfObject2 = new Object[6];
      arrayOfObject2[0] = Long.valueOf(l);
      arrayOfObject2[1] = paramar.kt();
      arrayOfObject2[2] = Long.valueOf(paramar.kk());
      arrayOfObject2[3] = Integer.valueOf(paramar.getType());
      arrayOfObject2[4] = Long.valueOf(paramar.kl());
      arrayOfObject2[5] = Long.valueOf(paramar.kn());
      z.i("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "insert:%d talker:%s id:%d type:%d svrid:%d  create:%d", arrayOfObject2);
      if (l == -1L)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Long.valueOf(paramar.kl());
        arrayOfObject3[1] = Long.valueOf(l);
        z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "insert failed svrid:%d ret:%d", arrayOfObject3);
        return -1L;
      }
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", localException.getMessage());
    }
    ba localba2;
    if (this.ijW)
    {
      boolean bool = this.ijX.containsKey(paramar.kt());
      localba2 = null;
      if (bool)
        localba2 = (ba)this.ijX.get(paramar.kt());
      if (localba2 == null)
      {
        localba2 = new ba(paramar.kt(), "insert", paramar);
        if (ba.B(paramar))
          localba2.ike = (1 + localba2.ike);
        this.ijX.put(paramar.kt(), localba2);
      }
    }
    while (true)
    {
      return paramar.kk();
      localba2.ikd.add(paramar);
      break;
      ba localba1 = new ba(paramar.kt(), "insert", paramar);
      if (ba.B(paramar))
        localba1.ike = 1;
      Bo();
      a(localba1);
    }
  }

  public final boolean yD(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = cl.aHP();
    z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "deleteMessageEndByName nameTag:%s  stack:%s", arrayOfObject);
    a(zI(paramString), " talker like '%" + paramString + "'", null);
    boolean bool = this.dmb.bp(zI(paramString), "delete from " + zI(paramString) + " where talker like '%" + paramString + "'");
    if (bool)
      Bo();
    return bool;
  }

  public final void z(ar paramar)
  {
    if ((paramar == null) || (paramar.getStatus() == 4));
    String str;
    h localh;
    ContentValues localContentValues;
    String[] arrayOfString;
    do
    {
      do
      {
        return;
        paramar.setStatus(4);
        str = cZ(paramar.kk());
      }
      while ((str == null) || (str.length() <= 0));
      localh = this.dmb;
      localContentValues = paramar.ir();
      arrayOfString = new String[1];
      arrayOfString[0] = paramar.kk();
    }
    while (localh.update(str, localContentValues, "msgId=?", arrayOfString) == 0);
    Bo();
    a(new ba(paramar.kt(), "update", paramar, -1));
  }

  public final Cursor zA(String paramString)
  {
    return this.dmb.a(zI(paramString), null, "isSend=? AND talker=? AND status!=?", new String[] { "0", paramString, "4" }, null, null);
  }

  public final au zB(String paramString)
  {
    au localau = (au)this.ijP.get(Integer.valueOf(paramString.hashCode()));
    if (localau == null)
    {
      localau = au.zo(paramString);
      this.ijP.b(Integer.valueOf(paramString.hashCode()), localau);
    }
    return localau;
  }

  public final av zC(String paramString)
  {
    av localav = (av)this.ijQ.get(Integer.valueOf(paramString.hashCode()));
    if (localav == null)
    {
      localav = av.zp(paramString);
      this.ijQ.b(Integer.valueOf(paramString.hashCode()), localav);
    }
    return localav;
  }

  public final as zD(String paramString)
  {
    if (this.ijR != null);
    for (as localas = (as)this.ijR.get(Integer.valueOf(paramString.hashCode())); ; localas = null)
    {
      if (localas == null)
      {
        localas = as.zl(paramString);
        if (this.ijR != null)
          this.ijR.b(Integer.valueOf(paramString.hashCode()), localas);
      }
      return localas;
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "[arthurdan.FriendContentCrash] Fatal error!!! cachesForFriend is null!");
    }
  }

  public final at zE(String paramString)
  {
    at localat = (at)this.ijS.get(Integer.valueOf(paramString.hashCode()));
    if (localat == null)
    {
      localat = at.zm(paramString);
      this.ijS.b(Integer.valueOf(paramString.hashCode()), localat);
    }
    return localat;
  }

  public final int zF(String paramString)
  {
    String str = "SELECT COUNT(*) FROM " + zI(paramString) + " WHERE talker='" + ch.iV(paramString) + "'";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final int zG(String paramString)
  {
    String str = "SELECT COUNT(*) FROM " + zI(paramString) + " WHERE talker='" + ch.iV(paramString) + "' AND type IN (3,39,13,43,44)";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final void zH(String paramString)
  {
    String str1 = "select createTime from " + zI(paramString) + " where talker=\"" + ch.iV(paramString) + "\" order by createTime desc limit -1 offset 100";
    Cursor localCursor = this.dmb.rawQuery(str1, null);
    localCursor.moveToFirst();
    long l1 = 0L;
    if (localCursor.moveToFirst())
      while (!localCursor.isAfterLast())
      {
        if (l1 < localCursor.getLong(0))
          l1 = localCursor.getLong(0);
        localCursor.moveToNext();
      }
    localCursor.close();
    long l2 = ch.CM() - 604800000L;
    if (l1 > l2)
      l1 = l2;
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "deleteOldMsgByTalker get max time :" + l1);
    String str2 = "( talker=\"" + ch.iV(paramString) + "\") and (createTime < " + l1 + ")";
    a(zI(paramString), str2, null);
    int i = this.dmb.delete(zI(paramString), str2, null);
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "deleted message count:" + i);
  }

  public final long zK(String paramString)
  {
    String str = "select createTime from message where talker='" + paramString + "'  order by createTime LIMIT 1 OFFSET 0";
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get first message create time: " + str);
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get first message create time failed: " + paramString);
      return -1L;
    }
    if (localCursor.moveToFirst())
    {
      long l = localCursor.getLong(0);
      localCursor.close();
      return l;
    }
    localCursor.close();
    return -1L;
  }

  public final long zL(String paramString)
  {
    String str = "select createTime from message where talker='" + paramString + "' order by createTime DESC LIMIT 1 ";
    z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get last message create time: " + str);
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "get last message create time failed " + paramString);
      return -1L;
    }
    if (localCursor.moveToFirst())
    {
      long l = localCursor.getLong(0);
      localCursor.close();
      return l;
    }
    localCursor.close();
    return -1L;
  }

  public final ar zq(String paramString)
  {
    ar localar = new ar();
    Cursor localCursor = this.dmb.a(zI(paramString), null, "talker=?", new String[] { paramString }, null, "msgSvrId  DESC limit 1 ");
    if (localCursor.moveToFirst())
      localar.b(localCursor);
    localCursor.close();
    return localar;
  }

  public final ar zr(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    ar localar = new ar();
    String str = "select * from " + zI(paramString) + " where talker = '" + ch.iV(paramString) + "'  order by createTime DESC limit 1";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localar.b(localCursor);
    }
    localCursor.close();
    return localar;
  }

  public final ar zs(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    ar localar = new ar();
    String str = "select * from " + zI(paramString) + " where talker = '" + ch.iV(paramString) + "' and isSend = " + 0 + "  order by createTime DESC limit 1";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localar.b(localCursor);
    }
    localCursor.close();
    return localar;
  }

  public final List zt(String paramString)
  {
    Cursor localCursor = this.dmb.rawQuery("select * from " + paramString, null);
    if (localCursor == null)
      return null;
    int i = localCursor.getCount();
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      ar localar = new ar();
      localar.b(localCursor);
      localArrayList.add(localar);
    }
    localCursor.close();
    return localArrayList;
  }

  public final List zu(String paramString)
  {
    Cursor localCursor = null;
    Object localObject1;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "getImgMessage fail, argument is invalid");
      localObject1 = null;
    }
    do
    {
      return localObject1;
      localObject1 = new ArrayList();
      String str = "select * from " + zI(paramString) + " where talker = '" + ch.iV(paramString) + "' AND type IN (3,39,13,43,44)  order by createTime";
      long l = this.dmb.aKU();
      try
      {
        localCursor = this.dmb.rawQuery(str, null);
        if (localCursor.moveToFirst())
          while (!localCursor.isAfterLast())
          {
            ar localar = new ar();
            localar.b(localCursor);
            localCursor.moveToNext();
            ((List)localObject1).add(localar);
          }
      }
      finally
      {
        this.dmb.dd(l);
        if (localCursor != null)
          localCursor.close();
      }
      this.dmb.dd(l);
    }
    while (localCursor == null);
    localCursor.close();
    return localObject1;
  }

  public final void zv(String paramString)
  {
    a(paramString, "", null);
    if (this.dmb.bp(paramString, "delete from " + paramString))
      Ba("delete_all " + paramString);
  }

  public final int zw(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = cl.aHP();
    z.w("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "deleteByTalker :%s  stack:%s", arrayOfObject);
    a(zI(paramString), "talker=?", new String[] { paramString });
    int i = this.dmb.delete(zI(paramString), "talker=?", new String[] { paramString });
    if (i != 0)
    {
      Ba("delete_talker " + paramString);
      ba localba = new ba(paramString, "delete", null);
      localba.ikf = -1L;
      a(localba);
    }
    return i;
  }

  public final int zx(String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    int i = this.dmb.update(zI(paramString), localContentValues, "talker=? AND isSend=? AND status!=? ", new String[] { paramString, "0", "4" });
    if (i != 0)
    {
      Bo();
      a(new ba(paramString, "update", null));
    }
    return i;
  }

  public final Cursor zy(String paramString)
  {
    return this.dmb.a(zI(paramString), null, "talker=?", new String[] { paramString }, null, "createTime ASC ");
  }

  public final Cursor zz(String paramString)
  {
    String str = "SELECT * FROM message WHERE talker like '%" + ch.iV(paramString) + "' ORDER BY msgId ASC";
    return this.dmb.rawQuery(str, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aw
 * JD-Core Version:    0.6.2
 */