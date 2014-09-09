package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.tools.MMGestureGallery;

public class GetHdHeadImageGalleryView extends MMGestureGallery
{
  private cn hyn;
  private Bitmap hyo;
  private Bitmap hyp;
  private q hyq;
  private String hyr;
  private String username;

  public GetHdHeadImageGalleryView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public GetHdHeadImageGalleryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public GetHdHeadImageGalleryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void init()
  {
    this.hyq = new q(this, (byte)0);
    setVerticalFadingEdgeEnabled(false);
    setHorizontalFadingEdgeEnabled(false);
    setAdapter(this.hyq);
    setSelection(0);
    a(new u(this, (byte)0));
    a(new s(this, (byte)0));
  }

  public final void a(cn paramcn)
  {
    this.hyn = paramcn;
  }

  public final void l(Bitmap paramBitmap)
  {
    this.hyp = paramBitmap;
    this.hyq.notifyDataSetChanged();
  }

  public final void setThumbImage(Bitmap paramBitmap)
  {
    this.hyo = paramBitmap;
    this.hyq.notifyDataSetChanged();
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final void vn(String paramString)
  {
    this.hyr = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView
 * JD-Core Version:    0.6.2
 */