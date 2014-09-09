package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.mm.sdk.platformtools.z;

final class ci
  implements Runnable
{
  ci(ChattingImageBGView paramChattingImageBGView)
  {
  }

  public final void run()
  {
    if (ChattingImageBGView.a(this.joz) == null)
    {
      z.w("!44@/B4Tb64lLpKwUcOR+EdWctGDzfdAEkAyxbpaMbRDirY=", "want to reset matrix, but bmp is null");
      return;
    }
    if (ChattingImageBGView.a(this.joz).getWidth() == 0)
      z.w("!44@/B4Tb64lLpKwUcOR+EdWctGDzfdAEkAyxbpaMbRDirY=", "want to reset matrix, but measured width error");
    Matrix localMatrix = new Matrix();
    float f1 = this.joz.getMeasuredWidth() / ChattingImageBGView.a(this.joz).getWidth();
    float f2 = this.joz.getMeasuredHeight() / ChattingImageBGView.a(this.joz).getHeight();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Float.valueOf(f1);
    arrayOfObject[1] = Float.valueOf(f2);
    arrayOfObject[2] = Integer.valueOf(this.joz.getMeasuredWidth());
    arrayOfObject[3] = Integer.valueOf(this.joz.getMeasuredHeight());
    z.d("!44@/B4Tb64lLpKwUcOR+EdWctGDzfdAEkAyxbpaMbRDirY=", "scaleW[%f], scaleH[%f] measured width[%d] measured height[%d]", arrayOfObject);
    if (f1 > f2)
      localMatrix.setScale(f1, f1);
    while (true)
    {
      this.joz.setImageMatrix(localMatrix);
      return;
      localMatrix.setScale(f2, f2);
      float f3 = f2 * ChattingImageBGView.a(this.joz).getWidth();
      localMatrix.postTranslate((this.joz.getMeasuredWidth() - f3) / 2.0F, 0.0F);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ci
 * JD-Core Version:    0.6.2
 */