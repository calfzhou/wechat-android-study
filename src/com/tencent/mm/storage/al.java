package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.z;

public final class al extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ak.dhu, "EmotionDetail");
  }

  public al(af paramaf)
  {
    super(paramaf, ak.dhu, "EmotionDetail", null);
    this.dtV = paramaf;
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean b(ak paramak)
  {
    z.d("!56@/B4Tb64lLpKW6XSoHkFWUD4sQdXykKjv69KuSvc99hiMxce2+HA4rQ==", "[saveOrUpdate]");
    if (paramak == null)
      z.i("!56@/B4Tb64lLpKW6XSoHkFWUD4sQdXykKjv69KuSvc99hiMxce2+HA4rQ==", "[insert] failed. item is null.");
    long l;
    do
    {
      return false;
      ContentValues localContentValues = paramak.ir();
      l = this.dtV.replace("EmotionDetail", "productID", localContentValues);
      if (l != -1L)
        Ba(paramak.field_productID);
    }
    while (l < 0L);
    return true;
  }

  public final String wj()
  {
    return "EmotionDetail";
  }

  public final ak zj(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    Cursor localCursor = this.dtV.a("EmotionDetail", null, "productID=?", new String[] { paramString }, null, null);
    int i = localCursor.getCount();
    ak localak = null;
    if (i > 0)
    {
      localCursor.moveToFirst();
      localak = new ak();
      localak.b(localCursor);
    }
    localCursor.close();
    return localak;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.al
 * JD-Core Version:    0.6.2
 */