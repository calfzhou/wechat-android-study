package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public enum bf
{
  private final SharedPreferences dkI = ak.getContext().getSharedPreferences(ak.aHi(), 0);

  static
  {
    bf[] arrayOfbf = new bf[1];
    arrayOfbf[0] = dkH;
  }

  private bf()
  {
  }

  public final void a(String paramString1, int paramInt, String paramString2)
  {
    int i = 0;
    if (paramInt != 0)
      i = 1;
    if (!ch.jb(paramString2))
      i |= 2;
    if (!ch.jb(paramString1))
      i |= 4;
    y("last_bind_info", String.valueOf(i));
  }

  public final void y(String paramString1, String paramString2)
  {
    z.d("!32@/B4Tb64lLpKi2lXvYwKJe8aax+f9N9cy", "save key : %s value : %s", new Object[] { paramString1, paramString2 });
    this.dkI.edit().putString(paramString1, paramString2).commit();
  }

  public final String z(String paramString1, String paramString2)
  {
    return this.dkI.getString(paramString1, paramString2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bf
 * JD-Core Version:    0.6.2
 */