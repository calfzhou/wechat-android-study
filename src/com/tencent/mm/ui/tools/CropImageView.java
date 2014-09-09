package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.c;
import java.util.Timer;

public class CropImageView extends ImageView
{
  private Bitmap eXB;
  private float eZp;
  private float elj;
  private View.OnTouchListener fWW = new bi(this);
  float faI = 0.0F;
  float faJ = 0.0F;
  private long flh;
  private boolean gHp = false;
  private Timer gcp = new Timer(true);
  private boolean jPD = true;
  private boolean jPE = false;
  private float jPF;
  private float jPG;
  private PointF jPH = new PointF();
  boolean jPI = false;
  private boolean jPJ = false;
  private boolean jPK = false;
  private boolean jPL = false;
  private boolean jPM = false;
  private boolean jPN = false;
  private boolean jPO = false;
  private boolean jPP = false;
  private float jPQ = 1.0F;
  private float jPR = 0.0F;
  private float jPS = 0.0F;
  private bm jPT = null;
  private boolean jPU = false;
  private Timer jPV;
  private cm jPW = new bg(this);
  private bl jPX = null;
  private cm jPY = new bh(this);
  private int jPZ = 0;
  private bk jQa;
  private boolean jQb = true;

  public CropImageView(Context paramContext)
  {
    super(paramContext);
    aZR();
  }

  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    aZR();
  }

  public final void a(bk parambk)
  {
    this.jQa = parambk;
  }

  public final void aZP()
  {
    this.jQb = false;
  }

  public final Bitmap aZQ()
  {
    return this.eXB;
  }

  public final void aZR()
  {
    setOnTouchListener(this.fWW);
  }

  public final void aZS()
  {
    this.jPQ = (1.0666F * this.jPQ);
    if (1.0F <= this.jPQ)
      this.jPL = false;
    if (1.6F < this.jPQ);
    for (this.jPK = true; (this.jPD) && (4.0F < this.jPQ); this.jPK = false)
    {
      this.jPQ = 4.0F;
      return;
    }
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float f1 = this.jPH.x;
    arrayOfFloat2[0] = f1;
    arrayOfFloat1[0] = f1;
    float f2 = this.jPH.y;
    arrayOfFloat2[1] = f2;
    arrayOfFloat1[1] = f2;
    getImageMatrix().mapPoints(arrayOfFloat1);
    getImageMatrix().postScale(1.0666F, 1.0666F);
    getImageMatrix().mapPoints(arrayOfFloat2);
    getImageMatrix().postTranslate((arrayOfFloat1[0] - arrayOfFloat2[0]) / 2.0F, (arrayOfFloat1[1] - arrayOfFloat2[1]) / 2.0F);
    setImageBitmap(this.eXB);
    invalidate();
  }

  public final void aZT()
  {
    this.jPQ = (0.9375F * this.jPQ);
    if (1.6F > this.jPQ)
      this.jPK = false;
    if (1.0F > this.jPQ);
    for (this.jPL = true; 0.4F > this.jPQ; this.jPL = false)
    {
      this.jPQ = 0.4F;
      return;
    }
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float f1 = this.jPH.x;
    arrayOfFloat2[0] = f1;
    arrayOfFloat1[0] = f1;
    float f2 = this.jPH.y;
    arrayOfFloat2[1] = f2;
    arrayOfFloat1[1] = f2;
    getImageMatrix().mapPoints(arrayOfFloat1);
    getImageMatrix().postScale(0.9375F, 0.9375F);
    getImageMatrix().mapPoints(arrayOfFloat2);
    getImageMatrix().postTranslate((arrayOfFloat1[0] - arrayOfFloat2[0]) / 2.0F, (arrayOfFloat1[1] - arrayOfFloat2[1]) / 2.0F);
    setImageBitmap(this.eXB);
    invalidate();
  }

  public final void aZU()
  {
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = (this.eXB.getWidth() / 2);
    arrayOfFloat[1] = (this.eXB.getHeight() / 2);
    getImageMatrix().mapPoints(arrayOfFloat);
    getImageMatrix().postRotate(90.0F, arrayOfFloat[0], arrayOfFloat[1]);
    setImageBitmap(this.eXB);
    invalidate();
    this.jPZ = (1 + this.jPZ);
  }

  public final int aZV()
  {
    return this.jPZ;
  }

  public final void gb(boolean paramBoolean)
  {
    this.jPD = false;
  }

  public final void onDestroy()
  {
    if ((this.eXB != null) && (!this.eXB.isRecycled()))
      this.eXB.recycle();
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.eXB = paramBitmap;
    c.a(this.jPH, paramBitmap);
    super.setImageBitmap(paramBitmap);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView
 * JD-Core Version:    0.6.2
 */