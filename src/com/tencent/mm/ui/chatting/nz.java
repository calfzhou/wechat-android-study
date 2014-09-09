package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.SurfaceView;
import com.tencent.mm.sdk.platformtools.z;

final class nz
  implements DialogInterface.OnCancelListener
{
  nz(ShortVideoRecorderView paramShortVideoRecorderView)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "tipDialog onCancel");
    if (ShortVideoRecorderView.j(this.jvS) != null)
      ShortVideoRecorderView.k(this.jvS).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nz
 * JD-Core Version:    0.6.2
 */