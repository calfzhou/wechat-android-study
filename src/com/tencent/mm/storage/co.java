package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class co extends ah
{
  public static final String[] dmc = arrayOfString;
  private af dtV;
  private final am ijV = new cp(this);

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(cn.dhu, "Stranger");
  }

  public co(af paramaf)
  {
    super(paramaf, cn.dhu, "Stranger", null);
    this.dtV = paramaf;
  }

  private void b(cn paramcn)
  {
    if (this.ijV.ae(paramcn))
      this.ijV.Bo();
  }

  public final cn Ab(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    cn localcn = new cn();
    Cursor localCursor = this.dtV.a("Stranger", null, "encryptUsername = ?", new String[] { paramString }, null, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localcn.b(localCursor);
    }
    localCursor.close();
    return localcn;
  }

  public final int Ac(String paramString)
  {
    int i = this.dtV.delete("Stranger", "(encryptUsername=?)", new String[] { paramString });
    if (i > 0)
      Bo();
    z.i("!44@/B4Tb64lLpJZ7cU6crbeb5dTa0zLWGgip6b0bwNd834=", "delByEncryptUsername:" + paramString + " result:" + i);
    return i;
  }

  public final void a(cq paramcq)
  {
    this.ijV.a(paramcq, null);
  }

  public final void b(cq paramcq)
  {
    this.ijV.remove(paramcq);
  }

  public final boolean c(cn paramcn)
  {
    boolean bool;
    if (paramcn != null)
    {
      bool = true;
      Assert.assertTrue("stranger NULL !", bool);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramcn.field_encryptUsername;
      arrayOfObject[1] = paramcn.field_conRemark;
      z.d("!44@/B4Tb64lLpJZ7cU6crbeb5dTa0zLWGgip6b0bwNd834=", "replace : encryptUsername=%s, conRemark=%s", arrayOfObject);
      ContentValues localContentValues = paramcn.ir();
      if (this.dtV.replace("Stranger", "", localContentValues) <= 0L)
        break label80;
    }
    label80: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        break label86;
      return false;
      bool = false;
      break;
    }
    label86: b(paramcn);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.co
 * JD-Core Version:    0.6.2
 */