package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import junit.framework.Assert;

public class CropImageNewUI extends MMActivity
{
  private String filePath;
  private final int jPk = 1;
  private final int jPl = 0;
  private int jPm;
  private int jPn = 0;
  private FilterImageView jPo;
  private LinearLayout jPp;
  private CropImageView jPq;
  private ImageView jPr;
  private View jPs;
  private int jPt = 0;
  private boolean jPu = false;
  private boolean jPv = false;
  private boolean jPw = false;

  private static boolean a(Bitmap paramBitmap, String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (!paramString.equals("")))
      try
      {
        com.tencent.mm.sdk.platformtools.i.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, paramBoolean);
        return true;
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "saveBitmapToImage failed:" + localException.toString());
      }
    return false;
  }

  private static float[][] a(Matrix paramMatrix)
  {
    int[] arrayOfInt = { 3, 3 };
    float[][] arrayOfFloat = (float[][])Array.newInstance(Float.TYPE, arrayOfInt);
    float[] arrayOfFloat1 = new float[9];
    paramMatrix.getValues(arrayOfFloat1);
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        arrayOfFloat[i][j] = arrayOfFloat1[(j + i * 3)];
    return arrayOfFloat;
  }

  private int[] aZN()
  {
    Rect localRect = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    z.e("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "window TitleBar.h:" + i);
    if (i == 0);
    while (true)
    {
      int m;
      try
      {
        Class localClass = Class.forName("com.android.internal.R$dimen");
        Object localObject = localClass.newInstance();
        int i5 = Integer.parseInt(localClass.getField("status_bar_height").get(localObject).toString());
        i = getResources().getDimensionPixelSize(i5);
        z.e("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "sbar:" + i);
        j = i;
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
        int k = (int)(67.0F * localDisplayMetrics.density / 1.5D);
        m = Math.min(this.jPs.getWidth(), this.jPs.getHeight());
        int n = Math.max(this.jPs.getWidth(), this.jPs.getHeight());
        int i1 = n - k * 2;
        int i2 = k + (n + j);
        int i3 = m - k * 2 - j;
        if (this.jPt != 0)
          break label289;
        i4 = m + (j + k * 2);
        i3 += k;
        return new int[] { i4, i1, i3, i2 };
      }
      catch (Exception localException)
      {
      }
      int j = i;
      continue;
      label289: int i4 = m;
    }
  }

  private void b(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    this.jPo = ((FilterImageView)findViewById(com.tencent.mm.i.apf));
    j.J(this.jPo);
    this.jPo.u(paramRunnable1);
    this.jPo.v(paramRunnable2);
  }

  private Bitmap bl(int paramInt1, int paramInt2)
  {
    Object localObject = com.tencent.mm.sdk.platformtools.i.a(this.filePath, paramInt2, paramInt1, true);
    if (this.jPt != 0)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.reset();
      localMatrix.setRotate(this.jPt, ((Bitmap)localObject).getWidth() / 2, ((Bitmap)localObject).getHeight() / 2);
      Bitmap localBitmap = Bitmap.createBitmap((Bitmap)localObject, 0, 0, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight(), localMatrix, true);
      if (localObject != localBitmap)
        ((Bitmap)localObject).recycle();
      localObject = localBitmap;
    }
    z.d("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "getcrop degree:" + this.jPt);
    return localObject;
  }

  protected final void DP()
  {
    Bt("");
    this.jPp = ((LinearLayout)findViewById(com.tencent.mm.i.apl));
    this.jPr = ((ImageView)findViewById(com.tencent.mm.i.apk));
    j.J(this.jPr);
    this.jPs = findViewById(com.tencent.mm.i.aph);
    this.jPm = getIntent().getIntExtra("CropImageMode", 0);
    boolean bool1;
    boolean bool2;
    boolean bool3;
    int i;
    label372: ax localax;
    if (this.jPm != 0)
    {
      bool1 = true;
      Assert.assertTrue("the image mode must be set", bool1);
      bool2 = getIntent().getBooleanExtra("CropImage_Filter", false);
      bool3 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
      if (bool2)
        b(new be(this), new bf(this));
      this.jPw = false;
      this.jPq = ((CropImageView)findViewById(com.tencent.mm.i.apm));
      j.J(this.jPq);
      this.jPq.post(new ah(this));
      this.jPq.a(new as(this));
      ((Button)findViewById(com.tencent.mm.i.apn)).setOnClickListener(new ak(this));
      Button localButton1 = (Button)findViewById(com.tencent.mm.i.apo);
      localButton1.setOnClickListener(new al(this));
      Button localButton2 = (Button)findViewById(com.tencent.mm.i.apq);
      localButton2.setOnClickListener(new am(this));
      com.tencent.mm.sdk.platformtools.ay localay1 = new com.tencent.mm.sdk.platformtools.ay(new an(this), true);
      com.tencent.mm.sdk.platformtools.ay localay2 = new com.tencent.mm.sdk.platformtools.ay(new ao(this), true);
      localButton1.setOnTouchListener(new ap(this, localay1));
      localButton2.setOnTouchListener(new aq(this, localay2));
      i = n.bDR;
      switch (this.jPm)
      {
      case 3:
      case 4:
      default:
        z.d("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "mode is  " + this.jPm);
        localax = new ax(this, bool2, bool3);
        if (this.jPm == 5)
          a(0, h.WS, localax);
        break;
      case 1:
      case 2:
      case 5:
      }
    }
    while (true)
    {
      if ((bool2) && (bool3))
        a(0, getString(n.bDM), localax, cu.iMA);
      a(new az(this));
      if (this.jPm == 6)
      {
        findViewById(com.tencent.mm.i.api).setVisibility(8);
        a(0, getString(n.bDR), new ba(this), cu.iMA);
      }
      return;
      bool1 = false;
      break;
      b(new ai(this), new aj(this));
      this.jPo.aZY();
      this.jPo.aZZ();
      this.jPo.bac();
      break label372;
      this.jPq.aZP();
      findViewById(com.tencent.mm.i.apc).setVisibility(8);
      findViewById(com.tencent.mm.i.api).setVisibility(8);
      break label372;
      int j = getIntent().getIntExtra("CropImage_CompressType", 1);
      boolean bool4 = getIntent().getBooleanExtra("CropImage_BHasHD", false);
      if ((j != 1) && (bool4))
      {
        findViewById(com.tencent.mm.i.api).setVisibility(0);
        Button localButton4 = (Button)findViewById(com.tencent.mm.i.apj);
        localButton4.setBackgroundResource(h.SY);
        localButton4.setPadding(25, 8, 25, 8);
        localButton4.setOnClickListener(new ar(this));
        break label372;
      }
      findViewById(com.tencent.mm.i.api).setVisibility(8);
      break label372;
      if (this.jPm == 4)
      {
        a(0, h.WS, localax);
        findViewById(com.tencent.mm.i.api).setVisibility(0);
        Button localButton3 = (Button)findViewById(com.tencent.mm.i.apj);
        localButton3.setText(n.bDM);
        localButton3.setOnClickListener(new ay(this));
      }
      else
      {
        a(0, getString(i), localax, cu.iMA);
      }
    }
  }

  protected final int getLayoutId()
  {
    return k.bea;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    z.d("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "onConfigurationChanged, config.orientation = " + paramConfiguration.orientation);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      z.v("!32@/B4Tb64lLpKZO8SHSsYWicKXKEvKYz0r", "onConfigurationChanged");
      this.jPq.post(new bd(this));
    }
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    if (this.jPq != null)
      this.jPq.onDestroy();
    if (this.jPo != null)
      this.jPo.onDestroy();
    super.onDestroy();
    Process.killProcess(Process.myPid());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    DP();
  }

  public void onResume()
  {
    super.onResume();
    setRequestedOrientation(1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI
 * JD-Core Version:    0.6.2
 */