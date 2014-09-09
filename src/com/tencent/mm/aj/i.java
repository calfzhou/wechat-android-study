package com.tencent.mm.aj;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.c.b.ac;
import com.tencent.mm.n.c;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.av;

public final class i extends ah
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(h.dhu, "LBSVerifyMessage");
  }

  public i(af paramaf)
  {
    super(paramaf, h.dhu, "LBSVerifyMessage", ac.cKz);
    this.dtV = paramaf;
  }

  public static long hP(String paramString)
  {
    long l1 = 0L;
    if (paramString != null)
    {
      h localh = l.AG().Az();
      if (localh != null)
        l1 = 1L + localh.field_createtime;
    }
    long l2 = ch.CL();
    if (l1 > l2)
      return l1;
    return l2;
  }

  public final void AA()
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    if (this.dtV.update(wj(), localContentValues, "status!=? ", new String[] { "4" }) != 0)
      Bo();
  }

  public final void AB()
  {
    this.dtV.delete(wj(), null, null);
  }

  public final int Ay()
  {
    Cursor localCursor = this.dtV.rawQuery("select count(*) from " + wj() + " where status != 4", null);
    if (localCursor.getCount() != 1)
      localCursor.close();
    int i;
    do
    {
      return 0;
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
    }
    while (i <= 0);
    return i;
  }

  public final h Az()
  {
    Cursor localCursor = this.dtV.rawQuery("SELECT * FROM " + wj() + " ORDER BY createtime DESC LIMIT 1", null);
    if (localCursor == null)
      return null;
    if (localCursor.getCount() != 1)
    {
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    h localh = new h();
    localh.b(localCursor);
    localCursor.close();
    return localh;
  }

  public final void a(q paramq, av paramav)
  {
    z.d("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "saveToVerifyStg, cmdAM, status = " + paramq.dZy + ", id = " + paramq.hOY);
    h localh = new h();
    localh.field_content = ai.a(paramq.hOS);
    localh.field_createtime = ch.CL();
    localh.field_imgpath = "";
    localh.field_sayhicontent = paramav.getContent();
    localh.field_sayhiuser = paramav.aJQ();
    localh.field_scene = paramav.Ew();
    if (paramq.dZy > 3);
    for (int i = paramq.dZy; ; i = 3)
    {
      localh.field_status = i;
      localh.field_svrid = paramq.hOY;
      localh.field_talker = ai.a(paramq.hOP);
      localh.field_type = paramq.hOR;
      localh.field_isSend = 0;
      a(localh);
      c.k(localh.field_sayhiuser, 3);
      return;
    }
  }

  public final boolean a(h paramh)
  {
    if (paramh == null)
      z.e("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "insert fail, lbsMsg is null");
    while (!super.b(paramh))
      return false;
    Ba(paramh.iGx);
    return true;
  }

  public final Cursor eE(int paramInt)
  {
    String str = "SELECT * FROM " + wj() + " where isSend = 0 ORDER BY createtime desc LIMIT " + paramInt;
    return this.dtV.rawQuery(str, null);
  }

  public final int getCount()
  {
    Cursor localCursor = this.dtV.rawQuery("select count(*) from " + wj(), null);
    if (localCursor.getCount() != 1)
      localCursor.close();
    int i;
    do
    {
      return 0;
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
    }
    while (i <= 0);
    return i;
  }

  public final void hL(String paramString)
  {
    String str = "svrid = '" + paramString + "'";
    int i = this.dtV.delete(wj(), str, null);
    if (i > 0)
      Bo();
    z.i("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "delBySvrId = " + i);
  }

  public final void hM(String paramString)
  {
    String str = "sayhiuser = '" + paramString + "'";
    int i = this.dtV.delete(wj(), str, null);
    if (i > 0)
      Bo();
    z.i("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "delByUserName = " + i);
  }

  public final h[] hN(String paramString)
  {
    z.d("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "getLastLBSVerifyMessage, talker = " + paramString + ", limit = 3");
    String str = "select *, rowid from LBSVerifyMessage  where sayhiuser = '" + ch.iV(paramString) + "' order by createtime DESC limit 3";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    if (i <= 0)
    {
      z.i("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "getLastLBSVerifyMessage, cursor count = 0, talker = " + paramString + ", limit = 3");
      localCursor.close();
      return null;
    }
    h[] arrayOfh = new h[i];
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      arrayOfh[(-1 + (i - j))] = new h();
      arrayOfh[(-1 + (i - j))].b(localCursor);
    }
    localCursor.close();
    return arrayOfh;
  }

  public final h hO(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!56@/B4Tb64lLpJUJpBqE+uXZhc6oZFZlJdvtA7B2HQ5L0LSwRQS6MA+sQ==", "getLastRecvLbsMsg fail, talker is null");
      return null;
    }
    String str = "select * from LBSVerifyMessage where isSend = 0 and sayhiuser = '" + ch.iV(paramString) + "' order by createTime DESC limit 1";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    h localh = new h();
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localh.b(localCursor);
    }
    localCursor.close();
    return localh;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.i
 * JD-Core Version:    0.6.2
 */