package com.tencent.mm.pluginsdk.f;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class d extends Handler
{
  boolean hwP = false;
  int hwU = 0;

  public d(Looper paramLooper)
  {
    super(paramLooper);
  }

  @TargetApi(8)
  public final void handleMessage(Message paramMessage)
  {
    Camera localCamera = (Camera)paramMessage.obj;
    Camera.Parameters localParameters = localCamera.getParameters();
    int i = localParameters.getZoom() + this.hwU;
    if (this.hwP)
      if (i >= localParameters.getMaxZoom() / 2)
        i = localParameters.getMaxZoom() / 2;
    while (true)
    {
      localParameters.setZoom(i);
      localCamera.setParameters(localParameters);
      return;
      sendMessageDelayed(Message.obtain(this, 4353, 0, 0, paramMessage.obj), 20L);
      continue;
      if (i <= 0)
        i = 0;
      else
        sendMessageDelayed(Message.obtain(this, 4353, 0, 0, paramMessage.obj), 20L);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.d
 * JD-Core Version:    0.6.2
 */