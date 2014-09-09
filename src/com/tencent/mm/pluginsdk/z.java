package com.tencent.mm.pluginsdk;

import android.content.Context;
import android.text.SpannableString;
import android.widget.TextView;

public abstract interface z
{
  public abstract SpannableString a(TextView paramTextView, Context paramContext);

  public abstract SpannableString a(TextView paramTextView, String paramString, Context paramContext);

  public abstract void akP();

  public abstract boolean b(Context paramContext, String paramString, boolean paramBoolean);

  public abstract void c(Context paramContext, String paramString, boolean paramBoolean);

  public abstract void c(TextView paramTextView);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.z
 * JD-Core Version:    0.6.2
 */