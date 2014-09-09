package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class cs extends ah
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(cr.dhu, "UserOpenIdInApp");
  }

  public cs(af paramaf)
  {
    super(paramaf, cr.dhu, "UserOpenIdInApp", null);
    this.dtV = paramaf;
    paramaf.bp("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
    paramaf.bp("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
  }

  public final cr Ad(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    Cursor localCursor = this.dtV.a("UserOpenIdInApp", null, "openId=?", new String[] { paramString }, null, null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!56@/B4Tb64lLpLhq7sWJ+/cPquHPuW4dVELw2sSKTF0Xr52ZGTQ0XEmhg==", "get null with openId:" + paramString);
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    cr localcr = new cr();
    localcr.b(localCursor);
    localCursor.close();
    return localcr;
  }

  public final boolean a(cr paramcr)
  {
    if ((paramcr == null) || (ch.jb(paramcr.field_appId)) || (ch.jb(paramcr.field_openId)) || (ch.jb(paramcr.field_username)))
    {
      z.w("!56@/B4Tb64lLpLhq7sWJ+/cPquHPuW4dVELw2sSKTF0Xr52ZGTQ0XEmhg==", "wrong argument");
      return false;
    }
    ContentValues localContentValues = paramcr.ir();
    if (this.dtV.replace("UserOpenIdInApp", cr.dhu.ihb, localContentValues) > 0L);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramcr.field_appId;
      arrayOfObject[1] = paramcr.field_username;
      arrayOfObject[2] = Boolean.valueOf(bool);
      z.d("!56@/B4Tb64lLpLhq7sWJ+/cPquHPuW4dVELw2sSKTF0Xr52ZGTQ0XEmhg==", "replace: appId=%s, username=%s, ret=%s ", arrayOfObject);
      return bool;
    }
  }

  public final cr bx(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0) || (paramString2 == null) || (paramString2.length() <= 0))
      return null;
    Cursor localCursor = this.dtV.a("UserOpenIdInApp", null, "appId=? and username=? ", new String[] { paramString1, paramString2 }, null, null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!56@/B4Tb64lLpLhq7sWJ+/cPquHPuW4dVELw2sSKTF0Xr52ZGTQ0XEmhg==", "get null with appId-%s, username-%s:", new Object[] { paramString1, paramString2 });
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    cr localcr = new cr();
    localcr.b(localCursor);
    localCursor.close();
    return localcr;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cs
 * JD-Core Version:    0.6.2
 */