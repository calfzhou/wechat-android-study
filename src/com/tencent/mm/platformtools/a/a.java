package com.tencent.mm.platformtools.a;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class a
{
  private static Map values;

  public static String u(Context paramContext, String paramString)
  {
    if (values == null);
    try
    {
      values = x.AL(ch.b(paramContext.getAssets().open("profile.ini")));
      label24: if (values == null)
        return null;
      return (String)values.get(paramString);
    }
    catch (Exception localException)
    {
      break label24;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.a.a
 * JD-Core Version:    0.6.2
 */