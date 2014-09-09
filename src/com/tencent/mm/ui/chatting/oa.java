package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.pluginsdk.f.b;
import com.tencent.mm.sdk.platformtools.z;

final class oa
  implements Runnable
{
  oa(ShortVideoRecorderView paramShortVideoRecorderView)
  {
  }

  public final void run()
  {
    if (((this.jvS.getContext() instanceof Activity)) && (ShortVideoRecorderView.j(this.jvS).a((Activity)this.jvS.getContext(), false) == 0) && (ShortVideoRecorderView.j(this.jvS).d(ShortVideoRecorderView.m(this.jvS)) == 0))
    {
      z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "preview camera ok");
      ViewGroup.LayoutParams localLayoutParams = ShortVideoRecorderView.k(this.jvS).getLayoutParams();
      DisplayMetrics localDisplayMetrics = this.jvS.getResources().getDisplayMetrics();
      int i = ShortVideoRecorderView.j(this.jvS).azu();
      int j = ShortVideoRecorderView.j(this.jvS).azv();
      Object[] arrayOfObject1 = new Object[4];
      arrayOfObject1[0] = Integer.valueOf(j);
      arrayOfObject1[1] = Integer.valueOf(i);
      arrayOfObject1[2] = Integer.valueOf(localDisplayMetrics.widthPixels);
      arrayOfObject1[3] = Integer.valueOf(localDisplayMetrics.heightPixels);
      z.i("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "resizeLayout priveview[%d, %d], dm[%d, %d]", arrayOfObject1);
      localLayoutParams.width = localDisplayMetrics.widthPixels;
      localLayoutParams.height = (i * localDisplayMetrics.widthPixels / j);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(localLayoutParams.width);
      arrayOfObject2[1] = Integer.valueOf(localLayoutParams.height);
      z.i("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "resizeLayout width:%d, height:%d", arrayOfObject2);
      ShortVideoRecorderView.k(this.jvS).postInvalidate();
      this.jvS.post(new ob(this));
      return;
    }
    ShortVideoRecorderView.l(this.jvS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oa
 * JD-Core Version:    0.6.2
 */