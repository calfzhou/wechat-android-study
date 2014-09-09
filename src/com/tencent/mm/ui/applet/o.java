package com.tencent.mm.ui.applet;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.cm;

@SuppressLint({"HandlerLeak"})
public final class o extends r
{
  private Bitmap bitmap;
  private String iVX;
  private final cm iVY = new p(this);

  public o(String paramString)
  {
    this.iVX = paramString;
  }

  public final void aQC()
  {
    this.bitmap = null;
    q localq = new q(this, (byte)0);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.iVX;
    localq.execute(arrayOfString);
  }

  public final void d(SecurityImage paramSecurityImage)
  {
    this.iWa = paramSecurityImage;
  }

  protected final void onStart()
  {
    aQC();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.o
 * JD-Core Version:    0.6.2
 */