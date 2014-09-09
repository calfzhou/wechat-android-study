package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class e extends Thread
{
  final float eXn;
  boolean evv = true;
  int hFC;
  Rect hFW = new Rect();
  Rect hFX = new Rect();
  List hFY = new ArrayList();
  Map hFZ = new HashMap();
  Paint hGa = null;
  Paint hGb = null;
  final int hGc;
  final int hGd;
  final float hGe;
  final float hGf;
  long hGg = 0L;
  int hGh;
  int hGi;
  int hGj;
  int hGk;
  int hGl;
  int hGm;
  int hGn;
  float hGo;
  float hGp;
  float hGq;
  float hGr;
  int hGs;
  int hGt;
  final int shadowColor;

  public e(LyricView paramLyricView, long paramLong)
  {
    this.hGg = paramLong;
    this.eXn = 1.0F;
    this.hGe = 0.0F;
    this.hGf = 1.0F;
    this.shadowColor = -16777216;
    this.hGa = new Paint();
    this.hGa.setAntiAlias(true);
    this.hGa.setColor(-4013374);
    this.hGa.setAlpha(255);
    this.hGa.setTextAlign(Paint.Align.CENTER);
    this.hGa.setTextSize(com.tencent.mm.aq.a.fromDPToPix(paramLyricView.getContext(), 18));
    this.hGa.setShadowLayer(this.eXn, this.hGe, this.hGf, this.shadowColor);
    this.hGb = new Paint();
    this.hGb.setAntiAlias(true);
    this.hGb.setColor(-9999249);
    this.hGb.setAlpha(255);
    this.hGb.setTextAlign(Paint.Align.CENTER);
    this.hGb.setTextSize(com.tencent.mm.aq.a.fromDPToPix(paramLyricView.getContext(), 18));
    this.hGb.setShadowLayer(this.eXn, this.hGe, this.hGf, this.shadowColor);
    Rect localRect = new Rect();
    this.hGa.getTextBounds("calculate text height", 0, 1, localRect);
    this.hGc = localRect.height();
    this.hGd = (4 * this.hGc);
  }

  private float a(Canvas paramCanvas, float paramFloat1, float paramFloat2, Paint paramPaint, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramCanvas == null) || (paramPaint == null))
    {
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "autoDrawText: canvas or paint is null");
      return 0.0F;
    }
    this.hGt = paramPaint.getAlpha();
    int j;
    float f2;
    int k;
    if (paramBoolean)
    {
      j = -1 + this.hFY.size();
      f2 = paramFloat2;
      k = paramInt2;
      if (j >= 0)
      {
        if (f2 <= this.hGm)
          k = (int)(255.0F * f2 / this.hGm);
        if (f2 < this.hGn)
          break label362;
      }
    }
    label362: for (int m = (int)(255.0F * (this.hGl - f2) / (this.hGl - this.hGn)); ; m = k)
    {
      paramPaint.setColor(paramInt1);
      paramPaint.setAlpha(m);
      paramCanvas.drawText((String)this.hFY.get(j), paramFloat1, f2, paramPaint);
      float f3 = f2 - this.hGd;
      if (f3 > this.hGk)
      {
        j--;
        f2 = f3;
        k = m;
        break;
        f3 = f2;
      }
      for (float f1 = f3 + this.hGd; ; f1 = paramFloat2 - this.hGd)
      {
        paramPaint.setAlpha(this.hGt);
        return f1;
        for (int i = 0; i < this.hFY.size(); i++)
        {
          if (paramFloat2 <= this.hGm)
            paramInt2 = (int)(255.0F * paramFloat2 / this.hGm);
          if (paramFloat2 >= this.hGn)
            paramInt2 = (int)(255.0F * (this.hGl - paramFloat2) / (this.hGl - this.hGn));
          paramPaint.setColor(paramInt1);
          paramPaint.setAlpha(paramInt2);
          paramCanvas.drawText((String)this.hFY.get(i), paramFloat1, paramFloat2, paramPaint);
          paramFloat2 += this.hGd;
          if (paramFloat2 >= this.hGl)
            break;
        }
      }
    }
  }

  private String a(int paramInt, String paramString, Paint paramPaint)
  {
    if ((paramString == null) || (paramPaint == null))
    {
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "get auto fix text, text, canvas or paint is null");
      return paramString;
    }
    for (int i = paramString.length(); ; i--)
    {
      if (i <= 0)
        break label164;
      paramPaint.getTextBounds(paramString, 0, i, this.hFX);
      if (this.hFX.width() <= paramInt)
      {
        if (i == paramString.length())
          break;
        String str = paramString.substring(0, i);
        int j = str.lastIndexOf(' ');
        int k = str.lastIndexOf('\t');
        if ((j < 0) && (k < 0))
        {
          z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "do not contains ' ' or '\t'");
          return str;
        }
        z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "contains ' ', index blank space[" + j + "] tab[" + k + "]");
        return str.substring(0, Math.max(j, k));
      }
    }
    label164: z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "can not get auto fix text");
    return paramString;
  }

  private void a(Canvas paramCanvas, String paramString, Paint paramPaint)
  {
    if ((paramString == null) || (paramPaint == null) || (paramCanvas == null))
    {
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "get fit text list, text, canvas or paint is null");
      return;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramCanvas.getWidth());
    String str1 = String.format("%s%d", arrayOfObject);
    List localList = (List)this.hFZ.get(str1);
    if (localList != null)
    {
      this.hFY = localList;
      return;
    }
    String str2 = "";
    this.hFY = new ArrayList();
    do
    {
      paramString = paramString.substring(str2.length()).trim();
      str2 = a(paramCanvas.getWidth(), paramString, paramPaint);
      z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "do text[" + paramString + "] temp text[" + str2 + "]");
      this.hFY.add(str2);
    }
    while (!paramString.equals(str2));
    this.hFZ.put(str1, this.hFY);
  }

  public final void run()
  {
    if ((this.evv) && (LyricView.e(this.hFU) != null))
      label782: 
      while (true)
      {
        Canvas localCanvas;
        int j;
        try
        {
          synchronized (LyricView.f(this.hFU))
          {
            LyricView.f(this.hFU).wait();
            localCanvas = this.hFU.getHolder().lockCanvas();
            if (localCanvas == null)
            {
              z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "renderBG, but canvas is null");
              l = this.hGg;
              if ((localCanvas != null) && (LyricView.e(this.hFU) != null))
                continue;
              z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "render lrc: but canvas or lrcMgr is null");
              this.hFU.getHolder().unlockCanvasAndPost(localCanvas);
            }
          }
          if ((LyricView.c(this.hFU) == null) && (!ch.jb(LyricView.g(this.hFU))))
            LyricView.b(this.hFU);
          if (!LyricView.a(LyricView.c(this.hFU), localCanvas, this.hFW))
            localCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
          LyricView.a(LyricView.d(this.hFU), localCanvas);
          continue;
        }
        catch (Exception localException)
        {
          long l;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localException.getLocalizedMessage();
          z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "draw run catch exception %s", arrayOfObject2);
          this.evv = false;
          continue;
          this.hGh = (localCanvas.getHeight() >> 1);
          this.hGi = (localCanvas.getWidth() >> 1);
          this.hGj = (this.hGh + this.hGc);
          this.hGk = (localCanvas.getHeight() >> 3);
          this.hGl = (7 * this.hGk + this.hGc);
          this.hGm = (localCanvas.getHeight() >> 2);
          this.hGn = (3 * this.hGm + this.hGc);
          this.hFC = LyricView.e(this.hFU).cC(l);
          a(localCanvas, LyricView.e(this.hFU).mV(this.hFC).content, this.hGa);
          this.hGo = LyricView.e(this.hFU).a(this.hFY.size() * this.hGd, l);
          this.hGp = (this.hGj - this.hGo * (float)(l - LyricView.e(this.hFU).mV(this.hFC).timestamp));
          this.hGq = a(localCanvas, this.hGi, this.hGp, this.hGa, -4013374, 255, false);
          this.hGr = this.hGp;
          this.hGs = 255;
          int i = -1 + this.hFC;
          if (i >= 0)
          {
            this.hGr -= this.hGd;
            if (this.hGr >= this.hGk)
            {
              if (this.hGr < this.hGm)
                this.hGs = Math.min(255, (int)(255.0F * (this.hGr - this.hGk) / this.hGk));
              a(localCanvas, LyricView.e(this.hFU).mV(i).content, this.hGb);
              this.hGr = a(localCanvas, this.hGi, this.hGr, this.hGb, -9999249, this.hGs, true);
              i--;
              continue;
            }
          }
          this.hGr = this.hGq;
          this.hGs = 255;
          j = 1 + this.hFC;
        }
        while (true)
        {
          if (j >= LyricView.e(this.hFU).aCP())
            break label782;
          this.hGr += this.hGd;
          if (this.hGr > this.hGl)
            break;
          if (this.hGr > this.hGn)
            this.hGs = Math.min(255, (int)(255.0F * (this.hGl - this.hGr) / this.hGk));
          a(localCanvas, LyricView.e(this.hFU).mV(j).content, this.hGb);
          this.hGr = a(localCanvas, this.hGi, this.hGr, this.hGb, -9999249, this.hGs, false);
          j++;
        }
      }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Boolean.valueOf(this.evv);
    if (LyricView.e(this.hFU) == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject1[1] = Boolean.valueOf(bool);
      z.d("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "quit draw lrc thread, run %B, lrcMgr is null ? %B", arrayOfObject1);
      this.evv = false;
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.e
 * JD-Core Version:    0.6.2
 */