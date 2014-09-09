package com.tencent.mm.plugin.exdevice.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class c extends ah
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(b.dhu, "HardDeviceInfo");
  }

  public c(af paramaf)
  {
    super(paramaf, b.dhu, "HardDeviceInfo", null);
    this.dtV = paramaf;
    paramaf.bp("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceUsernameIndex ON HardDeviceInfo ( brandName )");
    paramaf.bp("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceMacIndex ON HardDeviceInfo ( mac )");
  }

  public final int a(String paramString, b paramb)
  {
    if ((ch.jb(paramString)) || (ch.jb(paramb.field_deviceID)))
    {
      z.w("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "wrong argument");
      return 0;
    }
    ContentValues localContentValues = paramb.ir();
    af localaf;
    String[] arrayOfString;
    if (localContentValues.size() > 0)
    {
      localaf = this.dtV;
      arrayOfString = new String[1];
      arrayOfString[0] = paramb.field_brandName;
    }
    for (int i = localaf.update("HardDeviceInfo", localContentValues, "brandName=?", arrayOfString); ; i = 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramb.field_deviceID;
      arrayOfObject[1] = Integer.valueOf(i);
      z.i("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "update: id=%s, ret=%s ", arrayOfObject);
      return i;
    }
  }

  public final b lP(String paramString)
  {
    if (ch.jb(paramString));
    Cursor localCursor;
    do
    {
      return null;
      localCursor = this.dtV.a("HardDeviceInfo", null, "mac=?", new String[] { paramString }, null, null);
    }
    while (localCursor == null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "get null with mac:" + paramString);
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    b localb = new b();
    localb.b(localCursor);
    localCursor.close();
    return localb;
  }

  public final b lQ(String paramString)
  {
    if (ch.jb(paramString));
    Cursor localCursor;
    do
    {
      return null;
      localCursor = this.dtV.a("HardDeviceInfo", null, "deviceID=?", new String[] { paramString }, null, null);
    }
    while (localCursor == null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "get null with deviceId:" + paramString);
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    b localb = new b();
    localb.b(localCursor);
    localCursor.close();
    return localb;
  }

  public final b lR(String paramString)
  {
    if (ch.jb(paramString));
    Cursor localCursor;
    do
    {
      return null;
      localCursor = this.dtV.a("HardDeviceInfo", null, "brandName=?", new String[] { paramString }, null, null);
    }
    while (localCursor == null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "get null with brandName:" + paramString);
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    b localb = new b();
    localb.b(localCursor);
    localCursor.close();
    return localb;
  }

  public final boolean lS(String paramString)
  {
    if (ch.jb(paramString));
    while (this.dtV.delete("HardDeviceInfo", "brandName=?", new String[] { paramString }) <= 0)
      return false;
    return true;
  }

  public final boolean lT(String paramString)
  {
    if (ch.jb(paramString))
      return false;
    if (this.dtV.delete("HardDeviceInfo", "deviceID=?", new String[] { paramString }) <= 0)
    {
      z.i("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "delete hardDeviceInfo fail, deviceId = %s", new Object[] { paramString });
      return false;
    }
    z.i("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "delete hardDeviceInfo ok, deviceId = %s", new Object[] { paramString });
    return true;
  }

  public final boolean vT()
  {
    boolean bool = this.dtV.bp("HardDeviceInfo", "delete from HardDeviceInfo");
    if (!bool)
      z.e("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "deleteAll() failed!!!");
    return bool;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.c
 * JD-Core Version:    0.6.2
 */