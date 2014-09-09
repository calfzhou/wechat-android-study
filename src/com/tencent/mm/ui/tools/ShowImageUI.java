package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.MMActivity;

public class ShowImageUI extends MMActivity
{
  private MMGestureGallery ePa;
  private boolean jUX;
  private gv jUY;
  private boolean jUZ;

  protected final int getLayoutId()
  {
    return k.bnr;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jUX = getIntent().getBooleanExtra("key_favorite", false);
    this.jUZ = getIntent().getBooleanExtra("show_menu", true);
    this.ePa = ((MMGestureGallery)findViewById(i.auH));
    this.ePa.setVerticalFadingEdgeEnabled(false);
    this.ePa.setHorizontalFadingEdgeEnabled(false);
    this.jUY = new gv((byte)0);
    this.jUY.imagePath = getIntent().getStringExtra("key_image_path");
    this.ePa.setAdapter(this.jUY);
    a(new gs(this));
    if (this.jUZ)
      a(0, h.Yi, new gt(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShowImageUI
 * JD-Core Version:    0.6.2
 */