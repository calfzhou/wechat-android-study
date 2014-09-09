package com.tencent.mm.ui.chatting;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.tencent.mm.sdk.platformtools.z;

final class od
  implements SurfaceHolder.Callback
{
  od(ShortVideoRecorderView paramShortVideoRecorderView)
  {
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "surfaceChanged for:" + paramInt1 + " w:" + paramInt2 + " h:" + paramInt3);
    ShortVideoRecorderView.a(this.jvS, og.jvV);
    if (this.jvS.getVisibility() == 0)
    {
      z.i("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "current view is visible, try preview camera");
      ShortVideoRecorderView.a(this.jvS);
    }
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "surfaceChanged end");
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "surfaceCreated");
    ShortVideoRecorderView.a(this.jvS, og.jvU);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "surfaceDestroyed");
    ShortVideoRecorderView.a(this.jvS, og.jvW);
    ShortVideoRecorderView.b(this.jvS);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "surfaceDestroyed end");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.od
 * JD-Core Version:    0.6.2
 */