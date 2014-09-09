package com.tencent.mm.q;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class m extends ah
{
  public static final String[] cKz = { "CREATE  INDEX IF NOT EXISTS type_username_index ON bizinfo ( type,username ) ", "CREATE  INDEX IF NOT EXISTS  username_acceptType_index ON bizinfo ( username,acceptType ) " };
  public static final String[] dmc;
  private final am dqF = new n(this);

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(a.dhu, "bizinfo");
    dmc = arrayOfString;
  }

  public m(af paramaf)
  {
    super(paramaf, a.dhu, "bizinfo", cKz);
  }

  public static Cursor fB(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select bizinfo.brandIconURL");
    localStringBuilder.append(", bizinfo.type");
    localStringBuilder.append(", bizinfo.status");
    localStringBuilder.append(", rcontact.username");
    localStringBuilder.append(", rcontact.conRemark");
    localStringBuilder.append(", rcontact.nickname");
    localStringBuilder.append(", rcontact.alias");
    localStringBuilder.append(" from rcontact, bizinfo");
    localStringBuilder.append(" where rcontact.username").append(" = bizinfo.username");
    localStringBuilder.append(" and (rcontact.verifyFlag").append(" & ").append(i.aIi()).append(") != 0 ");
    localStringBuilder.append(" and (rcontact.type").append(" & 1) != 0 ");
    localStringBuilder.append(" and bizinfo.type").append(" = 3");
    localStringBuilder.append(" and bizinfo.enterpriseFather").append(" = '").append(paramString).append("'");
    String str = localStringBuilder.toString();
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getEnterpriseChild sql %s", new Object[] { str });
    return bg.qW().oO().rawQuery(str, null);
  }

  public static List fC(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select bizinfo.username");
    localStringBuilder.append(" from bizinfo");
    localStringBuilder.append(" where bizinfo.type").append(" = 3");
    localStringBuilder.append(" and bizinfo.enterpriseFather").append(" = '").append(paramString).append("'");
    String str = localStringBuilder.toString();
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getEnterpriseChildNameList sql %s", new Object[] { str });
    Cursor localCursor = bg.qW().oO().rawQuery(str, null);
    if (localCursor == null)
      return null;
    LinkedList localLinkedList = new LinkedList();
    if (localCursor.moveToFirst())
      do
        localLinkedList.add(localCursor.getString(0));
      while (localCursor.moveToNext());
    localCursor.close();
    return localLinkedList;
  }

  public static List fD(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select bizinfo.username");
    localStringBuilder.append(" from rcontact, bizinfo");
    localStringBuilder.append(" where bizinfo.type").append(" = 3");
    localStringBuilder.append(" and rcontact.username").append(" = bizinfo.username");
    localStringBuilder.append(" and (rcontact.verifyFlag").append(" & ").append(i.aIi()).append(") != 0 ");
    localStringBuilder.append(" and (rcontact.type").append(" & 1) != 0 ");
    localStringBuilder.append(" and bizinfo.enterpriseFather").append(" = '").append(paramString).append("'");
    String str = localStringBuilder.toString();
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getEnterpriseChildNameList sql %s", new Object[] { str });
    Cursor localCursor = bg.qW().oO().rawQuery(str, null);
    if (localCursor == null)
      return null;
    LinkedList localLinkedList = new LinkedList();
    if (localCursor.moveToFirst())
      do
        localLinkedList.add(localCursor.getString(0));
      while (localCursor.moveToNext());
    localCursor.close();
    return localLinkedList;
  }

  public final void a(o paramo)
  {
    this.dqF.a(paramo, null);
  }

  public final boolean a(a parama)
  {
    parama.field_updateTime = System.currentTimeMillis();
    parama.uc();
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = parama.field_username;
    arrayOfObject[1] = parama.field_brandList;
    arrayOfObject[2] = Integer.valueOf(parama.field_brandFlag);
    arrayOfObject[3] = parama.field_brandInfo;
    arrayOfObject[4] = parama.field_extInfo;
    arrayOfObject[5] = parama.field_brandIconURL;
    arrayOfObject[6] = Long.valueOf(parama.field_updateTime);
    z.v("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "username is %s, %s, %d, %s, %s, %s, %d", arrayOfObject);
    boolean bool = super.b(parama);
    if ((bool) && (!y.dc(parama.field_username)))
    {
      q localq = new q();
      localq.dqM = parama.field_username;
      localq.dpY = parama.ud();
      localq.dqL = p.dqH;
      localq.dqN = parama;
      this.dqF.ae(localq);
      this.dqF.Bo();
    }
    return bool;
  }

  public final void b(o paramo)
  {
    if (this.dqF != null)
      this.dqF.remove(paramo);
  }

  public final boolean b(a parama)
  {
    parama.field_updateTime = System.currentTimeMillis();
    parama.uc();
    boolean bool = super.a(parama);
    if ((bool) && (!y.dc(parama.field_username)))
    {
      q localq = new q();
      localq.dqM = parama.field_username;
      localq.dpY = parama.ud();
      localq.dqL = p.dqJ;
      localq.dqN = parama;
      this.dqF.ae(localq);
      this.dqF.Bo();
    }
    return bool;
  }

  public final List dk(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = "username";
    arrayOfObject1[1] = "bizinfo";
    arrayOfObject1[2] = "acceptType";
    arrayOfObject1[3] = Integer.valueOf(paramInt);
    String str = String.format(localLocale, "select %s from %s where %s & %d > 0", arrayOfObject1);
    z.i("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getList: sql[%s]", new Object[] { str });
    long l = ch.CN();
    Cursor localCursor = rawQuery(str, new String[0]);
    LinkedList localLinkedList = new LinkedList();
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
        do
          localLinkedList.add(localCursor.getString(0));
        while (localCursor.moveToNext());
      localCursor.close();
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      arrayOfObject3[1] = Long.valueOf(ch.ad(l));
      z.i("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getMyAcceptList: type[%d], use time[%d ms]", arrayOfObject3);
      return bg.qW().oT().aN(localLinkedList);
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(paramInt);
    arrayOfObject2[1] = Long.valueOf(ch.ad(l));
    z.i("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getMyAcceptList: cursor not null, type[%d], use time[%d ms]", arrayOfObject2);
    return localLinkedList;
  }

  public final int em(int paramInt)
  {
    long l = System.currentTimeMillis();
    Locale localLocale = Locale.US;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = "bizinfo";
    arrayOfObject1[1] = "acceptType";
    arrayOfObject1[2] = Integer.valueOf(paramInt);
    String str = String.format(localLocale, "select count(*) from %s where %s & %d > 0", arrayOfObject1);
    Cursor localCursor = rawQuery(str, new String[0]);
    int i;
    if (localCursor != null)
    {
      i = localCursor.getCount();
      localCursor.close();
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = str;
      arrayOfObject2[1] = Integer.valueOf(i);
      arrayOfObject2[2] = Long.valueOf(System.currentTimeMillis() - l);
      z.i("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getMyAcceptListCount: sql[%s], ret[%d], costTime[%d]", arrayOfObject2);
      return i;
      i = 0;
    }
  }

  public final void fA(String paramString)
  {
    a locala = new a();
    locala.field_username = paramString;
    boolean bool = super.b(locala, new String[] { "username" });
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(bool);
    arrayOfObject[1] = paramString;
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "delete biz ret = %b, username = %s", arrayOfObject);
    q localq = new q();
    localq.dqM = paramString;
    localq.dqL = p.dqI;
    localq.dqN = locala;
    this.dqF.ae(localq);
    this.dqF.Bo();
  }

  public final a fz(String paramString)
  {
    a locala = new a();
    locala.field_username = paramString;
    super.c(locala, new String[0]);
    return locala;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.m
 * JD-Core Version:    0.6.2
 */