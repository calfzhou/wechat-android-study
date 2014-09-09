package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.sdk.platformtools.z;

public class ChattingImageBGView extends ImageView
{
  private Bitmap eXB;
  private int joy = 0;

  public ChattingImageBGView(Context paramContext)
  {
    super(paramContext);
    setScaleType(ImageView.ScaleType.MATRIX);
  }

  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setScaleType(ImageView.ScaleType.MATRIX);
  }

  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScaleType(ImageView.ScaleType.MATRIX);
  }

  private void aUO()
  {
    post(new ci(this));
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (this.joy != paramInt3 - paramInt1))
    {
      this.joy = (paramInt3 - paramInt1);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      arrayOfObject[2] = Integer.valueOf(paramInt3);
      arrayOfObject[3] = Integer.valueOf(paramInt4);
      z.d("!44@/B4Tb64lLpKwUcOR+EdWctGDzfdAEkAyxbpaMbRDirY=", "on layout changed, %d, %d, %d, %d", arrayOfObject);
      aUO();
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.eXB = paramBitmap;
    super.setImageBitmap(paramBitmap);
    aUO();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingImageBGView
 * JD-Core Version:    0.6.2
 */