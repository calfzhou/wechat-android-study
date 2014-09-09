package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.protocal.a.ll;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

public final class am extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ap.dhu, "GetEmotionListCache");
  }

  public am(af paramaf)
  {
    this(paramaf, ap.dhu, "GetEmotionListCache");
  }

  private am(af paramaf, ae paramae, String paramString)
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

  public final boolean a(int paramInt, ll paramll)
  {
    if (paramll == null)
      return false;
    try
    {
      ap localap = new ap(paramInt, paramll.toByteArray());
      af localaf = this.dtV;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramInt);
      localaf.delete("GetEmotionListCache", "reqType=?", arrayOfString);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      z.d("!32@/B4Tb64lLpIUhDmLVZ6YSYZEe92ZMKgz", "insert cache: %d", arrayOfObject);
      boolean bool = b(localap);
      return bool;
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  public final ll oj(int paramInt)
  {
    af localaf = this.dtV;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    Cursor localCursor = localaf.a("GetEmotionListCache", null, "reqType=?", arrayOfString, null, null);
    Object localObject = null;
    ap localap;
    if (localCursor != null)
    {
      boolean bool = localCursor.moveToFirst();
      localObject = null;
      if (bool)
        localap = new ap(localCursor);
    }
    try
    {
      ll localll = new ll();
      localll.bL(localap.field_cache);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      z.d("!32@/B4Tb64lLpIUhDmLVZ6YSYZEe92ZMKgz", "succed get cache: %d", arrayOfObject);
      localObject = localll;
      if (localCursor != null)
        localCursor.close();
      return localObject;
    }
    catch (IOException localIOException)
    {
      while (true)
        localObject = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.am
 * JD-Core Version:    0.6.2
 */