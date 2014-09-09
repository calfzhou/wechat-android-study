package com.tencent.mm.pluginsdk.f;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import com.tencent.mm.sdk.platformtools.z;

final class i
  implements Camera.AutoFocusCallback
{
  i(h paramh)
  {
  }

  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    z.d("!32@/B4Tb64lLpKmqc5B3umJiVhkChryBljJ", "auto focus callback");
    h.a(this.hxm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.i
 * JD-Core Version:    0.6.2
 */