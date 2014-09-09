package com.tencent.mm.pluginsdk.ui.tools;

import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

final class m
{
  boolean eZh;
  ResolveInfo hKB;
  CharSequence hKC;
  Drawable hKD;
  boolean hKE;
  boolean hKF;
  boolean hKG;

  public m(AppChooserUI paramAppChooserUI)
  {
  }

  public m(AppChooserUI paramAppChooserUI, ResolveInfo paramResolveInfo, CharSequence paramCharSequence)
  {
    this.hKB = paramResolveInfo;
    this.hKC = paramCharSequence;
    this.hKE = false;
    this.hKF = true;
    this.hKG = false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.m
 * JD-Core Version:    0.6.2
 */