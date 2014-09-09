package com.tencent.mm.ui.setting;

import android.widget.LinearLayout;

final class gf
{
  LinearLayout jOv;
  LinearLayout jOw;
  LinearLayout jOx;
  LinearLayout jOy;
  LinearLayout jOz;

  public final void Dj(String paramString)
  {
    if (paramString.equals("downloading"))
    {
      this.jOv.setVisibility(0);
      this.jOw.setVisibility(8);
      this.jOx.setVisibility(8);
      this.jOy.setVisibility(8);
      this.jOz.setVisibility(8);
    }
    do
    {
      return;
      if (paramString.equals("downloaded"))
      {
        this.jOv.setVisibility(8);
        this.jOw.setVisibility(0);
        this.jOx.setVisibility(8);
        this.jOy.setVisibility(8);
        this.jOz.setVisibility(8);
        return;
      }
      if (paramString.equals("undownloaded"))
      {
        this.jOv.setVisibility(8);
        this.jOw.setVisibility(8);
        this.jOx.setVisibility(0);
        this.jOy.setVisibility(8);
        this.jOz.setVisibility(8);
        return;
      }
      if (paramString.equals("using"))
      {
        this.jOv.setVisibility(8);
        this.jOw.setVisibility(8);
        this.jOx.setVisibility(8);
        this.jOy.setVisibility(0);
        this.jOz.setVisibility(8);
        return;
      }
    }
    while (!paramString.equals("canceling"));
    this.jOv.setVisibility(8);
    this.jOw.setVisibility(8);
    this.jOx.setVisibility(8);
    this.jOy.setVisibility(8);
    this.jOz.setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.gf
 * JD-Core Version:    0.6.2
 */