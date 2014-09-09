package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.LayoutInflater;
import com.tencent.mm.sdk.platformtools.ak;

public final class ek
{
  private static float BR = 0.0F;

  public static void b(Context paramContext, float paramFloat)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(ak.aHi(), 0).edit();
    localEditor.putFloat("text_size_scale_key", paramFloat);
    localEditor.commit();
    BR = paramFloat;
  }

  public static LayoutInflater ck(Context paramContext)
  {
    cl(paramContext);
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext).cloneInContext(paramContext);
    localLayoutInflater.setFactory(new el(localLayoutInflater));
    return localLayoutInflater;
  }

  public static float cl(Context paramContext)
  {
    if (BR == 0.0F)
      BR = paramContext.getSharedPreferences(ak.aHi(), 0).getFloat("text_size_scale_key", 1.0F);
    return BR;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ek
 * JD-Core Version:    0.6.2
 */