package com.tencent.mm.aj;

import android.database.Cursor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.ArrayList;

public final class g extends ah
{
  private static final String[] dFn = { "CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )" };
  public static final String[] dmc;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(f.dhu, "fmessage_msginfo");
    dmc = arrayOfString;
  }

  public g(af paramaf)
  {
    super(paramaf, f.dhu, "fmessage_msginfo", dFn);
    this.dtV = paramaf;
  }

  public final ArrayList Ax()
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "getFMsgByType, type = 0");
    ArrayList localArrayList = new ArrayList();
    String str = "select *, rowid from fmessage_msginfo where type = 0";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.moveToFirst())
      while (!localCursor.isAfterLast())
      {
        f localf = new f();
        localf.b(localCursor);
        localArrayList.add(localf);
        localCursor.moveToNext();
      }
    localCursor.close();
    z.d("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "getFMsgByType, size = " + localArrayList.size());
    return localArrayList;
  }

  public final boolean R(String paramString1, String paramString2)
  {
    String str = "update fmessage_msginfo set talker = '" + ch.iV(paramString2) + "'  where talker = '" + ch.iV(paramString1) + "'";
    return this.dtV.bp("fmessage_msginfo", str);
  }

  public final boolean a(f paramf)
  {
    if (paramf == null)
      z.e("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "insert fail, fmsgInfo is null");
    while (!super.b(paramf))
      return false;
    if (paramf.field_isSend == 0)
    {
      int i = ch.a((Integer)bg.qW().oQ().get(143618));
      z.d("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "insert succ, udpate unread to = " + (i + 1));
    }
    Ba(paramf.iGx);
    return true;
  }

  public final boolean hG(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "deleteByTalker fail, talker is null");
      return false;
    }
    String str = "delete from fmessage_msginfo where talker = '" + ch.iV(paramString) + "'";
    return this.dtV.bp("fmessage_msginfo", str);
  }

  public final f[] hI(String paramString)
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "getLastFMessageMsgInfo, talker = " + paramString + ", limit = 3");
    String str = "select *, rowid from fmessage_msginfo  where talker = '" + ch.iV(paramString) + "' order by createTime DESC limit 3";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    if (i <= 0)
    {
      z.i("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "getLastFMessageMsgInfo, cursor count = 0, talker = " + paramString + ", limit = 3");
      localCursor.close();
      return null;
    }
    f[] arrayOff = new f[i];
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      arrayOff[(-1 + (i - j))] = new f();
      arrayOff[(-1 + (i - j))].b(localCursor);
    }
    localCursor.close();
    return arrayOff;
  }

  public final f hJ(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "getLastFMsg fail, talker is null");
      return null;
    }
    String str = "select * from fmessage_msginfo where talker = '" + ch.iV(paramString) + "' order by createTime DESC limit 1";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    f localf = new f();
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localf.b(localCursor);
    }
    localCursor.close();
    return localf;
  }

  public final f hK(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W2VhcZQPxSSISeQIepz/5Qg=", "getLastRecvFMsg fail, talker is null");
      return null;
    }
    String str = "select * from fmessage_msginfo where isSend = 0 and talker = '" + ch.iV(paramString) + "' order by createTime DESC limit 1";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    f localf = new f();
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localf.b(localCursor);
    }
    localCursor.close();
    return localf;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.g
 * JD-Core Version:    0.6.2
 */