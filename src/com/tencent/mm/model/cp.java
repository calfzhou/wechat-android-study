package com.tencent.mm.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class cp extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS readerappnews1 ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE TABLE IF NOT EXISTS readerappweibo ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappnews1 ( time )", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappweibo ( time )" };
  private h dmb;

  public cp(h paramh)
  {
    this.dmb = paramh;
  }

  private static String cQ(int paramInt)
  {
    if (paramInt == 20)
      return "readerappnews1";
    if (paramInt == 11)
      return "readerappweibo";
    Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
    return null;
  }

  private void el(int paramInt)
  {
    String str = ex(cQ(paramInt)) + " where istop = 1  group by " + "time ORDER BY time DESC " + " limit 2";
    z.i("!44@/B4Tb64lLpLMGCLb6QM5KwlYot/8nbdMra9RN2vDOpg=", "reset conversation, sql is %s", new Object[] { str });
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      r localr2 = new r();
      localr2.setUsername(co.cN(paramInt));
      localr2.setContent("");
      localr2.k(0L);
      localr2.bv(0);
      localr2.bt(0);
      bg.qW().oW().a(localr2, co.cN(paramInt));
      return;
    }
    localCursor.moveToFirst();
    co localco = new co();
    localco.b(localCursor);
    localCursor.close();
    r localr1 = new r();
    localr1.setUsername(co.cN(paramInt));
    localr1.setContent(localco.getTitle());
    localr1.k(localco.getTime());
    localr1.bv(0);
    localr1.bt(0);
    bg.qW().oW().a(localr1, co.cN(paramInt));
  }

  private static String ex(String paramString)
  {
    return "select tweetid,time,type,name,title,url,shorturl,longurl,pubtime,sourcename,sourceicon,istop,cover,digest,reserved1,reserved2,reserved3,reserved4 from " + paramString + "  ";
  }

  public final List a(long paramLong, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    String str = ex(cQ(paramInt)) + " where time = " + paramLong + " order by istop desc , tweetid" + " asc ";
    z.d("!44@/B4Tb64lLpLMGCLb6QM5KwlYot/8nbdMra9RN2vDOpg=", "getInfobyGroup :" + str);
    Cursor localCursor = this.dmb.rawQuery(str, null);
    int i = localCursor.getCount();
    if (i <= 0)
    {
      localCursor.close();
      return localArrayList;
    }
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      co localco = new co();
      localco.b(localCursor);
      localArrayList.add(localco);
    }
    localCursor.close();
    return localArrayList;
  }

  public final boolean a(co paramco)
  {
    if (paramco == null);
    ContentValues localContentValues;
    do
    {
      return false;
      paramco.rF();
      localContentValues = paramco.ir();
    }
    while ((int)this.dmb.insert(cQ(paramco.getType()), "tweetid", localContentValues) == -1);
    return true;
  }

  public final void b(long paramLong, int paramInt)
  {
    String str = "delete from " + cQ(paramInt) + " where time = " + paramLong;
    z.d("!44@/B4Tb64lLpLMGCLb6QM5KwlYot/8nbdMra9RN2vDOpg=", "deleteGroup:%s", new Object[] { str });
    if (this.dmb.bp(cQ(paramInt), str))
    {
      el(paramInt);
      Bo();
    }
  }

  public final int cR(int paramInt)
  {
    String str = "select count(*) from (SELECT count(*) FROM " + cQ(paramInt) + " group by time)";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final void cS(int paramInt)
  {
    r localr = bg.qW().oW().yE(co.cN(paramInt));
    if ((localr == null) || (!localr.getUsername().equals(co.cN(paramInt))));
    String str;
    do
    {
      return;
      localr.setUsername(co.cN(paramInt));
      localr.setContent("");
      localr.bv(0);
      localr.bt(0);
      bg.qW().oW().a(localr, co.cN(paramInt));
      str = "delete from " + cQ(paramInt);
    }
    while (!this.dmb.bp(cQ(paramInt), str));
    Bo();
  }

  public final List d(long paramLong, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    String str = ex(cQ(20)) + " where reserved2 = " + paramLong;
    z.d("!44@/B4Tb64lLpLMGCLb6QM5KwlYot/8nbdMra9RN2vDOpg=", "getInfoListByMsgSvrID :" + str);
    Cursor localCursor = this.dmb.rawQuery(str, null);
    int i = localCursor.getCount();
    if (i <= 0)
    {
      localCursor.close();
      return localArrayList;
    }
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      co localco = new co();
      localco.b(localCursor);
      localArrayList.add(localco);
    }
    localCursor.close();
    return localArrayList;
  }

  public final void y(long paramLong)
  {
    String str = "delete from " + cQ(20) + " where reserved2 = " + paramLong;
    z.d("!44@/B4Tb64lLpLMGCLb6QM5KwlYot/8nbdMra9RN2vDOpg=", "deleteGroupByMsgSvrID:%s", new Object[] { str });
    if (this.dmb.bp(cQ(20), str))
    {
      el(20);
      Bo();
    }
  }

  public final Cursor z(int paramInt1, int paramInt2)
  {
    String str = "SELECT time from " + cQ(paramInt2) + " GROUP BY time ORDER BY time" + " ASC  LIMIT " + paramInt1 + " offset (SELECT COUNT(*) FROM (SELECT COUNT(*) FROM " + cQ(paramInt2) + " GROUP BY time)) -" + paramInt1;
    return this.dmb.rawQuery(str, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cp
 * JD-Core Version:    0.6.2
 */