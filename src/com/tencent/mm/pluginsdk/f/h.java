package com.tencent.mm.pluginsdk.f;

import android.annotation.TargetApi;
import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import com.tencent.mm.compatible.c.b;
import com.tencent.mm.compatible.c.d;
import com.tencent.mm.compatible.c.f;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.List;

public final class h
  implements SensorEventListener
{
  private static int hxc = 0;
  private Camera dMs = null;
  private SensorManager fgs;
  private SurfaceHolder gQZ = null;
  private boolean hxa = false;
  private a hxb;
  f hxd;
  private List hxe = new ArrayList();
  private boolean hxf = true;
  private Sensor hxg;
  private float hxh = 0.0F;
  private float hxi = 0.0F;
  private float hxj = 0.0F;
  private boolean hxk = true;
  private Camera.AutoFocusCallback hxl = new i(this);

  public static int azA()
  {
    return hxc;
  }

  @TargetApi(9)
  private static void c(Camera.Parameters paramParameters)
  {
    if (v.dNB.dMh > 0);
    List localList;
    do
    {
      do
        return;
      while (Build.VERSION.SDK_INT < 9);
      localList = paramParameters.getSupportedPreviewFpsRange();
    }
    while ((localList == null) || (localList.size() == 0));
    int i = localList.size();
    int j = 0;
    int k = 2147483647;
    int m = 2147483647;
    label53: int i2;
    int n;
    if (j < i)
    {
      int[] arrayOfInt = (int[])localList.get(j);
      if ((arrayOfInt == null) || (arrayOfInt.length <= 1))
        break label238;
      i2 = arrayOfInt[0];
      n = arrayOfInt[1];
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(j);
      arrayOfObject2[1] = Integer.valueOf(i2);
      arrayOfObject2[2] = Integer.valueOf(n);
      z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "dkfps %d:[%d %d]", arrayOfObject2);
      if ((i2 < 0) || (n < i2) || (i2 >= m) || (n >= k))
        break label238;
    }
    for (int i1 = i2; ; i1 = m)
    {
      j++;
      m = i1;
      k = n;
      break label53;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(m);
      arrayOfObject1[1] = Integer.valueOf(k);
      z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "dkfps get fit  [%d %d]", arrayOfObject1);
      if ((m == 2147483647) || (k == 2147483647))
        break;
      try
      {
        paramParameters.setPreviewFpsRange(m, k);
        return;
      }
      catch (Exception localException)
      {
        return;
      }
      label238: n = k;
    }
  }

  public final int a(Activity paramActivity, a parama, boolean paramBoolean)
  {
    if (parama == null)
      return 0 - k.nJ();
    this.hxb = parama;
    if ((this.fgs == null) && (this.hxg == null))
    {
      this.fgs = ((SensorManager)paramActivity.getSystemService("sensor"));
      this.hxg = this.fgs.getDefaultSensor(1);
    }
    if ((paramBoolean) || (this.dMs == null))
    {
      azB();
      if (paramBoolean)
        hxc = 0x1 & (0xFFFFFFFF ^ hxc);
      this.hxd = d.a(paramActivity, hxc);
      if (this.hxd == null)
      {
        z.e("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "start camera FAILED!");
        return 0 - k.nJ();
      }
      this.dMs = this.hxd.dMs;
      this.hxb.dMp = this.hxd.dMp;
      if (this.dMs == null)
      {
        z.e("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "start camera FAILED!");
        return 0 - k.nJ();
      }
    }
    return 0;
  }

  public final int aK(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < this.hxe.size()))
    {
      z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "ret fr " + this.hxe.get(paramInt1));
      return ((Integer)this.hxe.get(paramInt1)).intValue();
    }
    z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "ret fr " + paramInt2);
    return paramInt2;
  }

  public final void azB()
  {
    if ((this.fgs != null) && (this.hxg != null))
      this.fgs.unregisterListener(this);
    if (this.dMs != null)
    {
      z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "release camera");
      this.dMs.stopPreview();
      this.dMs.release();
      this.dMs = null;
      this.hxa = false;
    }
  }

  public final Camera azC()
  {
    return this.dMs;
  }

  @TargetApi(9)
  public final int d(SurfaceHolder paramSurfaceHolder)
  {
    if (this.hxa)
      return 0;
    if (paramSurfaceHolder == null)
      return 0 - k.nJ();
    label645: label649: label663: 
    while (true)
    {
      int i;
      List localList1;
      List localList2;
      int k;
      int i4;
      int i3;
      int j;
      List localList4;
      try
      {
        this.gQZ = paramSurfaceHolder;
        Camera.Parameters localParameters = this.dMs.getParameters();
        a locala = this.hxb;
        z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "getFitRecordSize");
        i = 2147483647;
        localList1 = d.b(localParameters);
        if (localList1 != null)
          break label645;
        z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "getFitRecordSize getSupportedVideoSizes null, use getSupportedPreviewSizes instead");
        localList2 = d.a(localParameters);
        break label649;
        if (k < localList2.size())
        {
          int n = ((Camera.Size)localList2.get(k)).height;
          int i1 = ((Camera.Size)localList2.get(k)).width;
          z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "supp w:" + i1 + " h:" + n);
          int i2 = n * i1;
          if (((locala.dMp == 0) || (locala.dMp == 180)) && (((n < locala.hwy) || (i1 < locala.hwz)) && (((locala.dMp != 90) && (locala.dMp != 270)) || (i1 < locala.hwy) || (n < locala.hwz) || (i2 >= i))))
            break label634;
          locala.hww = i1;
          locala.hwv = n;
          i4 = i2;
          i3 = 1;
          break label663;
        }
        if (j == 0)
        {
          Camera.Size localSize1 = localParameters.getPreviewSize();
          locala.hwv = localSize1.height;
          locala.hww = localSize1.width;
        }
        z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", " rotate:" + locala.dMp + " w:" + locala.hww + " h:" + locala.hwv);
        localParameters.setPreviewSize(this.hxb.hww, this.hxb.hwv);
        c(localParameters);
        List localList3 = localParameters.getSupportedPreviewFrameRates();
        this.hxe.clear();
        this.hxe.addAll(localList3);
        localParameters.setPreviewFormat(17);
        localList4 = localParameters.getSupportedFocusModes();
        if (localList4 != null)
        {
          if (Build.VERSION.SDK_INT > 9)
          {
            m = 1;
            if ((m == 0) || (true != localList4.contains("continuous-video")))
              break label605;
            z.i("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "support continous-video");
            this.hxf = false;
            localParameters.setFocusMode("continuous-video");
          }
        }
        else
        {
          this.dMs.setParameters(localParameters);
          this.dMs.setPreviewDisplay(paramSurfaceHolder);
          this.dMs.startPreview();
          if ((this.fgs != null) && (this.hxg != null) && (true == this.hxf))
            this.fgs.registerListener(this, this.hxg, 2);
          this.hxa = true;
          return 0;
          Camera.Size localSize2 = localParameters.getPreviewSize();
          locala.hwv = localSize2.height;
          locala.hww = localSize2.width;
          continue;
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "Start preview FAILED :" + localException.getMessage());
        return 0 - k.nJ();
      }
      int m = 0;
      continue;
      label605: if (!localList4.contains("auto"))
      {
        z.i("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "don't support auto");
        this.hxf = false;
        continue;
        label634: i3 = j;
        i4 = i;
        break label663;
        localList2 = localList1;
        if (localList2 != null)
        {
          j = 0;
          k = 0;
          continue;
          k++;
          i = i4;
          j = i3;
        }
      }
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if (((Math.abs(this.hxh - f1) > 2.0F) || (Math.abs(this.hxi - f2) > 2.0F) || (Math.abs(this.hxj - f3) > 2.0F)) && (this.dMs != null) && (this.hxk) && (true == this.hxf));
    try
    {
      z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "auto focus");
      this.dMs.autoFocus(this.hxl);
      this.hxk = false;
      this.hxh = f1;
      this.hxi = f2;
      this.hxj = f3;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "auto focus failed");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.h
 * JD-Core Version:    0.6.2
 */