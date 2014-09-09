package com.tencent.mm.model.a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;

public abstract class a
  implements d
{
  protected e dmF;
  protected String dmG = sd();
  protected String[] dmH = sc();

  public final String C(String paramString1, String paramString2)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    if (localSharedPreferences == null)
      return null;
    return localSharedPreferences.getString(this.dmG + paramString2 + paramString1, null);
  }

  public final void a(e parame)
  {
    this.dmF = parame;
  }

  public final void a(String paramString, boolean paramBoolean, String[] paramArrayOfString)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    if (localSharedPreferences == null);
    label181: 
    do
    {
      return;
      localSharedPreferences.edit().putBoolean(this.dmG + paramString, paramBoolean).commit();
      if ((this.dmH != null) && (paramArrayOfString != null) && (this.dmH.length == paramArrayOfString.length))
      {
        String[] arrayOfString = this.dmH;
        int i = arrayOfString.length;
        int j = 0;
        int k = 0;
        if (j < i)
        {
          String str1 = arrayOfString[j];
          if (str1 != null)
            if (paramArrayOfString[k] == null)
              break label181;
          for (String str2 = paramArrayOfString[k]; ; str2 = "")
          {
            localSharedPreferences.edit().putString(this.dmG + str1 + paramString, str2).commit();
            k++;
            j++;
            break;
          }
        }
      }
    }
    while (this.dmF == null);
    this.dmF.se();
  }

  public final boolean eB(String paramString)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    boolean bool1 = false;
    if (localSharedPreferences != null)
    {
      boolean bool2 = localSharedPreferences.getBoolean(this.dmG + paramString, false);
      bool1 = false;
      if (bool2)
        bool1 = true;
    }
    return bool1;
  }

  public final void eC(String paramString)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    if (localSharedPreferences == null);
    do
    {
      return;
      localSharedPreferences.edit().remove(this.dmG + paramString).commit();
      if (this.dmH != null)
        for (String str : this.dmH)
          if (str != null)
            localSharedPreferences.edit().remove(this.dmG + str + paramString).commit();
    }
    while (this.dmF == null);
    this.dmF.sf();
  }

  protected String[] sc()
  {
    return null;
  }

  public abstract String sd();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.a
 * JD-Core Version:    0.6.2
 */