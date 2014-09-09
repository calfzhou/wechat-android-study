package com.tencent.mm.aj;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.n.c;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.av;

public final class k extends ah
{
  public static final String[] cKz = { "CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )" };
  public static final String[] dmc;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(j.dhu, "shakeverifymessage");
    dmc = arrayOfString;
  }

  public k(af paramaf)
  {
    super(paramaf, j.dhu, "shakeverifymessage", cKz);
    this.dtV = paramaf;
  }

  public static long hP(String paramString)
  {
    long l1 = 0L;
    if (paramString != null)
    {
      j localj = l.AH().AC();
      if (localj != null)
        l1 = 1L + localj.field_createtime;
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

  public final j AC()
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
    j localj = new j();
    localj.b(localCursor);
    localCursor.close();
    return localj;
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

  public final void a(q paramq, av paramav)
  {
    z.d("!56@/B4Tb64lLpKLfnxozhPvvTZPSCereVb3n7bdN/66lrYK29QWzfkOnA==", "saveToVerifyStg, cmdAM, status = " + paramq.dZy + ", id = " + paramq.hOY);
    j localj = new j();
    localj.field_content = ai.a(paramq.hOS);
    localj.field_createtime = ch.CL();
    localj.field_imgpath = "";
    localj.field_sayhicontent = paramav.getContent();
    localj.field_sayhiuser = paramav.aJQ();
    localj.field_scene = paramav.Ew();
    if (paramq.dZy > 3);
    for (int i = paramq.dZy; ; i = 3)
    {
      localj.field_status = i;
      localj.field_svrid = paramq.hOY;
      localj.field_talker = ai.a(paramq.hOP);
      localj.field_type = paramq.hOR;
      localj.field_isSend = 0;
      a(localj);
      c.k(localj.field_sayhiuser, 3);
      return;
    }
  }

  public final boolean a(j paramj)
  {
    if (paramj == null)
      z.e("!56@/B4Tb64lLpKLfnxozhPvvTZPSCereVb3n7bdN/66lrYK29QWzfkOnA==", "insert fail, shakeMsg is null");
    while (!super.b(paramj))
      return false;
    Ba(paramj.iGx);
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
    z.i("!56@/B4Tb64lLpKLfnxozhPvvTZPSCereVb3n7bdN/66lrYK29QWzfkOnA==", "delBySvrId = " + i);
  }

  public final j hQ(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!56@/B4Tb64lLpKLfnxozhPvvTZPSCereVb3n7bdN/66lrYK29QWzfkOnA==", "getLastRecvShakeMsg fail, talker is null");
      return null;
    }
    String str = "select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '" + ch.iV(paramString) + "' order by createTime DESC limit 1";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    j localj = new j();
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localj.b(localCursor);
    }
    localCursor.close();
    return localj;
  }

  public final j[] hR(String paramString)
  {
    z.d("!56@/B4Tb64lLpKLfnxozhPvvTZPSCereVb3n7bdN/66lrYK29QWzfkOnA==", "getLastShakeVerifyMessage, talker = " + paramString + ", limit = 3");
    String str = "select *, rowid from ShakeVerifyMessage  where sayhiuser = '" + ch.iV(paramString) + "' order by createtime DESC limit 3";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    if (i <= 0)
    {
      z.i("!56@/B4Tb64lLpKLfnxozhPvvTZPSCereVb3n7bdN/66lrYK29QWzfkOnA==", "getLastShakeVerifyMessage, cursor count = 0, talker = " + paramString + ", limit = 3");
      localCursor.close();
      return null;
    }
    j[] arrayOfj = new j[i];
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      arrayOfj[(-1 + (i - j))] = new j();
      arrayOfj[(-1 + (i - j))].b(localCursor);
    }
    localCursor.close();
    return arrayOfj;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.k
 * JD-Core Version:    0.6.2
 */