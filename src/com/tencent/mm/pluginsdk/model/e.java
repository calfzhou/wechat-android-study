package com.tencent.mm.pluginsdk.model;

import android.content.Context;

public final class e
{
  public static void a(Context paramContext, String[] paramArrayOfString, g paramg)
  {
    if ((paramg == null) || (paramArrayOfString == null) || (paramArrayOfString.length == 0))
      throw new IllegalArgumentException();
    new f(paramContext, paramArrayOfString, paramg).execute(new Void[0]);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.e
 * JD-Core Version:    0.6.2
 */