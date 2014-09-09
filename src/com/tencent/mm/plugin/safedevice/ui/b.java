package com.tencent.mm.plugin.safedevice.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.safedevice.a;

final class b
  implements View.OnClickListener
{
  b(BindSafeDeviceUI paramBindSafeDeviceUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("is_bind_for_safe_device", true);
    a.b(this.fTQ, localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.b
 * JD-Core Version:    0.6.2
 */