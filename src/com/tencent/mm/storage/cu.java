package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;

public final class cu extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ct.dhu, "VoiceTransText");
  }

  public cu(af paramaf)
  {
    this(paramaf, ct.dhu, "VoiceTransText");
  }

  private cu(af paramaf, ae paramae, String paramString)
  {
    super(paramaf, paramae, paramString, null);
    this.dtV = paramaf;
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean a(ct paramct)
  {
    if (paramct == null);
    ContentValues localContentValues;
    do
    {
      return false;
      localContentValues = paramct.ir();
    }
    while (this.dtV.replace("VoiceTransText", "msgId", localContentValues) < 0L);
    return true;
  }

  public final ct db(long paramLong)
  {
    if (paramLong < 0L)
      return null;
    ct localct = new ct();
    af localaf = this.dtV;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localaf.a("VoiceTransText", null, "msgId=?", arrayOfString, null, null);
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      localct.b(localCursor);
    }
    localCursor.close();
    return localct;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cu
 * JD-Core Version:    0.6.2
 */