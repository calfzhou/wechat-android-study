package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.z;

public final class ci extends ah
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ch.dhu, "OpenMsgListener");
  }

  public ci(af paramaf)
  {
    super(paramaf, ch.dhu, "OpenMsgListener", null);
    this.dtV = paramaf;
    paramaf.bp("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
    paramaf.bp("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
  }

  public final int a(String paramString, ch paramch)
  {
    if ((com.tencent.mm.sdk.platformtools.ch.jb(paramString)) || (paramch == null) || (com.tencent.mm.sdk.platformtools.ch.jb(paramch.field_appId)))
    {
      z.w("!44@/B4Tb64lLpJoDeDeiSCUn5MyWQBlOslHPXVmp0VF0zU=", "wrong argument");
      return 0;
    }
    ContentValues localContentValues = paramch.ir();
    if (localContentValues.size() > 0);
    for (int i = this.dtV.update("OpenMsgListener", localContentValues, "appId=?", new String[] { paramString }); ; i = 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramch.field_appId;
      arrayOfObject[1] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpJoDeDeiSCUn5MyWQBlOslHPXVmp0VF0zU=", "update: id=%s, ret=%s ", arrayOfObject);
      return i;
    }
  }

  public final ch zP(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    Cursor localCursor = this.dtV.a("OpenMsgListener", null, "appId=?", new String[] { paramString }, null, null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!44@/B4Tb64lLpJoDeDeiSCUn5MyWQBlOslHPXVmp0VF0zU=", "get null with appId:" + paramString);
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    ch localch = new ch();
    localch.b(localCursor);
    localCursor.close();
    return localch;
  }

  public final boolean zQ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    while (this.dtV.delete("OpenMsgListener", "appId=?", new String[] { paramString }) <= 0)
      return false;
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ci
 * JD-Core Version:    0.6.2
 */